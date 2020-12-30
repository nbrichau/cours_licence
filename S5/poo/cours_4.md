[Index](./index.md)  
[Cours précédant](./cours_3.md)  
[Cours suivant](./cours_5.md)

## Héritage

Véhicule :
- speedMax
- passengers

Plane :
- speedMax
- passengers
- altitudeMax

Un véhicule et un avion possède des attributs similaire

### Héritage de classes
Exprimer une relation de similarité entre deux classes.

```java
class Vehicule {
	int speedMax;
	int passengers;
}

class Plane {
	int speedMax;
	int passengers;
	int altitudeMax;
}
```

Plane "est un" Véhicule. (mais un Vehicule n'est pas forcément un Plane)

En Java :

```java
class Vehicule {
	int speedMax;
	int passengers;
}

class Plane extends Vehicule {
	//La classe Plane a ainsi les attributs de sa classe mère
	int altitudeMax;
}
```
La classe Plane étend la classe Vehicule.  
Plane est une sous-classe de Vehicule.  
Vehicule est la classe mère de Plane.  
La classe Plane est une spécialisation de la classe Vehicule.

Il est possible de faire des héritage multiple (hériter d'une classe qui hérite elle-même d'une autre classe). On hérite ainsi de tout les attributs et méthodes de ses classes mères.

On ne peux hériter que d'une seule classe.

Tout les classes en Java héritent implicitement de la classe `Object`.

### Redéfinition de méthode

```java
class Vehicule {
	int draw(){
		//some code
	}
}

class Plane extends Vehicule {
	@Override
	int draw(){
		//some other code
	}
}
```

Plane redéfini la méthode draw car elle a la même signature.  
Attention à ne pas confondre surcharge et redéfinition.

Il est possible de faire de la redéfinition de méthode avec des types de retour covariants. Redéfinir une méthode en changeant le type de retour à la seule condition que le nouveau type de retour soit une sous-classe de l'originel.


### Polymorphisme

Manipuler un objet sans connaître tout à fait son type.  
-> Late Binding (fr: Ligature dynamique)

Repose sur :
- relation ensembliste du sous-typage (relation "est un")
- substitution de classe

C'est une sorte d'encapsulation de la classe.

[Index](./index.md)  
[Cours précédant](./cours_3.md)  
[Cours suivant](./cours_5.md)
