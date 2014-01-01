package de.dekarlab.simplegr.expr;

import de.dekarlab.simplegr.parser.SimpleGrParser;
import de.dekarlab.simplegr.util.FunctionHandler;
import de.dekarlab.simplegr.util.VariableValueHandler;

public class ASTFuncExpr extends Expression {

	private String name;

	public ASTFuncExpr(int id) {
		super(id);
	}

	public ASTFuncExpr(SimpleGrParser parser, int id) {
		super(parser, id);
	}

	public String evaluateAsString(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		return functions.getValueAsString(name, getParams(), variables);
	}

	public Boolean evaluateAsBoolean(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		return functions.getValueAsBoolean(name, getParams(), variables);
	}

	public Double evaluateAsNumber(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		return functions.getValueAsNumber(name, getParams(), variables);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Expression[] getParams() {
		int numChildren = jjtGetNumChildren();
		Expression[] params = new Expression[numChildren];
		for (int i = 0; i < numChildren; i++) {
			params[i] = (Expression) jjtGetChild(i);
		}
		return params;
	}
}
