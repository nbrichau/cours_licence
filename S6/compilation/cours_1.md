[Index](./index.md)  

# Introduction

Un compilateur est un logiciel de traduction d'un document depuis un langage source vers un langage cible.  
Un compilateur contient plusieurs modules :
- analyseur lexical
- analyseur syntaxique
- analyseur sémantique
- générateur de code intermédiaire
- optimiseur de code
- générateur de code

Le compilateur fait partie d'un ensemble d'outils permettant l'implémentation de logiciels :  
Sources -> Préprocesseur -> Compilateur -> Assembleur -> Lieur -> Chargeur

# Analyse lexicale (tokenization)

L'analyse lexicale est traitée par un outil qui s'appelle un annalyseur lexical (ou scanner, tokenizer).

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
