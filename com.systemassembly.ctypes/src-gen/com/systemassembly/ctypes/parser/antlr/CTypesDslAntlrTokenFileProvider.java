/*
 * generated by Xtext 2.18.0.M3
 */
package com.systemassembly.ctypes.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CTypesDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/systemassembly/ctypes/parser/antlr/internal/InternalCTypesDsl.tokens");
	}
}