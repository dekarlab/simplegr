package de.dekarlab.simplegr.expr;

import de.dekarlab.simplegr.parser.SimpleGrParser;

public class NumberExpr extends Expression {

	public NumberExpr(int id) {
		super(id);
	}

	public NumberExpr(SimpleGrParser parser, int id) {
		super(parser, id);
	}

}
