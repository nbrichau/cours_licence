<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>  
<link rel="stylesheet" type="text/css" href="https://tikzjax.com/v1/fonts.css">  
<script src="https://tikzjax.com/v1/tikzjax.js"></script>

[Index](./index.md)  
[Cours précédant](./cours_3.md)

## Composantes fortement connexes

Si deux sommets u et v sont dans une même composante fortement connexe, alors aucun chemin entre eux n'utilise de sommet extérieur à la composante.

Lors d'un parcours en profondeur, tous les sommets d'une même composante fortement connexe se trouveront sand la même arborescence.

Si deux sommets u et v sont tels qu'il existe un chemin de u à v, alors pour tout parcours en profondeur, on aura $$f(\phi (u)) \geq f(\phi (v))$$.

Pour tout sommet u, $$\phi (\phi (u)) = \phi (u)$$?

Pour tout sommet u, lors d'un parcours en profondeur, $$\phi (u)$$ est un ancêtre du u.

Pour tout sommet u, u et $$\phi (u)$$ appartiennent à la même composante connexe.

Deux sommets u et v appartiennent à une même composante connexe si et seulement si ils ont le même aïeul.

Soit T une arborescence obtenue lors du parcours en profondeur de $$G^{-1}$$ de racine r. Pour tout sommet u, si $$\phi (u)$$ désigne l'ancêtre de u lors du parcours en profondeur de G (étape 1), alors $$\phi (u) = r$$ si et seulement si u appartient à T.

## Arbre
Un arbre est un graphe (non orienté) connexe sans cycle.  
Caractéristiques :
- G est un arbre.
- G est sans cycle et possède m arêtes avec m = n - 1.
- G est connexe et possède m arêtes avec m = n - 1.
- G est sans cycle, et en ajoutant une arête on obtient un graphe ayant un cycle (et un seul).
- G est connexe, et si on supprime une arête quelconque le graphe obtenu n'est plus connexe.
- Tout couple de sommets est relié par une chaîne élémentaire et une seule.

#### Lemmes

Soit G un graphe connexe à n sommets et m = n - 1 arêtes. Alors G possède au moins un sommet de degré 1.

Tout arbre possède au moins deux sommets de degré 1.

## Arbre couvrant de poids minimum

#### Graphe partiel

Soit G = (V, E) un graphe. Un **graphe partiel** de G est un graphe G' = (V, E') avec E' $$\subseteq$$ E.

#### Cycle fondamental

Soit T un arbre. Alors tout ajout d'une arête e = uv crée un cycle unique passant par e. Ce cycle sera appelé le **cycle fondamental** de e (par rapport à T).

#### Arbre couvrant de poids minimal

Soit (G, $$\omega$$) un graphe muni d'une fonction de poids sur ses arêtes $$\omega$$.  
Un arbre couvrant de poids minimum de (G, $$\omega$$) est un graphe partiel de G qui est un arbre et dont le poids total des arêtes est minimum.

*si $$\omega$$ est positive, alors un arbre couvrant de poids minimum est un graphe partiel connexe de poids minimum*

#### Algorithmes de calcul d'un arbre couvrant de poids minimum

Essentiellement :
- algorithme de Kruskal
- algorithme de Prim

## Algorithme de Kruskal

L'algorithme de Kruskal considère les arêtes une à une dans l'ordre croissant de leur poids et ne les gardes que si elles ne créent pas un cycle.




[Index](./index.md)  
[Cours précédant](./cours_3.md)
