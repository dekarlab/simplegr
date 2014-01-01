package de.dekarlab.simplegr.expr;

import de.dekarlab.simplegr.parser.SimpleGrParser;
import de.dekarlab.simplegr.util.FunctionHandler;
import de.dekarlab.simplegr.util.VariableValueHandler;

public class ASTBoolGreaterThanOrEqualsExpr extends BoolExpr {

	public ASTBoolGreaterThanOrEqualsExpr(int id) {
		super(id);
	}

	public ASTBoolGreaterThanOrEqualsExpr(SimpleGrParser parser, int id) {
		super(parser, id);
	}

	public Boolean evaluateAsBoolean(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		Expression exprLeft = (Expression) jjtGetChild(0);
		Expression exprRight = (Expression) jjtGetChild(1);
		return exprLeft.evaluateAsNumber(variables, functions).doubleValue() >= exprRight
				.evaluateAsNumber(variables, functions).doubleValue();
	}

}
