[Index](./index.md)  
[Cours précédant](./cours_5.md)  
[Cours suivant](./cours_6.md)

## Grammaire attribuée

Une dérivation d'un mot en fonction d'une grammaire algébrique permet de construire un arbre syntaxique où :
- la racine correspond au symbole initial de la grammaire
- les feuilles correspondent aux lettres de la grammaire
- chaque nœud correspond à une dérivation immédiate

Une grammaire attribuée est une grammaire où chaque terme de chaque règles est augmenté d'un ensemble de symbole permettant d'y associer un calcul.

Une grammaire S-attribuée (synthesized attribute grammar) est une grammaire dont les attributs ne peuvent être calculés que de droite à gauche dans l'ordre de dérivation (de bas en haut dans l'arbre d'analyse syntaxique).

Si les attributs peuvent être calculé de gauche à droite, alors c'est une grammaire H-attribuée (inherited attribute grammar).

Une grammaire L-attribuée a des attributs qui peuvent être calculé lors d'une traversée gauche droite de l'arbre.

[Index](./index.md)  
[Cours précédant](./cours_5.md)  
[Cours suivant](./cours_6.md)
