package de.dekarlab.simplegr.expr;

import de.dekarlab.simplegr.parser.SimpleGrParser;
import de.dekarlab.simplegr.util.FunctionHandler;
import de.dekarlab.simplegr.util.VariableValueHandler;

public class ASTNullExpr extends Expression {

	public ASTNullExpr(int id) {
		super(id);
	}

	public ASTNullExpr(SimpleGrParser parser, int numChildren) {
		super(parser, numChildren);
	}

	public String evaluateAsString(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		return null;
	}

	public Boolean evaluateAsBoolean(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		return null;
	}

	public Double evaluateAsNumber(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		return null;
	}

}
