% Alice no País das Maravilhas

% menina(Nome,Dia_semana,Horario).

before(A,B,[A|R]):- member(B,R), !.
before(A,B,[H|T]) :- B \== H ,before(A,B,T).

solucao(Teste) :-
	Teste = [_,_,_,_,_],
	member(menina(_,segunda,8),Teste),
	member(menina(_,segunda,9),Teste),
	member(menina(_,terca,8),Teste),
	member(menina(sara,terca,9),Teste),
	member(menina(nenhuma,quarta,8),Teste),
	member(menina(_,quarta,9),Teste),
	member(menina(_,quinta,8),Teste),
	member(menina(_,quinta,9),Teste),
	member(menina(_,sexta,8),Teste),
	member(menina(_,sexta,9),Teste),
	
	before(menina(pilar,_,_),menina(nanda,_,_),Teste),
	member(menina(lia,_,8),Teste),
	member(menina(rute,_,8),Teste),
	member(menina(olga,D,_),Teste), 
	member(menina(mel,D,_),Teste),
	member(menina(sara,_,_),Teste),
	member(menina(tina,_,_),Teste),
	member(menina(vago,_,_),Teste).

	
