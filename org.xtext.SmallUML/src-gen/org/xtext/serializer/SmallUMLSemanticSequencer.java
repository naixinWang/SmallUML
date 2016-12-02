/*
 * generated by Xtext 2.10.1
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.services.SmallUMLGrammarAccess;
import smalluml.Association;
import smalluml.Attribute;
import smalluml.Generalisation;
import smalluml.Methode;
import smalluml.Role;
import smalluml.SchemaUML;
import smalluml.SmallClass;
import smalluml.SmallumlPackage;

@SuppressWarnings("all")
public class SmallUMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmallUMLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SmallumlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SmallumlPackage.ASSOCIATION:
				sequence_Association(context, (Association) semanticObject); 
				return; 
			case SmallumlPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case SmallumlPackage.GENERALISATION:
				sequence_Generalisation(context, (Generalisation) semanticObject); 
				return; 
			case SmallumlPackage.METHODE:
				sequence_Methode(context, (Methode) semanticObject); 
				return; 
			case SmallumlPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case SmallumlPackage.SCHEMA_UML:
				sequence_SchemaUML(context, (SchemaUML) semanticObject); 
				return; 
			case SmallumlPackage.SMALL_CLASS:
				sequence_SmallClass(context, (SmallClass) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Association returns Association
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         source=SmallClass 
	 *         cible=SmallClass 
	 *         (listeAttribute+=Attribute listeAttribute+=Attribute*)? 
	 *         listeRole+=Role 
	 *         listeRole+=Role*
	 *     )
	 */
	protected void sequence_Association(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=EString type=EString?)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Generalisation returns Generalisation
	 *
	 * Constraint:
	 *     (source=SmallClass cible=SmallClass)
	 */
	protected void sequence_Generalisation(ISerializationContext context, Generalisation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.GENERALISATION__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.GENERALISATION__SOURCE));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.GENERALISATION__CIBLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.GENERALISATION__CIBLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGeneralisationAccess().getSourceSmallClassParserRuleCall_3_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getGeneralisationAccess().getCibleSmallClassParserRuleCall_5_0(), semanticObject.getCible());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Methode returns Methode
	 *
	 * Constraint:
	 *     (name=EString returnType=EString?)
	 */
	protected void sequence_Methode(ISerializationContext context, Methode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (Multiplicity=EString? classDedie=SmallClass)
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SchemaUML returns SchemaUML
	 *
	 * Constraint:
	 *     ((gene+=Generalisation gene+=Generalisation*)? c+=SmallClass c+=SmallClass* (ass+=Association ass+=Association*)?)
	 */
	protected void sequence_SchemaUML(ISerializationContext context, SchemaUML semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SmallClass returns SmallClass
	 *
	 * Constraint:
	 *     (name=EString (listeAttribute+=Attribute listeAttribute+=Attribute*)? (listeMethode+=Methode listeMethode+=Methode*)?)
	 */
	protected void sequence_SmallClass(ISerializationContext context, SmallClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
