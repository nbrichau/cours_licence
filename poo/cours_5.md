[Index](./index.md)  
[Cours précédant](./cours_4.md)  
[Cours suivant](./cours_6.md)

## Conception

##### Quand utiliser l'héritage ?

1. Factoriser du code.  
Au moins 2 classes avec méthode et/ou attributs identiques.
2. Réutilisation de code déjà existant.  
3. Imposer un cadre.  
Fournir un patron/cadre qui doit être respecté.

## Classe abstraites

```java
/**
 * Classe abstraite
 * Le mot clef `abstract` sert à définir une classe abstraite;
 * Impossible d'instancier la classe
 * Impossible de faire  = new Shape();
 */
public abstract class Shape {

	/**
	 * Méthode abstraite
	 * Le mot clef `abstract` sert à définir une méthode abstraite.
	 * On définit seulement la signature de la méthode.
	 * Elle est obligé d'être redéfinie dans ses classes filles.
	 */
	public abstract double perimeter();
}

/**
 * Cette classe hérite d'une classe abstraite
 * Elle doit redéfinir toutes les méthodes abstraite de sa classe mère.
 */
public class Rectangle extends Shape {

	/**
	 * Redéfinition de la méthode abstraite de la classe mère.
	 */
	public double perimeter(){
		return 0;
	}
}
```

## Visibilité d'un champ

|visibilité |classe|package|sous-classe|monde|
|:---------:|:----:|:-----:|:---------:|:---:|
| `public`  |  O   |   O   |     O     |  O  |
|`protected`|  O   |   O   |     O     |  X  |
|   `  `    |  O   |   O   |     X     |  X  |
| `private` |  O   |   X   |     X     |  X  |

## Méhodes d'`Object`

`boolean equals(Object o)`

`String toString()`

Pour plus de détail, voir la [Javadoc](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html).

## Package

les packages sont représenté sous forme de dossier et avec des adresses dns inversées.

exemple :  
dossiers : `com/google/guava/`  
adresse : `package com.google.guava`

Pour utiliser une classe d'un package différent, il faut l'importer.  
`import java.lang.*` : on importe tout les classes du package.  
`import java.lang.Math` : on importe seulement la classe Math.

## Mot clef `final`

Une variable déclarée finale ne peux pas être modifiée une fois qu'elle est initialisé.  
Son initialisation se fait lors de la déclaration ou dans le constructeur.

Ex :
```java
final int x = 2;
```

Une méthode finale ne peux pas être redéfinie.

Ex :
```java
final int fct(){
	return 0;
}
```

Une classe finale ne peux pas être héritée. Aucune classe ne peux héritée de celle-ci.

Ex :
```java
public final class MyClass {
	//some code
}
```

[Index](./index.md)  
[Cours précédant](./cours_4.md)  
[Cours suivant](./cours_6.md)
