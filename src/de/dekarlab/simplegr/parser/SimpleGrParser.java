/* SimpleGrParser.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. SimpleGrParser.java */
package de.dekarlab.simplegr.parser;

import de.dekarlab.simplegr.expr.*;

public class SimpleGrParser/*@bgen(jjtree)*/implements SimpleGrParserTreeConstants, SimpleGrParserConstants {/*@bgen(jjtree)*/
  protected JJTSimpleGrParserState jjtree = new JJTSimpleGrParserState();/**
   * Returns the root node of the AST.  
   * It only makes sense to call this after a successful parse. 
   * @return the root node
   */
  public Node rootNode() {
    return jjtree.rootNode();
  }

/*
 * Start parsing from here.
 */
  final public void parse() throws ParseException {
    Expression();
    jj_consume_token(0);
  }

/*
 * Expression.
 */
  final public void Expression() throws ParseException {
    BoolOrExpr();
  }

  final public void BoolOrExpr() throws ParseException {
    BoolAndExpr();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Or:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      jj_consume_token(Or);
ASTBoolOrExpr jjtn001 = new ASTBoolOrExpr(JJTBOOLOREXPR);
                         boolean jjtc001 = true;
                         jjtree.openNodeScope(jjtn001);
      try {
        BoolAndExpr();
      } catch (Throwable jjte001) {
if (jjtc001) {
                           jjtree.clearNodeScope(jjtn001);
                           jjtc001 = false;
                         } else {
                           jjtree.popNode();
                         }
                         if (jjte001 instanceof RuntimeException) {
                           {if (true) throw (RuntimeException)jjte001;}
                         }
                         if (jjte001 instanceof ParseException) {
                           {if (true) throw (ParseException)jjte001;}
                         }
                         {if (true) throw (Error)jjte001;}
      } finally {
if (jjtc001) {
                           jjtree.closeNodeScope(jjtn001,  2);
                         }
      }
    }
  }

  final public void BoolAndExpr() throws ParseException {
    EqualsExpr();
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case And:{
        ;
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
      jj_consume_token(And);
ASTBoolAndExpr jjtn001 = new ASTBoolAndExpr(JJTBOOLANDEXPR);
                         boolean jjtc001 = true;
                         jjtree.openNodeScope(jjtn001);
      try {
        EqualsExpr();
      } catch (Throwable jjte001) {
if (jjtc001) {
                           jjtree.clearNodeScope(jjtn001);
                           jjtc001 = false;
                         } else {
                           jjtree.popNode();
                         }
                         if (jjte001 instanceof RuntimeException) {
                           {if (true) throw (RuntimeException)jjte001;}
                         }
                         if (jjte001 instanceof ParseException) {
                           {if (true) throw (ParseException)jjte001;}
                         }
                         {if (true) throw (Error)jjte001;}
      } finally {
if (jjtc001) {
                           jjtree.closeNodeScope(jjtn001,  2);
                         }
      }
    }
  }

