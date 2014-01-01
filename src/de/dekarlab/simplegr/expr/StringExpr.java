package de.dekarlab.simplegr.expr;

import de.dekarlab.simplegr.parser.SimpleGrParser;


public class StringExpr extends Expression {

	public StringExpr(int id) {
		super(id);
	}

	public StringExpr(SimpleGrParser parser, int numChildren) {
		super(parser, numChildren);
	}

}
