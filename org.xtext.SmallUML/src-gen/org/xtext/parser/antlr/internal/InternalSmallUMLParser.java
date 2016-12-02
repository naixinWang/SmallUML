package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.SmallUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SchemaUML'", "'{'", "'gene'", "','", "'}'", "'c'", "'ass'", "'Generalisation'", "'source'", "'cible'", "'SmallClass'", "'listeAttribute'", "'listeMethode'", "'Association'", "'listeRole'", "'Attribute'", "'type'", "'Methode'", "'returnType'", "'Role'", "'Multiplicity'", "'classDedie'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallUMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallUMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallUMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmallUML.g"; }



     	private SmallUMLGrammarAccess grammarAccess;

        public InternalSmallUMLParser(TokenStream input, SmallUMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SchemaUML";
       	}

       	@Override
       	protected SmallUMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSchemaUML"
    // InternalSmallUML.g:64:1: entryRuleSchemaUML returns [EObject current=null] : iv_ruleSchemaUML= ruleSchemaUML EOF ;
    public final EObject entryRuleSchemaUML() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaUML = null;


        try {
            // InternalSmallUML.g:64:50: (iv_ruleSchemaUML= ruleSchemaUML EOF )
            // InternalSmallUML.g:65:2: iv_ruleSchemaUML= ruleSchemaUML EOF
            {
             newCompositeNode(grammarAccess.getSchemaUMLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchemaUML=ruleSchemaUML();

            state._fsp--;

             current =iv_ruleSchemaUML; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemaUML"


    // $ANTLR start "ruleSchemaUML"
    // InternalSmallUML.g:71:1: ruleSchemaUML returns [EObject current=null] : (otherlv_0= 'SchemaUML' otherlv_1= '{' (otherlv_2= 'gene' otherlv_3= '{' ( (lv_gene_4_0= ruleGeneralisation ) ) (otherlv_5= ',' ( (lv_gene_6_0= ruleGeneralisation ) ) )* otherlv_7= '}' )? otherlv_8= 'c' otherlv_9= '{' ( (lv_c_10_0= ruleSmallClass ) ) (otherlv_11= ',' ( (lv_c_12_0= ruleSmallClass ) ) )* otherlv_13= '}' (otherlv_14= 'ass' otherlv_15= '{' ( (lv_ass_16_0= ruleAssociation ) ) (otherlv_17= ',' ( (lv_ass_18_0= ruleAssociation ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleSchemaUML() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_gene_4_0 = null;

        EObject lv_gene_6_0 = null;

        EObject lv_c_10_0 = null;

        EObject lv_c_12_0 = null;

        EObject lv_ass_16_0 = null;

        EObject lv_ass_18_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:77:2: ( (otherlv_0= 'SchemaUML' otherlv_1= '{' (otherlv_2= 'gene' otherlv_3= '{' ( (lv_gene_4_0= ruleGeneralisation ) ) (otherlv_5= ',' ( (lv_gene_6_0= ruleGeneralisation ) ) )* otherlv_7= '}' )? otherlv_8= 'c' otherlv_9= '{' ( (lv_c_10_0= ruleSmallClass ) ) (otherlv_11= ',' ( (lv_c_12_0= ruleSmallClass ) ) )* otherlv_13= '}' (otherlv_14= 'ass' otherlv_15= '{' ( (lv_ass_16_0= ruleAssociation ) ) (otherlv_17= ',' ( (lv_ass_18_0= ruleAssociation ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalSmallUML.g:78:2: (otherlv_0= 'SchemaUML' otherlv_1= '{' (otherlv_2= 'gene' otherlv_3= '{' ( (lv_gene_4_0= ruleGeneralisation ) ) (otherlv_5= ',' ( (lv_gene_6_0= ruleGeneralisation ) ) )* otherlv_7= '}' )? otherlv_8= 'c' otherlv_9= '{' ( (lv_c_10_0= ruleSmallClass ) ) (otherlv_11= ',' ( (lv_c_12_0= ruleSmallClass ) ) )* otherlv_13= '}' (otherlv_14= 'ass' otherlv_15= '{' ( (lv_ass_16_0= ruleAssociation ) ) (otherlv_17= ',' ( (lv_ass_18_0= ruleAssociation ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalSmallUML.g:78:2: (otherlv_0= 'SchemaUML' otherlv_1= '{' (otherlv_2= 'gene' otherlv_3= '{' ( (lv_gene_4_0= ruleGeneralisation ) ) (otherlv_5= ',' ( (lv_gene_6_0= ruleGeneralisation ) ) )* otherlv_7= '}' )? otherlv_8= 'c' otherlv_9= '{' ( (lv_c_10_0= ruleSmallClass ) ) (otherlv_11= ',' ( (lv_c_12_0= ruleSmallClass ) ) )* otherlv_13= '}' (otherlv_14= 'ass' otherlv_15= '{' ( (lv_ass_16_0= ruleAssociation ) ) (otherlv_17= ',' ( (lv_ass_18_0= ruleAssociation ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalSmallUML.g:79:3: otherlv_0= 'SchemaUML' otherlv_1= '{' (otherlv_2= 'gene' otherlv_3= '{' ( (lv_gene_4_0= ruleGeneralisation ) ) (otherlv_5= ',' ( (lv_gene_6_0= ruleGeneralisation ) ) )* otherlv_7= '}' )? otherlv_8= 'c' otherlv_9= '{' ( (lv_c_10_0= ruleSmallClass ) ) (otherlv_11= ',' ( (lv_c_12_0= ruleSmallClass ) ) )* otherlv_13= '}' (otherlv_14= 'ass' otherlv_15= '{' ( (lv_ass_16_0= ruleAssociation ) ) (otherlv_17= ',' ( (lv_ass_18_0= ruleAssociation ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSchemaUMLAccess().getSchemaUMLKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSchemaUMLAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSmallUML.g:87:3: (otherlv_2= 'gene' otherlv_3= '{' ( (lv_gene_4_0= ruleGeneralisation ) ) (otherlv_5= ',' ( (lv_gene_6_0= ruleGeneralisation ) ) )* otherlv_7= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmallUML.g:88:4: otherlv_2= 'gene' otherlv_3= '{' ( (lv_gene_4_0= ruleGeneralisation ) ) (otherlv_5= ',' ( (lv_gene_6_0= ruleGeneralisation ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSchemaUMLAccess().getGeneKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSchemaUMLAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalSmallUML.g:96:4: ( (lv_gene_4_0= ruleGeneralisation ) )
                    // InternalSmallUML.g:97:5: (lv_gene_4_0= ruleGeneralisation )
                    {
                    // InternalSmallUML.g:97:5: (lv_gene_4_0= ruleGeneralisation )
                    // InternalSmallUML.g:98:6: lv_gene_4_0= ruleGeneralisation
                    {

                    						newCompositeNode(grammarAccess.getSchemaUMLAccess().getGeneGeneralisationParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_gene_4_0=ruleGeneralisation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSchemaUMLRule());
                    						}
                    						add(
                    							current,
                    							"gene",
                    							lv_gene_4_0,
                    							"org.xtext.SmallUML.Generalisation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:115:4: (otherlv_5= ',' ( (lv_gene_6_0= ruleGeneralisation ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSmallUML.g:116:5: otherlv_5= ',' ( (lv_gene_6_0= ruleGeneralisation ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSchemaUMLAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalSmallUML.g:120:5: ( (lv_gene_6_0= ruleGeneralisation ) )
                    	    // InternalSmallUML.g:121:6: (lv_gene_6_0= ruleGeneralisation )
                    	    {
                    	    // InternalSmallUML.g:121:6: (lv_gene_6_0= ruleGeneralisation )
                    	    // InternalSmallUML.g:122:7: lv_gene_6_0= ruleGeneralisation
                    	    {

                    	    							newCompositeNode(grammarAccess.getSchemaUMLAccess().getGeneGeneralisationParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_gene_6_0=ruleGeneralisation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSchemaUMLRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"gene",
                    	    								lv_gene_6_0,
                    	    								"org.xtext.SmallUML.Generalisation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getSchemaUMLAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getSchemaUMLAccess().getCKeyword_3());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getSchemaUMLAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSmallUML.g:153:3: ( (lv_c_10_0= ruleSmallClass ) )
            // InternalSmallUML.g:154:4: (lv_c_10_0= ruleSmallClass )
            {
            // InternalSmallUML.g:154:4: (lv_c_10_0= ruleSmallClass )
            // InternalSmallUML.g:155:5: lv_c_10_0= ruleSmallClass
            {

            					newCompositeNode(grammarAccess.getSchemaUMLAccess().getCSmallClassParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_c_10_0=ruleSmallClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchemaUMLRule());
            					}
            					add(
            						current,
            						"c",
            						lv_c_10_0,
            						"org.xtext.SmallUML.SmallClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUML.g:172:3: (otherlv_11= ',' ( (lv_c_12_0= ruleSmallClass ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmallUML.g:173:4: otherlv_11= ',' ( (lv_c_12_0= ruleSmallClass ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_11, grammarAccess.getSchemaUMLAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSmallUML.g:177:4: ( (lv_c_12_0= ruleSmallClass ) )
            	    // InternalSmallUML.g:178:5: (lv_c_12_0= ruleSmallClass )
            	    {
            	    // InternalSmallUML.g:178:5: (lv_c_12_0= ruleSmallClass )
            	    // InternalSmallUML.g:179:6: lv_c_12_0= ruleSmallClass
            	    {

            	    						newCompositeNode(grammarAccess.getSchemaUMLAccess().getCSmallClassParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_c_12_0=ruleSmallClass();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSchemaUMLRule());
            	    						}
            	    						add(
            	    							current,
            	    							"c",
            	    							lv_c_12_0,
            	    							"org.xtext.SmallUML.SmallClass");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getSchemaUMLAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalSmallUML.g:201:3: (otherlv_14= 'ass' otherlv_15= '{' ( (lv_ass_16_0= ruleAssociation ) ) (otherlv_17= ',' ( (lv_ass_18_0= ruleAssociation ) ) )* otherlv_19= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmallUML.g:202:4: otherlv_14= 'ass' otherlv_15= '{' ( (lv_ass_16_0= ruleAssociation ) ) (otherlv_17= ',' ( (lv_ass_18_0= ruleAssociation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getSchemaUMLAccess().getAssKeyword_8_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getSchemaUMLAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalSmallUML.g:210:4: ( (lv_ass_16_0= ruleAssociation ) )
                    // InternalSmallUML.g:211:5: (lv_ass_16_0= ruleAssociation )
                    {
                    // InternalSmallUML.g:211:5: (lv_ass_16_0= ruleAssociation )
                    // InternalSmallUML.g:212:6: lv_ass_16_0= ruleAssociation
                    {

                    						newCompositeNode(grammarAccess.getSchemaUMLAccess().getAssAssociationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_ass_16_0=ruleAssociation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSchemaUMLRule());
                    						}
                    						add(
                    							current,
                    							"ass",
                    							lv_ass_16_0,
                    							"org.xtext.SmallUML.Association");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:229:4: (otherlv_17= ',' ( (lv_ass_18_0= ruleAssociation ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSmallUML.g:230:5: otherlv_17= ',' ( (lv_ass_18_0= ruleAssociation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getSchemaUMLAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSmallUML.g:234:5: ( (lv_ass_18_0= ruleAssociation ) )
                    	    // InternalSmallUML.g:235:6: (lv_ass_18_0= ruleAssociation )
                    	    {
                    	    // InternalSmallUML.g:235:6: (lv_ass_18_0= ruleAssociation )
                    	    // InternalSmallUML.g:236:7: lv_ass_18_0= ruleAssociation
                    	    {

                    	    							newCompositeNode(grammarAccess.getSchemaUMLAccess().getAssAssociationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_ass_18_0=ruleAssociation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSchemaUMLRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ass",
                    	    								lv_ass_18_0,
                    	    								"org.xtext.SmallUML.Association");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_19, grammarAccess.getSchemaUMLAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getSchemaUMLAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemaUML"


    // $ANTLR start "entryRuleGeneralisation"
    // InternalSmallUML.g:267:1: entryRuleGeneralisation returns [EObject current=null] : iv_ruleGeneralisation= ruleGeneralisation EOF ;
    public final EObject entryRuleGeneralisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralisation = null;


        try {
            // InternalSmallUML.g:267:55: (iv_ruleGeneralisation= ruleGeneralisation EOF )
            // InternalSmallUML.g:268:2: iv_ruleGeneralisation= ruleGeneralisation EOF
            {
             newCompositeNode(grammarAccess.getGeneralisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralisation=ruleGeneralisation();

            state._fsp--;

             current =iv_ruleGeneralisation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralisation"


    // $ANTLR start "ruleGeneralisation"
    // InternalSmallUML.g:274:1: ruleGeneralisation returns [EObject current=null] : (otherlv_0= 'Generalisation' otherlv_1= '{' otherlv_2= 'source' ( (lv_source_3_0= ruleSmallClass ) ) otherlv_4= 'cible' ( (lv_cible_5_0= ruleSmallClass ) ) otherlv_6= '}' ) ;
    public final EObject ruleGeneralisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_source_3_0 = null;

        EObject lv_cible_5_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:280:2: ( (otherlv_0= 'Generalisation' otherlv_1= '{' otherlv_2= 'source' ( (lv_source_3_0= ruleSmallClass ) ) otherlv_4= 'cible' ( (lv_cible_5_0= ruleSmallClass ) ) otherlv_6= '}' ) )
            // InternalSmallUML.g:281:2: (otherlv_0= 'Generalisation' otherlv_1= '{' otherlv_2= 'source' ( (lv_source_3_0= ruleSmallClass ) ) otherlv_4= 'cible' ( (lv_cible_5_0= ruleSmallClass ) ) otherlv_6= '}' )
            {
            // InternalSmallUML.g:281:2: (otherlv_0= 'Generalisation' otherlv_1= '{' otherlv_2= 'source' ( (lv_source_3_0= ruleSmallClass ) ) otherlv_4= 'cible' ( (lv_cible_5_0= ruleSmallClass ) ) otherlv_6= '}' )
            // InternalSmallUML.g:282:3: otherlv_0= 'Generalisation' otherlv_1= '{' otherlv_2= 'source' ( (lv_source_3_0= ruleSmallClass ) ) otherlv_4= 'cible' ( (lv_cible_5_0= ruleSmallClass ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralisationAccess().getGeneralisationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralisationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralisationAccess().getSourceKeyword_2());
            		
            // InternalSmallUML.g:294:3: ( (lv_source_3_0= ruleSmallClass ) )
            // InternalSmallUML.g:295:4: (lv_source_3_0= ruleSmallClass )
            {
            // InternalSmallUML.g:295:4: (lv_source_3_0= ruleSmallClass )
            // InternalSmallUML.g:296:5: lv_source_3_0= ruleSmallClass
            {

            					newCompositeNode(grammarAccess.getGeneralisationAccess().getSourceSmallClassParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_source_3_0=ruleSmallClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeneralisationRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_3_0,
            						"org.xtext.SmallUML.SmallClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneralisationAccess().getCibleKeyword_4());
            		
            // InternalSmallUML.g:317:3: ( (lv_cible_5_0= ruleSmallClass ) )
            // InternalSmallUML.g:318:4: (lv_cible_5_0= ruleSmallClass )
            {
            // InternalSmallUML.g:318:4: (lv_cible_5_0= ruleSmallClass )
            // InternalSmallUML.g:319:5: lv_cible_5_0= ruleSmallClass
            {

            					newCompositeNode(grammarAccess.getGeneralisationAccess().getCibleSmallClassParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_cible_5_0=ruleSmallClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeneralisationRule());
            					}
            					set(
            						current,
            						"cible",
            						lv_cible_5_0,
            						"org.xtext.SmallUML.SmallClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGeneralisationAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralisation"


    // $ANTLR start "entryRuleSmallClass"
    // InternalSmallUML.g:344:1: entryRuleSmallClass returns [EObject current=null] : iv_ruleSmallClass= ruleSmallClass EOF ;
    public final EObject entryRuleSmallClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallClass = null;


        try {
            // InternalSmallUML.g:344:51: (iv_ruleSmallClass= ruleSmallClass EOF )
            // InternalSmallUML.g:345:2: iv_ruleSmallClass= ruleSmallClass EOF
            {
             newCompositeNode(grammarAccess.getSmallClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmallClass=ruleSmallClass();

            state._fsp--;

             current =iv_ruleSmallClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmallClass"


    // $ANTLR start "ruleSmallClass"
    // InternalSmallUML.g:351:1: ruleSmallClass returns [EObject current=null] : ( () otherlv_1= 'SmallClass' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'listeAttribute' otherlv_5= '{' ( (lv_listeAttribute_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_listeAttribute_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'listeMethode' otherlv_11= '{' ( (lv_listeMethode_12_0= ruleMethode ) ) (otherlv_13= ',' ( (lv_listeMethode_14_0= ruleMethode ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleSmallClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_listeAttribute_6_0 = null;

        EObject lv_listeAttribute_8_0 = null;

        EObject lv_listeMethode_12_0 = null;

        EObject lv_listeMethode_14_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:357:2: ( ( () otherlv_1= 'SmallClass' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'listeAttribute' otherlv_5= '{' ( (lv_listeAttribute_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_listeAttribute_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'listeMethode' otherlv_11= '{' ( (lv_listeMethode_12_0= ruleMethode ) ) (otherlv_13= ',' ( (lv_listeMethode_14_0= ruleMethode ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalSmallUML.g:358:2: ( () otherlv_1= 'SmallClass' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'listeAttribute' otherlv_5= '{' ( (lv_listeAttribute_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_listeAttribute_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'listeMethode' otherlv_11= '{' ( (lv_listeMethode_12_0= ruleMethode ) ) (otherlv_13= ',' ( (lv_listeMethode_14_0= ruleMethode ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalSmallUML.g:358:2: ( () otherlv_1= 'SmallClass' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'listeAttribute' otherlv_5= '{' ( (lv_listeAttribute_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_listeAttribute_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'listeMethode' otherlv_11= '{' ( (lv_listeMethode_12_0= ruleMethode ) ) (otherlv_13= ',' ( (lv_listeMethode_14_0= ruleMethode ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalSmallUML.g:359:3: () otherlv_1= 'SmallClass' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'listeAttribute' otherlv_5= '{' ( (lv_listeAttribute_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_listeAttribute_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'listeMethode' otherlv_11= '{' ( (lv_listeMethode_12_0= ruleMethode ) ) (otherlv_13= ',' ( (lv_listeMethode_14_0= ruleMethode ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalSmallUML.g:359:3: ()
            // InternalSmallUML.g:360:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSmallClassAccess().getSmallClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getSmallClassAccess().getSmallClassKeyword_1());
            		
            // InternalSmallUML.g:370:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:371:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:371:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:372:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSmallClassAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSmallClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getSmallClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:393:3: (otherlv_4= 'listeAttribute' otherlv_5= '{' ( (lv_listeAttribute_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_listeAttribute_8_0= ruleAttribute ) ) )* otherlv_9= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUML.g:394:4: otherlv_4= 'listeAttribute' otherlv_5= '{' ( (lv_listeAttribute_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_listeAttribute_8_0= ruleAttribute ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSmallClassAccess().getListeAttributeKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getSmallClassAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSmallUML.g:402:4: ( (lv_listeAttribute_6_0= ruleAttribute ) )
                    // InternalSmallUML.g:403:5: (lv_listeAttribute_6_0= ruleAttribute )
                    {
                    // InternalSmallUML.g:403:5: (lv_listeAttribute_6_0= ruleAttribute )
                    // InternalSmallUML.g:404:6: lv_listeAttribute_6_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getSmallClassAccess().getListeAttributeAttributeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_listeAttribute_6_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSmallClassRule());
                    						}
                    						add(
                    							current,
                    							"listeAttribute",
                    							lv_listeAttribute_6_0,
                    							"org.xtext.SmallUML.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:421:4: (otherlv_7= ',' ( (lv_listeAttribute_8_0= ruleAttribute ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSmallUML.g:422:5: otherlv_7= ',' ( (lv_listeAttribute_8_0= ruleAttribute ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSmallClassAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSmallUML.g:426:5: ( (lv_listeAttribute_8_0= ruleAttribute ) )
                    	    // InternalSmallUML.g:427:6: (lv_listeAttribute_8_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUML.g:427:6: (lv_listeAttribute_8_0= ruleAttribute )
                    	    // InternalSmallUML.g:428:7: lv_listeAttribute_8_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getSmallClassAccess().getListeAttributeAttributeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_listeAttribute_8_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSmallClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"listeAttribute",
                    	    								lv_listeAttribute_8_0,
                    	    								"org.xtext.SmallUML.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getSmallClassAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:451:3: (otherlv_10= 'listeMethode' otherlv_11= '{' ( (lv_listeMethode_12_0= ruleMethode ) ) (otherlv_13= ',' ( (lv_listeMethode_14_0= ruleMethode ) ) )* otherlv_15= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUML.g:452:4: otherlv_10= 'listeMethode' otherlv_11= '{' ( (lv_listeMethode_12_0= ruleMethode ) ) (otherlv_13= ',' ( (lv_listeMethode_14_0= ruleMethode ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getSmallClassAccess().getListeMethodeKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getSmallClassAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSmallUML.g:460:4: ( (lv_listeMethode_12_0= ruleMethode ) )
                    // InternalSmallUML.g:461:5: (lv_listeMethode_12_0= ruleMethode )
                    {
                    // InternalSmallUML.g:461:5: (lv_listeMethode_12_0= ruleMethode )
                    // InternalSmallUML.g:462:6: lv_listeMethode_12_0= ruleMethode
                    {

                    						newCompositeNode(grammarAccess.getSmallClassAccess().getListeMethodeMethodeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_listeMethode_12_0=ruleMethode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSmallClassRule());
                    						}
                    						add(
                    							current,
                    							"listeMethode",
                    							lv_listeMethode_12_0,
                    							"org.xtext.SmallUML.Methode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:479:4: (otherlv_13= ',' ( (lv_listeMethode_14_0= ruleMethode ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSmallUML.g:480:5: otherlv_13= ',' ( (lv_listeMethode_14_0= ruleMethode ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSmallClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSmallUML.g:484:5: ( (lv_listeMethode_14_0= ruleMethode ) )
                    	    // InternalSmallUML.g:485:6: (lv_listeMethode_14_0= ruleMethode )
                    	    {
                    	    // InternalSmallUML.g:485:6: (lv_listeMethode_14_0= ruleMethode )
                    	    // InternalSmallUML.g:486:7: lv_listeMethode_14_0= ruleMethode
                    	    {

                    	    							newCompositeNode(grammarAccess.getSmallClassAccess().getListeMethodeMethodeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_listeMethode_14_0=ruleMethode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSmallClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"listeMethode",
                    	    								lv_listeMethode_14_0,
                    	    								"org.xtext.SmallUML.Methode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getSmallClassAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getSmallClassAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmallClass"


    // $ANTLR start "entryRuleAssociation"
    // InternalSmallUML.g:517:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalSmallUML.g:517:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalSmallUML.g:518:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalSmallUML.g:524:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' ( (lv_source_4_0= ruleSmallClass ) ) otherlv_5= 'cible' ( (lv_cible_6_0= ruleSmallClass ) ) (otherlv_7= 'listeAttribute' otherlv_8= '{' ( (lv_listeAttribute_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_listeAttribute_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? otherlv_13= 'listeRole' otherlv_14= '{' ( (lv_listeRole_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_listeRole_17_0= ruleRole ) ) )* otherlv_18= '}' otherlv_19= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_source_4_0 = null;

        EObject lv_cible_6_0 = null;

        EObject lv_listeAttribute_9_0 = null;

        EObject lv_listeAttribute_11_0 = null;

        EObject lv_listeRole_15_0 = null;

        EObject lv_listeRole_17_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:530:2: ( (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' ( (lv_source_4_0= ruleSmallClass ) ) otherlv_5= 'cible' ( (lv_cible_6_0= ruleSmallClass ) ) (otherlv_7= 'listeAttribute' otherlv_8= '{' ( (lv_listeAttribute_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_listeAttribute_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? otherlv_13= 'listeRole' otherlv_14= '{' ( (lv_listeRole_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_listeRole_17_0= ruleRole ) ) )* otherlv_18= '}' otherlv_19= '}' ) )
            // InternalSmallUML.g:531:2: (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' ( (lv_source_4_0= ruleSmallClass ) ) otherlv_5= 'cible' ( (lv_cible_6_0= ruleSmallClass ) ) (otherlv_7= 'listeAttribute' otherlv_8= '{' ( (lv_listeAttribute_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_listeAttribute_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? otherlv_13= 'listeRole' otherlv_14= '{' ( (lv_listeRole_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_listeRole_17_0= ruleRole ) ) )* otherlv_18= '}' otherlv_19= '}' )
            {
            // InternalSmallUML.g:531:2: (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' ( (lv_source_4_0= ruleSmallClass ) ) otherlv_5= 'cible' ( (lv_cible_6_0= ruleSmallClass ) ) (otherlv_7= 'listeAttribute' otherlv_8= '{' ( (lv_listeAttribute_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_listeAttribute_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? otherlv_13= 'listeRole' otherlv_14= '{' ( (lv_listeRole_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_listeRole_17_0= ruleRole ) ) )* otherlv_18= '}' otherlv_19= '}' )
            // InternalSmallUML.g:532:3: otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'source' ( (lv_source_4_0= ruleSmallClass ) ) otherlv_5= 'cible' ( (lv_cible_6_0= ruleSmallClass ) ) (otherlv_7= 'listeAttribute' otherlv_8= '{' ( (lv_listeAttribute_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_listeAttribute_11_0= ruleAttribute ) ) )* otherlv_12= '}' )? otherlv_13= 'listeRole' otherlv_14= '{' ( (lv_listeRole_15_0= ruleRole ) ) (otherlv_16= ',' ( (lv_listeRole_17_0= ruleRole ) ) )* otherlv_18= '}' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getAssociationKeyword_0());
            		
            // InternalSmallUML.g:536:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:537:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:537:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:538:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getSourceKeyword_3());
            		
            // InternalSmallUML.g:563:3: ( (lv_source_4_0= ruleSmallClass ) )
            // InternalSmallUML.g:564:4: (lv_source_4_0= ruleSmallClass )
            {
            // InternalSmallUML.g:564:4: (lv_source_4_0= ruleSmallClass )
            // InternalSmallUML.g:565:5: lv_source_4_0= ruleSmallClass
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getSourceSmallClassParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_source_4_0=ruleSmallClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_4_0,
            						"org.xtext.SmallUML.SmallClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getCibleKeyword_5());
            		
            // InternalSmallUML.g:586:3: ( (lv_cible_6_0= ruleSmallClass ) )
            // InternalSmallUML.g:587:4: (lv_cible_6_0= ruleSmallClass )
            {
            // InternalSmallUML.g:587:4: (lv_cible_6_0= ruleSmallClass )
            // InternalSmallUML.g:588:5: lv_cible_6_0= ruleSmallClass
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getCibleSmallClassParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_cible_6_0=ruleSmallClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"cible",
            						lv_cible_6_0,
            						"org.xtext.SmallUML.SmallClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUML.g:605:3: (otherlv_7= 'listeAttribute' otherlv_8= '{' ( (lv_listeAttribute_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_listeAttribute_11_0= ruleAttribute ) ) )* otherlv_12= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallUML.g:606:4: otherlv_7= 'listeAttribute' otherlv_8= '{' ( (lv_listeAttribute_9_0= ruleAttribute ) ) (otherlv_10= ',' ( (lv_listeAttribute_11_0= ruleAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getListeAttributeKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalSmallUML.g:614:4: ( (lv_listeAttribute_9_0= ruleAttribute ) )
                    // InternalSmallUML.g:615:5: (lv_listeAttribute_9_0= ruleAttribute )
                    {
                    // InternalSmallUML.g:615:5: (lv_listeAttribute_9_0= ruleAttribute )
                    // InternalSmallUML.g:616:6: lv_listeAttribute_9_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getAssociationAccess().getListeAttributeAttributeParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_listeAttribute_9_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationRule());
                    						}
                    						add(
                    							current,
                    							"listeAttribute",
                    							lv_listeAttribute_9_0,
                    							"org.xtext.SmallUML.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:633:4: (otherlv_10= ',' ( (lv_listeAttribute_11_0= ruleAttribute ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSmallUML.g:634:5: otherlv_10= ',' ( (lv_listeAttribute_11_0= ruleAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSmallUML.g:638:5: ( (lv_listeAttribute_11_0= ruleAttribute ) )
                    	    // InternalSmallUML.g:639:6: (lv_listeAttribute_11_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUML.g:639:6: (lv_listeAttribute_11_0= ruleAttribute )
                    	    // InternalSmallUML.g:640:7: lv_listeAttribute_11_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationAccess().getListeAttributeAttributeParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_listeAttribute_11_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssociationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"listeAttribute",
                    	    								lv_listeAttribute_11_0,
                    	    								"org.xtext.SmallUML.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_20); 

                    				newLeafNode(otherlv_12, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getAssociationAccess().getListeRoleKeyword_8());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_14, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalSmallUML.g:671:3: ( (lv_listeRole_15_0= ruleRole ) )
            // InternalSmallUML.g:672:4: (lv_listeRole_15_0= ruleRole )
            {
            // InternalSmallUML.g:672:4: (lv_listeRole_15_0= ruleRole )
            // InternalSmallUML.g:673:5: lv_listeRole_15_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getListeRoleRoleParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_6);
            lv_listeRole_15_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					add(
            						current,
            						"listeRole",
            						lv_listeRole_15_0,
            						"org.xtext.SmallUML.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUML.g:690:3: (otherlv_16= ',' ( (lv_listeRole_17_0= ruleRole ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSmallUML.g:691:4: otherlv_16= ',' ( (lv_listeRole_17_0= ruleRole ) )
            	    {
            	    otherlv_16=(Token)match(input,14,FOLLOW_21); 

            	    				newLeafNode(otherlv_16, grammarAccess.getAssociationAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalSmallUML.g:695:4: ( (lv_listeRole_17_0= ruleRole ) )
            	    // InternalSmallUML.g:696:5: (lv_listeRole_17_0= ruleRole )
            	    {
            	    // InternalSmallUML.g:696:5: (lv_listeRole_17_0= ruleRole )
            	    // InternalSmallUML.g:697:6: lv_listeRole_17_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationAccess().getListeRoleRoleParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_listeRole_17_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listeRole",
            	    							lv_listeRole_17_0,
            	    							"org.xtext.SmallUML.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_18=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_18, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_19=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:727:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUML.g:727:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUML.g:728:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmallUML.g:734:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:740:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUML.g:741:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUML.g:741:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmallUML.g:742:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:750:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUML.g:761:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallUML.g:761:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallUML.g:762:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSmallUML.g:768:1: ruleAttribute returns [EObject current=null] : ( () otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:774:2: ( ( () otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalSmallUML.g:775:2: ( () otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalSmallUML.g:775:2: ( () otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalSmallUML.g:776:3: () otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalSmallUML.g:776:3: ()
            // InternalSmallUML.g:777:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
            		
            // InternalSmallUML.g:787:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:788:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:788:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:789:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:810:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallUML.g:811:4: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getTypeKeyword_4_0());
                    			
                    // InternalSmallUML.g:815:4: ( (lv_type_5_0= ruleEString ) )
                    // InternalSmallUML.g:816:5: (lv_type_5_0= ruleEString )
                    {
                    // InternalSmallUML.g:816:5: (lv_type_5_0= ruleEString )
                    // InternalSmallUML.g:817:6: lv_type_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.xtext.SmallUML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleMethode"
    // InternalSmallUML.g:843:1: entryRuleMethode returns [EObject current=null] : iv_ruleMethode= ruleMethode EOF ;
    public final EObject entryRuleMethode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethode = null;


        try {
            // InternalSmallUML.g:843:48: (iv_ruleMethode= ruleMethode EOF )
            // InternalSmallUML.g:844:2: iv_ruleMethode= ruleMethode EOF
            {
             newCompositeNode(grammarAccess.getMethodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethode=ruleMethode();

            state._fsp--;

             current =iv_ruleMethode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethode"


    // $ANTLR start "ruleMethode"
    // InternalSmallUML.g:850:1: ruleMethode returns [EObject current=null] : ( () otherlv_1= 'Methode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( (lv_returnType_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleMethode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_returnType_5_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:856:2: ( ( () otherlv_1= 'Methode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( (lv_returnType_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalSmallUML.g:857:2: ( () otherlv_1= 'Methode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( (lv_returnType_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalSmallUML.g:857:2: ( () otherlv_1= 'Methode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( (lv_returnType_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalSmallUML.g:858:3: () otherlv_1= 'Methode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( (lv_returnType_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalSmallUML.g:858:3: ()
            // InternalSmallUML.g:859:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodeAccess().getMethodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodeAccess().getMethodeKeyword_1());
            		
            // InternalSmallUML.g:869:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:870:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:870:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:871:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:892:3: (otherlv_4= 'returnType' ( (lv_returnType_5_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSmallUML.g:893:4: otherlv_4= 'returnType' ( (lv_returnType_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getMethodeAccess().getReturnTypeKeyword_4_0());
                    			
                    // InternalSmallUML.g:897:4: ( (lv_returnType_5_0= ruleEString ) )
                    // InternalSmallUML.g:898:5: (lv_returnType_5_0= ruleEString )
                    {
                    // InternalSmallUML.g:898:5: (lv_returnType_5_0= ruleEString )
                    // InternalSmallUML.g:899:6: lv_returnType_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMethodeAccess().getReturnTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_returnType_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodeRule());
                    						}
                    						set(
                    							current,
                    							"returnType",
                    							lv_returnType_5_0,
                    							"org.xtext.SmallUML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethode"


    // $ANTLR start "entryRuleRole"
    // InternalSmallUML.g:925:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSmallUML.g:925:45: (iv_ruleRole= ruleRole EOF )
            // InternalSmallUML.g:926:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalSmallUML.g:932:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' otherlv_1= '{' (otherlv_2= 'Multiplicity' ( (lv_Multiplicity_3_0= ruleEString ) ) )? otherlv_4= 'classDedie' ( (lv_classDedie_5_0= ruleSmallClass ) ) otherlv_6= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_Multiplicity_3_0 = null;

        EObject lv_classDedie_5_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:938:2: ( (otherlv_0= 'Role' otherlv_1= '{' (otherlv_2= 'Multiplicity' ( (lv_Multiplicity_3_0= ruleEString ) ) )? otherlv_4= 'classDedie' ( (lv_classDedie_5_0= ruleSmallClass ) ) otherlv_6= '}' ) )
            // InternalSmallUML.g:939:2: (otherlv_0= 'Role' otherlv_1= '{' (otherlv_2= 'Multiplicity' ( (lv_Multiplicity_3_0= ruleEString ) ) )? otherlv_4= 'classDedie' ( (lv_classDedie_5_0= ruleSmallClass ) ) otherlv_6= '}' )
            {
            // InternalSmallUML.g:939:2: (otherlv_0= 'Role' otherlv_1= '{' (otherlv_2= 'Multiplicity' ( (lv_Multiplicity_3_0= ruleEString ) ) )? otherlv_4= 'classDedie' ( (lv_classDedie_5_0= ruleSmallClass ) ) otherlv_6= '}' )
            // InternalSmallUML.g:940:3: otherlv_0= 'Role' otherlv_1= '{' (otherlv_2= 'Multiplicity' ( (lv_Multiplicity_3_0= ruleEString ) ) )? otherlv_4= 'classDedie' ( (lv_classDedie_5_0= ruleSmallClass ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSmallUML.g:948:3: (otherlv_2= 'Multiplicity' ( (lv_Multiplicity_3_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmallUML.g:949:4: otherlv_2= 'Multiplicity' ( (lv_Multiplicity_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getMultiplicityKeyword_2_0());
                    			
                    // InternalSmallUML.g:953:4: ( (lv_Multiplicity_3_0= ruleEString ) )
                    // InternalSmallUML.g:954:5: (lv_Multiplicity_3_0= ruleEString )
                    {
                    // InternalSmallUML.g:954:5: (lv_Multiplicity_3_0= ruleEString )
                    // InternalSmallUML.g:955:6: lv_Multiplicity_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getMultiplicityEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_Multiplicity_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						set(
                    							current,
                    							"Multiplicity",
                    							lv_Multiplicity_3_0,
                    							"org.xtext.SmallUML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getClassDedieKeyword_3());
            		
            // InternalSmallUML.g:977:3: ( (lv_classDedie_5_0= ruleSmallClass ) )
            // InternalSmallUML.g:978:4: (lv_classDedie_5_0= ruleSmallClass )
            {
            // InternalSmallUML.g:978:4: (lv_classDedie_5_0= ruleSmallClass )
            // InternalSmallUML.g:979:5: lv_classDedie_5_0= ruleSmallClass
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getClassDedieSmallClassParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_classDedie_5_0=ruleSmallClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"classDedie",
            						lv_classDedie_5_0,
            						"org.xtext.SmallUML.SmallClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C08000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});

}