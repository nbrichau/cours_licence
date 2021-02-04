[Index](./index.md)  
[Cours précédant](./cours_1.md)  
[Cours suivant](./cours_3.md)

## Expressions régulières

^R : Le mot reconnu par R doit se trouver en début de ligne (debut du fichier ou juste après `\n`).  
R$ : Le mot reconnu par R précède immédiatement `\n` ou la fin du fichier.  
R/S : Le mot reconnu par R précède immédiatement un mot reconnu par S.

Il existe d'autres compléments utiles comme `[:digit:]` pour un chiffre, `[:uppercase:]` pour un caractère capitale, ou `\S` pour tout caractère qui n'est pas un espace.

Notons que toute expression régulière correspond à un automate fini qui reconnait le langage d'une telle expression, et inversement.

## JFlex

JFlex est un logiciel écrit en Java qui contient principalement deux choses :
- Un programme qui permet de traduire des expressions régulières en automate à nombre fini d'états
- Un programme qui permet de parcourir un automate à nombre fini d'états.

## Entités lexicales (tokens)

Les mots (tokens) reconnus par un tokenizer (comme JFlex) sont des mots d'un langage rationnel.

Les langages d'expressions parenthésés ou structurées ne sont pas des tokens et de sont pas définis grâce à JFlex.

[Index](./index.md)  
[Cours précédant](./cours_1.md)  
[Cours suivant](./cours_3.md)
