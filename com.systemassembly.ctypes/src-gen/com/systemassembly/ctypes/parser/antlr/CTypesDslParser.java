/*
 * generated by Xtext 2.18.0.M3
 */
package com.systemassembly.ctypes.parser.antlr;

import com.google.inject.Inject;
import com.systemassembly.ctypes.parser.antlr.internal.InternalCTypesDslParser;
import com.systemassembly.ctypes.services.CTypesDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class CTypesDslParser extends AbstractAntlrParser {

	@Inject
	private CTypesDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCTypesDslParser createParser(XtextTokenStream stream) {
		return new InternalCTypesDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public CTypesDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CTypesDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
