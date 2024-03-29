// Generated from C:/Users/laure/workspace/1718_INFOB314_COMPILATEUR_GROUPE04/src/main/antlr4/be/unamur/info/b314/compiler\B314.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class B314Lexer extends Lexer {
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
		COMMENT=82, NEWLINE=83, WS=84;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOLEAN", "INTEGER", "SQUARE", "TRUE", "FALSE", "AND", "OR", "NOT", "AS", 
		"INF", "SUP", "EQUAL", "DPT", "SCOL", "LBR", "RBR", "COMMA", "LPAR", "RPAR", 
		"PLUS", "MINUS", "MULT", "DIV", "MOD", "SKIPP", "IF", "THEN", "DONE", 
		"ELSE", "WHILE", "DO", "VOID", "SET", "TO", "COMPUTE", "NEXT", "NOTHING", 
		"FUNCTION", "DECLARE", "LOCAL", "RETURN", "IMPORT", "WLD", "RETAIN", "DEFAULT", 
		"ARENA", "LATITUDE", "LONGITUDE", "GRID", "SIZE", "MOVE", "SHOOT", "USE", 
		"MAP", "RADIO", "FRUITS", "SODA", "AMMO", "COUNT", "GRAAL", "IS", "NORTH", 
		"SOUTH", "EAST", "WEST", "NEARBY", "BY", "DIRT", "ROCK", "VINES", "ZOMBIE", 
		"PLAYER", "ENNEMI", "LIFE", "WHEN", "YOUR", "TURN", "COML", "COMR", "ID", 
		"NUMBER", "LETTER", "DIGIT", "COMMENT", "NEWLINE", "WS"
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
		"TURN", "COML", "COMR", "ID", "NUMBER", "COMMENT", "NEWLINE", "WS"
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


	public B314Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "B314.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2V\u025e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*"+
		"\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;"+
		"\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@"+
		"\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D"+
		"\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H"+
		"\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3L\3L\3L"+
		"\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\7Q\u0235"+
		"\nQ\fQ\16Q\u0238\13Q\3R\6R\u023b\nR\rR\16R\u023c\3S\3S\3T\3T\3U\3U\3U"+
		"\3U\7U\u0247\nU\fU\16U\u024a\13U\3U\3U\3U\3U\3U\3V\5V\u0252\nV\3V\3V\3"+
		"V\3V\3W\6W\u0259\nW\rW\16W\u025a\3W\3W\3\u0248\2X\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5\2\u00a7\2\u00a9"+
		"T\u00abU\u00adV\3\2\4\4\2C\\c|\4\2\13\13\"\"\2\u0261\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\3\u00af"+
		"\3\2\2\2\5\u00b7\3\2\2\2\7\u00bf\3\2\2\2\t\u00c6\3\2\2\2\13\u00cb\3\2"+
		"\2\2\r\u00d1\3\2\2\2\17\u00d5\3\2\2\2\21\u00d8\3\2\2\2\23\u00dc\3\2\2"+
		"\2\25\u00df\3\2\2\2\27\u00e1\3\2\2\2\31\u00e3\3\2\2\2\33\u00e5\3\2\2\2"+
		"\35\u00e7\3\2\2\2\37\u00e9\3\2\2\2!\u00eb\3\2\2\2#\u00ed\3\2\2\2%\u00ef"+
		"\3\2\2\2\'\u00f1\3\2\2\2)\u00f3\3\2\2\2+\u00f5\3\2\2\2-\u00f7\3\2\2\2"+
		"/\u00f9\3\2\2\2\61\u00fb\3\2\2\2\63\u00fd\3\2\2\2\65\u0102\3\2\2\2\67"+
		"\u0105\3\2\2\29\u010a\3\2\2\2;\u010f\3\2\2\2=\u0114\3\2\2\2?\u011a\3\2"+
		"\2\2A\u011d\3\2\2\2C\u0122\3\2\2\2E\u0126\3\2\2\2G\u0129\3\2\2\2I\u0131"+
		"\3\2\2\2K\u0136\3\2\2\2M\u013e\3\2\2\2O\u0147\3\2\2\2Q\u014f\3\2\2\2S"+
		"\u0155\3\2\2\2U\u015c\3\2\2\2W\u0163\3\2\2\2Y\u0167\3\2\2\2[\u016e\3\2"+
		"\2\2]\u0176\3\2\2\2_\u017c\3\2\2\2a\u0185\3\2\2\2c\u018f\3\2\2\2e\u0194"+
		"\3\2\2\2g\u0199\3\2\2\2i\u019e\3\2\2\2k\u01a4\3\2\2\2m\u01a8\3\2\2\2o"+
		"\u01ac\3\2\2\2q\u01b2\3\2\2\2s\u01b9\3\2\2\2u\u01be\3\2\2\2w\u01c3\3\2"+
		"\2\2y\u01c9\3\2\2\2{\u01cf\3\2\2\2}\u01d2\3\2\2\2\177\u01d8\3\2\2\2\u0081"+
		"\u01de\3\2\2\2\u0083\u01e3\3\2\2\2\u0085\u01e8\3\2\2\2\u0087\u01ef\3\2"+
		"\2\2\u0089\u01f2\3\2\2\2\u008b\u01f7\3\2\2\2\u008d\u01fc\3\2\2\2\u008f"+
		"\u0202\3\2\2\2\u0091\u0209\3\2\2\2\u0093\u0210\3\2\2\2\u0095\u0217\3\2"+
		"\2\2\u0097\u021c\3\2\2\2\u0099\u0221\3\2\2\2\u009b\u0226\3\2\2\2\u009d"+
		"\u022b\3\2\2\2\u009f\u022e\3\2\2\2\u00a1\u0231\3\2\2\2\u00a3\u023a\3\2"+
		"\2\2\u00a5\u023e\3\2\2\2\u00a7\u0240\3\2\2\2\u00a9\u0242\3\2\2\2\u00ab"+
		"\u0251\3\2\2\2\u00ad\u0258\3\2\2\2\u00af\u00b0\7d\2\2\u00b0\u00b1\7q\2"+
		"\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5"+
		"\7c\2\2\u00b5\u00b6\7p\2\2\u00b6\4\3\2\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9"+
		"\7p\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7i\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\u00be\7t\2\2\u00be\6\3\2\2\2\u00bf\u00c0\7u\2\2\u00c0"+
		"\u00c1\7s\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7t\2\2"+
		"\u00c4\u00c5\7g\2\2\u00c5\b\3\2\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7t"+
		"\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7g\2\2\u00ca\n\3\2\2\2\u00cb\u00cc"+
		"\7h\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7u\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0\f\3\2\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7p\2\2\u00d3"+
		"\u00d4\7f\2\2\u00d4\16\3\2\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7t\2\2\u00d7"+
		"\20\3\2\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7v\2\2\u00db"+
		"\22\3\2\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7u\2\2\u00de\24\3\2\2\2\u00df"+
		"\u00e0\7>\2\2\u00e0\26\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2\30\3\2\2\2\u00e3"+
		"\u00e4\7?\2\2\u00e4\32\3\2\2\2\u00e5\u00e6\7<\2\2\u00e6\34\3\2\2\2\u00e7"+
		"\u00e8\7=\2\2\u00e8\36\3\2\2\2\u00e9\u00ea\7]\2\2\u00ea \3\2\2\2\u00eb"+
		"\u00ec\7_\2\2\u00ec\"\3\2\2\2\u00ed\u00ee\7.\2\2\u00ee$\3\2\2\2\u00ef"+
		"\u00f0\7*\2\2\u00f0&\3\2\2\2\u00f1\u00f2\7+\2\2\u00f2(\3\2\2\2\u00f3\u00f4"+
		"\7-\2\2\u00f4*\3\2\2\2\u00f5\u00f6\7/\2\2\u00f6,\3\2\2\2\u00f7\u00f8\7"+
		",\2\2\u00f8.\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\60\3\2\2\2\u00fb\u00fc"+
		"\7\'\2\2\u00fc\62\3\2\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7m\2\2\u00ff"+
		"\u0100\7k\2\2\u0100\u0101\7r\2\2\u0101\64\3\2\2\2\u0102\u0103\7k\2\2\u0103"+
		"\u0104\7h\2\2\u0104\66\3\2\2\2\u0105\u0106\7v\2\2\u0106\u0107\7j\2\2\u0107"+
		"\u0108\7g\2\2\u0108\u0109\7p\2\2\u01098\3\2\2\2\u010a\u010b\7f\2\2\u010b"+
		"\u010c\7q\2\2\u010c\u010d\7p\2\2\u010d\u010e\7g\2\2\u010e:\3\2\2\2\u010f"+
		"\u0110\7g\2\2\u0110\u0111\7n\2\2\u0111\u0112\7u\2\2\u0112\u0113\7g\2\2"+
		"\u0113<\3\2\2\2\u0114\u0115\7y\2\2\u0115\u0116\7j\2\2\u0116\u0117\7k\2"+
		"\2\u0117\u0118\7n\2\2\u0118\u0119\7g\2\2\u0119>\3\2\2\2\u011a\u011b\7"+
		"f\2\2\u011b\u011c\7q\2\2\u011c@\3\2\2\2\u011d\u011e\7x\2\2\u011e\u011f"+
		"\7q\2\2\u011f\u0120\7k\2\2\u0120\u0121\7f\2\2\u0121B\3\2\2\2\u0122\u0123"+
		"\7u\2\2\u0123\u0124\7g\2\2\u0124\u0125\7v\2\2\u0125D\3\2\2\2\u0126\u0127"+
		"\7v\2\2\u0127\u0128\7q\2\2\u0128F\3\2\2\2\u0129\u012a\7e\2\2\u012a\u012b"+
		"\7q\2\2\u012b\u012c\7o\2\2\u012c\u012d\7r\2\2\u012d\u012e\7w\2\2\u012e"+
		"\u012f\7v\2\2\u012f\u0130\7g\2\2\u0130H\3\2\2\2\u0131\u0132\7p\2\2\u0132"+
		"\u0133\7g\2\2\u0133\u0134\7z\2\2\u0134\u0135\7v\2\2\u0135J\3\2\2\2\u0136"+
		"\u0137\7p\2\2\u0137\u0138\7q\2\2\u0138\u0139\7v\2\2\u0139\u013a\7j\2\2"+
		"\u013a\u013b\7k\2\2\u013b\u013c\7p\2\2\u013c\u013d\7i\2\2\u013dL\3\2\2"+
		"\2\u013e\u013f\7h\2\2\u013f\u0140\7w\2\2\u0140\u0141\7p\2\2\u0141\u0142"+
		"\7e\2\2\u0142\u0143\7v\2\2\u0143\u0144\7k\2\2\u0144\u0145\7q\2\2\u0145"+
		"\u0146\7p\2\2\u0146N\3\2\2\2\u0147\u0148\7f\2\2\u0148\u0149\7g\2\2\u0149"+
		"\u014a\7e\2\2\u014a\u014b\7n\2\2\u014b\u014c\7c\2\2\u014c\u014d\7t\2\2"+
		"\u014d\u014e\7g\2\2\u014eP\3\2\2\2\u014f\u0150\7n\2\2\u0150\u0151\7q\2"+
		"\2\u0151\u0152\7e\2\2\u0152\u0153\7c\2\2\u0153\u0154\7n\2\2\u0154R\3\2"+
		"\2\2\u0155\u0156\7t\2\2\u0156\u0157\7g\2\2\u0157\u0158\7v\2\2\u0158\u0159"+
		"\7w\2\2\u0159\u015a\7t\2\2\u015a\u015b\7p\2\2\u015bT\3\2\2\2\u015c\u015d"+
		"\7k\2\2\u015d\u015e\7o\2\2\u015e\u015f\7r\2\2\u015f\u0160\7q\2\2\u0160"+
		"\u0161\7t\2\2\u0161\u0162\7v\2\2\u0162V\3\2\2\2\u0163\u0164\7y\2\2\u0164"+
		"\u0165\7n\2\2\u0165\u0166\7f\2\2\u0166X\3\2\2\2\u0167\u0168\7t\2\2\u0168"+
		"\u0169\7g\2\2\u0169\u016a\7v\2\2\u016a\u016b\7c\2\2\u016b\u016c\7k\2\2"+
		"\u016c\u016d\7p\2\2\u016dZ\3\2\2\2\u016e\u016f\7f\2\2\u016f\u0170\7g\2"+
		"\2\u0170\u0171\7h\2\2\u0171\u0172\7c\2\2\u0172\u0173\7w\2\2\u0173\u0174"+
		"\7n\2\2\u0174\u0175\7v\2\2\u0175\\\3\2\2\2\u0176\u0177\7c\2\2\u0177\u0178"+
		"\7t\2\2\u0178\u0179\7g\2\2\u0179\u017a\7p\2\2\u017a\u017b\7c\2\2\u017b"+
		"^\3\2\2\2\u017c\u017d\7n\2\2\u017d\u017e\7c\2\2\u017e\u017f\7v\2\2\u017f"+
		"\u0180\7k\2\2\u0180\u0181\7v\2\2\u0181\u0182\7w\2\2\u0182\u0183\7f\2\2"+
		"\u0183\u0184\7g\2\2\u0184`\3\2\2\2\u0185\u0186\7n\2\2\u0186\u0187\7q\2"+
		"\2\u0187\u0188\7p\2\2\u0188\u0189\7i\2\2\u0189\u018a\7k\2\2\u018a\u018b"+
		"\7v\2\2\u018b\u018c\7w\2\2\u018c\u018d\7f\2\2\u018d\u018e\7g\2\2\u018e"+
		"b\3\2\2\2\u018f\u0190\7i\2\2\u0190\u0191\7t\2\2\u0191\u0192\7k\2\2\u0192"+
		"\u0193\7f\2\2\u0193d\3\2\2\2\u0194\u0195\7u\2\2\u0195\u0196\7k\2\2\u0196"+
		"\u0197\7|\2\2\u0197\u0198\7g\2\2\u0198f\3\2\2\2\u0199\u019a\7o\2\2\u019a"+
		"\u019b\7q\2\2\u019b\u019c\7x\2\2\u019c\u019d\7g\2\2\u019dh\3\2\2\2\u019e"+
		"\u019f\7u\2\2\u019f\u01a0\7j\2\2\u01a0\u01a1\7q\2\2\u01a1\u01a2\7q\2\2"+
		"\u01a2\u01a3\7v\2\2\u01a3j\3\2\2\2\u01a4\u01a5\7w\2\2\u01a5\u01a6\7u\2"+
		"\2\u01a6\u01a7\7g\2\2\u01a7l\3\2\2\2\u01a8\u01a9\7o\2\2\u01a9\u01aa\7"+
		"c\2\2\u01aa\u01ab\7r\2\2\u01abn\3\2\2\2\u01ac\u01ad\7t\2\2\u01ad\u01ae"+
		"\7c\2\2\u01ae\u01af\7f\2\2\u01af\u01b0\7k\2\2\u01b0\u01b1\7q\2\2\u01b1"+
		"p\3\2\2\2\u01b2\u01b3\7h\2\2\u01b3\u01b4\7t\2\2\u01b4\u01b5\7w\2\2\u01b5"+
		"\u01b6\7k\2\2\u01b6\u01b7\7v\2\2\u01b7\u01b8\7u\2\2\u01b8r\3\2\2\2\u01b9"+
		"\u01ba\7u\2\2\u01ba\u01bb\7q\2\2\u01bb\u01bc\7f\2\2\u01bc\u01bd\7c\2\2"+
		"\u01bdt\3\2\2\2\u01be\u01bf\7c\2\2\u01bf\u01c0\7o\2\2\u01c0\u01c1\7o\2"+
		"\2\u01c1\u01c2\7q\2\2\u01c2v\3\2\2\2\u01c3\u01c4\7e\2\2\u01c4\u01c5\7"+
		"q\2\2\u01c5\u01c6\7w\2\2\u01c6\u01c7\7p\2\2\u01c7\u01c8\7v\2\2\u01c8x"+
		"\3\2\2\2\u01c9\u01ca\7i\2\2\u01ca\u01cb\7t\2\2\u01cb\u01cc\7c\2\2\u01cc"+
		"\u01cd\7c\2\2\u01cd\u01ce\7n\2\2\u01cez\3\2\2\2\u01cf\u01d0\7k\2\2\u01d0"+
		"\u01d1\7u\2\2\u01d1|\3\2\2\2\u01d2\u01d3\7p\2\2\u01d3\u01d4\7q\2\2\u01d4"+
		"\u01d5\7t\2\2\u01d5\u01d6\7v\2\2\u01d6\u01d7\7j\2\2\u01d7~\3\2\2\2\u01d8"+
		"\u01d9\7u\2\2\u01d9\u01da\7q\2\2\u01da\u01db\7w\2\2\u01db\u01dc\7v\2\2"+
		"\u01dc\u01dd\7j\2\2\u01dd\u0080\3\2\2\2\u01de\u01df\7g\2\2\u01df\u01e0"+
		"\7c\2\2\u01e0\u01e1\7u\2\2\u01e1\u01e2\7v\2\2\u01e2\u0082\3\2\2\2\u01e3"+
		"\u01e4\7y\2\2\u01e4\u01e5\7g\2\2\u01e5\u01e6\7u\2\2\u01e6\u01e7\7v\2\2"+
		"\u01e7\u0084\3\2\2\2\u01e8\u01e9\7p\2\2\u01e9\u01ea\7g\2\2\u01ea\u01eb"+
		"\7c\2\2\u01eb\u01ec\7t\2\2\u01ec\u01ed\7d\2\2\u01ed\u01ee\7{\2\2\u01ee"+
		"\u0086\3\2\2\2\u01ef\u01f0\7d\2\2\u01f0\u01f1\7{\2\2\u01f1\u0088\3\2\2"+
		"\2\u01f2\u01f3\7f\2\2\u01f3\u01f4\7k\2\2\u01f4\u01f5\7t\2\2\u01f5\u01f6"+
		"\7v\2\2\u01f6\u008a\3\2\2\2\u01f7\u01f8\7t\2\2\u01f8\u01f9\7q\2\2\u01f9"+
		"\u01fa\7e\2\2\u01fa\u01fb\7m\2\2\u01fb\u008c\3\2\2\2\u01fc\u01fd\7x\2"+
		"\2\u01fd\u01fe\7k\2\2\u01fe\u01ff\7p\2\2\u01ff\u0200\7g\2\2\u0200\u0201"+
		"\7u\2\2\u0201\u008e\3\2\2\2\u0202\u0203\7|\2\2\u0203\u0204\7q\2\2\u0204"+
		"\u0205\7o\2\2\u0205\u0206\7d\2\2\u0206\u0207\7k\2\2\u0207\u0208\7g\2\2"+
		"\u0208\u0090\3\2\2\2\u0209\u020a\7r\2\2\u020a\u020b\7n\2\2\u020b\u020c"+
		"\7c\2\2\u020c\u020d\7{\2\2\u020d\u020e\7g\2\2\u020e\u020f\7t\2\2\u020f"+
		"\u0092\3\2\2\2\u0210\u0211\7g\2\2\u0211\u0212\7p\2\2\u0212\u0213\7p\2"+
		"\2\u0213\u0214\7g\2\2\u0214\u0215\7o\2\2\u0215\u0216\7k\2\2\u0216\u0094"+
		"\3\2\2\2\u0217\u0218\7n\2\2\u0218\u0219\7k\2\2\u0219\u021a\7h\2\2\u021a"+
		"\u021b\7g\2\2\u021b\u0096\3\2\2\2\u021c\u021d\7y\2\2\u021d\u021e\7j\2"+
		"\2\u021e\u021f\7g\2\2\u021f\u0220\7p\2\2\u0220\u0098\3\2\2\2\u0221\u0222"+
		"\7{\2\2\u0222\u0223\7q\2\2\u0223\u0224\7w\2\2\u0224\u0225\7t\2\2\u0225"+
		"\u009a\3\2\2\2\u0226\u0227\7v\2\2\u0227\u0228\7w\2\2\u0228\u0229\7t\2"+
		"\2\u0229\u022a\7p\2\2\u022a\u009c\3\2\2\2\u022b\u022c\7\61\2\2\u022c\u022d"+
		"\7,\2\2\u022d\u009e\3\2\2\2\u022e\u022f\7,\2\2\u022f\u0230\7\61\2\2\u0230"+
		"\u00a0\3\2\2\2\u0231\u0236\5\u00a5S\2\u0232\u0235\5\u00a5S\2\u0233\u0235"+
		"\5\u00a7T\2\u0234\u0232\3\2\2\2\u0234\u0233\3\2\2\2\u0235\u0238\3\2\2"+
		"\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u00a2\3\2\2\2\u0238\u0236"+
		"\3\2\2\2\u0239\u023b\5\u00a7T\2\u023a\u0239\3\2\2\2\u023b\u023c\3\2\2"+
		"\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u00a4\3\2\2\2\u023e\u023f"+
		"\t\2\2\2\u023f\u00a6\3\2\2\2\u0240\u0241\4\62;\2\u0241\u00a8\3\2\2\2\u0242"+
		"\u0243\7\61\2\2\u0243\u0244\7,\2\2\u0244\u0248\3\2\2\2\u0245\u0247\13"+
		"\2\2\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0249\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024c\7,"+
		"\2\2\u024c\u024d\7\61\2\2\u024d\u024e\3\2\2\2\u024e\u024f\bU\2\2\u024f"+
		"\u00aa\3\2\2\2\u0250\u0252\7\17\2\2\u0251\u0250\3\2\2\2\u0251\u0252\3"+
		"\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\7\f\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u0256\bV\2\2\u0256\u00ac\3\2\2\2\u0257\u0259\t\3\2\2\u0258\u0257\3\2"+
		"\2\2\u0259\u025a\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025c\u025d\bW\2\2\u025d\u00ae\3\2\2\2\t\2\u0234\u0236"+
		"\u023c\u0248\u0251\u025a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}