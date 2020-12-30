<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>  
<link rel="stylesheet" type="text/css" href="https://tikzjax.com/v1/fonts.css">  
<script src="https://tikzjax.com/v1/tikzjax.js"></script>

[Index](./index.md)  
[Cours précédant](./cours_8.md)

## Couplage

Un couplage dans un graphe G non orienté est un ensemble d'arêtes ayant aucun sommets en commun.

Un couplage parfait est un couplage qui couvre tous les sommets.

## Graphe biparti

Un graphe est biparti si son ensemble de sommets peut être partitionné en deux sous-ensemble disjoints A et B tels que les sous-graphes induits par A et B soient des stables (ne contiennent aucune arête).  
On note alors G par $$G=(A\cup B,E)$$
*un graphe est biparti si et seulement si il ne contient aucun cycle impair.*

### Recherche d'un couplage maximum dans un graphe biparti

Pour trouver un couplage maximum dans un graphe biparti $$G = (A\cup B,E)$$, on ajoute deux sommet s et t. s aura des arêtes vers chaque sommet de A, chaque sommet de B aura une arête vers t, et chaque arête de E deviennent orienté de A vers B.  
On donne une capacité de 1 à chaque arêtes du nouveau graphe.  
Il nous reste plus qu'a trouver le flot maximum de ce graphe pour avoir le couplage maximum du graphe d'origine.

### Sommet-connectivité

La sommet-connectivité (ou simplement connectivité) d'un graphe G non orienté est le nombre minimum de sommet qu'il faut supprimer pour que le graphe ne soit plus connexe.

Théorème de Menger : G est k-connexe si et seulement si il existe enter toute paire de sommet u et v k chaînes reliant u et v sommet-disjoints à l'exception de leur extrémités.

Il est possible de trouver la sommet-connectivité en utilisant les flots et l'algorithme de Ford et Fulkerson.

[Index](./index.md)  
[Cours précédant](./cours_8.md)
