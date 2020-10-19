<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>  
<link rel="stylesheet" type="text/css" href="https://tikzjax.com/v1/fonts.css">  
<script src="https://tikzjax.com/v1/tikzjax.js"></script>

[Index](./index.md)  
[Cours précédant](./cours_5.md)

# Algorithme de Ford (Bellman-Ford)

## Objectif
Il permet de calculer les plus cours chemins entre un sommet s et tous les autres. Même si le graphe possède un ou des circuits et/ou des arcs de poids négatif.

Si un circuit négatif alors renvoi Faux sinon Vrai.

## Principe
A chaque itération, on effectue un relâchement sur chaque arc uv pour voir si il est opportun d'utiliser cet arc pour avoir un plus court chemin entre s et v.

## Complexité

O(n*m)

# Plus court chemin entre chaque paire de sommets
Utilisation de Dijkstra n fois. On a ainsi un algorithme de complexité O(n²*log(n) + n\*m).

## Calcul matriciel
On considère une matrice W[i, j] avec
- O si i=j
- $$\omega (i,j)$$ si ij $$\in$$ E(g)
- $$\infty$$ sinon

# Algorithme de Floyd (Floyd-Warshall)

L'algorithme de Floyd s'appuie sur le fait que l'on ne va, à chaque calcul de la nouvelle matrice, considérer que les k premiers sommets comme sommets intermédiaires potentiels.  
Comme il y a n boucles, on aura bien à la fin considéré tous les sommets comme sommet intermédiaires potentiel.

# Algorithme de Warshall


[Index](./index.md)  
[Cours précédant](./cours_5.md)
