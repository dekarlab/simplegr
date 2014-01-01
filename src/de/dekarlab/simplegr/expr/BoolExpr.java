package de.dekarlab.simplegr.expr;

import de.dekarlab.simplegr.parser.SimpleGrParser;

public class BoolExpr extends Expression {

	public BoolExpr(int id) {
		super(id);
	}

	public BoolExpr(SimpleGrParser parser, int id) {
		super(parser, id);
	}
}
