%1
pred([],[]).
pred([H|T],[H1|T1]) :- H1 is H+1, pred(T,T1).

/*
%1 ?- pred([1,2,3],[a,b,c]) -> false
%2 ?- pred([8,9],L). -> L = [9, 10].
%3 ?- pred([1,2,3],[2,L]). -> false.
%4 ?- pred([1,2],[2,X]). -> X = 3.

 o predicado funciona como um map, acrescentando uma unidade para cada elemento da lista de entrada,
ele tambem pode verificar, entrando com 2 listas, se cada elemento da lista 1 é uma unidade menor que cada elemento da lista 2.*/

%2
ziplus([],[],[]).
ziplus([H1|T1],[H2|T2],[H|T]) :- H is H1+H2,ziplus(T1,T2,T).

%3
countdown(0,[0]) :- !.
countdown(N,[N|T]) :- I is N-1,countdown(I,T).

%4
aux(X,Y,[]) :- X>=Y,!.
aux(X,Y,[H|T]) :- X<Y,H is 2^X, I is X+1, aux(I,Y,T).

potencias(N,L) :- aux(0,N,L).

%5
positivos([],[]).
positivos([H1|T1],L) :- H1=<0, positivos(T1,L).
positivos([H1|T1],[H|T]) :- H1>0, H=H1,positivos(T1,T).

%6
mesmaposicao(_,[],[]).
mesmaposicao(A,[H1|T1],[H2|T2]) :- A == H1, A == H2.
mesmaposicao(A,[H1|T1],[H2|T2]) :- A \== H1, A \== H2, mesmaposicao(A,T1,T2).

%7
intercala(_,[],[]):-!.
intercala(_,T,T) :- length(T,L),L=1,!.
intercala(A,[H1|T1],[H1,A|T]) :- intercala(A,T1,T).

%8
comissao(0,_,[]).
comissao(NP,LP,[H|T]) :- NP>0, el(H,LP,R), NP1 is NP-1, comissao(NP1,R,T).

el(X,[X|L],L).
el(X,[_|L],R) :- el(X,L,R).

%9
azulejos(0,0) :- !.
azulejos(NA,NQ) :- A is floor(sqrt(NA)),B is NA-(A^2),azulejos(B,L),NQ is L+1.



