package com.milenguaje.simple.interprete2.ast;

import java.util.Map;

public class Random implements ASTNode {
	private ASTNode data;
	
	public Random(ASTNode data) {
		super();
		this.data = data;
	}
	
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		return (int)(Math.random() * (int)data.execute(symbolTable));
	}

}
