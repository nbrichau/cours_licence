[Index](./index.md)  
[Cours précédant](./cours_4.md)

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






[Index](./index.md)  
[Cours précédant](./cours_4.md)
