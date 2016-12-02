/*
 * generated by Xtext 2.10.1
 */
package org.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SmallUMLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class SchemaUMLElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.SmallUML.SchemaUML");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSchemaUMLKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cGeneKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cGeneAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cGeneGeneralisationParserRuleCall_2_2_0 = (RuleCall)cGeneAssignment_2_2.eContents().get(0);
		private final Group cGroup_2_3 = (Group)cGroup_2.eContents().get(3);
		private final Keyword cCommaKeyword_2_3_0 = (Keyword)cGroup_2_3.eContents().get(0);
		private final Assignment cGeneAssignment_2_3_1 = (Assignment)cGroup_2_3.eContents().get(1);
		private final RuleCall cGeneGeneralisationParserRuleCall_2_3_1_0 = (RuleCall)cGeneAssignment_2_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_4 = (Keyword)cGroup_2.eContents().get(4);
		private final Keyword cCKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cCAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cCSmallClassParserRuleCall_5_0 = (RuleCall)cCAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cCAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cCSmallClassParserRuleCall_6_1_0 = (RuleCall)cCAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cAssKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cAssAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final RuleCall cAssAssociationParserRuleCall_8_2_0 = (RuleCall)cAssAssignment_8_2.eContents().get(0);
		private final Group cGroup_8_3 = (Group)cGroup_8.eContents().get(3);
		private final Keyword cCommaKeyword_8_3_0 = (Keyword)cGroup_8_3.eContents().get(0);
		private final Assignment cAssAssignment_8_3_1 = (Assignment)cGroup_8_3.eContents().get(1);
		private final RuleCall cAssAssociationParserRuleCall_8_3_1_0 = (RuleCall)cAssAssignment_8_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8_4 = (Keyword)cGroup_8.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//SchemaUML:
		//	'SchemaUML'
		//	'{' ('gene' '{' gene+=Generalisation ("," gene+=Generalisation)* '}')?
		//	'c' '{' c+=SmallClass ("," c+=SmallClass)* '}' ('ass' '{' ass+=Association ("," ass+=Association)* '}')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'SchemaUML' '{' ('gene' '{' gene+=Generalisation ("," gene+=Generalisation)* '}')? 'c' '{' c+=SmallClass (","
		//c+=SmallClass)* '}' ('ass' '{' ass+=Association ("," ass+=Association)* '}')? '}'
		public Group getGroup() { return cGroup; }
		
		//'SchemaUML'
		public Keyword getSchemaUMLKeyword_0() { return cSchemaUMLKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('gene' '{' gene+=Generalisation ("," gene+=Generalisation)* '}')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'gene'
		public Keyword getGeneKeyword_2_0() { return cGeneKeyword_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2_1() { return cLeftCurlyBracketKeyword_2_1; }
		
		//gene+=Generalisation
		public Assignment getGeneAssignment_2_2() { return cGeneAssignment_2_2; }
		
		//Generalisation
		public RuleCall getGeneGeneralisationParserRuleCall_2_2_0() { return cGeneGeneralisationParserRuleCall_2_2_0; }
		
		//("," gene+=Generalisation)*
		public Group getGroup_2_3() { return cGroup_2_3; }
		
		//","
		public Keyword getCommaKeyword_2_3_0() { return cCommaKeyword_2_3_0; }
		
		//gene+=Generalisation
		public Assignment getGeneAssignment_2_3_1() { return cGeneAssignment_2_3_1; }
		
		//Generalisation
		public RuleCall getGeneGeneralisationParserRuleCall_2_3_1_0() { return cGeneGeneralisationParserRuleCall_2_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2_4() { return cRightCurlyBracketKeyword_2_4; }
		
		//'c'
		public Keyword getCKeyword_3() { return cCKeyword_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//c+=SmallClass
		public Assignment getCAssignment_5() { return cCAssignment_5; }
		
		//SmallClass
		public RuleCall getCSmallClassParserRuleCall_5_0() { return cCSmallClassParserRuleCall_5_0; }
		
		//("," c+=SmallClass)*
		public Group getGroup_6() { return cGroup_6; }
		
		//","
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//c+=SmallClass
		public Assignment getCAssignment_6_1() { return cCAssignment_6_1; }
		
		//SmallClass
		public RuleCall getCSmallClassParserRuleCall_6_1_0() { return cCSmallClassParserRuleCall_6_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//('ass' '{' ass+=Association ("," ass+=Association)* '}')?
		public Group getGroup_8() { return cGroup_8; }
		
		//'ass'
		public Keyword getAssKeyword_8_0() { return cAssKeyword_8_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_8_1() { return cLeftCurlyBracketKeyword_8_1; }
		
		//ass+=Association
		public Assignment getAssAssignment_8_2() { return cAssAssignment_8_2; }
		
		//Association
		public RuleCall getAssAssociationParserRuleCall_8_2_0() { return cAssAssociationParserRuleCall_8_2_0; }
		
		//("," ass+=Association)*
		public Group getGroup_8_3() { return cGroup_8_3; }
		
		//","
		public Keyword getCommaKeyword_8_3_0() { return cCommaKeyword_8_3_0; }
		
		//ass+=Association
		public Assignment getAssAssignment_8_3_1() { return cAssAssignment_8_3_1; }
		
		//Association
		public RuleCall getAssAssociationParserRuleCall_8_3_1_0() { return cAssAssociationParserRuleCall_8_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8_4() { return cRightCurlyBracketKeyword_8_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class GeneralisationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.SmallUML.Generalisation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGeneralisationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSourceKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSourceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSourceSmallClassParserRuleCall_3_0 = (RuleCall)cSourceAssignment_3.eContents().get(0);
		private final Keyword cCibleKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cCibleAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cCibleSmallClassParserRuleCall_5_0 = (RuleCall)cCibleAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Generalisation:
		//	'Generalisation'
		//	'{'
		//	'source' source=SmallClass
		//	'cible' cible=SmallClass
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Generalisation' '{' 'source' source=SmallClass 'cible' cible=SmallClass '}'
		public Group getGroup() { return cGroup; }
		
		//'Generalisation'
		public Keyword getGeneralisationKeyword_0() { return cGeneralisationKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'source'
		public Keyword getSourceKeyword_2() { return cSourceKeyword_2; }
		
		//source=SmallClass
		public Assignment getSourceAssignment_3() { return cSourceAssignment_3; }
		
		//SmallClass
		public RuleCall getSourceSmallClassParserRuleCall_3_0() { return cSourceSmallClassParserRuleCall_3_0; }
		
		//'cible'
		public Keyword getCibleKeyword_4() { return cCibleKeyword_4; }
		
		//cible=SmallClass
		public Assignment getCibleAssignment_5() { return cCibleAssignment_5; }
		
		//SmallClass
		public RuleCall getCibleSmallClassParserRuleCall_5_0() { return cCibleSmallClassParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class SmallClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.SmallUML.SmallClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSmallClassAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSmallClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cListeAttributeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cListeAttributeAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cListeAttributeAttributeParserRuleCall_4_2_0 = (RuleCall)cListeAttributeAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cListeAttributeAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cListeAttributeAttributeParserRuleCall_4_3_1_0 = (RuleCall)cListeAttributeAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cListeMethodeKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cListeMethodeAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cListeMethodeMethodeParserRuleCall_5_2_0 = (RuleCall)cListeMethodeAssignment_5_2.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cListeMethodeAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cListeMethodeMethodeParserRuleCall_5_3_1_0 = (RuleCall)cListeMethodeAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//SmallClass:
		//	{SmallClass}
		//	'SmallClass'
		//	name=EString
		//	'{' ('listeAttribute' '{' listeAttribute+=Attribute ("," listeAttribute+=Attribute)* '}')? ('listeMethode' '{'
		//	listeMethode+=Methode ("," listeMethode+=Methode)* '}')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{SmallClass} 'SmallClass' name=EString '{' ('listeAttribute' '{' listeAttribute+=Attribute (","
		//listeAttribute+=Attribute)* '}')? ('listeMethode' '{' listeMethode+=Methode ("," listeMethode+=Methode)* '}')? '}'
		public Group getGroup() { return cGroup; }
		
		//{SmallClass}
		public Action getSmallClassAction_0() { return cSmallClassAction_0; }
		
		//'SmallClass'
		public Keyword getSmallClassKeyword_1() { return cSmallClassKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('listeAttribute' '{' listeAttribute+=Attribute ("," listeAttribute+=Attribute)* '}')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'listeAttribute'
		public Keyword getListeAttributeKeyword_4_0() { return cListeAttributeKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//listeAttribute+=Attribute
		public Assignment getListeAttributeAssignment_4_2() { return cListeAttributeAssignment_4_2; }
		
		//Attribute
		public RuleCall getListeAttributeAttributeParserRuleCall_4_2_0() { return cListeAttributeAttributeParserRuleCall_4_2_0; }
		
		//("," listeAttribute+=Attribute)*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//listeAttribute+=Attribute
		public Assignment getListeAttributeAssignment_4_3_1() { return cListeAttributeAssignment_4_3_1; }
		
		//Attribute
		public RuleCall getListeAttributeAttributeParserRuleCall_4_3_1_0() { return cListeAttributeAttributeParserRuleCall_4_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }
		
		//('listeMethode' '{' listeMethode+=Methode ("," listeMethode+=Methode)* '}')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'listeMethode'
		public Keyword getListeMethodeKeyword_5_0() { return cListeMethodeKeyword_5_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }
		
		//listeMethode+=Methode
		public Assignment getListeMethodeAssignment_5_2() { return cListeMethodeAssignment_5_2; }
		
		//Methode
		public RuleCall getListeMethodeMethodeParserRuleCall_5_2_0() { return cListeMethodeMethodeParserRuleCall_5_2_0; }
		
		//("," listeMethode+=Methode)*
		public Group getGroup_5_3() { return cGroup_5_3; }
		
		//","
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }
		
		//listeMethode+=Methode
		public Assignment getListeMethodeAssignment_5_3_1() { return cListeMethodeAssignment_5_3_1; }
		
		//Methode
		public RuleCall getListeMethodeMethodeParserRuleCall_5_3_1_0() { return cListeMethodeMethodeParserRuleCall_5_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class AssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.SmallUML.Association");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssociationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cSourceKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSourceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSourceSmallClassParserRuleCall_4_0 = (RuleCall)cSourceAssignment_4.eContents().get(0);
		private final Keyword cCibleKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCibleAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCibleSmallClassParserRuleCall_6_0 = (RuleCall)cCibleAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cListeAttributeKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Assignment cListeAttributeAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final RuleCall cListeAttributeAttributeParserRuleCall_7_2_0 = (RuleCall)cListeAttributeAssignment_7_2.eContents().get(0);
		private final Group cGroup_7_3 = (Group)cGroup_7.eContents().get(3);
		private final Keyword cCommaKeyword_7_3_0 = (Keyword)cGroup_7_3.eContents().get(0);
		private final Assignment cListeAttributeAssignment_7_3_1 = (Assignment)cGroup_7_3.eContents().get(1);
		private final RuleCall cListeAttributeAttributeParserRuleCall_7_3_1_0 = (RuleCall)cListeAttributeAssignment_7_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7_4 = (Keyword)cGroup_7.eContents().get(4);
		private final Keyword cListeRoleKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cLeftCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cListeRoleAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cListeRoleRoleParserRuleCall_10_0 = (RuleCall)cListeRoleAssignment_10.eContents().get(0);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cCommaKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Assignment cListeRoleAssignment_11_1 = (Assignment)cGroup_11.eContents().get(1);
		private final RuleCall cListeRoleRoleParserRuleCall_11_1_0 = (RuleCall)cListeRoleAssignment_11_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//Association:
		//	'Association'
		//	name=EString
		//	'{'
		//	'source' source=SmallClass
		//	'cible' cible=SmallClass ('listeAttribute' '{' listeAttribute+=Attribute ("," listeAttribute+=Attribute)* '}')?
		//	'listeRole' '{' listeRole+=Role ("," listeRole+=Role)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Association' name=EString '{' 'source' source=SmallClass 'cible' cible=SmallClass ('listeAttribute' '{'
		//listeAttribute+=Attribute ("," listeAttribute+=Attribute)* '}')? 'listeRole' '{' listeRole+=Role ("," listeRole+=Role)*
		//'}' '}'
		public Group getGroup() { return cGroup; }
		
		//'Association'
		public Keyword getAssociationKeyword_0() { return cAssociationKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'source'
		public Keyword getSourceKeyword_3() { return cSourceKeyword_3; }
		
		//source=SmallClass
		public Assignment getSourceAssignment_4() { return cSourceAssignment_4; }
		
		//SmallClass
		public RuleCall getSourceSmallClassParserRuleCall_4_0() { return cSourceSmallClassParserRuleCall_4_0; }
		
		//'cible'
		public Keyword getCibleKeyword_5() { return cCibleKeyword_5; }
		
		//cible=SmallClass
		public Assignment getCibleAssignment_6() { return cCibleAssignment_6; }
		
		//SmallClass
		public RuleCall getCibleSmallClassParserRuleCall_6_0() { return cCibleSmallClassParserRuleCall_6_0; }
		
		//('listeAttribute' '{' listeAttribute+=Attribute ("," listeAttribute+=Attribute)* '}')?
		public Group getGroup_7() { return cGroup_7; }
		
		//'listeAttribute'
		public Keyword getListeAttributeKeyword_7_0() { return cListeAttributeKeyword_7_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_7_1() { return cLeftCurlyBracketKeyword_7_1; }
		
		//listeAttribute+=Attribute
		public Assignment getListeAttributeAssignment_7_2() { return cListeAttributeAssignment_7_2; }
		
		//Attribute
		public RuleCall getListeAttributeAttributeParserRuleCall_7_2_0() { return cListeAttributeAttributeParserRuleCall_7_2_0; }
		
		//("," listeAttribute+=Attribute)*
		public Group getGroup_7_3() { return cGroup_7_3; }
		
		//","
		public Keyword getCommaKeyword_7_3_0() { return cCommaKeyword_7_3_0; }
		
		//listeAttribute+=Attribute
		public Assignment getListeAttributeAssignment_7_3_1() { return cListeAttributeAssignment_7_3_1; }
		
		//Attribute
		public RuleCall getListeAttributeAttributeParserRuleCall_7_3_1_0() { return cListeAttributeAttributeParserRuleCall_7_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7_4() { return cRightCurlyBracketKeyword_7_4; }
		
		//'listeRole'
		public Keyword getListeRoleKeyword_8() { return cListeRoleKeyword_8; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_9() { return cLeftCurlyBracketKeyword_9; }
		
		//listeRole+=Role
		public Assignment getListeRoleAssignment_10() { return cListeRoleAssignment_10; }
		
		//Role
		public RuleCall getListeRoleRoleParserRuleCall_10_0() { return cListeRoleRoleParserRuleCall_10_0; }
		
		//("," listeRole+=Role)*
		public Group getGroup_11() { return cGroup_11; }
		
		//","
		public Keyword getCommaKeyword_11_0() { return cCommaKeyword_11_0; }
		
		//listeRole+=Role
		public Assignment getListeRoleAssignment_11_1() { return cListeRoleAssignment_11_1; }
		
		//Role
		public RuleCall getListeRoleRoleParserRuleCall_11_1_0() { return cListeRoleRoleParserRuleCall_11_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.SmallUML.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.SmallUML.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAttributeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAttributeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cTypeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cTypeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cTypeEStringParserRuleCall_4_1_0 = (RuleCall)cTypeAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Attribute:
		//	{Attribute}
		//	'Attribute'
		//	name=EString
		//	'{' ('type' type=EString)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Attribute} 'Attribute' name=EString '{' ('type' type=EString)? '}'
		public Group getGroup() { return cGroup; }
		
		//{Attribute}
		public Action getAttributeAction_0() { return cAttributeAction_0; }
		
		//'Attribute'
		public Keyword getAttributeKeyword_1() { return cAttributeKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('type' type=EString)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'type'
		public Keyword getTypeKeyword_4_0() { return cTypeKeyword_4_0; }
		
		//type=EString
		public Assignment getTypeAssignment_4_1() { return cTypeAssignment_4_1; }
		
		//EString
		public RuleCall getTypeEStringParserRuleCall_4_1_0() { return cTypeEStringParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class MethodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.SmallUML.Methode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMethodeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMethodeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cReturnTypeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cReturnTypeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cReturnTypeEStringParserRuleCall_4_1_0 = (RuleCall)cReturnTypeAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Methode:
		//	{Methode}
		//	'Methode'
		//	name=EString
		//	'{' ('returnType' returnType=EString)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Methode} 'Methode' name=EString '{' ('returnType' returnType=EString)? '}'
		public Group getGroup() { return cGroup; }
		
		//{Methode}
		public Action getMethodeAction_0() { return cMethodeAction_0; }
		
		//'Methode'
		public Keyword getMethodeKeyword_1() { return cMethodeKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('returnType' returnType=EString)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'returnType'
		public Keyword getReturnTypeKeyword_4_0() { return cReturnTypeKeyword_4_0; }
		
		//returnType=EString
		public Assignment getReturnTypeAssignment_4_1() { return cReturnTypeAssignment_4_1; }
		
		//EString
		public RuleCall getReturnTypeEStringParserRuleCall_4_1_0() { return cReturnTypeEStringParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class RoleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.SmallUML.Role");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRoleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cMultiplicityKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cMultiplicityAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cMultiplicityEStringParserRuleCall_2_1_0 = (RuleCall)cMultiplicityAssignment_2_1.eContents().get(0);
		private final Keyword cClassDedieKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cClassDedieAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cClassDedieSmallClassParserRuleCall_4_0 = (RuleCall)cClassDedieAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Role:
		//	'Role'
		//	'{' ('Multiplicity' Multiplicity=EString)?
		//	'classDedie' classDedie=SmallClass
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Role' '{' ('Multiplicity' Multiplicity=EString)? 'classDedie' classDedie=SmallClass '}'
		public Group getGroup() { return cGroup; }
		
		//'Role'
		public Keyword getRoleKeyword_0() { return cRoleKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('Multiplicity' Multiplicity=EString)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'Multiplicity'
		public Keyword getMultiplicityKeyword_2_0() { return cMultiplicityKeyword_2_0; }
		
		//Multiplicity=EString
		public Assignment getMultiplicityAssignment_2_1() { return cMultiplicityAssignment_2_1; }
		
		//EString
		public RuleCall getMultiplicityEStringParserRuleCall_2_1_0() { return cMultiplicityEStringParserRuleCall_2_1_0; }
		
		//'classDedie'
		public Keyword getClassDedieKeyword_3() { return cClassDedieKeyword_3; }
		
		//classDedie=SmallClass
		public Assignment getClassDedieAssignment_4() { return cClassDedieAssignment_4; }
		
		//SmallClass
		public RuleCall getClassDedieSmallClassParserRuleCall_4_0() { return cClassDedieSmallClassParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	
	
	private final SchemaUMLElements pSchemaUML;
	private final GeneralisationElements pGeneralisation;
	private final SmallClassElements pSmallClass;
	private final AssociationElements pAssociation;
	private final EStringElements pEString;
	private final AttributeElements pAttribute;
	private final MethodeElements pMethode;
	private final RoleElements pRole;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SmallUMLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSchemaUML = new SchemaUMLElements();
		this.pGeneralisation = new GeneralisationElements();
		this.pSmallClass = new SmallClassElements();
		this.pAssociation = new AssociationElements();
		this.pEString = new EStringElements();
		this.pAttribute = new AttributeElements();
		this.pMethode = new MethodeElements();
		this.pRole = new RoleElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.SmallUML".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//SchemaUML:
	//	'SchemaUML'
	//	'{' ('gene' '{' gene+=Generalisation ("," gene+=Generalisation)* '}')?
	//	'c' '{' c+=SmallClass ("," c+=SmallClass)* '}' ('ass' '{' ass+=Association ("," ass+=Association)* '}')?
	//	'}';
	public SchemaUMLElements getSchemaUMLAccess() {
		return pSchemaUML;
	}
	
	public ParserRule getSchemaUMLRule() {
		return getSchemaUMLAccess().getRule();
	}
	
	//Generalisation:
	//	'Generalisation'
	//	'{'
	//	'source' source=SmallClass
	//	'cible' cible=SmallClass
	//	'}';
	public GeneralisationElements getGeneralisationAccess() {
		return pGeneralisation;
	}
	
	public ParserRule getGeneralisationRule() {
		return getGeneralisationAccess().getRule();
	}
	
	//SmallClass:
	//	{SmallClass}
	//	'SmallClass'
	//	name=EString
	//	'{' ('listeAttribute' '{' listeAttribute+=Attribute ("," listeAttribute+=Attribute)* '}')? ('listeMethode' '{'
	//	listeMethode+=Methode ("," listeMethode+=Methode)* '}')?
	//	'}';
	public SmallClassElements getSmallClassAccess() {
		return pSmallClass;
	}
	
	public ParserRule getSmallClassRule() {
		return getSmallClassAccess().getRule();
	}
	
	//Association:
	//	'Association'
	//	name=EString
	//	'{'
	//	'source' source=SmallClass
	//	'cible' cible=SmallClass ('listeAttribute' '{' listeAttribute+=Attribute ("," listeAttribute+=Attribute)* '}')?
	//	'listeRole' '{' listeRole+=Role ("," listeRole+=Role)* '}'
	//	'}';
	public AssociationElements getAssociationAccess() {
		return pAssociation;
	}
	
	public ParserRule getAssociationRule() {
		return getAssociationAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Attribute:
	//	{Attribute}
	//	'Attribute'
	//	name=EString
	//	'{' ('type' type=EString)?
	//	'}';
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//Methode:
	//	{Methode}
	//	'Methode'
	//	name=EString
	//	'{' ('returnType' returnType=EString)?
	//	'}';
	public MethodeElements getMethodeAccess() {
		return pMethode;
	}
	
	public ParserRule getMethodeRule() {
		return getMethodeAccess().getRule();
	}
	
	//Role:
	//	'Role'
	//	'{' ('Multiplicity' Multiplicity=EString)?
	//	'classDedie' classDedie=SmallClass
	//	'}';
	public RoleElements getRoleAccess() {
		return pRole;
	}
	
	public ParserRule getRoleRule() {
		return getRoleAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}