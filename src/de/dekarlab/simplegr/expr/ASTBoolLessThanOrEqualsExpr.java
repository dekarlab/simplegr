package de.dekarlab.simplegr.expr;


import de.dekarlab.simplegr.parser.SimpleGrParser;
import de.dekarlab.simplegr.util.FunctionHandler;
import de.dekarlab.simplegr.util.VariableValueHandler;

public class ASTBoolLessThanOrEqualsExpr extends BoolExpr {

	public ASTBoolLessThanOrEqualsExpr( int id) {
		super(id);
	}

	public ASTBoolLessThanOrEqualsExpr(SimpleGrParser parser, int numChildren) {
		super(parser, numChildren);
	}

	public Boolean evaluateAsBoolean(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		Expression exprLeft = (Expression) jjtGetChild(0);
		Expression exprRight = (Expression) jjtGetChild(1);
		return exprLeft.evaluateAsNumber(variables, functions).doubleValue() <= exprRight
				.evaluateAsNumber(variables, functions).doubleValue();
	}

}
