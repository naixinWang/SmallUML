/*
 * generated by Xtext 2.10.1
 */
package org.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.ide.contentassist.antlr.internal.InternalSmallUMLParser;
import org.xtext.services.SmallUMLGrammarAccess;

public class SmallUMLParser extends AbstractContentAssistParser {

	@Inject
	private SmallUMLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSmallUMLParser createParser() {
		InternalSmallUMLParser result = new InternalSmallUMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getSchemaUMLAccess().getGroup(), "rule__SchemaUML__Group__0");
					put(grammarAccess.getSchemaUMLAccess().getGroup_2(), "rule__SchemaUML__Group_2__0");
					put(grammarAccess.getSchemaUMLAccess().getGroup_2_3(), "rule__SchemaUML__Group_2_3__0");
					put(grammarAccess.getSchemaUMLAccess().getGroup_6(), "rule__SchemaUML__Group_6__0");
					put(grammarAccess.getSchemaUMLAccess().getGroup_8(), "rule__SchemaUML__Group_8__0");
					put(grammarAccess.getSchemaUMLAccess().getGroup_8_3(), "rule__SchemaUML__Group_8_3__0");
					put(grammarAccess.getGeneralisationAccess().getGroup(), "rule__Generalisation__Group__0");
					put(grammarAccess.getSmallClassAccess().getGroup(), "rule__SmallClass__Group__0");
					put(grammarAccess.getSmallClassAccess().getGroup_4(), "rule__SmallClass__Group_4__0");
					put(grammarAccess.getSmallClassAccess().getGroup_4_3(), "rule__SmallClass__Group_4_3__0");
					put(grammarAccess.getSmallClassAccess().getGroup_5(), "rule__SmallClass__Group_5__0");
					put(grammarAccess.getSmallClassAccess().getGroup_5_3(), "rule__SmallClass__Group_5_3__0");
					put(grammarAccess.getAssociationAccess().getGroup(), "rule__Association__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup_7(), "rule__Association__Group_7__0");
					put(grammarAccess.getAssociationAccess().getGroup_7_3(), "rule__Association__Group_7_3__0");
					put(grammarAccess.getAssociationAccess().getGroup_11(), "rule__Association__Group_11__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup_4(), "rule__Attribute__Group_4__0");
					put(grammarAccess.getMethodeAccess().getGroup(), "rule__Methode__Group__0");
					put(grammarAccess.getMethodeAccess().getGroup_4(), "rule__Methode__Group_4__0");
					put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
					put(grammarAccess.getRoleAccess().getGroup_2(), "rule__Role__Group_2__0");
					put(grammarAccess.getSchemaUMLAccess().getGeneAssignment_2_2(), "rule__SchemaUML__GeneAssignment_2_2");
					put(grammarAccess.getSchemaUMLAccess().getGeneAssignment_2_3_1(), "rule__SchemaUML__GeneAssignment_2_3_1");
					put(grammarAccess.getSchemaUMLAccess().getCAssignment_5(), "rule__SchemaUML__CAssignment_5");
					put(grammarAccess.getSchemaUMLAccess().getCAssignment_6_1(), "rule__SchemaUML__CAssignment_6_1");
					put(grammarAccess.getSchemaUMLAccess().getAssAssignment_8_2(), "rule__SchemaUML__AssAssignment_8_2");
					put(grammarAccess.getSchemaUMLAccess().getAssAssignment_8_3_1(), "rule__SchemaUML__AssAssignment_8_3_1");
					put(grammarAccess.getGeneralisationAccess().getSourceAssignment_3(), "rule__Generalisation__SourceAssignment_3");
					put(grammarAccess.getGeneralisationAccess().getCibleAssignment_5(), "rule__Generalisation__CibleAssignment_5");
					put(grammarAccess.getSmallClassAccess().getNameAssignment_2(), "rule__SmallClass__NameAssignment_2");
					put(grammarAccess.getSmallClassAccess().getListeAttributeAssignment_4_2(), "rule__SmallClass__ListeAttributeAssignment_4_2");
					put(grammarAccess.getSmallClassAccess().getListeAttributeAssignment_4_3_1(), "rule__SmallClass__ListeAttributeAssignment_4_3_1");
					put(grammarAccess.getSmallClassAccess().getListeMethodeAssignment_5_2(), "rule__SmallClass__ListeMethodeAssignment_5_2");
					put(grammarAccess.getSmallClassAccess().getListeMethodeAssignment_5_3_1(), "rule__SmallClass__ListeMethodeAssignment_5_3_1");
					put(grammarAccess.getAssociationAccess().getNameAssignment_1(), "rule__Association__NameAssignment_1");
					put(grammarAccess.getAssociationAccess().getSourceAssignment_4(), "rule__Association__SourceAssignment_4");
					put(grammarAccess.getAssociationAccess().getCibleAssignment_6(), "rule__Association__CibleAssignment_6");
					put(grammarAccess.getAssociationAccess().getListeAttributeAssignment_7_2(), "rule__Association__ListeAttributeAssignment_7_2");
					put(grammarAccess.getAssociationAccess().getListeAttributeAssignment_7_3_1(), "rule__Association__ListeAttributeAssignment_7_3_1");
					put(grammarAccess.getAssociationAccess().getListeRoleAssignment_10(), "rule__Association__ListeRoleAssignment_10");
					put(grammarAccess.getAssociationAccess().getListeRoleAssignment_11_1(), "rule__Association__ListeRoleAssignment_11_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_2(), "rule__Attribute__NameAssignment_2");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_4_1(), "rule__Attribute__TypeAssignment_4_1");
					put(grammarAccess.getMethodeAccess().getNameAssignment_2(), "rule__Methode__NameAssignment_2");
					put(grammarAccess.getMethodeAccess().getReturnTypeAssignment_4_1(), "rule__Methode__ReturnTypeAssignment_4_1");
					put(grammarAccess.getRoleAccess().getMultiplicityAssignment_2_1(), "rule__Role__MultiplicityAssignment_2_1");
					put(grammarAccess.getRoleAccess().getClassDedieAssignment_4(), "rule__Role__ClassDedieAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSmallUMLParser typedParser = (InternalSmallUMLParser) parser;
			typedParser.entryRuleSchemaUML();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SmallUMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SmallUMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}