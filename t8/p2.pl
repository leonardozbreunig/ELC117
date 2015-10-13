% Banda de Rock

esquerda(A,B,[A|[B|_]]).
esquerda(A,B,[_|R]):-esquerda(A,B,R).

proximo(A,B,L):-esquerda(A,B,L);esquerda(B,A,L).

mesmaPosicao(X,[X|_],[X|_]):- !.
mesmaPosicao(X,[H1|T1],[H2|T2]) :- mesmaPosicao(X,T1,T2).

before(A,B,[A|R]):- member(B,R), !.
before(A,B,[H|T]) :- B \== H ,before(A,B,T).

nao_lado(A,B,[A|[H|_]]):- H \== B, !.
nao_lado(A,B,[_|R]):- nao_lado(A,B,R).

longe(A,B,L):-nao_lado(A,B,L),before(A,B,L),!.
longe(A,B,L):-nao_lado(B,A,L),before(B,A,L),!.


solucao(Semana1,Semana2):-
	Semana1 = [_,_,_,_,_,_],
	Semana2 = [_,_,_,_,_,_],
	before(r,s,Semana1), before(r,s,Semana2),
	mesmaPosicao(s,Semana1,Semana2),
	proximo(t,v,Semana1),
	proximo(t,v,Semana2),
	longe(u,w,Semana1),
	longe(u,w,Semana2),
	[_,_,_,w,_,_] = Semana1,
	[_,w,_,_,_,_] = Semana2.	
	
	
	
	
	
