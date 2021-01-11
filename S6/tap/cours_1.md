<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
<!-- [Cours suivant](./cours_2.md) -->

# Introduction

## Tchisla

Le but est de trouver une expression arithmétique de valeur n, c $$\in$$ {1..9} uniquement avec c, -, +, *, /, ^, $$\sqrt{}$$, !, (, ).

ex : n=2016, c=1 : $$2016=(1+1)^{11}-\sqrt{(1+1)^{11-1}}$$

Le but est de minimiser le nombre de c : $$f_c(n)$$.

|n         |1  |2  |3    |4      |5         |6       |7         |8           |9     |10  |
|----------|:-:|:-:|:---:|:-----:|:--------:|:------:|:--------:|:----------:|:----:|:--:|
|$$f_c(n)$$|1  |2  |3    |4      |4         |3       |4         |5           |4     |3   |
|          |1  |1+1|1+1+1|1+1+1+1|(1+1+1)!-1|(1+1+1)!|(1+1+1)!+1|(1+1+1)!+1+1|11-1-1|11-1|

## Formule close

Expression arithmétique qui donne la solution avec un nombre fini d'opérations liés aux paramètres.

S'il n'y a pas de formule close pour le calcul de $$f_c(n)$$, on peux rechercher un algorithme.

## Algorithme

**Algorithme** : Résoudre le problème avec un processus automatique de calcul à partir des entrées.

**Problème** : Description des instances et des sorties, la relation entre les entrées et les sorties.

Ex : Tchisla  
Instance : deux entiers n $$\ge$$ 1 c $$\in$$ [1,9]  
Question : Trouver une expression arithmétique utilisant uniquement +-*/^$$\sqrt{}$$!(), de valeur n et comportant le moins de fois c.

Malheureusement, les problèmes n'ont pas forcément d'algorithmes.  
Ces problèmes sont dits **indécidables**.

## Problèmes indécidables

C'est un problème qui n'a pas d'algorithme pour trouver une solution.

Les équations diophantiennes sont indécidables avec 11 variables.  
Une fonction qui dit si une autre fonction s'arrête ou boucle indéfiniment est indécidable (problème de la halte).

[Index](./index.md)  
<!-- [Cours suivant](./cours_2.md) -->