/** Equality expression. */
  final public void EqualsExpr() throws ParseException {
    RelationalExpr();
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Equal:
      case NotEqual:{
        ;
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        break label_3;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Equal:{
        jj_consume_token(Equal);
ASTBoolEqualsExpr jjtn001 = new ASTBoolEqualsExpr(JJTBOOLEQUALSEXPR);
               boolean jjtc001 = true;
               jjtree.openNodeScope(jjtn001);
        try {
          RelationalExpr();
        } catch (Throwable jjte001) {
if (jjtc001) {
                 jjtree.clearNodeScope(jjtn001);
                 jjtc001 = false;
               } else {
                 jjtree.popNode();
               }
               if (jjte001 instanceof RuntimeException) {
                 {if (true) throw (RuntimeException)jjte001;}
               }
               if (jjte001 instanceof ParseException) {
                 {if (true) throw (ParseException)jjte001;}
               }
               {if (true) throw (Error)jjte001;}
        } finally {
if (jjtc001) {
                 jjtree.closeNodeScope(jjtn001,  2);
               }
        }
        break;
        }
      case NotEqual:{
        jj_consume_token(NotEqual);
ASTBoolNotEqualsExpr jjtn002 = new ASTBoolNotEqualsExpr(JJTBOOLNOTEQUALSEXPR);
                  boolean jjtc002 = true;
                  jjtree.openNodeScope(jjtn002);
        try {
          RelationalExpr();
        } catch (Throwable jjte002) {
if (jjtc002) {
                    jjtree.clearNodeScope(jjtn002);
                    jjtc002 = false;
                  } else {
                    jjtree.popNode();
                  }
                  if (jjte002 instanceof RuntimeException) {
                    {if (true) throw (RuntimeException)jjte002;}
                  }
                  if (jjte002 instanceof ParseException) {
                    {if (true) throw (ParseException)jjte002;}
                  }
                  {if (true) throw (Error)jjte002;}
        } finally {
if (jjtc002) {
                    jjtree.closeNodeScope(jjtn002,  2);
                  }
        }
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

/** Relational expression. */
  final public void RelationalExpr() throws ParseException {
    AdditiveExpr();
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LessThan:
      case LessEqualThan:
      case GreaterThan:
      case GreaterEqualThan:{
        ;
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        break label_4;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LessThan:{
        jj_consume_token(LessThan);
ASTBoolLessThanExpr jjtn001 = new ASTBoolLessThanExpr(JJTBOOLLESSTHANEXPR);
                 boolean jjtc001 = true;
                 jjtree.openNodeScope(jjtn001);
        try {
          AdditiveExpr();
        } catch (Throwable jjte001) {
if (jjtc001) {
                   jjtree.clearNodeScope(jjtn001);
                   jjtc001 = false;
                 } else {
                   jjtree.popNode();
                 }
                 if (jjte001 instanceof RuntimeException) {
                   {if (true) throw (RuntimeException)jjte001;}
                 }
                 if (jjte001 instanceof ParseException) {
                   {if (true) throw (ParseException)jjte001;}
                 }
                 {if (true) throw (Error)jjte001;}
        } finally {
if (jjtc001) {
                   jjtree.closeNodeScope(jjtn001,  2);
                 }
        }
        break;
        }
      case GreaterThan:{
        jj_consume_token(GreaterThan);
ASTBoolGreaterThanExpr jjtn002 = new ASTBoolGreaterThanExpr(JJTBOOLGREATERTHANEXPR);
                    boolean jjtc002 = true;
                    jjtree.openNodeScope(jjtn002);
        try {
          AdditiveExpr();
        } catch (Throwable jjte002) {
if (jjtc002) {
                      jjtree.clearNodeScope(jjtn002);
                      jjtc002 = false;
                    } else {
                      jjtree.popNode();
                    }
                    if (jjte002 instanceof RuntimeException) {
                      {if (true) throw (RuntimeException)jjte002;}
                    }
                    if (jjte002 instanceof ParseException) {
                      {if (true) throw (ParseException)jjte002;}
                    }
                    {if (true) throw (Error)jjte002;}
        } finally {
if (jjtc002) {
                      jjtree.closeNodeScope(jjtn002,  2);
                    }
        }
        break;
        }
      case LessEqualThan:{
        jj_consume_token(LessEqualThan);
ASTBoolLessThanOrEqualsExpr jjtn003 = new ASTBoolLessThanOrEqualsExpr(JJTBOOLLESSTHANOREQUALSEXPR);
                      boolean jjtc003 = true;
                      jjtree.openNodeScope(jjtn003);
        try {
          AdditiveExpr();
        } catch (Throwable jjte003) {
if (jjtc003) {
                        jjtree.clearNodeScope(jjtn003);
                        jjtc003 = false;
                      } else {
                        jjtree.popNode();
                      }
                      if (jjte003 instanceof RuntimeException) {
                        {if (true) throw (RuntimeException)jjte003;}
                      }
                      if (jjte003 instanceof ParseException) {
                        {if (true) throw (ParseException)jjte003;}
                      }
                      {if (true) throw (Error)jjte003;}
        } finally {
if (jjtc003) {
                        jjtree.closeNodeScope(jjtn003,  2);
                      }
        }
        break;
        }
      case GreaterEqualThan:{
        jj_consume_token(GreaterEqualThan);
ASTBoolGreaterThanOrEqualsExpr jjtn004 = new ASTBoolGreaterThanOrEqualsExpr(JJTBOOLGREATERTHANOREQUALSEXPR);
                         boolean jjtc004 = true;
                         jjtree.openNodeScope(jjtn004);
        try {
          AdditiveExpr();
        } catch (Throwable jjte004) {
if (jjtc004) {
                           jjtree.clearNodeScope(jjtn004);
                           jjtc004 = false;
                         } else {
                           jjtree.popNode();
                         }
                         if (jjte004 instanceof RuntimeException) {
                           {if (true) throw (RuntimeException)jjte004;}
                         }
                         if (jjte004 instanceof ParseException) {
                           {if (true) throw (ParseException)jjte004;}
                         }
                         {if (true) throw (Error)jjte004;}
        } finally {
if (jjtc004) {
                           jjtree.closeNodeScope(jjtn004,  2);
                         }
        }
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  final public void AdditiveExpr() throws ParseException {
    MultiplicativeExpr();
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Plus:
      case Minus:{
        ;
        break;
        }
      default:
        jj_la1[6] = jj_gen;
        break label_5;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Plus:{
        jj_consume_token(Plus);
ASTNumAddExpr jjtn001 = new ASTNumAddExpr(JJTNUMADDEXPR);
             boolean jjtc001 = true;
             jjtree.openNodeScope(jjtn001);
        try {
          MultiplicativeExpr();
        } catch (Throwable jjte001) {
if (jjtc001) {
               jjtree.clearNodeScope(jjtn001);
               jjtc001 = false;
             } else {
               jjtree.popNode();
             }
             if (jjte001 instanceof RuntimeException) {
               {if (true) throw (RuntimeException)jjte001;}
             }
             if (jjte001 instanceof ParseException) {
               {if (true) throw (ParseException)jjte001;}
             }
             {if (true) throw (Error)jjte001;}
        } finally {
if (jjtc001) {
               jjtree.closeNodeScope(jjtn001,  2);
             }
        }
        break;
        }
      case Minus:{
        jj_consume_token(Minus);
ASTNumSubstrExpr jjtn002 = new ASTNumSubstrExpr(JJTNUMSUBSTREXPR);
              boolean jjtc002 = true;
              jjtree.openNodeScope(jjtn002);
        try {
          MultiplicativeExpr();
        } catch (Throwable jjte002) {
if (jjtc002) {
                jjtree.clearNodeScope(jjtn002);
                jjtc002 = false;
              } else {
                jjtree.popNode();
              }
              if (jjte002 instanceof RuntimeException) {
                {if (true) throw (RuntimeException)jjte002;}
              }
              if (jjte002 instanceof ParseException) {
                {if (true) throw (ParseException)jjte002;}
              }
              {if (true) throw (Error)jjte002;}
        } finally {
if (jjtc002) {
                jjtree.closeNodeScope(jjtn002,  2);
              }
        }
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  final public void MultiplicativeExpr() throws ParseException {
    UnaryExpr();
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Div:
      case Mult:{
        ;
        break;
        }
      default:
        jj_la1[8] = jj_gen;
        break label_6;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Mult:{
        jj_consume_token(Mult);
ASTNumMulExpr jjtn001 = new ASTNumMulExpr(JJTNUMMULEXPR);
             boolean jjtc001 = true;
             jjtree.openNodeScope(jjtn001);
        try {
          UnaryExpr();
        } catch (Throwable jjte001) {
if (jjtc001) {
               jjtree.clearNodeScope(jjtn001);
               jjtc001 = false;
             } else {
               jjtree.popNode();
             }
             if (jjte001 instanceof RuntimeException) {
               {if (true) throw (RuntimeException)jjte001;}
             }
             if (jjte001 instanceof ParseException) {
               {if (true) throw (ParseException)jjte001;}
             }
             {if (true) throw (Error)jjte001;}
        } finally {
if (jjtc001) {
               jjtree.closeNodeScope(jjtn001,  2);
             }
        }
        break;
        }
      case Div:{
        jj_consume_token(Div);
ASTNumDivExpr jjtn002 = new ASTNumDivExpr(JJTNUMDIVEXPR);
            boolean jjtc002 = true;
            jjtree.openNodeScope(jjtn002);
        try {
          UnaryExpr();
        } catch (Throwable jjte002) {
if (jjtc002) {
              jjtree.clearNodeScope(jjtn002);
              jjtc002 = false;
            } else {
              jjtree.popNode();
            }
            if (jjte002 instanceof RuntimeException) {
              {if (true) throw (RuntimeException)jjte002;}
            }
            if (jjte002 instanceof ParseException) {
              {if (true) throw (ParseException)jjte002;}
            }
            {if (true) throw (Error)jjte002;}
        } finally {
if (jjtc002) {
              jjtree.closeNodeScope(jjtn002,  2);
            }
        }
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  final public void UnaryExpr() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Not:{
      jj_consume_token(Not);
ASTBoolNotExpr jjtn001 = new ASTBoolNotExpr(JJTBOOLNOTEXPR);
          boolean jjtc001 = true;
          jjtree.openNodeScope(jjtn001);
      try {
        UnaryExpr();
      } catch (Throwable jjte001) {
if (jjtc001) {
            jjtree.clearNodeScope(jjtn001);
            jjtc001 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte001 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte001;}
          }
          if (jjte001 instanceof ParseException) {
            {if (true) throw (ParseException)jjte001;}
          }
          {if (true) throw (Error)jjte001;}
      } finally {
if (jjtc001) {
            jjtree.closeNodeScope(jjtn001,  1);
          }
      }
      break;
      }
    case NumberLit:
    case BooleanLit:
    case StringLit:
    case Null:
    case Identifier:
    case Open:{
      PrimaryExpr();
      break;
      }
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

/** Primary expression. */
  final public void PrimaryExpr() throws ParseException {
    if (jj_2_1(2)) {
      Function();
    } else {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Identifier:{
        Variable();
        break;
        }
      case NumberLit:
      case BooleanLit:
      case StringLit:
      case Null:{
        Literal();
        break;
        }
      case Open:{
        jj_consume_token(Open);
        Expression();
        jj_consume_token(Close);
        break;
        }
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

/** An Id. */
  final public void Variable() throws ParseException {/*@bgen(jjtree) Variable */
   ASTVariable jjtn000 = new ASTVariable(JJTVARIABLE);
   boolean jjtc000 = true;
   jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(Identifier);
jjtree.closeNodeScope(jjtn000, true);
                        jjtc000 = false;
jjtn000.setName(t.image);
    } finally {
if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
  }

/** An Id. */
  final public void Function() throws ParseException {/*@bgen(jjtree) FuncExpr */
   ASTFuncExpr jjtn000 = new ASTFuncExpr(JJTFUNCEXPR);
   boolean jjtc000 = true;
   jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(Identifier);
      Parameters();
jjtree.closeNodeScope(jjtn000, true);
                                    jjtc000 = false;
jjtn000.setName(t.image);
    } catch (Throwable jjte000) {
if (jjtc000) {
       jjtree.clearNodeScope(jjtn000);
       jjtc000 = false;
     } else {
       jjtree.popNode();
     }
     if (jjte000 instanceof RuntimeException) {
       {if (true) throw (RuntimeException)jjte000;}
     }
     if (jjte000 instanceof ParseException) {
       {if (true) throw (ParseException)jjte000;}
     }
     {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
       jjtree.closeNodeScope(jjtn000, true);
     }
    }
  }

  final public void Parameters() throws ParseException {
    jj_consume_token(Open);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NumberLit:
    case BooleanLit:
    case StringLit:
    case Null:
    case Not:
    case Identifier:
    case Open:{
      Expression();
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case Comma:{
          ;
          break;
          }
        default:
          jj_la1[12] = jj_gen;
          break label_7;
        }
        jj_consume_token(Comma);
        Expression();
      }
      break;
      }
    default:
      jj_la1[13] = jj_gen;
      ;
    }
    jj_consume_token(Close);
  }

/** A literal. */
  final public void Literal() throws ParseException {Token t;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NumberLit:{
ASTNumberLiteral jjtn001 = new ASTNumberLiteral(JJTNUMBERLITERAL);
           boolean jjtc001 = true;
           jjtree.openNodeScope(jjtn001);
      try {
        t = jj_consume_token(NumberLit);
jjtree.closeNodeScope(jjtn001, true);
              jjtc001 = false;
jjtn001.setValue(Double.parseDouble(t.image));
      } finally {
if (jjtc001) {
             jjtree.closeNodeScope(jjtn001, true);
           }
      }
      break;
      }
    case BooleanLit:{
ASTBooleanLiteral jjtn002 = new ASTBooleanLiteral(JJTBOOLEANLITERAL);
           boolean jjtc002 = true;
           jjtree.openNodeScope(jjtn002);
      try {
        t = jj_consume_token(BooleanLit);
jjtree.closeNodeScope(jjtn002, true);
              jjtc002 = false;
jjtn002.setValue(Boolean.parseBoolean(t.image.toLowerCase()));
      } finally {
if (jjtc002) {
             jjtree.closeNodeScope(jjtn002, true);
           }
      }
      break;
      }
    case StringLit:{
ASTStringLiteral jjtn003 = new ASTStringLiteral(JJTSTRINGLITERAL);
           boolean jjtc003 = true;
           jjtree.openNodeScope(jjtn003);
      try {
        t = jj_consume_token(StringLit);
jjtree.closeNodeScope(jjtn003, true);
              jjtc003 = false;
jjtn003.setValue(t.image);
      } finally {
if (jjtc003) {
             jjtree.closeNodeScope(jjtn003, true);
           }
      }
      break;
      }
    case Null:{
ASTNullExpr jjtn004 = new ASTNullExpr(JJTNULLEXPR);
           boolean jjtc004 = true;
           jjtree.openNodeScope(jjtn004);
      try {
        t = jj_consume_token(Null);
      } finally {
if (jjtc004) {
             jjtree.closeNodeScope(jjtn004, true);
           }
      }
      break;
      }
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_3R_9()
 {
    if (jj_scan_token(Open)) return true;
    return false;
  }

  private boolean jj_3_1()
 {
    if (jj_3R_8()) return true;
    return false;
  }

  private boolean jj_3R_8()
 {
    if (jj_scan_token(Identifier)) return true;
    if (jj_3R_9()) return true;
    return false;
  }

  /** Generated Token Manager. */
  public SimpleGrParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[15];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x800,0x400,0xc000,0xc000,0xf0000,0xf0000,0x300000,0x300000,0xc00000,0xc00000,0x10033c0,0x10023c0,0x4000000,0x10033c0,0x3c0,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[1];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public SimpleGrParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public SimpleGrParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SimpleGrParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public SimpleGrParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SimpleGrParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public SimpleGrParser(SimpleGrParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(SimpleGrParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[29];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 15; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 29; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 1; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
