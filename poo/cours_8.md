[Index](./index.md)  
[Cours précédant](./cours_7.md)

# Enumération

```java
public enum Color {
	RED(255,0,0),
	GREEN(0,255,0),
	BLUE(0,0,255);

	private int r;
	private int g;
	private int b;

	Color(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
}
```

# Collections
- regrouper des objets éléments
- comportement ≠ (liste/ensemble)
- interface `java.util.Collection`


```
add()
contains()
isEmpty()
remove()
size()
```


## Liste
`List<E>`
- collection ordonnée d'éléments
- taille non bornée
- opération pour
	- accéder en tete de liste
	- accéder en queue de liste
- implémentations différentes
	- `ArrayList<E>`
	- `LinkedList<E>`

## Itérateur
`Iterator<E>`

```
hasNext
next
remove
```

## Ensemble
`Set<E>`  
Ensemble non ordonné

# Map
`Map<K,V>`
Liste associative clé-valeur

```
get(K key)
put(K key, V value)
remove
keySet()
values()
```

# hash table

C'est un ensemble de couple key-value  
Ça transforme la table (K key, V Value) en (int key, V value) ça permet un accès direct à une valeur grace à get(key.hashcode) au lieu de tester tout les clef une par une.

### hashcode

fonction qui prend un objet de peux importe quelle taille et retourne un entier.

# Classes anonymes
```java
/*
 * L'annotation permet de dire au développeur que c'est sensé être une interface fonctionnelle (utilisé par des classes anonymes)
 */
public @FunctionnalInterface interface Operation {
	int calculer(int x, int y);
}

public class Somme implements Operation {
	@Override
	public int calculer(int x, int y){
		return x + y;
	}
}

public class Main {
	public static void main(String[] args) {
		Operation op = new Somme();
		System.out.println(op.calculer(1, 2));

		/*
		 * Ici on déclare une classe anonyme.
		 * Cette classe implémente `Operation` et n'as pas de nom.
		 * Cela permet de créer une classe à usage unique. Sans s'embêter avec un fichier.
		 * C'est possible de les faire à partir d'interfaces mais aussi de classes abstraites.
		 */
		Operation op2 = new Operation(){
			@Override
			public int calculer(int x, int y){
				return x * y;
			}
		};
		System.out.println(op2.calculer(1, 2));
	}
}
```

# Lambda Expression
```java
(x, y) -> {
	//some code
}
x -> x + 1
```

Applique les instructions à droite de la fleche à partir des objets de la partie de gauche.  
```java
(x, y) -> {
	//some code
}
// La lambda expression ci-dessus est équivalente à la méthode ci-dessous.
method(T x, T y){
	//some code
}
```

# Stream
Approche fonctionnelle des traitements sur les éléments d'une source.  

```java
List<String> givenList = Arrays.asList("aaa", "abb", "acc", "dd");

givenList.stream()
	.filter(s -> s.startWith("a"))
	.map(s -> "_" + s)
	.limit(2)
	.map(String::toUpperCase)// égal à .map(s -> s.toUpperCase)
	.forEach(System.out::println);

```

[Index](./index.md)  
[Cours précédant](./cours_7.md)
