package EMFRessourceGeneration;



import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtext.example.eaa.MyDslStandaloneSetup;

import com.google.inject.Injector;


public class Generate {
	public static void main(String[] args){
		// do this only once per application
		Injector injector =  new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		 
		// obtain a resourceset from the injector
		XtextResourceSet resourceSet =  injector.getInstance(XtextResourceSet.class);
		 
		// load a resource by URI, in this case from the file system
		Resource inputResource = resourceSet.getResource(URI.createFileURI("./instance1.dmodel"), true);

		EcoreUtil.resolveAll(inputResource);
		
		Resource xmiResource = resourceSet.getResource(URI.createFileURI("./INST.xmi"), true);
		
		xmiResource.getContents().add(inputResource.getContents().get(0));
		try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		System.out.println(xmiResource.getContents());
		//System.out.println(inputResource+"\n");

		// Validation
		IResourceValidator validator = ((XtextResource)inputResource).getResourceServiceProvider().getResourceValidator();
		List<Issue> issues = validator.validate(inputResource, CheckMode.ALL, CancelIndicator.NullImpl);
		for (Issue issue : issues) {
		  System.out.println(issue.getMessage());
		}
		
		/*
		// Code Generator
		GeneratorDelegate generator = injector.getInstance(GeneratorDelegate.class);
		InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
		generator.doGenerate(resource, fsa);
		System.out.println(resource+"\n" + fsa);
		System.out.println("where is the file");
		for (Entry<String, CharSequence> file : fsa.getTextFiles().entrySet()) {
		  System.out.println("Generated file path : "+file.getKey());
		  System.out.println("Generated file contents : "+file.getValue());
		}
		*/
	}
}
