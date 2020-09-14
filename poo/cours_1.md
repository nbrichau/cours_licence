### Programmation Orientée Objet :
Langage paradigme procédural -> langage impératif  
paradigme impératif :
- exprimer des traitements
- structurer les données
- modulariser le code
	- traitements réutilisés dans d'autres traitements (fonctions)

séparation entre :
- traitements
- données

exemple limitations en c :
```c
double surface (double largeur, double hauteur){
	return largeur*hauteur;
}
double l = 3.0;
double h = 4.0;
printf("surface = %f", surface(l, h));
```
```c
struct sfig{
	double largeur;
	double hauteur;
};
struct sfig f1 = {3.0, 4.0};
printf("surface = %f", surface(f1.largeur, f1.hauteur));
```

### Les Objets :
Au lieu de traiter d'un coté les données et de l'autre les traitements, on regroupe dans une même entité données et traitements :  
C'est un **objet**.

Chaque objet possède ses propres données, ses propres traitements (méthodes) et un identifiant unique.  
Un programme contient ainsi plusieurs objets.  

Ex : l'objet rectangle possède les données largeur et hauteur, peut faire les traitements calcul de sa surface, possède un identifiant unique

Un objet peut demander à un autre objet de réaliser un de ses traitements.  
Un objet est autonome.  
Un objet interagit avec d'autres objets.  

#### Création d'Objet :
```java
Rectangle rect = new Rectangle(3.0, 4.0);
```
On obtient ainsi une variable `rect` qui contient une référence vers l'objet de type `Rectangle`

### Mémoire en Java :
La mémoire est géré par la JVM (Java Virtual Machine).  
Il n'y a pas besoin de s'en occuper soi-même.  
La JVM alloue et libère automatiquement la mémoire au grès du programme, grâce au **Garbage Collector**

##### Garbage Collector :
Le garbage collector (ramasse miettes) supprime automatiquement les objets de la mémoire.  
Pour qu'un objet soit supprimé, il faut que plus aucun objet n'est de référence vers celui-ci.  
Il n'est pas possible de supprimer les objets à la main.

### Langage Java :
C'est un langage compilé et interprété.  
Le code source (fichiers .java) passe dans un compilateur (javac) qui génère du bytecode (fichiers .class).  
Les fichiers .class sont indépendants du système et architecture matérielle.  
Ensuite, la JVM execute les .class. Ils sont interprété dynamiquement par la JVM.

JRE (Java Runtime Environment) : Execute le programme dans la JVM (Java Virtual Machine)
JDK (Java Development Kit) : JRE + Compilateur

La JVM contient d'autres mini programme en plus du notre. Le garbage collector en fait parti.
