[Index](./index.md)  
[Cours précédant](./cours_5.md)

classes :
- type des objets (données, traitements)
- le code des traitements
- initialisation des objets

## Interfaces (java <1.8)

Une interface permet de définir la vue utilisateur d'un objet.

```java
/**
 * On définit seulement les prototypes/signatures des méthodes.
 */
public interface ILibrary {
	String name;

	Book takeBook(int id);
	void putBook(Book book);
}

/**
 * La classe est obligé de définir les méthodes et attributs
 */
public class RealLibrary implements ILibrary {
	public RealLibrary(){
		name = "L1";
	}
	Book takeBook(int id){
		return null;
	}
	void putBook(Book book){

	}
}

class MyClass {
	public static void main(String[] args) {
		// On peux définir une ILibrary comme une RealLibrary
		ILibrary lib = new RealLibrary();
	}
}
```

### Différence interfaces et classes abstraites

java < 8 : une interface c'est juste des types (pas de code).

La classe abstraite induit un lien d'héritage entre classes.

Une classe peux implémenter plusieurs interfaces, mais hériter d'une seule classe.

Une classe abstraite sert à spécialiser un objet.  
Une interface sert à définir la vision utilisateur d'un objet.

## Exception

- à la compilation (ex : type de variable)
- à l'exécution (ex : entrée de l'utilisateur)

```java
try {
	
} catch(Exception e) {

}
```
[Index](./index.md)  
[Cours précédant](./cours_5.md)
