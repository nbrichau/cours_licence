<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>  
<link rel="stylesheet" type="text/css" href="https://tikzjax.com/v1/fonts.css">  
<script src="https://tikzjax.com/v1/tikzjax.js"></script>

[Index](./index.md)  
[Cours précédant](./cours_2.md)  

## Parcours en profondeur
On examine les sommets du graphe en partant d'un sommet s.  
Tant que c'est possible, on "descend" dans le graphe de voisin en voisin. Sinon, on remonte jusqu'à être sur un sommet ayant encore un voisin non encore visité, et on redescend à nouveau.  
Si on remote jusqu'au premier sommet et qu'aucun de ses voisins n'a pas été visité, alors s'il reste encore un sommet s' non encore visité, on repart de s'.

*On va au plus profond et quand on ne peux plus descendre, on remonte le moins possible pour redescendre.*  

Pour cela, on utilise une boucle et une pile. Le plus simple est d'utiliser la pile d'appels générée par des appels récursifs.  
Une variable *temps*, initialisée à 0, sert à définir pour chaque sommet u deux valeurs : d(u) l'heure de début de visite de u et f(u) l'heure de fin de visite de u. *temps* est incrémentée avant chaque mise à jour des tableaux d et f.

#### Exemple

<script type="text/tikz">
\begin{tikzpicture}
	\tikzstyle{sommet}=[circle, draw=black!50,  thick]
	\node[sommet] (S) at (0,2) {$S$};
	\node[sommet] (A) at (2,2) {$A$}
		edge node {} (S);
	\node[sommet] (B) at (2,0) {$B$}
		edge node {} (S)
		edge node {} (A);
	\node[sommet] (C) at (0,0) {$C$}
		edge node {} (S)
		edge node {} (B);
	\node[sommet] (D) at (1,4) {$D$}
		edge node {} (A)
		edge node {} (B);

\end{tikzpicture}
</script>

Le parcours se fait dans l'ordre lexicographique.  

|sommet|S|A|B|C|D|
|--------|-|-|-|-|-|
|d(v)    |1 |2|3|4|6|
|f(v)    |10|9|8|5|7|


### Type des arcs de l'arborescence
- de **liaison** : ce sont les arcs reliant un sommet à ses fils
- **avant** : ce sont les arcs reliant un sommet à ses descendants $$\neq$$ de ses fils
- **arrière ou de retour** : ce sont les arcs reliant un sommet à l'un de ses ancêtres
- **transverse** : ce sont les arcs reliant un sommet aux sommets avec lesquels il n'a aucune relation dans l'arborescence.

##### Graphe non orienté
Il n'y a que des arcs de liaison ou des arcs retour. Il n'y a pas d'arc avant ni d'arc transverse.

## Théorème des parenthèses

Soit u et v deux sommets de G, et [d(u), f (u)], [d(v), f (v)] les intervalles définis par leurs heures de début et fin de visite. On suppose que d(u) < d(v). Deux cas sont possibles :  
- Soit [d(v), f (v)] $$\subset$$ [d(u), f (u)]. Dans ce cas v est un descendant de u.
- Soit [d(v), f (v)] $$\cap$$ [d(u), f (u)] = $$\o$$. Dans ce cas, aucun des deux n’est le descendant de l’autre dans l’arborescence.

Justification :
- dans le cas où [d(v), f (v)] $$\subset$$ [d(u), f (u)], cela signifie que v a été visité quand u était GRIS. Donc v sera un descendant de v et on finira la visite de v avant celle de u.
- Si [d(v), f (v)] $$\cap$$ [d(u), f (u)] = $$\o$$, alors comme d(v) > d(u), on a f (v) > d(v) > f (u) > d(u) et donc, on aura fini de visiter u avant de commencer la visite de v.

## Théorème du chemin blanc

Dans une forêt obtenu par un parcours en profondeur d’un graphe G = (V, E), un sommet v est un descendant d’un sommet u si et seulement si lors du début de visite du sommet u, il existe une chaîne ou un chemin reliant u à v composé exclusivement de sommets blancs.

## Application du parcours en profondeur

- tri topologique
- calcul des composantes fortement connexes
- recherche de points d'articulation
- test de planarité d'un graphe

### Tri topologique

Le tri topologique d’un graphe G orienté est un ordonnancement de ses sommets de telle sorte que si $$v_1, ..., v_n$$ est l’ordre obtenu, alors : $$\forall v_i, v_j \in V(G), v_i, v_j \in E(G) \implies i < j$$

##### Théorème
Un graphe G orienté admet un tri topologique si et seulement si il est sans circuit.

## Arbre
Un arbre est un graphe (non orienté) connexe sans cycle.  
Caractéristiques :
- G est un arbre.
- G est sans cycle et possède m arêtes avec m = n - 1.
- G est connexe et possède m arêtes avec m = n - 1.
- G est sans cycle, et en ajoutant une arête on obtient un graphe ayant un cycle (et un seul).
- G est connexe, et si on supprime une arête quelconque le graphe obtenu n'est plus connexe.
- Tout couple de sommets est relié par une chaîne élémentaire et une seule.

[Index](./index.md)  
[Cours précédant](./cours_2.md)  
