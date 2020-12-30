<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>  
<link rel="stylesheet" type="text/css" href="https://tikzjax.com/v1/fonts.css">  
<script src="https://tikzjax.com/v1/tikzjax.js"></script>

[Index](./index.md)  
[Cours précédant](./cours_6.md)  
[Cours suivant](./cours_9.md)

## Réseaux

Un réseau est un quadruplet (G, s, t, c) :
- G un graphe orienté
- s sommet source de G
- t sommet puits de G
- c fonction de E(G) qui donne la capacité de chaque arc

## Flots

Un flot f dans un réseau (G, s, t, c) est une fonction de E(G) telle que :  
$$\forall e\in E(G),c(e) \geq f(e) \geq 0$$  
$$\forall v\in V(G)\setminus\{s,t\}\sum_{e=uv\in E(G)}f(e) = \sum_{e=vw\in E(G)}f(e)$$

La valeur du flot val(f) sera égale à $$\sum_{e=sv\in E(G)}f(e)$$

L'objectif est de trouver pour un réseau son flot de valeur maximum.

Pour trouver le flot maximal, on peux utiliser l'algorithme de Ford-Fulkerson. Sa complexité dépend de la valeur du flot maximum $$f_{max}$$, elle est en $$O(m*f_{max})$$

## Coupe

Une coupe est un sous-ensemble C de V(G) contenant s et ne contenant pas T.

Sa valeur est définie par : $$val(C)=\sum_{e=uv,u\in C,v\notin C}c(e)$$

#### Théorèmes

Soit f un flot réalisable sur un réseau R = (G, s, t, c) et C une coupe de R : Alors $$val(f)\leq val(C)$$

Soit f un flot maximum sur un réseau R = (G, s, t, c) et C une coupe minimum de R : Alors $$val(f) = val(C)$$

[Index](./index.md)  
[Cours précédant](./cours_6.md)  
[Cours suivant](./cours_9.md)
