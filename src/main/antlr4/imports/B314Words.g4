lexer grammar B314Words;


// Identifiers
// Grammaire
BOOLEAN:'boolean'; INTEGER: 'integer'; SQUARE: 'square';
TRUE: 'true'; FALSE : 'false';
AND: 'and'; OR: 'or'; NOT: 'not'; AS: 'as';
INF: '<'; SUP: '>'; EQUAL: '='; DPT: ':'; SCOL: ';';
LBR:'['; RBR:']'; COMMA:','; LPAR: '('; RPAR: ')';
PLUS: '+'; MINUS: '-'; MULT: '*'; DIV: '/'; MOD: '%';
SKIPP: 'skip';
IF: 'if'; THEN: 'then'; DONE: 'done'; ELSE: 'else'; WHILE: 'while'; DO: 'do'; VOID: 'void';
SET: 'set'; TO: 'to';
COMPUTE: 'compute'; NEXT: 'next'; NOTHING: 'nothing';
FUNCTION: 'function'; DECLARE: 'declare'; LOCAL: 'local'; RETURN: 'return'; IMPORT: 'import';
WLD: 'wld';
RETAIN: 'retain';
DEFAULT: 'default';

ARENA: 'arena'; LATITUDE: 'latitude'; LONGITUDE: 'longitude'; GRID: 'grid'; SIZE: 'size';
MOVE: 'move'; SHOOT: 'shoot'; USE: 'use';

MAP: 'map'; RADIO: 'radio'; FRUITS: 'fruits'; SODA: 'soda'; AMMO: 'ammo';
COUNT: 'count';
GRAAL: 'graal';

IS: 'is';
NORTH: 'north'; SOUTH: 'south'; EAST: 'east'; WEST: 'west';
NEARBY: 'nearby'; BY: 'by';

DIRT: 'dirt'; ROCK: 'rock'; VINES: 'vines';
ZOMBIE: 'zombie'; PLAYER: 'player'; ENNEMI: 'ennemi'; LIFE: 'life';

WHEN: 'when'; YOUR: 'your'; TURN: 'turn';
//pour les commentaires(11)
COML: '/*'; COMR: '*/';


// Automatic
ID: LETTER (LETTER | DIGIT)* ;

NUMBER: (DIGIT)+;

fragment LETTER: 'A'..'Z' | 'a'..'z' ;
fragment DIGIT: '0'..'9' ;

// Comments -> ignored

COMMENT: '/*' .*? '*/' -> skip;

// Whitespaces -> ignored

NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \t]+ -> skip ;
