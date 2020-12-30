[Index](./index.md)  
[Cours précédant](./cours_2.md)  
[Cours suivant](./cours_4.md)

## Encapsulation

Permet de protéger les données pour préserver l'intégrité  
La visibilité d'un champ permet de changer l'accessibilité de ces champs.  

|visibilité|classe|package|sous-classe|monde|
|:--------:|:----:|:-----:|:---------:|:---:|
|`public`  |O|O|O|O|
|`protected`|O|O|O|X|
|`  `      |O|O|X|X|
|`private` |O|X|X|X|


## Responsabilité

Si les champs sont privés, alors la classe est responsable des traitements de ces champs.  
Elle se doit de proposer des méthodes ou des objets pour faire ces traitements.

## Cohésion

Les données et les traitements doivent faire un ensemble cohérent.

## Couplage fort/faible

C'est les dépendances/connaissances des objets entre eux.  
Si un objet A a une référence vers un objet B et ses attributs. Il y a un couplage fort. L'objet A a un accès direct aux attributs de l'objet B.

Pour limiter ce couplage, il faut que l'objet B n'expose plus ses attributs mais des méthodes qui permettent de manipuler ses attributs. Il y a alors un couplage faible entre les objets A et B.

## Encapsulation et responsabilité
+ Tous les attributs en privé.
+ Mise en place de getters et setters pour pouvoir modifier les attributs privés. Ils permettent de garantir l'intégrité des données qu'il stocke.

```java
class Point {
	private int x;

	int getX() { return x; }
	void setX(int x) {
		this.x = x;
	}
}

class Main {
	public static void main(String[] args) {
		Point p = new Point();
		int a = p.x //compile pas
		int b = p.getX();//là ca compile
	}
}
```




[Index](./index.md)  
[Cours précédant](./cours_2.md)  
[Cours suivant](./cours_4.md)
