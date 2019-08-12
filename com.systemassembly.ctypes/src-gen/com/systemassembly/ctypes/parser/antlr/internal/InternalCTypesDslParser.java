package com.systemassembly.ctypes.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.systemassembly.ctypes.services.CTypesDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCTypesDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int8'", "'int16'", "'int32'", "'int64'", "'uint8'", "'uint16'", "'uint32'", "'uint64'", "'float'", "'double'", "'struct'", "'{'", "'}'", "';'", "'['", "']'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCTypesDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCTypesDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCTypesDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCTypesDsl.g"; }



     	private CTypesDslGrammarAccess grammarAccess;

        public InternalCTypesDslParser(TokenStream input, CTypesDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected CTypesDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCTypesDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCTypesDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalCTypesDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCTypesDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_dataTypeDefinitions_0_0= ruleDataTypeDef ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_dataTypeDefinitions_0_0 = null;



        	enterRule();

        try {
            // InternalCTypesDsl.g:77:2: ( ( (lv_dataTypeDefinitions_0_0= ruleDataTypeDef ) )* )
            // InternalCTypesDsl.g:78:2: ( (lv_dataTypeDefinitions_0_0= ruleDataTypeDef ) )*
            {
            // InternalCTypesDsl.g:78:2: ( (lv_dataTypeDefinitions_0_0= ruleDataTypeDef ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCTypesDsl.g:79:3: (lv_dataTypeDefinitions_0_0= ruleDataTypeDef )
            	    {
            	    // InternalCTypesDsl.g:79:3: (lv_dataTypeDefinitions_0_0= ruleDataTypeDef )
            	    // InternalCTypesDsl.g:80:4: lv_dataTypeDefinitions_0_0= ruleDataTypeDef
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getDataTypeDefinitionsDataTypeDefParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_dataTypeDefinitions_0_0=ruleDataTypeDef();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"dataTypeDefinitions",
            	    					lv_dataTypeDefinitions_0_0,
            	    					"com.systemassembly.ctypes.CTypesDsl.DataTypeDef");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDataTypeDef"
    // InternalCTypesDsl.g:100:1: entryRuleDataTypeDef returns [EObject current=null] : iv_ruleDataTypeDef= ruleDataTypeDef EOF ;
    public final EObject entryRuleDataTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeDef = null;


        try {
            // InternalCTypesDsl.g:100:52: (iv_ruleDataTypeDef= ruleDataTypeDef EOF )
            // InternalCTypesDsl.g:101:2: iv_ruleDataTypeDef= ruleDataTypeDef EOF
            {
             newCompositeNode(grammarAccess.getDataTypeDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataTypeDef=ruleDataTypeDef();

            state._fsp--;

             current =iv_ruleDataTypeDef; 
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
    // $ANTLR end "entryRuleDataTypeDef"


    // $ANTLR start "ruleDataTypeDef"
    // InternalCTypesDsl.g:107:1: ruleDataTypeDef returns [EObject current=null] : this_StructDef_0= ruleStructDef ;
    public final EObject ruleDataTypeDef() throws RecognitionException {
        EObject current = null;

        EObject this_StructDef_0 = null;



        	enterRule();

        try {
            // InternalCTypesDsl.g:113:2: (this_StructDef_0= ruleStructDef )
            // InternalCTypesDsl.g:114:2: this_StructDef_0= ruleStructDef
            {

            		newCompositeNode(grammarAccess.getDataTypeDefAccess().getStructDefParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_StructDef_0=ruleStructDef();

            state._fsp--;


            		current = this_StructDef_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleDataTypeDef"


    // $ANTLR start "entryRuleBasicType"
    // InternalCTypesDsl.g:125:1: entryRuleBasicType returns [String current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final String entryRuleBasicType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicType = null;


        try {
            // InternalCTypesDsl.g:125:49: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalCTypesDsl.g:126:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType.getText(); 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalCTypesDsl.g:132:1: ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int8' | kw= 'int16' | kw= 'int32' | kw= 'int64' | kw= 'uint8' | kw= 'uint16' | kw= 'uint32' | kw= 'uint64' | kw= 'float' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruleBasicType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCTypesDsl.g:138:2: ( (kw= 'int8' | kw= 'int16' | kw= 'int32' | kw= 'int64' | kw= 'uint8' | kw= 'uint16' | kw= 'uint32' | kw= 'uint64' | kw= 'float' | kw= 'double' ) )
            // InternalCTypesDsl.g:139:2: (kw= 'int8' | kw= 'int16' | kw= 'int32' | kw= 'int64' | kw= 'uint8' | kw= 'uint16' | kw= 'uint32' | kw= 'uint64' | kw= 'float' | kw= 'double' )
            {
            // InternalCTypesDsl.g:139:2: (kw= 'int8' | kw= 'int16' | kw= 'int32' | kw= 'int64' | kw= 'uint8' | kw= 'uint16' | kw= 'uint32' | kw= 'uint64' | kw= 'float' | kw= 'double' )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            case 20:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCTypesDsl.g:140:3: kw= 'int8'
                    {
                    kw=(Token)match(input,11,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getInt8Keyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCTypesDsl.g:146:3: kw= 'int16'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getInt16Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCTypesDsl.g:152:3: kw= 'int32'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getInt32Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalCTypesDsl.g:158:3: kw= 'int64'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getInt64Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalCTypesDsl.g:164:3: kw= 'uint8'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getUint8Keyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalCTypesDsl.g:170:3: kw= 'uint16'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getUint16Keyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalCTypesDsl.g:176:3: kw= 'uint32'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getUint32Keyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalCTypesDsl.g:182:3: kw= 'uint64'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getUint64Keyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalCTypesDsl.g:188:3: kw= 'float'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getFloatKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalCTypesDsl.g:194:3: kw= 'double'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getDoubleKeyword_9());
                    		

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleStructDef"
    // InternalCTypesDsl.g:203:1: entryRuleStructDef returns [EObject current=null] : iv_ruleStructDef= ruleStructDef EOF ;
    public final EObject entryRuleStructDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructDef = null;


        try {
            // InternalCTypesDsl.g:203:50: (iv_ruleStructDef= ruleStructDef EOF )
            // InternalCTypesDsl.g:204:2: iv_ruleStructDef= ruleStructDef EOF
            {
             newCompositeNode(grammarAccess.getStructDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructDef=ruleStructDef();

            state._fsp--;

             current =iv_ruleStructDef; 
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
    // $ANTLR end "entryRuleStructDef"


    // $ANTLR start "ruleStructDef"
    // InternalCTypesDsl.g:210:1: ruleStructDef returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleStructField ) )* otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleStructDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalCTypesDsl.g:216:2: ( (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleStructField ) )* otherlv_4= '}' otherlv_5= ';' ) )
            // InternalCTypesDsl.g:217:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleStructField ) )* otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalCTypesDsl.g:217:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleStructField ) )* otherlv_4= '}' otherlv_5= ';' )
            // InternalCTypesDsl.g:218:3: otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleStructField ) )* otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStructDefAccess().getStructKeyword_0());
            		
            // InternalCTypesDsl.g:222:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCTypesDsl.g:223:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCTypesDsl.g:223:4: (lv_name_1_0= RULE_ID )
            // InternalCTypesDsl.g:224:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStructDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStructDefAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCTypesDsl.g:244:3: ( (lv_fields_3_0= ruleStructField ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=11 && LA3_0<=20)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCTypesDsl.g:245:4: (lv_fields_3_0= ruleStructField )
            	    {
            	    // InternalCTypesDsl.g:245:4: (lv_fields_3_0= ruleStructField )
            	    // InternalCTypesDsl.g:246:5: lv_fields_3_0= ruleStructField
            	    {

            	    					newCompositeNode(grammarAccess.getStructDefAccess().getFieldsStructFieldParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_fields_3_0=ruleStructField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStructDefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_3_0,
            	    						"com.systemassembly.ctypes.CTypesDsl.StructField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getStructDefAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStructDefAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleStructDef"


    // $ANTLR start "entryRuleStructField"
    // InternalCTypesDsl.g:275:1: entryRuleStructField returns [EObject current=null] : iv_ruleStructField= ruleStructField EOF ;
    public final EObject entryRuleStructField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructField = null;


        try {
            // InternalCTypesDsl.g:275:52: (iv_ruleStructField= ruleStructField EOF )
            // InternalCTypesDsl.g:276:2: iv_ruleStructField= ruleStructField EOF
            {
             newCompositeNode(grammarAccess.getStructFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructField=ruleStructField();

            state._fsp--;

             current =iv_ruleStructField; 
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
    // $ANTLR end "entryRuleStructField"


    // $ANTLR start "ruleStructField"
    // InternalCTypesDsl.g:282:1: ruleStructField returns [EObject current=null] : ( ( ( (lv_basicType_0_0= ruleBasicType ) ) | ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= '[' ( (lv_arraySize_3_0= RULE_INT ) ) otherlv_4= ']' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' ) ;
    public final EObject ruleStructField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_arraySize_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_basicType_0_0 = null;



        	enterRule();

        try {
            // InternalCTypesDsl.g:288:2: ( ( ( ( (lv_basicType_0_0= ruleBasicType ) ) | ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= '[' ( (lv_arraySize_3_0= RULE_INT ) ) otherlv_4= ']' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' ) )
            // InternalCTypesDsl.g:289:2: ( ( ( (lv_basicType_0_0= ruleBasicType ) ) | ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= '[' ( (lv_arraySize_3_0= RULE_INT ) ) otherlv_4= ']' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' )
            {
            // InternalCTypesDsl.g:289:2: ( ( ( (lv_basicType_0_0= ruleBasicType ) ) | ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= '[' ( (lv_arraySize_3_0= RULE_INT ) ) otherlv_4= ']' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';' )
            // InternalCTypesDsl.g:290:3: ( ( (lv_basicType_0_0= ruleBasicType ) ) | ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= '[' ( (lv_arraySize_3_0= RULE_INT ) ) otherlv_4= ']' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ';'
            {
            // InternalCTypesDsl.g:290:3: ( ( (lv_basicType_0_0= ruleBasicType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=20)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCTypesDsl.g:291:4: ( (lv_basicType_0_0= ruleBasicType ) )
                    {
                    // InternalCTypesDsl.g:291:4: ( (lv_basicType_0_0= ruleBasicType ) )
                    // InternalCTypesDsl.g:292:5: (lv_basicType_0_0= ruleBasicType )
                    {
                    // InternalCTypesDsl.g:292:5: (lv_basicType_0_0= ruleBasicType )
                    // InternalCTypesDsl.g:293:6: lv_basicType_0_0= ruleBasicType
                    {

                    						newCompositeNode(grammarAccess.getStructFieldAccess().getBasicTypeBasicTypeParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_basicType_0_0=ruleBasicType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStructFieldRule());
                    						}
                    						set(
                    							current,
                    							"basicType",
                    							lv_basicType_0_0,
                    							"com.systemassembly.ctypes.CTypesDsl.BasicType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCTypesDsl.g:311:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalCTypesDsl.g:311:4: ( (otherlv_1= RULE_ID ) )
                    // InternalCTypesDsl.g:312:5: (otherlv_1= RULE_ID )
                    {
                    // InternalCTypesDsl.g:312:5: (otherlv_1= RULE_ID )
                    // InternalCTypesDsl.g:313:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStructFieldRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_1, grammarAccess.getStructFieldAccess().getDerivedTypeDataTypeDefCrossReference_0_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCTypesDsl.g:325:3: (otherlv_2= '[' ( (lv_arraySize_3_0= RULE_INT ) ) otherlv_4= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCTypesDsl.g:326:4: otherlv_2= '[' ( (lv_arraySize_3_0= RULE_INT ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getStructFieldAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalCTypesDsl.g:330:4: ( (lv_arraySize_3_0= RULE_INT ) )
                    // InternalCTypesDsl.g:331:5: (lv_arraySize_3_0= RULE_INT )
                    {
                    // InternalCTypesDsl.g:331:5: (lv_arraySize_3_0= RULE_INT )
                    // InternalCTypesDsl.g:332:6: lv_arraySize_3_0= RULE_INT
                    {
                    lv_arraySize_3_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                    						newLeafNode(lv_arraySize_3_0, grammarAccess.getStructFieldAccess().getArraySizeINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStructFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"arraySize",
                    							lv_arraySize_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getStructFieldAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalCTypesDsl.g:353:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalCTypesDsl.g:354:4: (lv_name_5_0= RULE_ID )
            {
            // InternalCTypesDsl.g:354:4: (lv_name_5_0= RULE_ID )
            // InternalCTypesDsl.g:355:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_5_0, grammarAccess.getStructFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStructFieldAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleStructField"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000009FF810L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});

}