/* SimpleGrParserTokenManager.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. SimpleGrParserTokenManager.java */
package de.dekarlab.simplegr.parser;

/** Token Manager. */
@SuppressWarnings("unused")
public class SimpleGrParserTokenManager implements SimpleGrParserConstants {

	/** Debug output. */
	public java.io.PrintStream debugStream = System.out;

	/** Set debug output. */
	public void setDebugStream(java.io.PrintStream ds) {
		debugStream = ds;
	}

	private final int jjStopStringLiteralDfa_0(int pos, long active0) {
		switch (pos) {
		case 0:
			if ((active0 & 0x1e00L) != 0L) {
				jjmatchedKind = 13;
				return 23;
			}
			return -1;
		case 1:
			if ((active0 & 0x800L) != 0L)
				return 23;
			if ((active0 & 0x1600L) != 0L) {
				jjmatchedKind = 13;
				jjmatchedPos = 1;
				return 23;
			}
			return -1;
		case 2:
			if ((active0 & 0x200L) != 0L) {
				jjmatchedKind = 13;
				jjmatchedPos = 2;
				return 23;
			}
			if ((active0 & 0x1400L) != 0L)
				return 23;
			return -1;
		default:
			return -1;
		}
	}

	private final int jjStartNfa_0(int pos, long active0) {
		return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
	}

