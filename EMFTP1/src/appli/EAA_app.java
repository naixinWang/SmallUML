package appli;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import EAA.Association;
import EAA.EAAFactory;
import EAA.EAAPackage;
import EAA.Entity;
import EAA.Role;
import EAA.Schema;

public class EAA_app {
	public static void main(String[] args){
		EAAPackage pack = EAAPackage.eINSTANCE;
		EAAFactory factory = pack.getEAAFactory();
		
		Schema sch = factory.createSchema();
		Entity e1 = factory.createEntity();
		e1.setName("Personne");
		
		Entity e2 = factory.createEntity();
		e2.setName("Voiture");

		Association ass = factory.createAssociation();
		ass.setName("possède");
		Role r1 = factory.createRole();
		Role r2 = factory.createRole();
		
		r1.setCardinality("0.*");
		r2.setCardinality("1");
		ass.getListeRole().add(r1);
		ass.getListeRole().add(r2);
		e1.getListeRole().add(r1);
		e2.getListeRole().add(r2);
		
		sch.getE().add(e1);
		sch.getE().add(e2);
		sch.getAss().add(ass);
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String,Object> m = reg.getExtensionToFactoryMap();
		m.put("eaa", new XMIResourceFactoryImpl());
		
		
		ResourceSet rs = new ResourceSetImpl();	
		URI uri = URI.createFileURI("Schema.eaa");
		System.out.println(uri);
		
		Resource resource = rs.createResource(uri);

		resource.getContents().add(sch);
//		resource.getContents().add(e1);
//		resource.getContents().add(e2);
//		resource.getContents().add(r1);
//		resource.getContents().add(r2);
//		resource.getContents().add(ass);
		
		
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
