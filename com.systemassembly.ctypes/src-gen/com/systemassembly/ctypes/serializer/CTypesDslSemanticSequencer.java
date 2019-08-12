/*
 * generated by Xtext 2.18.0.M3
 */
package com.systemassembly.ctypes.serializer;

import com.google.inject.Inject;
import com.systemassembly.ctypes.cTypesDsl.CTypesDslPackage;
import com.systemassembly.ctypes.cTypesDsl.Model;
import com.systemassembly.ctypes.cTypesDsl.StructDef;
import com.systemassembly.ctypes.cTypesDsl.StructField;
import com.systemassembly.ctypes.services.CTypesDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class CTypesDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CTypesDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CTypesDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CTypesDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case CTypesDslPackage.STRUCT_DEF:
				sequence_StructDef(context, (StructDef) semanticObject); 
				return; 
			case CTypesDslPackage.STRUCT_FIELD:
				sequence_StructField(context, (StructField) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     dataTypeDefinitions+=DataTypeDef+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataTypeDef returns StructDef
	 *     StructDef returns StructDef
	 *
	 * Constraint:
	 *     (name=ID fields+=StructField*)
	 */
	protected void sequence_StructDef(ISerializationContext context, StructDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StructField returns StructField
	 *
	 * Constraint:
	 *     ((basicType=BasicType | derivedType=[DataTypeDef|ID]) arraySize=INT? name=ID)
	 */
	protected void sequence_StructField(ISerializationContext context, StructField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}