	private int jjStopAtPos(int pos, int kind) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		return pos + 1;
	}

	private int jjMoveStringLiteralDfa0_0() {
		switch (curChar) {
		case 33:
			return jjMoveStringLiteralDfa1_0(0x8000L);
		case 40:
			return jjStopAtPos(0, 24);
		case 41:
			return jjStopAtPos(0, 25);
		case 42:
			return jjStopAtPos(0, 23);
		case 43:
			return jjStopAtPos(0, 20);
		case 44:
			return jjStopAtPos(0, 26);
		case 45:
			return jjStopAtPos(0, 21);
		case 47:
			return jjStopAtPos(0, 22);
		case 60:
			jjmatchedKind = 16;
			return jjMoveStringLiteralDfa1_0(0x20000L);
		case 61:
			return jjMoveStringLiteralDfa1_0(0x4000L);
		case 62:
			jjmatchedKind = 18;
			return jjMoveStringLiteralDfa1_0(0x80000L);
		case 65:
			return jjMoveStringLiteralDfa1_0(0x400L);
		case 78:
			return jjMoveStringLiteralDfa1_0(0x1200L);
		case 79:
			return jjMoveStringLiteralDfa1_0(0x800L);
		default:
			return jjMoveNfa_0(3, 0);
		}
	}

	private int jjMoveStringLiteralDfa1_0(long active0) {
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(0, active0);
			return 1;
		}
		switch (curChar) {
		case 61:
			if ((active0 & 0x4000L) != 0L)
				return jjStopAtPos(1, 14);
			else if ((active0 & 0x8000L) != 0L)
				return jjStopAtPos(1, 15);
			else if ((active0 & 0x20000L) != 0L)
				return jjStopAtPos(1, 17);
			else if ((active0 & 0x80000L) != 0L)
				return jjStopAtPos(1, 19);
			break;
		case 78:
			return jjMoveStringLiteralDfa2_0(active0, 0x400L);
		case 79:
			return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
		case 82:
			if ((active0 & 0x800L) != 0L)
				return jjStartNfaWithStates_0(1, 11, 23);
			break;
		case 85:
			return jjMoveStringLiteralDfa2_0(active0, 0x200L);
		default:
			break;
		}
		return jjStartNfa_0(0, active0);
	}

	private int jjMoveStringLiteralDfa2_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(0, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(1, active0);
			return 2;
		}
		switch (curChar) {
		case 68:
			if ((active0 & 0x400L) != 0L)
				return jjStartNfaWithStates_0(2, 10, 23);
			break;
		case 76:
			return jjMoveStringLiteralDfa3_0(active0, 0x200L);
		case 84:
			if ((active0 & 0x1000L) != 0L)
				return jjStartNfaWithStates_0(2, 12, 23);
			break;
		default:
			break;
		}
		return jjStartNfa_0(1, active0);
	}

	private int jjMoveStringLiteralDfa3_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(1, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(2, active0);
			return 3;
		}
		switch (curChar) {
		case 76:
			if ((active0 & 0x200L) != 0L)
				return jjStartNfaWithStates_0(3, 9, 23);
			break;
		default:
			break;
		}
		return jjStartNfa_0(2, active0);
	}

	private int jjStartNfaWithStates_0(int pos, int kind, int state) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return pos + 1;
		}
		return jjMoveNfa_0(state, pos + 1);
	}

	static final long[] jjbitVec0 = { 0x0L, 0x0L, 0xffffffffffffffffL,
			0xffffffffffffffffL };

	private int jjMoveNfa_0(int startState, int curPos) {
		int startsAt = 0;
		jjnewStateCnt = 24;
		int i = 1;
		jjstateSet[0] = startState;
		int kind = 0x7fffffff;
		for (;;) {
			if (++jjround == 0x7fffffff)
				ReInitRounds();
			if (curChar < 64) {
				long l = 1L << curChar;
				do {
					switch (jjstateSet[--i]) {
					case 3:
						if ((0x3ff000000000000L & l) != 0L) {
							jjCheckNAddTwoStates(0, 1);
						} else if (curChar == 34) {
							jjCheckNAddStates(0, 2);
						} else if (curChar == 46) {
							jjCheckNAdd(4);
						}
						break;
					case 0:
						if ((0x3ff000000000000L & l) != 0L) {
							jjCheckNAddTwoStates(0, 1);
						}
						break;
					case 1:
						if (curChar == 46) {
							jjCheckNAdd(2);
						}
						break;
					case 2:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 6)
							kind = 6;
						{
							jjCheckNAdd(2);
						}
						break;
					case 4:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 6)
							kind = 6;
						{
							jjCheckNAdd(4);
						}
						break;
					case 13:
						if (curChar == 34) {
							jjCheckNAddStates(0, 2);
						}
						break;
					case 14:
						if ((0xfffffffbffffdbffL & l) != 0L) {
							jjCheckNAddStates(0, 2);
						}
						break;
					case 16:
						if ((0x8400000000L & l) != 0L) {
							jjCheckNAddStates(0, 2);
						}
						break;
					case 17:
						if (curChar == 34 && kind > 8)
							kind = 8;
						break;
					case 18:
						if ((0xff000000000000L & l) != 0L) {
							jjCheckNAddStates(3, 6);
						}
						break;
					case 19:
						if ((0xff000000000000L & l) != 0L) {
							jjCheckNAddStates(0, 2);
						}
						break;
					case 20:
						if ((0xf000000000000L & l) != 0L)
							jjstateSet[jjnewStateCnt++] = 21;
						break;
					case 21:
						if ((0xff000000000000L & l) != 0L) {
							jjCheckNAdd(19);
						}
						break;
					case 23:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 13)
							kind = 13;
						jjstateSet[jjnewStateCnt++] = 23;
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else if (curChar < 128) {
				long l = 1L << (curChar & 077);
				do {
					switch (jjstateSet[--i]) {
					case 3:
						if ((0x7fffffe07fffffeL & l) != 0L) {
							if (kind > 13)
								kind = 13;
							{
								jjCheckNAdd(23);
							}
						}
						if (curChar == 70)
							jjstateSet[jjnewStateCnt++] = 11;
						else if (curChar == 84)
							jjstateSet[jjnewStateCnt++] = 7;
						break;
					case 5:
						if (curChar == 69 && kind > 7)
							kind = 7;
						break;
					case 6:
						if (curChar == 85) {
							jjCheckNAdd(5);
						}
						break;
					case 7:
						if (curChar == 82)
							jjstateSet[jjnewStateCnt++] = 6;
						break;
					case 8:
						if (curChar == 84)
							jjstateSet[jjnewStateCnt++] = 7;
						break;
					case 9:
						if (curChar == 83) {
							jjCheckNAdd(5);
						}
						break;
					case 10:
						if (curChar == 76)
							jjstateSet[jjnewStateCnt++] = 9;
						break;
					case 11:
						if (curChar == 65)
							jjstateSet[jjnewStateCnt++] = 10;
						break;
					case 12:
						if (curChar == 70)
							jjstateSet[jjnewStateCnt++] = 11;
						break;
					case 14:
						if ((0xffffffffefffffffL & l) != 0L) {
							jjCheckNAddStates(0, 2);
						}
						break;
					case 15:
						if (curChar == 92) {
							jjAddStates(7, 9);
						}
						break;
					case 16:
						if ((0x14404410000000L & l) != 0L) {
							jjCheckNAddStates(0, 2);
						}
						break;
					case 22:
						if ((0x7fffffe07fffffeL & l) == 0L)
							break;
						if (kind > 13)
							kind = 13;
						{
							jjCheckNAdd(23);
						}
						break;
					case 23:
						if ((0x7fffffe87fffffeL & l) == 0L)
							break;
						if (kind > 13)
							kind = 13;
						{
							jjCheckNAdd(23);
						}
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else {
				int i2 = (curChar & 0xff) >> 6;
				long l2 = 1L << (curChar & 077);
				do {
					switch (jjstateSet[--i]) {
					case 14:
						if ((jjbitVec0[i2] & l2) != 0L) {
							jjAddStates(0, 2);
						}
						break;
					default:
						if (i2 == 0 || l2 == 0)
							break;
						else
							break;
					}
				} while (i != startsAt);
			}
			if (kind != 0x7fffffff) {
				jjmatchedKind = kind;
				jjmatchedPos = curPos;
				kind = 0x7fffffff;
			}
			++curPos;
			if ((i = jjnewStateCnt) == (startsAt = 24 - (jjnewStateCnt = startsAt)))
				return curPos;
			try {
				curChar = input_stream.readChar();
			} catch (java.io.IOException e) {
				return curPos;
			}
		}
	}

	static final int[] jjnextStates = { 14, 15, 17, 14, 15, 19, 17, 16, 18, 20, };

	/** Token literal values. */
	public static final String[] jjstrLiteralImages = { "", null, null, null,
			null, null, null, null, null, "\116\125\114\114", "\101\116\104",
			"\117\122", "\116\117\124", null, "\75\75", "\41\75", "\74",
			"\74\75", "\76", "\76\75", "\53", "\55", "\57", "\52", "\50",
			"\51", "\54", null, null, };

	protected Token jjFillToken() {
		final Token t;
		final String curTokenImage;
		final int beginLine;
		final int endLine;
		final int beginColumn;
		final int endColumn;
		String im = jjstrLiteralImages[jjmatchedKind];
		curTokenImage = (im == null) ? input_stream.GetImage() : im;
		beginLine = input_stream.getBeginLine();
		beginColumn = input_stream.getBeginColumn();
		endLine = input_stream.getEndLine();
		endColumn = input_stream.getEndColumn();
		t = Token.newToken(jjmatchedKind, curTokenImage);

		t.beginLine = beginLine;
		t.endLine = endLine;
		t.beginColumn = beginColumn;
		t.endColumn = endColumn;

		return t;
	}

	int curLexState = 0;
	int defaultLexState = 0;
	int jjnewStateCnt;
	int jjround;
	int jjmatchedPos;
	int jjmatchedKind;

	/** Get the next Token. */
	public Token getNextToken() {
		Token matchedToken;
		int curPos = 0;

		EOFLoop: for (;;) {
			try {
				curChar = input_stream.BeginToken();
			} catch (java.io.IOException e) {
				jjmatchedKind = 0;
				jjmatchedPos = -1;
				matchedToken = jjFillToken();
				return matchedToken;
			}

			try {
				input_stream.backup(0);
				while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
					curChar = input_stream.BeginToken();
			} catch (java.io.IOException e1) {
				continue EOFLoop;
			}
			jjmatchedKind = 0x7fffffff;
			jjmatchedPos = 0;
			curPos = jjMoveStringLiteralDfa0_0();
			if (jjmatchedKind != 0x7fffffff) {
				if (jjmatchedPos + 1 < curPos)
					input_stream.backup(curPos - jjmatchedPos - 1);
				if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
					matchedToken = jjFillToken();
					return matchedToken;
				} else {
					continue EOFLoop;
				}
			}
			int error_line = input_stream.getEndLine();
			int error_column = input_stream.getEndColumn();
			String error_after = null;
			boolean EOFSeen = false;
			try {
				input_stream.readChar();
				input_stream.backup(1);
			} catch (java.io.IOException e1) {
				EOFSeen = true;
				error_after = curPos <= 1 ? "" : input_stream.GetImage();
				if (curChar == '\n' || curChar == '\r') {
					error_line++;
					error_column = 0;
				} else
					error_column++;
			}
			if (!EOFSeen) {
				input_stream.backup(1);
				error_after = curPos <= 1 ? "" : input_stream.GetImage();
			}
			throw new TokenMgrError(EOFSeen, curLexState, error_line,
					error_column, error_after, curChar,
					TokenMgrError.LEXICAL_ERROR);
		}
	}

	private void jjCheckNAdd(int state) {
		if (jjrounds[state] != jjround) {
			jjstateSet[jjnewStateCnt++] = state;
			jjrounds[state] = jjround;
		}
	}

	private void jjAddStates(int start, int end) {
		do {
			jjstateSet[jjnewStateCnt++] = jjnextStates[start];
		} while (start++ != end);
	}

	private void jjCheckNAddTwoStates(int state1, int state2) {
		jjCheckNAdd(state1);
		jjCheckNAdd(state2);
	}

	private void jjCheckNAddStates(int start, int end) {
		do {
			jjCheckNAdd(jjnextStates[start]);
		} while (start++ != end);
	}

	/** Constructor. */
	public SimpleGrParserTokenManager(SimpleCharStream stream) {

		if (SimpleCharStream.staticFlag)
			throw new Error(
					"ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

		input_stream = stream;
	}

	/** Constructor. */
	public SimpleGrParserTokenManager(SimpleCharStream stream, int lexState) {
		ReInit(stream);
		SwitchTo(lexState);
	}

	/** Reinitialise parser. */
	public void ReInit(SimpleCharStream stream) {
		jjmatchedPos = jjnewStateCnt = 0;
		curLexState = defaultLexState;
		input_stream = stream;
		ReInitRounds();
	}

	private void ReInitRounds() {
		int i;
		jjround = 0x80000001;
		for (i = 24; i-- > 0;)
			jjrounds[i] = 0x80000000;
	}

	/** Reinitialise parser. */
	public void ReInit(SimpleCharStream stream, int lexState) {
		ReInit(stream);
		SwitchTo(lexState);
	}

	/** Switch to specified lex state. */
	public void SwitchTo(int lexState) {
		if (lexState >= 1 || lexState < 0)
			throw new TokenMgrError("Error: Ignoring invalid lexical state : "
					+ lexState + ". State unchanged.",
					TokenMgrError.INVALID_LEXICAL_STATE);
		else
			curLexState = lexState;
	}

	/** Lexer state names. */
	public static final String[] lexStateNames = { "DEFAULT", };
	static final long[] jjtoToken = { 0x7ffffc1L, };
	static final long[] jjtoSkip = { 0x3eL, };
	protected SimpleCharStream input_stream;

	private final int[] jjrounds = new int[24];
	private final int[] jjstateSet = new int[2 * 24];

	protected char curChar;
}
