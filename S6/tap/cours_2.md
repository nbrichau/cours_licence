<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_1.md)  
[Cours suivant](./cours_3.md)

## Tchisla 2
comme tchisla mais on compte aussi les signes.

exemple : c=1

|n  |valeur    |#c |longueur|
|:-:|:--------:|:-:|:------:|
|24 |(1+1+1+1)!|4  |10      |
|   |11+11+1+1 |6  |9       |

### Algorithme (principe)

On liste toutes les expressions par taille croissante et on s'arrête à la première qui est valide et de valeur n. (aka recherche exhaustive)  
Lister tous les résultats possibles et à vérifier à chaque fois si c'est une solution.

### Lister toutes les expressions
En codant les symbole par des chiffres :

|symbole|c|+|-|*|/|^|$$\sqrt{}$$|!|(|)|
|:-----:|-|-|-|-|-|-|-|-|-|-|
|codage |0|1|2|3|4|5|6|7|8|9|

11+11+1+1 -> 001001010  
11^11*1-1 -> 005003020

Il est possible de balayer toutes les possibilités en voyant le codage comme un compteur.

La longueur maximale du code est de 2n+3.

### Rappels sur la Complexité

Deux notions :
- complexité
- notations asymptotiques ($$O(), \Omega(), \Theta()$$)

## Complexité

C'est une mesure qui est appliquée à un algorithme ou un programme et qui s'exprime en fonction de la taille des entrées (paramètres).

La complexité en temps est le nombre d'opérations élémentaire maximum exécutées par l'algorithme pour toute entrées (donc dans la pire des cas).  
On admet qu'une opération élémentaire prend un temps unitaire.

La complexité en espace est le nombre de mots mémoires élémentaire maximum utilisés durant l'exécution de l'algorithme pour toute entrées.

Calculer exactement la complexité n'est pas souvent pertinent.

## Notation asymptotique

Comportement de la complexité sur de très grandes valeurs.

On dit que "f(n) est en grand O de g(n)" si $$\exists c>0, \forall n >= n_0, f(n) <= c g(n)$$. on le note $$f(n) = O(g(n))$$

"f(n) est en $$\Omega$$ de g(n)" si f(n) > c g(n).

"f(n) est en $$\Theta$$ de g(n)" si f(n) est en grand-O et Omega.

[Index](./index.md)  
[Cours précédant](./cours_1.md)  
[Cours suivant](./cours_3.md)
