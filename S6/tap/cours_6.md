<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_5.md)  
[Cours suivant](./cours_7.md)

## Approximation

Trouver une tournée "proche" de la tournée maximum.

Exemple : l'algorithme du plus proche voisin. *complexité en $$O(n^2)$$*.  


### Algorithme glouton

L'algorithme glouton (greedy) est une stratégie algorithmique qui consiste à former une solution prenant à chaque étape le meilleur choix sans remettre en cause les choix précédents (backtracking).

On utilise ce principe dans le bin packing et Kruskal.

### Problème d'optimisation

TSP -> optimiser la longueur de la tournée. I = (V, d)

Définition : Une **$$\alpha$$-approximation**, pour un réel $$\alpha > 0$$, et un problème $$\Pi$$, est un algorithme polynomial A qui donne une solution pour toute instance $$I \in \Pi$$ telle que :
- $$A(I) \leq \alpha OPT_{\Pi}(I)$$ (minimisation)

ou
- $$A(I) \geq \alpha OPT_{\Pi}(I)$$ (maximisation)

$$\alpha$$ = facteur d'approximation de l'algo A

L'algorithme glouton n'est pas une $$\alpha$$-approximation. On parle d'heuristique.  
(algo supposé efficace en pratique qui produit un résultat sans garantit de qualité)

[Index](./index.md)  
[Cours précédant](./cours_5.md)  
[Cours suivant](./cours_7.md)
