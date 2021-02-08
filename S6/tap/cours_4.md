<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_3.md)  
[Cours suivant](./cours_5.md)

# Voyageur de commerce

## Le problème (TSP)

Instance : ensemble V avec |V| = n avec d=distance sur V

Question : Trouver un ordre de points de V $$v_0, ..., v_n$$ telle que $$\sum_{i=0}^{n}{d(v_i, v_{i+1})}$$ soit minimum.  
On supposera que la distance vérifie l'inégalité triangulaire : d(a,c) <= d(a,b)+d(b,c)

## Recherche exhaustive

1. Ce qui est demandé est un ordre sur V.
2. Calculer la longueur de la tournée pour savoir si c'est la bonne.

Donc : Générer tous les ordres possibles et prendre la plus courte

Complexité : O(n!*n)

[Index](./index.md)  
[Cours précédant](./cours_3.md)  
[Cours suivant](./cours_5.md)
