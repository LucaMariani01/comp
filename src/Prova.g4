grammar Prova;

start: iniz;
iniz:
    list #generatoreDiListe
;

list:
    alfa list1 #successivo
;

list1:
    ','list #nuovoElemento
    |   #vuoto
;

alfa:
    '(' expr ')' ('*')? alfa?#nuovaEspressioneP
    | expr alfa?#nuovaEspressione
;

expr:
    expr FINAl #per
    | expr1 #passo
;
expr1:
    expr1 '+' FINAl #piu
    | FINAl #final
;


FINAl:
    [a-z]+('*')?
    | [A-Z]+('*')?
    | [0-9]+('*')?
    |[espilon]
;

WS: [\t\r\n]+ -> skip;
