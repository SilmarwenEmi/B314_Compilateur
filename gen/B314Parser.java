// Generated from /home/users/100/cedelhay/IdeaProjects/1718_INFOB314_COMPILATEUR_GROUPE04/src/main/antlr4/be/unamur/info/b314/compiler/B314.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class B314Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, INTEGER=2, SQUARE=3, TRUE=4, FALSE=5, AND=6, OR=7, NOT=8, AS=9, 
		INF=10, SUP=11, EQUAL=12, DPT=13, SCOL=14, LBR=15, RBR=16, COMMA=17, LPAR=18, 
		RPAR=19, PLUS=20, MINUS=21, MULT=22, DIV=23, MOD=24, SKIPP=25, IF=26, 
		THEN=27, DONE=28, ELSE=29, WHILE=30, DO=31, VOID=32, SET=33, TO=34, COMPUTE=35, 
		NEXT=36, NOTHING=37, FUNCTION=38, DECLARE=39, LOCAL=40, RETURN=41, IMPORT=42, 
		WLD=43, RETAIN=44, DEFAULT=45, ARENA=46, LATITUDE=47, LONGITUDE=48, GRID=49, 
		SIZE=50, MOVE=51, SHOOT=52, USE=53, MAP=54, RADIO=55, FRUITS=56, SODA=57, 
		AMMO=58, COUNT=59, GRAAL=60, IS=61, NORTH=62, SOUTH=63, EAST=64, WEST=65, 
		NEARBY=66, BY=67, DIRT=68, ROCK=69, VINES=70, ZOMBIE=71, PLAYER=72, ENNEMI=73, 
		LIFE=74, WHEN=75, YOUR=76, TURN=77, COML=78, COMR=79, ID=80, NUMBER=81, 
		COMMENT=82, NEWLINE=83, WS=84, LETTER=85;
	public static final int
		RULE_root = 0, RULE_type = 1, RULE_scalar = 2, RULE_array = 3, RULE_varDecl = 4, 
		RULE_arena = 5, RULE_item = 6, RULE_exprD = 7, RULE_exprEnt = 8, RULE_exprBool = 9, 
		RULE_exprCase = 10, RULE_exprG = 11, RULE_instruction = 12, RULE_action = 13, 
		RULE_fctDecl = 14, RULE_impDecl = 15, RULE_fileDecl = 16, RULE_fileName = 17, 
		RULE_programWorld = 18, RULE_clauseDefault = 19, RULE_programStrat = 20, 
		RULE_clauseWhen = 21, RULE_commentaire = 22, RULE_program = 23;
	public static final String[] ruleNames = {
		"root", "type", "scalar", "array", "varDecl", "arena", "item", "exprD", 
		"exprEnt", "exprBool", "exprCase", "exprG", "instruction", "action", "fctDecl", 
		"impDecl", "fileDecl", "fileName", "programWorld", "clauseDefault", "programStrat", 
		"clauseWhen", "commentaire", "program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'integer'", "'square'", "'true'", "'false'", "'and'", 
		"'or'", "'not'", "'as'", "'<'", "'>'", "'='", "':'", "';'", "'['", "']'", 
		"','", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'%'", "'skip'", "'if'", 
		"'then'", "'done'", "'else'", "'while'", "'do'", "'void'", "'set'", "'to'", 
		"'compute'", "'next'", "'nothing'", "'function'", "'declare'", "'local'", 
		"'return'", "'import'", "'wld'", "'retain'", "'default'", "'arena'", "'latitude'", 
		"'longitude'", "'grid'", "'size'", "'move'", "'shoot'", "'use'", "'map'", 
		"'radio'", "'fruits'", "'soda'", "'ammo'", "'count'", "'graal'", "'is'", 
		"'north'", "'south'", "'east'", "'west'", "'nearby'", "'by'", "'dirt'", 
		"'rock'", "'vines'", "'zombie'", "'player'", "'ennemi'", "'life'", "'when'", 
		"'your'", "'turn'", "'/*'", "'*/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN", "INTEGER", "SQUARE", "TRUE", "FALSE", "AND", "OR", "NOT", 
		"AS", "INF", "SUP", "EQUAL", "DPT", "SCOL", "LBR", "RBR", "COMMA", "LPAR", 
		"RPAR", "PLUS", "MINUS", "MULT", "DIV", "MOD", "SKIPP", "IF", "THEN", 
		"DONE", "ELSE", "WHILE", "DO", "VOID", "SET", "TO", "COMPUTE", "NEXT", 
		"NOTHING", "FUNCTION", "DECLARE", "LOCAL", "RETURN", "IMPORT", "WLD", 
		"RETAIN", "DEFAULT", "ARENA", "LATITUDE", "LONGITUDE", "GRID", "SIZE", 
		"MOVE", "SHOOT", "USE", "MAP", "RADIO", "FRUITS", "SODA", "AMMO", "COUNT", 
		"GRAAL", "IS", "NORTH", "SOUTH", "EAST", "WEST", "NEARBY", "BY", "DIRT", 
		"ROCK", "VINES", "ZOMBIE", "PLAYER", "ENNEMI", "LIFE", "WHEN", "YOUR", 
		"TURN", "COML", "COMR", "ID", "NUMBER", "COMMENT", "NEWLINE", "WS", "LETTER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "B314.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public B314Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			program();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeArrayContext extends TypeContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TypeArrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterTypeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitTypeArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitTypeArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeScalarContext extends TypeContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TypeScalarContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterTypeScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitTypeScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitTypeScalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new TypeScalarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				scalar();
				}
				break;
			case 2:
				_localctx = new TypeArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				array();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarContext extends ParserRuleContext {
		public ScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar; }
	 
		public ScalarContext() { }
		public void copyFrom(ScalarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ScalarSquareContext extends ScalarContext {
		public TerminalNode SQUARE() { return getToken(B314Parser.SQUARE, 0); }
		public ScalarSquareContext(ScalarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterScalarSquare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitScalarSquare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitScalarSquare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarBoolContext extends ScalarContext {
		public TerminalNode BOOLEAN() { return getToken(B314Parser.BOOLEAN, 0); }
		public ScalarBoolContext(ScalarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterScalarBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitScalarBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitScalarBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarIntContext extends ScalarContext {
		public TerminalNode INTEGER() { return getToken(B314Parser.INTEGER, 0); }
		public ScalarIntContext(ScalarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterScalarInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitScalarInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitScalarInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scalar);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new ScalarBoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(BOOLEAN);
				}
				break;
			case INTEGER:
				_localctx = new ScalarIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(INTEGER);
				}
				break;
			case SQUARE:
				_localctx = new ScalarSquareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(SQUARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValArrayContext extends ArrayContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TerminalNode LBR() { return getToken(B314Parser.LBR, 0); }
		public TerminalNode RBR() { return getToken(B314Parser.RBR, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(B314Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(B314Parser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(B314Parser.COMMA, 0); }
		public ValArrayContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array);
		int _la;
		try {
			_localctx = new ValArrayContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			scalar();
			setState(60);
			match(LBR);
			{
			setState(61);
			match(NUMBER);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(62);
				match(COMMA);
				{
				setState(63);
				match(NUMBER);
				}
				}
			}

			setState(66);
			match(RBR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode AS() { return getToken(B314Parser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			setState(69);
			match(AS);
			setState(70);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArenaContext extends ParserRuleContext {
		public ArenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arena; }
	 
		public ArenaContext() { }
		public void copyFrom(ArenaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValArenaContext extends ArenaContext {
		public TerminalNode ARENA() { return getToken(B314Parser.ARENA, 0); }
		public TerminalNode AS() { return getToken(B314Parser.AS, 0); }
		public TerminalNode SQUARE() { return getToken(B314Parser.SQUARE, 0); }
		public TerminalNode LBR() { return getToken(B314Parser.LBR, 0); }
		public TerminalNode COMMA() { return getToken(B314Parser.COMMA, 0); }
		public TerminalNode RBR() { return getToken(B314Parser.RBR, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(B314Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(B314Parser.NUMBER, i);
		}
		public ValArenaContext(ArenaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValArena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValArena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValArena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArenaContext arena() throws RecognitionException {
		ArenaContext _localctx = new ArenaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arena);
		int _la;
		try {
			_localctx = new ValArenaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(ARENA);
			setState(73);
			match(AS);
			setState(74);
			match(SQUARE);
			setState(75);
			match(LBR);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				match(NUMBER);
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(81);
			match(COMMA);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				match(NUMBER);
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(87);
			match(RBR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
	 
		public ItemContext() { }
		public void copyFrom(ItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValItemSContext extends ItemContext {
		public TerminalNode SODA() { return getToken(B314Parser.SODA, 0); }
		public ValItemSContext(ItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValItemS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValItemS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValItemS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValItemRContext extends ItemContext {
		public TerminalNode RADIO() { return getToken(B314Parser.RADIO, 0); }
		public ValItemRContext(ItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValItemR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValItemR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValItemR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValItemMContext extends ItemContext {
		public TerminalNode MAP() { return getToken(B314Parser.MAP, 0); }
		public ValItemMContext(ItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValItemM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValItemM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValItemM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValItemGContext extends ItemContext {
		public TerminalNode GRAAL() { return getToken(B314Parser.GRAAL, 0); }
		public ValItemGContext(ItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValItemG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValItemG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValItemG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValItemFContext extends ItemContext {
		public TerminalNode FRUITS() { return getToken(B314Parser.FRUITS, 0); }
		public ValItemFContext(ItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValItemF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValItemF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValItemF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_item);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RADIO:
				_localctx = new ValItemRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(RADIO);
				}
				break;
			case MAP:
				_localctx = new ValItemMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(MAP);
				}
				break;
			case GRAAL:
				_localctx = new ValItemGContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(GRAAL);
				}
				break;
			case SODA:
				_localctx = new ValItemSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(SODA);
				}
				break;
			case FRUITS:
				_localctx = new ValItemFContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				match(FRUITS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprDContext extends ParserRuleContext {
		public ExprDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprD; }
	 
		public ExprDContext() { }
		public void copyFrom(ExprDContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValExprGContext extends ExprDContext {
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ValExprGContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValExprG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValExprG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValExprG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValExprCaseContext extends ExprDContext {
		public ExprCaseContext exprCase() {
			return getRuleContext(ExprCaseContext.class,0);
		}
		public ValExprCaseContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValExprCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValExprCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValExprCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValFunctContext extends ExprDContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(B314Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(B314Parser.COMMA, i);
		}
		public ValFunctContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValFunct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValFunct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValFunct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValExprEntContext extends ExprDContext {
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public ValExprEntContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValExprEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValExprEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValExprEnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValExprBoolContext extends ExprDContext {
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public ValExprBoolContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValExprBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValExprBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprDContext exprD() throws RecognitionException {
		ExprDContext _localctx = new ExprDContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprD);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ValExprGContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				exprG();
				}
				break;
			case 2:
				_localctx = new ValFunctContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(ID);
				setState(98);
				match(LPAR);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << LPAR) | (1L << MINUS) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << MAP) | (1L << RADIO) | (1L << FRUITS) | (1L << SODA) | (1L << AMMO) | (1L << GRAAL))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEARBY - 66)) | (1L << (DIRT - 66)) | (1L << (ROCK - 66)) | (1L << (VINES - 66)) | (1L << (ZOMBIE - 66)) | (1L << (PLAYER - 66)) | (1L << (ENNEMI - 66)) | (1L << (LIFE - 66)) | (1L << (ID - 66)) | (1L << (NUMBER - 66)))) != 0)) {
					{
					setState(99);
					exprD();
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(100);
						match(COMMA);
						setState(101);
						exprD();
						}
						}
						setState(106);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(109);
				match(RPAR);
				}
				break;
			case 3:
				_localctx = new ValExprEntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				exprEnt(0);
				}
				break;
			case 4:
				_localctx = new ValExprBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				exprBool(0);
				}
				break;
			case 5:
				_localctx = new ValExprCaseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				exprCase();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprEntContext extends ParserRuleContext {
		public ExprEntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprEnt; }
	 
		public ExprEntContext() { }
		public void copyFrom(ExprEntContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValAddContext extends ExprEntContext {
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(B314Parser.PLUS, 0); }
		public ValAddContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValLongContext extends ExprEntContext {
		public TerminalNode LONGITUDE() { return getToken(B314Parser.LONGITUDE, 0); }
		public ValLongContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValLong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValLong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValLong(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValLifeContext extends ExprEntContext {
		public TerminalNode LIFE() { return getToken(B314Parser.LIFE, 0); }
		public ValLifeContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValLife(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValLife(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValLife(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValMultContext extends ExprEntContext {
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode MULT() { return getToken(B314Parser.MULT, 0); }
		public ValMultContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValMinusContext extends ExprEntContext {
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(B314Parser.MINUS, 0); }
		public ValMinusContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValNumberContext extends ExprEntContext {
		public TerminalNode NUMBER() { return getToken(B314Parser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(B314Parser.MINUS, 0); }
		public ValNumberContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValFctContext extends ExprEntContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(B314Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(B314Parser.COMMA, i);
		}
		public ValFctContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValFct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValFct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValFct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValExprEntGContext extends ExprEntContext {
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ValExprEntGContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValExprEntG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValExprEntG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValExprEntG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValDivContext extends ExprEntContext {
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode DIV() { return getToken(B314Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(B314Parser.MOD, 0); }
		public ValDivContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValCountContext extends ExprEntContext {
		public TerminalNode COUNT() { return getToken(B314Parser.COUNT, 0); }
		public TerminalNode MAP() { return getToken(B314Parser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(B314Parser.RADIO, 0); }
		public TerminalNode FRUITS() { return getToken(B314Parser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(B314Parser.SODA, 0); }
		public TerminalNode AMMO() { return getToken(B314Parser.AMMO, 0); }
		public ValCountContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValCount(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValExrpEntParContext extends ExprEntContext {
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public ValExrpEntParContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValExrpEntPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValExrpEntPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValExrpEntPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValLatContext extends ExprEntContext {
		public TerminalNode LATITUDE() { return getToken(B314Parser.LATITUDE, 0); }
		public ValLatContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValLat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValLat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValLat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValGridContext extends ExprEntContext {
		public TerminalNode GRID() { return getToken(B314Parser.GRID, 0); }
		public TerminalNode SIZE() { return getToken(B314Parser.SIZE, 0); }
		public ValGridContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValGrid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValGrid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValGrid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprEntContext exprEnt() throws RecognitionException {
		return exprEnt(0);
	}

	private ExprEntContext exprEnt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprEntContext _localctx = new ExprEntContext(_ctx, _parentState);
		ExprEntContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exprEnt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ValNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(116);
					match(MINUS);
					}
				}

				setState(119);
				match(NUMBER);
				}
				break;
			case 2:
				{
				_localctx = new ValExrpEntParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(LPAR);
				setState(121);
				exprEnt(0);
				setState(122);
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new ValLatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(LATITUDE);
				}
				break;
			case 4:
				{
				_localctx = new ValLongContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(LONGITUDE);
				}
				break;
			case 5:
				{
				_localctx = new ValGridContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(GRID);
				setState(127);
				match(SIZE);
				}
				break;
			case 6:
				{
				_localctx = new ValCountContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << RADIO) | (1L << FRUITS) | (1L << SODA) | (1L << AMMO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(129);
				match(COUNT);
				}
				break;
			case 7:
				{
				_localctx = new ValLifeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(LIFE);
				}
				break;
			case 8:
				{
				_localctx = new ValFctContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(ID);
				setState(132);
				match(LPAR);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << LPAR) | (1L << MINUS) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << MAP) | (1L << RADIO) | (1L << FRUITS) | (1L << SODA) | (1L << AMMO) | (1L << GRAAL))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEARBY - 66)) | (1L << (DIRT - 66)) | (1L << (ROCK - 66)) | (1L << (VINES - 66)) | (1L << (ZOMBIE - 66)) | (1L << (PLAYER - 66)) | (1L << (ENNEMI - 66)) | (1L << (LIFE - 66)) | (1L << (ID - 66)) | (1L << (NUMBER - 66)))) != 0)) {
					{
					setState(133);
					exprD();
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(134);
						match(COMMA);
						setState(135);
						exprD();
						}
						}
						setState(140);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(143);
				match(RPAR);
				}
				break;
			case 9:
				{
				_localctx = new ValExprEntGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				exprG();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ValAddContext(new ExprEntContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(147);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(148);
						match(PLUS);
						setState(149);
						exprEnt(8);
						}
						break;
					case 2:
						{
						_localctx = new ValMinusContext(new ExprEntContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(150);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(151);
						match(MINUS);
						setState(152);
						exprEnt(7);
						}
						break;
					case 3:
						{
						_localctx = new ValMultContext(new ExprEntContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(153);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(154);
						match(MULT);
						setState(155);
						exprEnt(6);
						}
						break;
					case 4:
						{
						_localctx = new ValDivContext(new ExprEntContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(156);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(157);
						match(DIV);
						setState(158);
						exprEnt(5);
						}
						break;
					case 5:
						{
						_localctx = new ValDivContext(new ExprEntContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(159);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(160);
						match(MOD);
						setState(161);
						exprEnt(4);
						}
						break;
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprBoolContext extends ParserRuleContext {
		public ExprBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBool; }
	 
		public ExprBoolContext() { }
		public void copyFrom(ExprBoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValExprBoolCaseContext extends ExprBoolContext {
		public List<ExprCaseContext> exprCase() {
			return getRuleContexts(ExprCaseContext.class);
		}
		public ExprCaseContext exprCase(int i) {
			return getRuleContext(ExprCaseContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(B314Parser.EQUAL, 0); }
		public ValExprBoolCaseContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValExprBoolCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValExprBoolCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValExprBoolCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValExprBoolGContext extends ExprBoolContext {
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ValExprBoolGContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValExprBoolG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValExprBoolG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValExprBoolG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValExpBoolParContext extends ExprBoolContext {
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public List<ExprBoolContext> exprBool() {
			return getRuleContexts(ExprBoolContext.class);
		}
		public ExprBoolContext exprBool(int i) {
			return getRuleContext(ExprBoolContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public TerminalNode TRUE() { return getToken(B314Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(B314Parser.FALSE, 0); }
		public TerminalNode ENNEMI() { return getToken(B314Parser.ENNEMI, 0); }
		public TerminalNode IS() { return getToken(B314Parser.IS, 0); }
		public TerminalNode NORTH() { return getToken(B314Parser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(B314Parser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(B314Parser.EAST, 0); }
		public TerminalNode WEST() { return getToken(B314Parser.WEST, 0); }
		public TerminalNode GRAAL() { return getToken(B314Parser.GRAAL, 0); }
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode INF() { return getToken(B314Parser.INF, 0); }
		public TerminalNode SUP() { return getToken(B314Parser.SUP, 0); }
		public TerminalNode EQUAL() { return getToken(B314Parser.EQUAL, 0); }
		public TerminalNode NOT() { return getToken(B314Parser.NOT, 0); }
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode OR() { return getToken(B314Parser.OR, 0); }
		public ValExpBoolParContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValExpBoolPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValExpBoolPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValExpBoolPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValFctBoolContext extends ExprBoolContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(B314Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(B314Parser.COMMA, i);
		}
		public ValFctBoolContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValFctBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValFctBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValFctBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprBoolContext exprBool() throws RecognitionException {
		return exprBool(0);
	}

	private ExprBoolContext exprBool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprBoolContext _localctx = new ExprBoolContext(_ctx, _parentState);
		ExprBoolContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exprBool, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new ValExpBoolParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(168);
				match(LPAR);
				setState(169);
				exprBool(0);
				setState(170);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new ValExpBoolParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(TRUE);
				}
				break;
			case 3:
				{
				_localctx = new ValExpBoolParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(FALSE);
				}
				break;
			case 4:
				{
				_localctx = new ValExpBoolParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(ENNEMI);
				setState(175);
				match(IS);
				setState(176);
				_la = _input.LA(1);
				if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NORTH - 62)) | (1L << (SOUTH - 62)) | (1L << (EAST - 62)) | (1L << (WEST - 62)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				{
				_localctx = new ValExpBoolParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(GRAAL);
				setState(178);
				match(IS);
				setState(179);
				_la = _input.LA(1);
				if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NORTH - 62)) | (1L << (SOUTH - 62)) | (1L << (EAST - 62)) | (1L << (WEST - 62)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				{
				_localctx = new ValFctBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(ID);
				setState(181);
				match(LPAR);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << LPAR) | (1L << MINUS) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << MAP) | (1L << RADIO) | (1L << FRUITS) | (1L << SODA) | (1L << AMMO) | (1L << GRAAL))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEARBY - 66)) | (1L << (DIRT - 66)) | (1L << (ROCK - 66)) | (1L << (VINES - 66)) | (1L << (ZOMBIE - 66)) | (1L << (PLAYER - 66)) | (1L << (ENNEMI - 66)) | (1L << (LIFE - 66)) | (1L << (ID - 66)) | (1L << (NUMBER - 66)))) != 0)) {
					{
					setState(182);
					exprD();
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(183);
						match(COMMA);
						setState(184);
						exprD();
						}
						}
						setState(189);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(192);
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new ValExprBoolCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				exprCase();
				setState(194);
				match(EQUAL);
				setState(195);
				exprCase();
				}
				break;
			case 8:
				{
				_localctx = new ValExpBoolParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				exprEnt(0);
				setState(198);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INF) | (1L << SUP) | (1L << EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(199);
				exprEnt(0);
				}
				break;
			case 9:
				{
				_localctx = new ValExpBoolParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				match(NOT);
				setState(202);
				exprBool(2);
				}
				break;
			case 10:
				{
				_localctx = new ValExprBoolGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				exprG();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValExpBoolParContext(new ExprBoolContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
					setState(206);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(207);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << EQUAL))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(208);
					exprBool(4);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprCaseContext extends ParserRuleContext {
		public ExprCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCase; }
	 
		public ExprCaseContext() { }
		public void copyFrom(ExprCaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValSquareContext extends ExprCaseContext {
		public TerminalNode DIRT() { return getToken(B314Parser.DIRT, 0); }
		public TerminalNode ROCK() { return getToken(B314Parser.ROCK, 0); }
		public TerminalNode VINES() { return getToken(B314Parser.VINES, 0); }
		public TerminalNode ZOMBIE() { return getToken(B314Parser.ZOMBIE, 0); }
		public TerminalNode PLAYER() { return getToken(B314Parser.PLAYER, 0); }
		public TerminalNode ENNEMI() { return getToken(B314Parser.ENNEMI, 0); }
		public TerminalNode MAP() { return getToken(B314Parser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(B314Parser.RADIO, 0); }
		public TerminalNode AMMO() { return getToken(B314Parser.AMMO, 0); }
		public TerminalNode FRUITS() { return getToken(B314Parser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(B314Parser.SODA, 0); }
		public TerminalNode GRAAL() { return getToken(B314Parser.GRAAL, 0); }
		public ValSquareContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValSquare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValSquare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValSquare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValExprCaseGContext extends ExprCaseContext {
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ValExprCaseGContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValExprCaseG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValExprCaseG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValExprCaseG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValNearbyContext extends ExprCaseContext {
		public TerminalNode NEARBY() { return getToken(B314Parser.NEARBY, 0); }
		public TerminalNode LBR() { return getToken(B314Parser.LBR, 0); }
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(B314Parser.COMMA, 0); }
		public TerminalNode RBR() { return getToken(B314Parser.RBR, 0); }
		public List<ExprCaseContext> exprCase() {
			return getRuleContexts(ExprCaseContext.class);
		}
		public ExprCaseContext exprCase(int i) {
			return getRuleContext(ExprCaseContext.class,i);
		}
		public ValNearbyContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValNearby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValNearby(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValNearby(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValExprCaseParContext extends ExprCaseContext {
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public ExprCaseContext exprCase() {
			return getRuleContext(ExprCaseContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public ValExprCaseParContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValExprCasePar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValExprCasePar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValExprCasePar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseContext exprCase() throws RecognitionException {
		ExprCaseContext _localctx = new ExprCaseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprCase);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ValExprCaseParContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(LPAR);
				setState(215);
				exprCase();
				setState(216);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new ValSquareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(DIRT);
				}
				break;
			case 3:
				_localctx = new ValSquareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(ROCK);
				}
				break;
			case 4:
				_localctx = new ValSquareContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				match(VINES);
				}
				break;
			case 5:
				_localctx = new ValSquareContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				match(ZOMBIE);
				}
				break;
			case 6:
				_localctx = new ValSquareContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				match(PLAYER);
				}
				break;
			case 7:
				_localctx = new ValSquareContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(223);
				match(ENNEMI);
				}
				break;
			case 8:
				_localctx = new ValSquareContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(224);
				match(MAP);
				}
				break;
			case 9:
				_localctx = new ValSquareContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(225);
				match(RADIO);
				}
				break;
			case 10:
				_localctx = new ValSquareContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(226);
				match(AMMO);
				}
				break;
			case 11:
				_localctx = new ValSquareContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(227);
				match(FRUITS);
				}
				break;
			case 12:
				_localctx = new ValSquareContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(228);
				match(SODA);
				}
				break;
			case 13:
				_localctx = new ValSquareContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(229);
				match(GRAAL);
				}
				break;
			case 14:
				_localctx = new ValNearbyContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(230);
				match(NEARBY);
				setState(231);
				match(LBR);
				setState(232);
				exprEnt(0);
				setState(233);
				match(COMMA);
				setState(234);
				exprEnt(0);
				setState(235);
				match(RBR);
				}
				break;
			case 15:
				_localctx = new ValNearbyContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(237);
				match(NEARBY);
				setState(238);
				match(LBR);
				setState(239);
				exprCase();
				setState(240);
				match(COMMA);
				setState(241);
				exprCase();
				setState(242);
				match(RBR);
				}
				break;
			case 16:
				_localctx = new ValExprCaseGContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(244);
				exprG();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprGContext extends ParserRuleContext {
		public ExprGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprG; }
	 
		public ExprGContext() { }
		public void copyFrom(ExprGContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValIdContext extends ExprGContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public ValIdContext(ExprGContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValGExprContext extends ExprGContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode LBR() { return getToken(B314Parser.LBR, 0); }
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public TerminalNode RBR() { return getToken(B314Parser.RBR, 0); }
		public TerminalNode COMMA() { return getToken(B314Parser.COMMA, 0); }
		public ValGExprContext(ExprGContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValGExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValGExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValGExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValExprContext extends ExprGContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode LBR() { return getToken(B314Parser.LBR, 0); }
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode RBR() { return getToken(B314Parser.RBR, 0); }
		public TerminalNode COMMA() { return getToken(B314Parser.COMMA, 0); }
		public ValExprContext(ExprGContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterValExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitValExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitValExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprGContext exprG() throws RecognitionException {
		ExprGContext _localctx = new ExprGContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprG);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new ValIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ValExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(ID);
				setState(249);
				match(LBR);
				setState(250);
				exprEnt(0);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(251);
					match(COMMA);
					setState(252);
					exprEnt(0);
					}
				}

				setState(255);
				match(RBR);
				}
				break;
			case 3:
				_localctx = new ValGExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(ID);
				setState(258);
				match(LBR);
				setState(259);
				exprG();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(260);
					match(COMMA);
					setState(261);
					exprG();
					}
				}

				setState(264);
				match(RBR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarSkipContext extends InstructionContext {
		public TerminalNode SKIPP() { return getToken(B314Parser.SKIPP, 0); }
		public VarSkipContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIfContext extends InstructionContext {
		public TerminalNode IF() { return getToken(B314Parser.IF, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode THEN() { return getToken(B314Parser.THEN, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public VarIfContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarNextContext extends InstructionContext {
		public TerminalNode NEXT() { return getToken(B314Parser.NEXT, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public VarNextContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarNext(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarWhileDoContext extends InstructionContext {
		public TerminalNode WHILE() { return getToken(B314Parser.WHILE, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public VarWhileDoContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarWhileDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarWhileDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarWhileDo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarSetContext extends InstructionContext {
		public TerminalNode SET() { return getToken(B314Parser.SET, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode TO() { return getToken(B314Parser.TO, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public VarSetContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIfElseContext extends InstructionContext {
		public TerminalNode IF() { return getToken(B314Parser.IF, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode THEN() { return getToken(B314Parser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(B314Parser.ELSE, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public VarIfElseContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarComputeContext extends InstructionContext {
		public TerminalNode COMPUTE() { return getToken(B314Parser.COMPUTE, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public VarComputeContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarCompute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarCompute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarCompute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instruction);
		int _la;
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new VarSkipContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(SKIPP);
				}
				break;
			case 2:
				_localctx = new VarIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(IF);
				setState(270);
				exprD();
				setState(271);
				match(THEN);
				setState(273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(272);
					instruction();
					}
					}
					setState(275); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPP) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << NEXT))) != 0) );
				setState(277);
				match(DONE);
				}
				break;
			case 3:
				_localctx = new VarIfElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				match(IF);
				setState(280);
				exprD();
				setState(281);
				match(THEN);
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(282);
					instruction();
					}
					}
					setState(285); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPP) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << NEXT))) != 0) );
				setState(287);
				match(ELSE);
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(288);
					instruction();
					}
					}
					setState(291); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPP) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << NEXT))) != 0) );
				setState(293);
				match(DONE);
				}
				break;
			case 4:
				_localctx = new VarWhileDoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(WHILE);
				setState(296);
				exprD();
				setState(297);
				match(DO);
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(298);
					instruction();
					}
					}
					setState(301); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPP) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << NEXT))) != 0) );
				setState(303);
				match(DONE);
				}
				break;
			case 5:
				_localctx = new VarSetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				match(SET);
				setState(306);
				exprG();
				setState(307);
				match(TO);
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(308);
					match(LPAR);
					}
					break;
				}
				setState(311);
				exprD();
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RPAR) {
					{
					setState(312);
					match(RPAR);
					}
				}

				}
				break;
			case 6:
				_localctx = new VarComputeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(315);
				match(COMPUTE);
				setState(316);
				exprD();
				}
				break;
			case 7:
				_localctx = new VarNextContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(317);
				match(NEXT);
				setState(318);
				action();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	 
		public ActionContext() { }
		public void copyFrom(ActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarUseContext extends ActionContext {
		public TerminalNode USE() { return getToken(B314Parser.USE, 0); }
		public TerminalNode MAP() { return getToken(B314Parser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(B314Parser.RADIO, 0); }
		public TerminalNode FRUITS() { return getToken(B314Parser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(B314Parser.SODA, 0); }
		public VarUseContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarMoveContext extends ActionContext {
		public TerminalNode MOVE() { return getToken(B314Parser.MOVE, 0); }
		public TerminalNode NORTH() { return getToken(B314Parser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(B314Parser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(B314Parser.EAST, 0); }
		public TerminalNode WEST() { return getToken(B314Parser.WEST, 0); }
		public VarMoveContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarMove(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarShootContext extends ActionContext {
		public TerminalNode SHOOT() { return getToken(B314Parser.SHOOT, 0); }
		public TerminalNode NORTH() { return getToken(B314Parser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(B314Parser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(B314Parser.EAST, 0); }
		public TerminalNode WEST() { return getToken(B314Parser.WEST, 0); }
		public VarShootContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarShoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarShoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarShoot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDoNothingContext extends ActionContext {
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode NOTHING() { return getToken(B314Parser.NOTHING, 0); }
		public VarDoNothingContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarDoNothing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarDoNothing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarDoNothing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_action);
		int _la;
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				_localctx = new VarMoveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(MOVE);
				setState(322);
				_la = _input.LA(1);
				if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NORTH - 62)) | (1L << (SOUTH - 62)) | (1L << (EAST - 62)) | (1L << (WEST - 62)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SHOOT:
				_localctx = new VarShootContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(SHOOT);
				setState(324);
				_la = _input.LA(1);
				if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (NORTH - 62)) | (1L << (SOUTH - 62)) | (1L << (EAST - 62)) | (1L << (WEST - 62)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case USE:
				_localctx = new VarUseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(USE);
				setState(326);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << RADIO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DO:
				_localctx = new VarDoNothingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				match(DO);
				setState(328);
				match(NOTHING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FctDeclContext extends ParserRuleContext {
		public FctDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fctDecl; }
	 
		public FctDeclContext() { }
		public void copyFrom(FctDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarFctDeclContext extends FctDeclContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode AS() { return getToken(B314Parser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(B314Parser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public TerminalNode DPT() { return getToken(B314Parser.DPT, 0); }
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TerminalNode VOID() { return getToken(B314Parser.VOID, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(B314Parser.LOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(B314Parser.RETURN, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(B314Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(B314Parser.COMMA, i);
		}
		public List<TerminalNode> SCOL() { return getTokens(B314Parser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(B314Parser.SCOL, i);
		}
		public VarFctDeclContext(FctDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarFctDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarFctDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarFctDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FctDeclContext fctDecl() throws RecognitionException {
		FctDeclContext _localctx = new FctDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fctDecl);
		int _la;
		try {
			_localctx = new VarFctDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(ID);
			setState(332);
			match(AS);
			setState(333);
			match(FUNCTION);
			setState(334);
			match(LPAR);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(335);
				varDecl();
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(336);
					match(COMMA);
					setState(337);
					varDecl();
					}
					}
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(345);
			match(RPAR);
			setState(346);
			match(DPT);
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INTEGER:
			case SQUARE:
				{
				setState(347);
				scalar();
				}
				break;
			case VOID:
				{
				setState(348);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(351);
				match(DECLARE);
				setState(352);
				match(LOCAL);
				setState(356); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(353);
					varDecl();
					setState(354);
					match(SCOL);
					}
					}
					setState(358); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(362);
			match(DO);
			setState(364); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(363);
				instruction();
				}
				}
				setState(366); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPP) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << NEXT))) != 0) );
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(368);
				match(RETURN);
				setState(369);
				exprD();
				}
			}

			setState(372);
			match(DONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImpDeclContext extends ParserRuleContext {
		public ImpDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impDecl; }
	 
		public ImpDeclContext() { }
		public void copyFrom(ImpDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarImpDeclContext extends ImpDeclContext {
		public TerminalNode IMPORT() { return getToken(B314Parser.IMPORT, 0); }
		public FileDeclContext fileDecl() {
			return getRuleContext(FileDeclContext.class,0);
		}
		public VarImpDeclContext(ImpDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarImpDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarImpDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarImpDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpDeclContext impDecl() throws RecognitionException {
		ImpDeclContext _localctx = new ImpDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_impDecl);
		try {
			_localctx = new VarImpDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(IMPORT);
			setState(375);
			fileDecl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileDeclContext extends ParserRuleContext {
		public FileDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileDecl; }
	 
		public FileDeclContext() { }
		public void copyFrom(FileDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarFileDeclContext extends FileDeclContext {
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode WLD() { return getToken(B314Parser.WLD, 0); }
		public VarFileDeclContext(FileDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarFileDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarFileDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarFileDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileDeclContext fileDecl() throws RecognitionException {
		FileDeclContext _localctx = new FileDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fileDecl);
		try {
			_localctx = new VarFileDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			fileName();
			setState(378);
			matchWildcard();
			setState(379);
			match(WLD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileNameContext extends ParserRuleContext {
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
	 
		public FileNameContext() { }
		public void copyFrom(FileNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarFileNameContext extends FileNameContext {
		public List<TerminalNode> LETTER() { return getTokens(B314Parser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(B314Parser.LETTER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(B314Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(B314Parser.NUMBER, i);
		}
		public VarFileNameContext(FileNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fileName);
		int _la;
		try {
			int _alt;
			_localctx = new VarFileNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(LETTER);
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(382);
					_la = _input.LA(1);
					if ( !(_la==NUMBER || _la==LETTER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramWorldContext extends ParserRuleContext {
		public ProgramWorldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programWorld; }
	 
		public ProgramWorldContext() { }
		public void copyFrom(ProgramWorldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarProgramWorldContext extends ProgramWorldContext {
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode RETAIN() { return getToken(B314Parser.RETAIN, 0); }
		public ClauseDefaultContext clauseDefault() {
			return getRuleContext(ClauseDefaultContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(B314Parser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(B314Parser.SCOL, i);
		}
		public List<FctDeclContext> fctDecl() {
			return getRuleContexts(FctDeclContext.class);
		}
		public FctDeclContext fctDecl(int i) {
			return getRuleContext(FctDeclContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public VarProgramWorldContext(ProgramWorldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarProgramWorld(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarProgramWorld(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarProgramWorld(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramWorldContext programWorld() throws RecognitionException {
		ProgramWorldContext _localctx = new ProgramWorldContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_programWorld);
		int _la;
		try {
			_localctx = new VarProgramWorldContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(DECLARE);
			setState(389);
			match(AND);
			setState(390);
			match(RETAIN);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(391);
					varDecl();
					setState(392);
					match(SCOL);
					}
					break;
				case 2:
					{
					setState(394);
					fctDecl();
					}
					break;
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPP) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << NEXT))) != 0)) {
				{
				{
				setState(400);
				instruction();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
			clauseDefault();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClauseDefaultContext extends ParserRuleContext {
		public ClauseDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseDefault; }
	 
		public ClauseDefaultContext() { }
		public void copyFrom(ClauseDefaultContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarClauseDefaultContext extends ClauseDefaultContext {
		public TerminalNode BY() { return getToken(B314Parser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(B314Parser.DEFAULT, 0); }
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(B314Parser.LOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(B314Parser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(B314Parser.SCOL, i);
		}
		public VarClauseDefaultContext(ClauseDefaultContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarClauseDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarClauseDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarClauseDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseDefaultContext clauseDefault() throws RecognitionException {
		ClauseDefaultContext _localctx = new ClauseDefaultContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_clauseDefault);
		int _la;
		try {
			_localctx = new VarClauseDefaultContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(BY);
			setState(409);
			match(DEFAULT);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(410);
				match(DECLARE);
				setState(411);
				match(LOCAL);
				setState(415); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(412);
					varDecl();
					setState(413);
					match(SCOL);
					}
					}
					setState(417); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(421);
			match(DO);
			setState(423); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(422);
				instruction();
				}
				}
				setState(425); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPP) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << NEXT))) != 0) );
			setState(427);
			match(DONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramStratContext extends ParserRuleContext {
		public ProgramStratContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programStrat; }
	 
		public ProgramStratContext() { }
		public void copyFrom(ProgramStratContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarProgramStratContext extends ProgramStratContext {
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode RETAIN() { return getToken(B314Parser.RETAIN, 0); }
		public TerminalNode WHEN() { return getToken(B314Parser.WHEN, 0); }
		public TerminalNode YOUR() { return getToken(B314Parser.YOUR, 0); }
		public TerminalNode TURN() { return getToken(B314Parser.TURN, 0); }
		public ClauseDefaultContext clauseDefault() {
			return getRuleContext(ClauseDefaultContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(B314Parser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(B314Parser.SCOL, i);
		}
		public List<FctDeclContext> fctDecl() {
			return getRuleContexts(FctDeclContext.class);
		}
		public FctDeclContext fctDecl(int i) {
			return getRuleContext(FctDeclContext.class,i);
		}
		public List<ImpDeclContext> impDecl() {
			return getRuleContexts(ImpDeclContext.class);
		}
		public ImpDeclContext impDecl(int i) {
			return getRuleContext(ImpDeclContext.class,i);
		}
		public List<ClauseWhenContext> clauseWhen() {
			return getRuleContexts(ClauseWhenContext.class);
		}
		public ClauseWhenContext clauseWhen(int i) {
			return getRuleContext(ClauseWhenContext.class,i);
		}
		public VarProgramStratContext(ProgramStratContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarProgramStrat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarProgramStrat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarProgramStrat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramStratContext programStrat() throws RecognitionException {
		ProgramStratContext _localctx = new ProgramStratContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_programStrat);
		int _la;
		try {
			_localctx = new VarProgramStratContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(DECLARE);
			setState(430);
			match(AND);
			setState(431);
			match(RETAIN);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT || _la==ID) {
				{
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(432);
					varDecl();
					setState(433);
					match(SCOL);
					}
					break;
				case 2:
					{
					setState(435);
					fctDecl();
					}
					break;
				case 3:
					{
					setState(436);
					impDecl();
					}
					break;
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
			match(WHEN);
			setState(443);
			match(YOUR);
			setState(444);
			match(TURN);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(445);
				clauseWhen();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			clauseDefault();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClauseWhenContext extends ParserRuleContext {
		public ClauseWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseWhen; }
	 
		public ClauseWhenContext() { }
		public void copyFrom(ClauseWhenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarWhenContext extends ClauseWhenContext {
		public TerminalNode WHEN() { return getToken(B314Parser.WHEN, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(B314Parser.LOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(B314Parser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(B314Parser.SCOL, i);
		}
		public VarWhenContext(ClauseWhenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseWhenContext clauseWhen() throws RecognitionException {
		ClauseWhenContext _localctx = new ClauseWhenContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_clauseWhen);
		int _la;
		try {
			_localctx = new VarWhenContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(WHEN);
			setState(454);
			exprBool(0);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(455);
				match(DECLARE);
				setState(456);
				match(LOCAL);
				setState(460); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(457);
					varDecl();
					setState(458);
					match(SCOL);
					}
					}
					setState(462); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(466);
			match(DO);
			setState(468); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(467);
				instruction();
				}
				}
				setState(470); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPP) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << NEXT))) != 0) );
			setState(472);
			match(DONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentaireContext extends ParserRuleContext {
		public CommentaireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentaire; }
	 
		public CommentaireContext() { }
		public void copyFrom(CommentaireContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarCommentaireContext extends CommentaireContext {
		public TerminalNode COML() { return getToken(B314Parser.COML, 0); }
		public List<TerminalNode> LETTER() { return getTokens(B314Parser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(B314Parser.LETTER, i);
		}
		public TerminalNode COMR() { return getToken(B314Parser.COMR, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(B314Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(B314Parser.NUMBER, i);
		}
		public VarCommentaireContext(CommentaireContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarCommentaire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarCommentaire(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarCommentaire(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentaireContext commentaire() throws RecognitionException {
		CommentaireContext _localctx = new CommentaireContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_commentaire);
		int _la;
		try {
			_localctx = new VarCommentaireContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(COML);
			setState(475);
			match(LETTER);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER || _la==LETTER) {
				{
				{
				setState(476);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==LETTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(482);
			match(COMR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarProgramContext extends ProgramContext {
		public ProgramStratContext programStrat() {
			return getRuleContext(ProgramStratContext.class,0);
		}
		public ProgramWorldContext programWorld() {
			return getRuleContext(ProgramWorldContext.class,0);
		}
		public VarProgramContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_program);
		try {
			_localctx = new VarProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(484);
				programStrat();
				}
				break;
			case 2:
				{
				setState(485);
				programWorld();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return exprEnt_sempred((ExprEntContext)_localctx, predIndex);
		case 9:
			return exprBool_sempred((ExprBoolContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprEnt_sempred(ExprEntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exprBool_sempred(ExprBoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3W\u01eb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\5\3\67\n\3\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\5"+
		"\5C\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\6\7P\n\7\r\7\16\7"+
		"Q\3\7\3\7\6\7V\n\7\r\7\16\7W\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\ba\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\ti\n\t\f\t\16\tl\13\t\5\tn\n\t\3\t\3\t\3\t\3\t"+
		"\5\tt\n\t\3\n\3\n\5\nx\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008b\n\n\f\n\16\n\u008e\13\n\5\n\u0090\n"+
		"\n\3\n\3\n\5\n\u0094\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u00a5\n\n\f\n\16\n\u00a8\13\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7"+
		"\13\u00bc\n\13\f\13\16\13\u00bf\13\13\5\13\u00c1\n\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00cf\n\13\3\13\3\13"+
		"\3\13\7\13\u00d4\n\13\f\13\16\13\u00d7\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f8\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0100\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0109\n\r\3\r\3\r\5\r\u010d"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\6\16\u0114\n\16\r\16\16\16\u0115\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\6\16\u011e\n\16\r\16\16\16\u011f\3\16\3\16\6\16"+
		"\u0124\n\16\r\16\16\16\u0125\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u012e"+
		"\n\16\r\16\16\16\u012f\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0138\n\16\3"+
		"\16\3\16\5\16\u013c\n\16\3\16\3\16\3\16\3\16\5\16\u0142\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u014c\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u0155\n\20\f\20\16\20\u0158\13\20\5\20\u015a\n\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0160\n\20\3\20\3\20\3\20\3\20\3\20\6\20\u0167\n"+
		"\20\r\20\16\20\u0168\5\20\u016b\n\20\3\20\3\20\6\20\u016f\n\20\r\20\16"+
		"\20\u0170\3\20\3\20\5\20\u0175\n\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\7\23\u0182\n\23\f\23\16\23\u0185\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u018e\n\24\f\24\16\24\u0191\13\24\3\24"+
		"\7\24\u0194\n\24\f\24\16\24\u0197\13\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\6\25\u01a2\n\25\r\25\16\25\u01a3\5\25\u01a6\n\25\3\25"+
		"\3\25\6\25\u01aa\n\25\r\25\16\25\u01ab\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\7\26\u01b8\n\26\f\26\16\26\u01bb\13\26\3\26\3\26\3"+
		"\26\3\26\7\26\u01c1\n\26\f\26\16\26\u01c4\13\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\6\27\u01cf\n\27\r\27\16\27\u01d0\5\27\u01d3\n"+
		"\27\3\27\3\27\6\27\u01d7\n\27\r\27\16\27\u01d8\3\27\3\27\3\30\3\30\3\30"+
		"\7\30\u01e0\n\30\f\30\16\30\u01e3\13\30\3\30\3\30\3\31\3\31\5\31\u01e9"+
		"\n\31\3\31\2\4\22\24\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\2\b\3\28<\3\2@C\3\2\f\16\4\2\b\t\16\16\3\28;\4\2SSWW\2\u0237\2\62"+
		"\3\2\2\2\4\66\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\nF\3\2\2\2\fJ\3\2\2\2\16`"+
		"\3\2\2\2\20s\3\2\2\2\22\u0093\3\2\2\2\24\u00ce\3\2\2\2\26\u00f7\3\2\2"+
		"\2\30\u010c\3\2\2\2\32\u0141\3\2\2\2\34\u014b\3\2\2\2\36\u014d\3\2\2\2"+
		" \u0178\3\2\2\2\"\u017b\3\2\2\2$\u017f\3\2\2\2&\u0186\3\2\2\2(\u019a\3"+
		"\2\2\2*\u01af\3\2\2\2,\u01c7\3\2\2\2.\u01dc\3\2\2\2\60\u01e8\3\2\2\2\62"+
		"\63\5\60\31\2\63\3\3\2\2\2\64\67\5\6\4\2\65\67\5\b\5\2\66\64\3\2\2\2\66"+
		"\65\3\2\2\2\67\5\3\2\2\28<\7\3\2\29<\7\4\2\2:<\7\5\2\2;8\3\2\2\2;9\3\2"+
		"\2\2;:\3\2\2\2<\7\3\2\2\2=>\5\6\4\2>?\7\21\2\2?B\7S\2\2@A\7\23\2\2AC\7"+
		"S\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\22\2\2E\t\3\2\2\2FG\7R\2\2GH\7"+
		"\13\2\2HI\5\4\3\2I\13\3\2\2\2JK\7\60\2\2KL\7\13\2\2LM\7\5\2\2MO\7\21\2"+
		"\2NP\7S\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2SU\7\23\2"+
		"\2TV\7S\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\22\2"+
		"\2Z\r\3\2\2\2[a\79\2\2\\a\78\2\2]a\7>\2\2^a\7;\2\2_a\7:\2\2`[\3\2\2\2"+
		"`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\17\3\2\2\2bt\5\30\r\2cd\7R"+
		"\2\2dm\7\24\2\2ej\5\20\t\2fg\7\23\2\2gi\5\20\t\2hf\3\2\2\2il\3\2\2\2j"+
		"h\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2me\3\2\2\2mn\3\2\2\2no\3\2\2\2"+
		"ot\7\25\2\2pt\5\22\n\2qt\5\24\13\2rt\5\26\f\2sb\3\2\2\2sc\3\2\2\2sp\3"+
		"\2\2\2sq\3\2\2\2sr\3\2\2\2t\21\3\2\2\2uw\b\n\1\2vx\7\27\2\2wv\3\2\2\2"+
		"wx\3\2\2\2xy\3\2\2\2y\u0094\7S\2\2z{\7\24\2\2{|\5\22\n\2|}\7\25\2\2}\u0094"+
		"\3\2\2\2~\u0094\7\61\2\2\177\u0094\7\62\2\2\u0080\u0081\7\63\2\2\u0081"+
		"\u0094\7\64\2\2\u0082\u0083\t\2\2\2\u0083\u0094\7=\2\2\u0084\u0094\7L"+
		"\2\2\u0085\u0086\7R\2\2\u0086\u008f\7\24\2\2\u0087\u008c\5\20\t\2\u0088"+
		"\u0089\7\23\2\2\u0089\u008b\5\20\t\2\u008a\u0088\3\2\2\2\u008b\u008e\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0094\7\25\2\2\u0092\u0094\5\30\r\2\u0093u\3\2\2\2\u0093z\3"+
		"\2\2\2\u0093~\3\2\2\2\u0093\177\3\2\2\2\u0093\u0080\3\2\2\2\u0093\u0082"+
		"\3\2\2\2\u0093\u0084\3\2\2\2\u0093\u0085\3\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u00a6\3\2\2\2\u0095\u0096\f\t\2\2\u0096\u0097\7\26\2\2\u0097\u00a5\5"+
		"\22\n\n\u0098\u0099\f\b\2\2\u0099\u009a\7\27\2\2\u009a\u00a5\5\22\n\t"+
		"\u009b\u009c\f\7\2\2\u009c\u009d\7\30\2\2\u009d\u00a5\5\22\n\b\u009e\u009f"+
		"\f\6\2\2\u009f\u00a0\7\31\2\2\u00a0\u00a5\5\22\n\7\u00a1\u00a2\f\5\2\2"+
		"\u00a2\u00a3\7\32\2\2\u00a3\u00a5\5\22\n\6\u00a4\u0095\3\2\2\2\u00a4\u0098"+
		"\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\23\3\2\2"+
		"\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\b\13\1\2\u00aa\u00ab\7\24\2\2\u00ab"+
		"\u00ac\5\24\13\2\u00ac\u00ad\7\25\2\2\u00ad\u00cf\3\2\2\2\u00ae\u00cf"+
		"\7\6\2\2\u00af\u00cf\7\7\2\2\u00b0\u00b1\7K\2\2\u00b1\u00b2\7?\2\2\u00b2"+
		"\u00cf\t\3\2\2\u00b3\u00b4\7>\2\2\u00b4\u00b5\7?\2\2\u00b5\u00cf\t\3\2"+
		"\2\u00b6\u00b7\7R\2\2\u00b7\u00c0\7\24\2\2\u00b8\u00bd\5\20\t\2\u00b9"+
		"\u00ba\7\23\2\2\u00ba\u00bc\5\20\t\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3"+
		"\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00cf\7\25\2\2\u00c3\u00c4\5\26\f\2\u00c4\u00c5\7\16\2\2\u00c5"+
		"\u00c6\5\26\f\2\u00c6\u00cf\3\2\2\2\u00c7\u00c8\5\22\n\2\u00c8\u00c9\t"+
		"\4\2\2\u00c9\u00ca\5\22\n\2\u00ca\u00cf\3\2\2\2\u00cb\u00cc\7\n\2\2\u00cc"+
		"\u00cf\5\24\13\4\u00cd\u00cf\5\30\r\2\u00ce\u00a9\3\2\2\2\u00ce\u00ae"+
		"\3\2\2\2\u00ce\u00af\3\2\2\2\u00ce\u00b0\3\2\2\2\u00ce\u00b3\3\2\2\2\u00ce"+
		"\u00b6\3\2\2\2\u00ce\u00c3\3\2\2\2\u00ce\u00c7\3\2\2\2\u00ce\u00cb\3\2"+
		"\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d5\3\2\2\2\u00d0\u00d1\f\5\2\2\u00d1"+
		"\u00d2\t\5\2\2\u00d2\u00d4\5\24\13\6\u00d3\u00d0\3\2\2\2\u00d4\u00d7\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\25\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\7\24\2\2\u00d9\u00da\5\26\f\2\u00da\u00db\7"+
		"\25\2\2\u00db\u00f8\3\2\2\2\u00dc\u00f8\7F\2\2\u00dd\u00f8\7G\2\2\u00de"+
		"\u00f8\7H\2\2\u00df\u00f8\7I\2\2\u00e0\u00f8\7J\2\2\u00e1\u00f8\7K\2\2"+
		"\u00e2\u00f8\78\2\2\u00e3\u00f8\79\2\2\u00e4\u00f8\7<\2\2\u00e5\u00f8"+
		"\7:\2\2\u00e6\u00f8\7;\2\2\u00e7\u00f8\7>\2\2\u00e8\u00e9\7D\2\2\u00e9"+
		"\u00ea\7\21\2\2\u00ea\u00eb\5\22\n\2\u00eb\u00ec\7\23\2\2\u00ec\u00ed"+
		"\5\22\n\2\u00ed\u00ee\7\22\2\2\u00ee\u00f8\3\2\2\2\u00ef\u00f0\7D\2\2"+
		"\u00f0\u00f1\7\21\2\2\u00f1\u00f2\5\26\f\2\u00f2\u00f3\7\23\2\2\u00f3"+
		"\u00f4\5\26\f\2\u00f4\u00f5\7\22\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f8\5"+
		"\30\r\2\u00f7\u00d8\3\2\2\2\u00f7\u00dc\3\2\2\2\u00f7\u00dd\3\2\2\2\u00f7"+
		"\u00de\3\2\2\2\u00f7\u00df\3\2\2\2\u00f7\u00e0\3\2\2\2\u00f7\u00e1\3\2"+
		"\2\2\u00f7\u00e2\3\2\2\2\u00f7\u00e3\3\2\2\2\u00f7\u00e4\3\2\2\2\u00f7"+
		"\u00e5\3\2\2\2\u00f7\u00e6\3\2\2\2\u00f7\u00e7\3\2\2\2\u00f7\u00e8\3\2"+
		"\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\27\3\2\2\2\u00f9\u010d"+
		"\7R\2\2\u00fa\u00fb\7R\2\2\u00fb\u00fc\7\21\2\2\u00fc\u00ff\5\22\n\2\u00fd"+
		"\u00fe\7\23\2\2\u00fe\u0100\5\22\n\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\22\2\2\u0102\u010d\3\2\2\2\u0103"+
		"\u0104\7R\2\2\u0104\u0105\7\21\2\2\u0105\u0108\5\30\r\2\u0106\u0107\7"+
		"\23\2\2\u0107\u0109\5\30\r\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\7\22\2\2\u010b\u010d\3\2\2\2\u010c\u00f9\3"+
		"\2\2\2\u010c\u00fa\3\2\2\2\u010c\u0103\3\2\2\2\u010d\31\3\2\2\2\u010e"+
		"\u0142\7\33\2\2\u010f\u0110\7\34\2\2\u0110\u0111\5\20\t\2\u0111\u0113"+
		"\7\35\2\2\u0112\u0114\5\32\16\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2"+
		"\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\7\36\2\2\u0118\u0142\3\2\2\2\u0119\u011a\7\34\2\2\u011a\u011b\5\20\t"+
		"\2\u011b\u011d\7\35\2\2\u011c\u011e\5\32\16\2\u011d\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\7\37\2\2\u0122\u0124\5\32\16\2\u0123\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0128\7\36\2\2\u0128\u0142\3\2\2\2\u0129\u012a\7 \2\2\u012a"+
		"\u012b\5\20\t\2\u012b\u012d\7!\2\2\u012c\u012e\5\32\16\2\u012d\u012c\3"+
		"\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\7\36\2\2\u0132\u0142\3\2\2\2\u0133\u0134\7"+
		"#\2\2\u0134\u0135\5\30\r\2\u0135\u0137\7$\2\2\u0136\u0138\7\24\2\2\u0137"+
		"\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\5\20"+
		"\t\2\u013a\u013c\7\25\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u0142\3\2\2\2\u013d\u013e\7%\2\2\u013e\u0142\5\20\t\2\u013f\u0140\7&"+
		"\2\2\u0140\u0142\5\34\17\2\u0141\u010e\3\2\2\2\u0141\u010f\3\2\2\2\u0141"+
		"\u0119\3\2\2\2\u0141\u0129\3\2\2\2\u0141\u0133\3\2\2\2\u0141\u013d\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0142\33\3\2\2\2\u0143\u0144\7\65\2\2\u0144\u014c"+
		"\t\3\2\2\u0145\u0146\7\66\2\2\u0146\u014c\t\3\2\2\u0147\u0148\7\67\2\2"+
		"\u0148\u014c\t\6\2\2\u0149\u014a\7!\2\2\u014a\u014c\7\'\2\2\u014b\u0143"+
		"\3\2\2\2\u014b\u0145\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\35\3\2\2\2\u014d\u014e\7R\2\2\u014e\u014f\7\13\2\2\u014f\u0150\7(\2\2"+
		"\u0150\u0159\7\24\2\2\u0151\u0156\5\n\6\2\u0152\u0153\7\23\2\2\u0153\u0155"+
		"\5\n\6\2\u0154\u0152\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u0151\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7\25\2\2\u015c"+
		"\u015f\7\17\2\2\u015d\u0160\5\6\4\2\u015e\u0160\7\"\2\2\u015f\u015d\3"+
		"\2\2\2\u015f\u015e\3\2\2\2\u0160\u016a\3\2\2\2\u0161\u0162\7)\2\2\u0162"+
		"\u0166\7*\2\2\u0163\u0164\5\n\6\2\u0164\u0165\7\20\2\2\u0165\u0167\3\2"+
		"\2\2\u0166\u0163\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0161\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016e\7!\2\2\u016d\u016f\5\32\16\2\u016e"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0174\3\2\2\2\u0172\u0173\7+\2\2\u0173\u0175\5\20\t\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7\36"+
		"\2\2\u0177\37\3\2\2\2\u0178\u0179\7,\2\2\u0179\u017a\5\"\22\2\u017a!\3"+
		"\2\2\2\u017b\u017c\5$\23\2\u017c\u017d\13\2\2\2\u017d\u017e\7-\2\2\u017e"+
		"#\3\2\2\2\u017f\u0183\7W\2\2\u0180\u0182\t\7\2\2\u0181\u0180\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184%\3\2\2\2"+
		"\u0185\u0183\3\2\2\2\u0186\u0187\7)\2\2\u0187\u0188\7\b\2\2\u0188\u018f"+
		"\7.\2\2\u0189\u018a\5\n\6\2\u018a\u018b\7\20\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018e\5\36\20\2\u018d\u0189\3\2\2\2\u018d\u018c\3\2\2\2\u018e\u0191\3"+
		"\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0195\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0192\u0194\5\32\16\2\u0193\u0192\3\2\2\2\u0194\u0197\3"+
		"\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0198\u0199\5(\25\2\u0199\'\3\2\2\2\u019a\u019b\7E\2\2"+
		"\u019b\u01a5\7/\2\2\u019c\u019d\7)\2\2\u019d\u01a1\7*\2\2\u019e\u019f"+
		"\5\n\6\2\u019f\u01a0\7\20\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019e\3\2\2\2"+
		"\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6"+
		"\3\2\2\2\u01a5\u019c\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a9\7!\2\2\u01a8\u01aa\5\32\16\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3"+
		"\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ae\7\36\2\2\u01ae)\3\2\2\2\u01af\u01b0\7)\2\2\u01b0\u01b1\7\b\2\2"+
		"\u01b1\u01b9\7.\2\2\u01b2\u01b3\5\n\6\2\u01b3\u01b4\7\20\2\2\u01b4\u01b8"+
		"\3\2\2\2\u01b5\u01b8\5\36\20\2\u01b6\u01b8\5 \21\2\u01b7\u01b2\3\2\2\2"+
		"\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc"+
		"\u01bd\7M\2\2\u01bd\u01be\7N\2\2\u01be\u01c2\7O\2\2\u01bf\u01c1\5,\27"+
		"\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3"+
		"\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\5(\25\2\u01c6"+
		"+\3\2\2\2\u01c7\u01c8\7M\2\2\u01c8\u01d2\5\24\13\2\u01c9\u01ca\7)\2\2"+
		"\u01ca\u01ce\7*\2\2\u01cb\u01cc\5\n\6\2\u01cc\u01cd\7\20\2\2\u01cd\u01cf"+
		"\3\2\2\2\u01ce\u01cb\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01c9\3\2\2\2\u01d2\u01d3\3\2"+
		"\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\7!\2\2\u01d5\u01d7\5\32\16\2\u01d6"+
		"\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\7\36\2\2\u01db-\3\2\2\2\u01dc\u01dd"+
		"\7P\2\2\u01dd\u01e1\7W\2\2\u01de\u01e0\t\7\2\2\u01df\u01de\3\2\2\2\u01e0"+
		"\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2"+
		"\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\7Q\2\2\u01e5/\3\2\2\2\u01e6\u01e9"+
		"\5*\26\2\u01e7\u01e9\5&\24\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"\61\3\2\2\2\67\66;BQW`jmsw\u008c\u008f\u0093\u00a4\u00a6\u00bd\u00c0\u00ce"+
		"\u00d5\u00f7\u00ff\u0108\u010c\u0115\u011f\u0125\u012f\u0137\u013b\u0141"+
		"\u014b\u0156\u0159\u015f\u0168\u016a\u0170\u0174\u0183\u018d\u018f\u0195"+
		"\u01a3\u01a5\u01ab\u01b7\u01b9\u01c2\u01d0\u01d2\u01d8\u01e1\u01e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}