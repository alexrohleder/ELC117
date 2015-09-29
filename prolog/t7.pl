
pred([], []).
pred([H|T], [H1|T1]) :- H1 is H + 1, pred(T, T1).

ziplus([], [], []).
ziplus([H|T], [H1|T1], [HL|TL]) :- HL is H + H1, ziplus(T, T1, TL).

countdown(0, [0]).
countdown(N, [N|T]) :- N1 is N - 1, countdown(N1, T).

potencias(N, L) :- potenciasAux(0, N, L).
potenciasAux(N, N, [L|[]]) :- L is 2 ^ N.
potenciasAux(X, N, [H|T]) :- H is 2 ^ X, X1 is X + 1, potenciasAux(X1, N, T).

positivos([], []).
positivos([H1|T1], [H2|T2]) :- H1 > -1, H2 is H1, positivos(T1, T2).
positivos([H1|T1], L) :- H1 < 0, positivos(T1, L).

mesmaPosicao(A, [A|_], [A|_]).
mesmaPosicao(A, [_|T1], [_|T2]) :- mesmaPosicao(A, T1, T2).

intercala(_, [], []).
intercala(_, [L], [L]).
intercala(S, [H|T], [H,S|LT]) :- intercala(S, T, LT).

comb(0, [], []).
comb(NP, [H|T1], [H|T2]) :- NPD is NP - 1, comb(NPD, T1, T2).
comb(NP, [_|T1], C) :- comb(NP, T1, C).
