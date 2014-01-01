package de.dekarlab.simplegr.expr;

import de.dekarlab.simplegr.parser.SimpleGrParser;
import de.dekarlab.simplegr.util.FunctionHandler;
import de.dekarlab.simplegr.util.VariableValueHandler;

public class ASTNumSubstrExpr extends NumberExpr {

	public ASTNumSubstrExpr(int id) {
		super(id);
	}

	public ASTNumSubstrExpr(SimpleGrParser parser, int id) {
		super(parser, id);
	}

	public Double evaluateAsDouble(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		Expression exprLeft = (Expression) jjtGetChild(0);
		Expression exprRight = (Expression) jjtGetChild(1);
		return exprLeft.evaluateAsNumber(variables, functions).doubleValue()
				- exprRight.evaluateAsNumber(variables, functions)
						.doubleValue();
	}

}
