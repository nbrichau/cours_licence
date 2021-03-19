<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédent](./cours_5.md)  
[Cours suivant](./cours_7.md)

# Lemme de l'étoile

Soit L un langage régulier reconnu par un automate fini à n états. Soit $$Z\in L$$ un mot de longueur $$\geq n$$.  
Alors z se factorise $$z=uvw$$, où $$|uv|\leq n, v \neq \epsilon$$ et on a $$uv^iw \in L, \forall i \geq 0$$

C'est une condition nécessaire mais pas suffisante de rationalité.

Si on a un mot suffisamment long alors le langage accepté est infini. Informellement, tout mot suffisamment long d'un langage rationnel peut-être pompé (ou gonflé, itéré). Une partie centrale du mot peut être répétée un nombre quelconque de fois, et chacun des mots ainsi produit est toujours dans le langage.

## Preuve

Basée sur le principe des tiroirs.  
Idée : identifier un circuit dans le graphe représentant l'automate fini.

Soit $$A$$ un automate fini. Soit $$z = a_1a_2...a_n$$ mot accepté par $$A$$. Il existe un chemin associé à $$z$$.
<!-- \overset{m}{\rightarrow} -->
$$q_0 \to^z q_t, q_0 in I, q_t \in F$$
$$z = a_1a_2...a_nw'$$
$$q_0 \to^{a_1} q_1 \to^{a_2} q_2 \to^{a_3} ... \to^{a_{n-1}} q_{n-1} \to^{a_n} q_n \to^{w'} q_t$$
Parmis ces n+1 états ($$q_0, q_1, ..., q_n$$), au moins 2 sont égaux.  
Soit $$0 \leq k \leq l \leq n$$ tels que $$q_k = q_l$$.  
Soit $$q = q_k = q_l$$, Un circuit dans le graphe.  
$$u = a_1a_2...a_k$$, $$v = a_{k+1}...a_l$$, $$w = a_{l+1}...a_nw'$$
$$|v| = l - k \neq 0 \Rightarrow v \neq \epsilon, |uv| \leq n$$

Le chemin se factorise.  
$$q_0 \to^u q \to^v q \to^w q_t \Rightarrow q_0 \to^u q \to^{v^i} q \to^w q_t , uv^iw \in L , \forall i \geq 0$$

## Utilisation du lemme

On se sert du lemme de l'étoile pour prouver qu'un langage n'est pas rationnel. On prouve pour cela par réduction à l'absurde.

Exemple : Prouver que le langage $$L = \{a^nb^n \| n \geq 0 \}$$ n'est pas régulier.

On suppose par absurde que L est un langage régulier. Soit $$z = a^nb^n \in L$$.  
D'après le lemme de l'étoile, il existe une factorisation  $$z = uvw$$, où $$|uv| \leq n, v \neq \epsilon$$  
$$\Rightarrow uv \subset a^*$$.  
Soit $$k = |v| > 0$$ c'est-à-dire $$v = a^k$$  
$$\Rightarrow uv^iw = uvv^{i-1}w = a^{m+(k-1)^k}b^m \notin L$$  
Contradiction, donc L n'est pas un langage régulier.

# Résiduel (quotient à gauche)

Soit A un alphabet. On appelle résiduel d'un langage $$L \subseteq A^* $$ par rapport à un mot $$u \in A^* $$ le langage $$u^{-1}L = L/u = \{v \in A^* \| uv \in L\}$$ qui est l'ensemble de mots de $$L$$ qui commence par $$u$$ auxquels ont a retiré ce préfixe $$u$$.

Exemple :  
L = aa(bb+c)*  
L/a = a(bb+c)*  
L/b = $$\emptyset$$

## Quotient à droite

Le quotient à droite $$Lu^{-1}$$ du langage $$L$$ par rapport à un mot $$u$$ est l'ensemble des mots $$v$$ tels que $$vu \in L$$. On enlève le suffixe $$v$$.

## Résiduels d'un langage

On appelle résiduels d'un langage $$L$$ les langages $$R_{\epsilon}$$, $$R_a$$, $$R_b$$, $$R_aa$$, ... où $$R_u = u^{-1}L$$

Exemple :  
$$L = ab^* + ba^*$$
$$R_{\epsilon} = \epsilon^{-1}L = L$$
$$R_a = a^{-1}L = b*$$
$$R_b = b^{-1}L = a*$$
$$R_{aa} = a^{-1}R_a = \emptyset$$

[Index](./index.md)  
[Cours précédent](./cours_5.md)  
[Cours suivant](./cours_7.md)
