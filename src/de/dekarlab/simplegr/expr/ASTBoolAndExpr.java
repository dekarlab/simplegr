package de.dekarlab.simplegr.expr;


import de.dekarlab.simplegr.parser.SimpleGrParser;
import de.dekarlab.simplegr.util.FunctionHandler;
import de.dekarlab.simplegr.util.VariableValueHandler;

public class ASTBoolAndExpr extends BoolExpr {

	public ASTBoolAndExpr(int id) {
		super(id);
	}

	public ASTBoolAndExpr(SimpleGrParser parser, int id) {
		super(parser, id);
	}

	public Boolean evaluateAsBoolean(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		Expression exprLeft = (Expression) jjtGetChild(0);
		Expression exprRight = (Expression) jjtGetChild(1);
		return exprLeft.evaluateAsBoolean(variables, functions).booleanValue()
				&& exprRight.evaluateAsBoolean(variables, functions)
						.booleanValue();
	}

}
