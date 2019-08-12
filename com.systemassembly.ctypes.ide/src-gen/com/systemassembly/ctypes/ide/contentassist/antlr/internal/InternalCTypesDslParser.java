package com.systemassembly.ctypes.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.systemassembly.ctypes.services.CTypesDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCTypesDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(CTypesDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalCTypesDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalCTypesDsl.g:54:1: ( ruleModel EOF )
            // InternalCTypesDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCTypesDsl.g:62:1: ruleModel : ( ( rule__Model__DataTypeDefinitionsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:66:2: ( ( ( rule__Model__DataTypeDefinitionsAssignment )* ) )
            // InternalCTypesDsl.g:67:2: ( ( rule__Model__DataTypeDefinitionsAssignment )* )
            {
            // InternalCTypesDsl.g:67:2: ( ( rule__Model__DataTypeDefinitionsAssignment )* )
            // InternalCTypesDsl.g:68:3: ( rule__Model__DataTypeDefinitionsAssignment )*
            {
             before(grammarAccess.getModelAccess().getDataTypeDefinitionsAssignment()); 
            // InternalCTypesDsl.g:69:3: ( rule__Model__DataTypeDefinitionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCTypesDsl.g:69:4: rule__Model__DataTypeDefinitionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__DataTypeDefinitionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDataTypeDefinitionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDataTypeDef"
    // InternalCTypesDsl.g:78:1: entryRuleDataTypeDef : ruleDataTypeDef EOF ;
    public final void entryRuleDataTypeDef() throws RecognitionException {
        try {
            // InternalCTypesDsl.g:79:1: ( ruleDataTypeDef EOF )
            // InternalCTypesDsl.g:80:1: ruleDataTypeDef EOF
            {
             before(grammarAccess.getDataTypeDefRule()); 
            pushFollow(FOLLOW_1);
            ruleDataTypeDef();

            state._fsp--;

             after(grammarAccess.getDataTypeDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataTypeDef"


    // $ANTLR start "ruleDataTypeDef"
    // InternalCTypesDsl.g:87:1: ruleDataTypeDef : ( ruleStructDef ) ;
    public final void ruleDataTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:91:2: ( ( ruleStructDef ) )
            // InternalCTypesDsl.g:92:2: ( ruleStructDef )
            {
            // InternalCTypesDsl.g:92:2: ( ruleStructDef )
            // InternalCTypesDsl.g:93:3: ruleStructDef
            {
             before(grammarAccess.getDataTypeDefAccess().getStructDefParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleStructDef();

            state._fsp--;

             after(grammarAccess.getDataTypeDefAccess().getStructDefParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypeDef"


    // $ANTLR start "entryRuleBasicType"
    // InternalCTypesDsl.g:103:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalCTypesDsl.g:104:1: ( ruleBasicType EOF )
            // InternalCTypesDsl.g:105:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalCTypesDsl.g:112:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:116:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalCTypesDsl.g:117:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalCTypesDsl.g:117:2: ( ( rule__BasicType__Alternatives ) )
            // InternalCTypesDsl.g:118:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalCTypesDsl.g:119:3: ( rule__BasicType__Alternatives )
            // InternalCTypesDsl.g:119:4: rule__BasicType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleStructDef"
    // InternalCTypesDsl.g:128:1: entryRuleStructDef : ruleStructDef EOF ;
    public final void entryRuleStructDef() throws RecognitionException {
        try {
            // InternalCTypesDsl.g:129:1: ( ruleStructDef EOF )
            // InternalCTypesDsl.g:130:1: ruleStructDef EOF
            {
             before(grammarAccess.getStructDefRule()); 
            pushFollow(FOLLOW_1);
            ruleStructDef();

            state._fsp--;

             after(grammarAccess.getStructDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructDef"


    // $ANTLR start "ruleStructDef"
    // InternalCTypesDsl.g:137:1: ruleStructDef : ( ( rule__StructDef__Group__0 ) ) ;
    public final void ruleStructDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:141:2: ( ( ( rule__StructDef__Group__0 ) ) )
            // InternalCTypesDsl.g:142:2: ( ( rule__StructDef__Group__0 ) )
            {
            // InternalCTypesDsl.g:142:2: ( ( rule__StructDef__Group__0 ) )
            // InternalCTypesDsl.g:143:3: ( rule__StructDef__Group__0 )
            {
             before(grammarAccess.getStructDefAccess().getGroup()); 
            // InternalCTypesDsl.g:144:3: ( rule__StructDef__Group__0 )
            // InternalCTypesDsl.g:144:4: rule__StructDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StructDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructDef"


    // $ANTLR start "entryRuleStructField"
    // InternalCTypesDsl.g:153:1: entryRuleStructField : ruleStructField EOF ;
    public final void entryRuleStructField() throws RecognitionException {
        try {
            // InternalCTypesDsl.g:154:1: ( ruleStructField EOF )
            // InternalCTypesDsl.g:155:1: ruleStructField EOF
            {
             before(grammarAccess.getStructFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleStructField();

            state._fsp--;

             after(grammarAccess.getStructFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructField"


    // $ANTLR start "ruleStructField"
    // InternalCTypesDsl.g:162:1: ruleStructField : ( ( rule__StructField__Group__0 ) ) ;
    public final void ruleStructField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:166:2: ( ( ( rule__StructField__Group__0 ) ) )
            // InternalCTypesDsl.g:167:2: ( ( rule__StructField__Group__0 ) )
            {
            // InternalCTypesDsl.g:167:2: ( ( rule__StructField__Group__0 ) )
            // InternalCTypesDsl.g:168:3: ( rule__StructField__Group__0 )
            {
             before(grammarAccess.getStructFieldAccess().getGroup()); 
            // InternalCTypesDsl.g:169:3: ( rule__StructField__Group__0 )
            // InternalCTypesDsl.g:169:4: rule__StructField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StructField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructField"


    // $ANTLR start "rule__BasicType__Alternatives"
    // InternalCTypesDsl.g:177:1: rule__BasicType__Alternatives : ( ( 'int8' ) | ( 'int16' ) | ( 'int32' ) | ( 'int64' ) | ( 'uint8' ) | ( 'uint16' ) | ( 'uint32' ) | ( 'uint64' ) | ( 'float' ) | ( 'double' ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:181:1: ( ( 'int8' ) | ( 'int16' ) | ( 'int32' ) | ( 'int64' ) | ( 'uint8' ) | ( 'uint16' ) | ( 'uint32' ) | ( 'uint64' ) | ( 'float' ) | ( 'double' ) )
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
                    // InternalCTypesDsl.g:182:2: ( 'int8' )
                    {
                    // InternalCTypesDsl.g:182:2: ( 'int8' )
                    // InternalCTypesDsl.g:183:3: 'int8'
                    {
                     before(grammarAccess.getBasicTypeAccess().getInt8Keyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getInt8Keyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCTypesDsl.g:188:2: ( 'int16' )
                    {
                    // InternalCTypesDsl.g:188:2: ( 'int16' )
                    // InternalCTypesDsl.g:189:3: 'int16'
                    {
                     before(grammarAccess.getBasicTypeAccess().getInt16Keyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getInt16Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCTypesDsl.g:194:2: ( 'int32' )
                    {
                    // InternalCTypesDsl.g:194:2: ( 'int32' )
                    // InternalCTypesDsl.g:195:3: 'int32'
                    {
                     before(grammarAccess.getBasicTypeAccess().getInt32Keyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getInt32Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCTypesDsl.g:200:2: ( 'int64' )
                    {
                    // InternalCTypesDsl.g:200:2: ( 'int64' )
                    // InternalCTypesDsl.g:201:3: 'int64'
                    {
                     before(grammarAccess.getBasicTypeAccess().getInt64Keyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getInt64Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCTypesDsl.g:206:2: ( 'uint8' )
                    {
                    // InternalCTypesDsl.g:206:2: ( 'uint8' )
                    // InternalCTypesDsl.g:207:3: 'uint8'
                    {
                     before(grammarAccess.getBasicTypeAccess().getUint8Keyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getUint8Keyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCTypesDsl.g:212:2: ( 'uint16' )
                    {
                    // InternalCTypesDsl.g:212:2: ( 'uint16' )
                    // InternalCTypesDsl.g:213:3: 'uint16'
                    {
                     before(grammarAccess.getBasicTypeAccess().getUint16Keyword_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getUint16Keyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCTypesDsl.g:218:2: ( 'uint32' )
                    {
                    // InternalCTypesDsl.g:218:2: ( 'uint32' )
                    // InternalCTypesDsl.g:219:3: 'uint32'
                    {
                     before(grammarAccess.getBasicTypeAccess().getUint32Keyword_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getUint32Keyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCTypesDsl.g:224:2: ( 'uint64' )
                    {
                    // InternalCTypesDsl.g:224:2: ( 'uint64' )
                    // InternalCTypesDsl.g:225:3: 'uint64'
                    {
                     before(grammarAccess.getBasicTypeAccess().getUint64Keyword_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getUint64Keyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCTypesDsl.g:230:2: ( 'float' )
                    {
                    // InternalCTypesDsl.g:230:2: ( 'float' )
                    // InternalCTypesDsl.g:231:3: 'float'
                    {
                     before(grammarAccess.getBasicTypeAccess().getFloatKeyword_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getFloatKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCTypesDsl.g:236:2: ( 'double' )
                    {
                    // InternalCTypesDsl.g:236:2: ( 'double' )
                    // InternalCTypesDsl.g:237:3: 'double'
                    {
                     before(grammarAccess.getBasicTypeAccess().getDoubleKeyword_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getDoubleKeyword_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__Alternatives"


    // $ANTLR start "rule__StructField__Alternatives_0"
    // InternalCTypesDsl.g:246:1: rule__StructField__Alternatives_0 : ( ( ( rule__StructField__BasicTypeAssignment_0_0 ) ) | ( ( rule__StructField__DerivedTypeAssignment_0_1 ) ) );
    public final void rule__StructField__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:250:1: ( ( ( rule__StructField__BasicTypeAssignment_0_0 ) ) | ( ( rule__StructField__DerivedTypeAssignment_0_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=20)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCTypesDsl.g:251:2: ( ( rule__StructField__BasicTypeAssignment_0_0 ) )
                    {
                    // InternalCTypesDsl.g:251:2: ( ( rule__StructField__BasicTypeAssignment_0_0 ) )
                    // InternalCTypesDsl.g:252:3: ( rule__StructField__BasicTypeAssignment_0_0 )
                    {
                     before(grammarAccess.getStructFieldAccess().getBasicTypeAssignment_0_0()); 
                    // InternalCTypesDsl.g:253:3: ( rule__StructField__BasicTypeAssignment_0_0 )
                    // InternalCTypesDsl.g:253:4: rule__StructField__BasicTypeAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StructField__BasicTypeAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStructFieldAccess().getBasicTypeAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCTypesDsl.g:257:2: ( ( rule__StructField__DerivedTypeAssignment_0_1 ) )
                    {
                    // InternalCTypesDsl.g:257:2: ( ( rule__StructField__DerivedTypeAssignment_0_1 ) )
                    // InternalCTypesDsl.g:258:3: ( rule__StructField__DerivedTypeAssignment_0_1 )
                    {
                     before(grammarAccess.getStructFieldAccess().getDerivedTypeAssignment_0_1()); 
                    // InternalCTypesDsl.g:259:3: ( rule__StructField__DerivedTypeAssignment_0_1 )
                    // InternalCTypesDsl.g:259:4: rule__StructField__DerivedTypeAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StructField__DerivedTypeAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStructFieldAccess().getDerivedTypeAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Alternatives_0"


    // $ANTLR start "rule__StructDef__Group__0"
    // InternalCTypesDsl.g:267:1: rule__StructDef__Group__0 : rule__StructDef__Group__0__Impl rule__StructDef__Group__1 ;
    public final void rule__StructDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:271:1: ( rule__StructDef__Group__0__Impl rule__StructDef__Group__1 )
            // InternalCTypesDsl.g:272:2: rule__StructDef__Group__0__Impl rule__StructDef__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__StructDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDef__Group__0"


    // $ANTLR start "rule__StructDef__Group__0__Impl"
    // InternalCTypesDsl.g:279:1: rule__StructDef__Group__0__Impl : ( 'struct' ) ;
    public final void rule__StructDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:283:1: ( ( 'struct' ) )
            // InternalCTypesDsl.g:284:1: ( 'struct' )
            {
            // InternalCTypesDsl.g:284:1: ( 'struct' )
            // InternalCTypesDsl.g:285:2: 'struct'
            {
             before(grammarAccess.getStructDefAccess().getStructKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStructDefAccess().getStructKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDef__Group__0__Impl"


    // $ANTLR start "rule__StructDef__Group__1"
    // InternalCTypesDsl.g:294:1: rule__StructDef__Group__1 : rule__StructDef__Group__1__Impl rule__StructDef__Group__2 ;
    public final void rule__StructDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:298:1: ( rule__StructDef__Group__1__Impl rule__StructDef__Group__2 )
            // InternalCTypesDsl.g:299:2: rule__StructDef__Group__1__Impl rule__StructDef__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__StructDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDef__Group__1"


    // $ANTLR start "rule__StructDef__Group__1__Impl"
    // InternalCTypesDsl.g:306:1: rule__StructDef__Group__1__Impl : ( ( rule__StructDef__NameAssignment_1 ) ) ;
    public final void rule__StructDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:310:1: ( ( ( rule__StructDef__NameAssignment_1 ) ) )
            // InternalCTypesDsl.g:311:1: ( ( rule__StructDef__NameAssignment_1 ) )
            {
            // InternalCTypesDsl.g:311:1: ( ( rule__StructDef__NameAssignment_1 ) )
            // InternalCTypesDsl.g:312:2: ( rule__StructDef__NameAssignment_1 )
            {
             before(grammarAccess.getStructDefAccess().getNameAssignment_1()); 
            // InternalCTypesDsl.g:313:2: ( rule__StructDef__NameAssignment_1 )
            // InternalCTypesDsl.g:313:3: rule__StructDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StructDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStructDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDef__Group__1__Impl"


    // $ANTLR start "rule__StructDef__Group__2"
    // InternalCTypesDsl.g:321:1: rule__StructDef__Group__2 : rule__StructDef__Group__2__Impl rule__StructDef__Group__3 ;
    public final void rule__StructDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:325:1: ( rule__StructDef__Group__2__Impl rule__StructDef__Group__3 )
            // InternalCTypesDsl.g:326:2: rule__StructDef__Group__2__Impl rule__StructDef__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__StructDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDef__Group__2"


    // $ANTLR start "rule__StructDef__Group__2__Impl"
    // InternalCTypesDsl.g:333:1: rule__StructDef__Group__2__Impl : ( '{' ) ;
    public final void rule__StructDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:337:1: ( ( '{' ) )
            // InternalCTypesDsl.g:338:1: ( '{' )
            {
            // InternalCTypesDsl.g:338:1: ( '{' )
            // InternalCTypesDsl.g:339:2: '{'
            {
             before(grammarAccess.getStructDefAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStructDefAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDef__Group__2__Impl"


    // $ANTLR start "rule__StructDef__Group__3"
    // InternalCTypesDsl.g:348:1: rule__StructDef__Group__3 : rule__StructDef__Group__3__Impl rule__StructDef__Group__4 ;
    public final void rule__StructDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:352:1: ( rule__StructDef__Group__3__Impl rule__StructDef__Group__4 )
            // InternalCTypesDsl.g:353:2: rule__StructDef__Group__3__Impl rule__StructDef__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__StructDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDef__Group__3"


    // $ANTLR start "rule__StructDef__Group__3__Impl"
    // InternalCTypesDsl.g:360:1: rule__StructDef__Group__3__Impl : ( ( rule__StructDef__FieldsAssignment_3 )* ) ;
    public final void rule__StructDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:364:1: ( ( ( rule__StructDef__FieldsAssignment_3 )* ) )
            // InternalCTypesDsl.g:365:1: ( ( rule__StructDef__FieldsAssignment_3 )* )
            {
            // InternalCTypesDsl.g:365:1: ( ( rule__StructDef__FieldsAssignment_3 )* )
            // InternalCTypesDsl.g:366:2: ( rule__StructDef__FieldsAssignment_3 )*
            {
             before(grammarAccess.getStructDefAccess().getFieldsAssignment_3()); 
            // InternalCTypesDsl.g:367:2: ( rule__StructDef__FieldsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=11 && LA4_0<=20)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCTypesDsl.g:367:3: rule__StructDef__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StructDef__FieldsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getStructDefAccess().getFieldsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDef__Group__3__Impl"


    // $ANTLR start "rule__StructDef__Group__4"
    // InternalCTypesDsl.g:375:1: rule__StructDef__Group__4 : rule__StructDef__Group__4__Impl rule__StructDef__Group__5 ;
    public final void rule__StructDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:379:1: ( rule__StructDef__Group__4__Impl rule__StructDef__Group__5 )
            // InternalCTypesDsl.g:380:2: rule__StructDef__Group__4__Impl rule__StructDef__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__StructDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDef__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDef__Group__4"


    // $ANTLR start "rule__StructDef__Group__4__Impl"
    // InternalCTypesDsl.g:387:1: rule__StructDef__Group__4__Impl : ( '}' ) ;
    public final void rule__StructDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:391:1: ( ( '}' ) )
            // InternalCTypesDsl.g:392:1: ( '}' )
            {
            // InternalCTypesDsl.g:392:1: ( '}' )
            // InternalCTypesDsl.g:393:2: '}'
            {
             before(grammarAccess.getStructDefAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStructDefAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDef__Group__4__Impl"


    // $ANTLR start "rule__StructDef__Group__5"
    // InternalCTypesDsl.g:402:1: rule__StructDef__Group__5 : rule__StructDef__Group__5__Impl ;
    public final void rule__StructDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:406:1: ( rule__StructDef__Group__5__Impl )
            // InternalCTypesDsl.g:407:2: rule__StructDef__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructDef__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDef__Group__5"


    // $ANTLR start "rule__StructDef__Group__5__Impl"
    // InternalCTypesDsl.g:413:1: rule__StructDef__Group__5__Impl : ( ';' ) ;
    public final void rule__StructDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:417:1: ( ( ';' ) )
            // InternalCTypesDsl.g:418:1: ( ';' )
            {
            // InternalCTypesDsl.g:418:1: ( ';' )
            // InternalCTypesDsl.g:419:2: ';'
            {
             before(grammarAccess.getStructDefAccess().getSemicolonKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStructDefAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDef__Group__5__Impl"


    // $ANTLR start "rule__StructField__Group__0"
    // InternalCTypesDsl.g:429:1: rule__StructField__Group__0 : rule__StructField__Group__0__Impl rule__StructField__Group__1 ;
    public final void rule__StructField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:433:1: ( rule__StructField__Group__0__Impl rule__StructField__Group__1 )
            // InternalCTypesDsl.g:434:2: rule__StructField__Group__0__Impl rule__StructField__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__StructField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group__0"


    // $ANTLR start "rule__StructField__Group__0__Impl"
    // InternalCTypesDsl.g:441:1: rule__StructField__Group__0__Impl : ( ( rule__StructField__Alternatives_0 ) ) ;
    public final void rule__StructField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:445:1: ( ( ( rule__StructField__Alternatives_0 ) ) )
            // InternalCTypesDsl.g:446:1: ( ( rule__StructField__Alternatives_0 ) )
            {
            // InternalCTypesDsl.g:446:1: ( ( rule__StructField__Alternatives_0 ) )
            // InternalCTypesDsl.g:447:2: ( rule__StructField__Alternatives_0 )
            {
             before(grammarAccess.getStructFieldAccess().getAlternatives_0()); 
            // InternalCTypesDsl.g:448:2: ( rule__StructField__Alternatives_0 )
            // InternalCTypesDsl.g:448:3: rule__StructField__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__StructField__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStructFieldAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group__0__Impl"


    // $ANTLR start "rule__StructField__Group__1"
    // InternalCTypesDsl.g:456:1: rule__StructField__Group__1 : rule__StructField__Group__1__Impl rule__StructField__Group__2 ;
    public final void rule__StructField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:460:1: ( rule__StructField__Group__1__Impl rule__StructField__Group__2 )
            // InternalCTypesDsl.g:461:2: rule__StructField__Group__1__Impl rule__StructField__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__StructField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group__1"


    // $ANTLR start "rule__StructField__Group__1__Impl"
    // InternalCTypesDsl.g:468:1: rule__StructField__Group__1__Impl : ( ( rule__StructField__Group_1__0 )? ) ;
    public final void rule__StructField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:472:1: ( ( ( rule__StructField__Group_1__0 )? ) )
            // InternalCTypesDsl.g:473:1: ( ( rule__StructField__Group_1__0 )? )
            {
            // InternalCTypesDsl.g:473:1: ( ( rule__StructField__Group_1__0 )? )
            // InternalCTypesDsl.g:474:2: ( rule__StructField__Group_1__0 )?
            {
             before(grammarAccess.getStructFieldAccess().getGroup_1()); 
            // InternalCTypesDsl.g:475:2: ( rule__StructField__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCTypesDsl.g:475:3: rule__StructField__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StructField__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructFieldAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group__1__Impl"


    // $ANTLR start "rule__StructField__Group__2"
    // InternalCTypesDsl.g:483:1: rule__StructField__Group__2 : rule__StructField__Group__2__Impl rule__StructField__Group__3 ;
    public final void rule__StructField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:487:1: ( rule__StructField__Group__2__Impl rule__StructField__Group__3 )
            // InternalCTypesDsl.g:488:2: rule__StructField__Group__2__Impl rule__StructField__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__StructField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group__2"


    // $ANTLR start "rule__StructField__Group__2__Impl"
    // InternalCTypesDsl.g:495:1: rule__StructField__Group__2__Impl : ( ( rule__StructField__NameAssignment_2 ) ) ;
    public final void rule__StructField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:499:1: ( ( ( rule__StructField__NameAssignment_2 ) ) )
            // InternalCTypesDsl.g:500:1: ( ( rule__StructField__NameAssignment_2 ) )
            {
            // InternalCTypesDsl.g:500:1: ( ( rule__StructField__NameAssignment_2 ) )
            // InternalCTypesDsl.g:501:2: ( rule__StructField__NameAssignment_2 )
            {
             before(grammarAccess.getStructFieldAccess().getNameAssignment_2()); 
            // InternalCTypesDsl.g:502:2: ( rule__StructField__NameAssignment_2 )
            // InternalCTypesDsl.g:502:3: rule__StructField__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StructField__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStructFieldAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group__2__Impl"


    // $ANTLR start "rule__StructField__Group__3"
    // InternalCTypesDsl.g:510:1: rule__StructField__Group__3 : rule__StructField__Group__3__Impl ;
    public final void rule__StructField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:514:1: ( rule__StructField__Group__3__Impl )
            // InternalCTypesDsl.g:515:2: rule__StructField__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructField__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group__3"


    // $ANTLR start "rule__StructField__Group__3__Impl"
    // InternalCTypesDsl.g:521:1: rule__StructField__Group__3__Impl : ( ';' ) ;
    public final void rule__StructField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:525:1: ( ( ';' ) )
            // InternalCTypesDsl.g:526:1: ( ';' )
            {
            // InternalCTypesDsl.g:526:1: ( ';' )
            // InternalCTypesDsl.g:527:2: ';'
            {
             before(grammarAccess.getStructFieldAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStructFieldAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group__3__Impl"


    // $ANTLR start "rule__StructField__Group_1__0"
    // InternalCTypesDsl.g:537:1: rule__StructField__Group_1__0 : rule__StructField__Group_1__0__Impl rule__StructField__Group_1__1 ;
    public final void rule__StructField__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:541:1: ( rule__StructField__Group_1__0__Impl rule__StructField__Group_1__1 )
            // InternalCTypesDsl.g:542:2: rule__StructField__Group_1__0__Impl rule__StructField__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__StructField__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructField__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group_1__0"


    // $ANTLR start "rule__StructField__Group_1__0__Impl"
    // InternalCTypesDsl.g:549:1: rule__StructField__Group_1__0__Impl : ( '[' ) ;
    public final void rule__StructField__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:553:1: ( ( '[' ) )
            // InternalCTypesDsl.g:554:1: ( '[' )
            {
            // InternalCTypesDsl.g:554:1: ( '[' )
            // InternalCTypesDsl.g:555:2: '['
            {
             before(grammarAccess.getStructFieldAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStructFieldAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group_1__0__Impl"


    // $ANTLR start "rule__StructField__Group_1__1"
    // InternalCTypesDsl.g:564:1: rule__StructField__Group_1__1 : rule__StructField__Group_1__1__Impl rule__StructField__Group_1__2 ;
    public final void rule__StructField__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:568:1: ( rule__StructField__Group_1__1__Impl rule__StructField__Group_1__2 )
            // InternalCTypesDsl.g:569:2: rule__StructField__Group_1__1__Impl rule__StructField__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__StructField__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructField__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group_1__1"


    // $ANTLR start "rule__StructField__Group_1__1__Impl"
    // InternalCTypesDsl.g:576:1: rule__StructField__Group_1__1__Impl : ( ( rule__StructField__ArraySizeAssignment_1_1 ) ) ;
    public final void rule__StructField__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:580:1: ( ( ( rule__StructField__ArraySizeAssignment_1_1 ) ) )
            // InternalCTypesDsl.g:581:1: ( ( rule__StructField__ArraySizeAssignment_1_1 ) )
            {
            // InternalCTypesDsl.g:581:1: ( ( rule__StructField__ArraySizeAssignment_1_1 ) )
            // InternalCTypesDsl.g:582:2: ( rule__StructField__ArraySizeAssignment_1_1 )
            {
             before(grammarAccess.getStructFieldAccess().getArraySizeAssignment_1_1()); 
            // InternalCTypesDsl.g:583:2: ( rule__StructField__ArraySizeAssignment_1_1 )
            // InternalCTypesDsl.g:583:3: rule__StructField__ArraySizeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StructField__ArraySizeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStructFieldAccess().getArraySizeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group_1__1__Impl"


    // $ANTLR start "rule__StructField__Group_1__2"
    // InternalCTypesDsl.g:591:1: rule__StructField__Group_1__2 : rule__StructField__Group_1__2__Impl ;
    public final void rule__StructField__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:595:1: ( rule__StructField__Group_1__2__Impl )
            // InternalCTypesDsl.g:596:2: rule__StructField__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructField__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group_1__2"


    // $ANTLR start "rule__StructField__Group_1__2__Impl"
    // InternalCTypesDsl.g:602:1: rule__StructField__Group_1__2__Impl : ( ']' ) ;
    public final void rule__StructField__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:606:1: ( ( ']' ) )
            // InternalCTypesDsl.g:607:1: ( ']' )
            {
            // InternalCTypesDsl.g:607:1: ( ']' )
            // InternalCTypesDsl.g:608:2: ']'
            {
             before(grammarAccess.getStructFieldAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStructFieldAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__Group_1__2__Impl"


    // $ANTLR start "rule__Model__DataTypeDefinitionsAssignment"
    // InternalCTypesDsl.g:618:1: rule__Model__DataTypeDefinitionsAssignment : ( ruleDataTypeDef ) ;
    public final void rule__Model__DataTypeDefinitionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:622:1: ( ( ruleDataTypeDef ) )
            // InternalCTypesDsl.g:623:2: ( ruleDataTypeDef )
            {
            // InternalCTypesDsl.g:623:2: ( ruleDataTypeDef )
            // InternalCTypesDsl.g:624:3: ruleDataTypeDef
            {
             before(grammarAccess.getModelAccess().getDataTypeDefinitionsDataTypeDefParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDataTypeDef();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDataTypeDefinitionsDataTypeDefParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DataTypeDefinitionsAssignment"


    // $ANTLR start "rule__StructDef__NameAssignment_1"
    // InternalCTypesDsl.g:633:1: rule__StructDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StructDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:637:1: ( ( RULE_ID ) )
            // InternalCTypesDsl.g:638:2: ( RULE_ID )
            {
            // InternalCTypesDsl.g:638:2: ( RULE_ID )
            // InternalCTypesDsl.g:639:3: RULE_ID
            {
             before(grammarAccess.getStructDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStructDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDef__NameAssignment_1"


    // $ANTLR start "rule__StructDef__FieldsAssignment_3"
    // InternalCTypesDsl.g:648:1: rule__StructDef__FieldsAssignment_3 : ( ruleStructField ) ;
    public final void rule__StructDef__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:652:1: ( ( ruleStructField ) )
            // InternalCTypesDsl.g:653:2: ( ruleStructField )
            {
            // InternalCTypesDsl.g:653:2: ( ruleStructField )
            // InternalCTypesDsl.g:654:3: ruleStructField
            {
             before(grammarAccess.getStructDefAccess().getFieldsStructFieldParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStructField();

            state._fsp--;

             after(grammarAccess.getStructDefAccess().getFieldsStructFieldParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDef__FieldsAssignment_3"


    // $ANTLR start "rule__StructField__BasicTypeAssignment_0_0"
    // InternalCTypesDsl.g:663:1: rule__StructField__BasicTypeAssignment_0_0 : ( ruleBasicType ) ;
    public final void rule__StructField__BasicTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:667:1: ( ( ruleBasicType ) )
            // InternalCTypesDsl.g:668:2: ( ruleBasicType )
            {
            // InternalCTypesDsl.g:668:2: ( ruleBasicType )
            // InternalCTypesDsl.g:669:3: ruleBasicType
            {
             before(grammarAccess.getStructFieldAccess().getBasicTypeBasicTypeParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getStructFieldAccess().getBasicTypeBasicTypeParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__BasicTypeAssignment_0_0"


    // $ANTLR start "rule__StructField__DerivedTypeAssignment_0_1"
    // InternalCTypesDsl.g:678:1: rule__StructField__DerivedTypeAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__StructField__DerivedTypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:682:1: ( ( ( RULE_ID ) ) )
            // InternalCTypesDsl.g:683:2: ( ( RULE_ID ) )
            {
            // InternalCTypesDsl.g:683:2: ( ( RULE_ID ) )
            // InternalCTypesDsl.g:684:3: ( RULE_ID )
            {
             before(grammarAccess.getStructFieldAccess().getDerivedTypeDataTypeDefCrossReference_0_1_0()); 
            // InternalCTypesDsl.g:685:3: ( RULE_ID )
            // InternalCTypesDsl.g:686:4: RULE_ID
            {
             before(grammarAccess.getStructFieldAccess().getDerivedTypeDataTypeDefIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStructFieldAccess().getDerivedTypeDataTypeDefIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getStructFieldAccess().getDerivedTypeDataTypeDefCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__DerivedTypeAssignment_0_1"


    // $ANTLR start "rule__StructField__ArraySizeAssignment_1_1"
    // InternalCTypesDsl.g:697:1: rule__StructField__ArraySizeAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__StructField__ArraySizeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:701:1: ( ( RULE_INT ) )
            // InternalCTypesDsl.g:702:2: ( RULE_INT )
            {
            // InternalCTypesDsl.g:702:2: ( RULE_INT )
            // InternalCTypesDsl.g:703:3: RULE_INT
            {
             before(grammarAccess.getStructFieldAccess().getArraySizeINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStructFieldAccess().getArraySizeINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__ArraySizeAssignment_1_1"


    // $ANTLR start "rule__StructField__NameAssignment_2"
    // InternalCTypesDsl.g:712:1: rule__StructField__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StructField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCTypesDsl.g:716:1: ( ( RULE_ID ) )
            // InternalCTypesDsl.g:717:2: ( RULE_ID )
            {
            // InternalCTypesDsl.g:717:2: ( RULE_ID )
            // InternalCTypesDsl.g:718:3: RULE_ID
            {
             before(grammarAccess.getStructFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStructFieldAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructField__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000009FF810L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001FF812L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});

}