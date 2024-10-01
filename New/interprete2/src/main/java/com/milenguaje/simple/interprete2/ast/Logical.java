package com.milenguaje.simple.interprete2.ast;

import java.util.Map;

public class Logical implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	private ASTNode type;
	private Boolean result;
	
	public Logical(ASTNode operand1, ASTNode operand2, ASTNode type) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.type = type; 
		this.result = false;
	}
	
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		switch((int)this.type.execute(symbolTable)) {
			case 1:
				this.result = (boolean)((int)operand1.execute(symbolTable) > (int)operand2.execute(symbolTable));
				break;
		  case 2:
			  	this.result = (boolean)((int)operand1.execute(symbolTable) < (int)operand2.execute(symbolTable));
			  	break;
		  case 3:
			  	this.result = (boolean)((int)operand1.execute(symbolTable) >= (int)operand2.execute(symbolTable));
			  	break;
		  case 4:
			  	this.result = (boolean)((int)operand1.execute(symbolTable) <= (int)operand2.execute(symbolTable));
			  	break;
		  case 5:
			  	this.result = (boolean)((int)operand1.execute(symbolTable) == (int)operand2.execute(symbolTable));
			  	break;
		  case 6:
			  	this.result = (boolean)((int)operand1.execute(symbolTable) != (int)operand2.execute(symbolTable));
			  	break;
		  default:
			  this.result = false;
		}
		return result;
	}
}
