grammar Prova;

start: iniz;

iniz: list;

list: alfa (',' alfa)*;

alfa:
    '(' expr ')' clini alfa #nuovaEspressioneP
    | expr clini alfa? #nuovaEspressione
    | FINAl #fine
    | #fineSenzaFinal
;

clini: '*' #cliniSi | #cliniNO;

expr: expr1 expr2?;

expr1: FINAl expr3? #piu;

expr2: FINAl expr2?;

expr3: '+' possibilita?;

possibilita: FINAl | alfa;

FINAl: [a-zA-Z0-9] | 'epsilon';

WS: [ \t\r\n]+ -> skip;
