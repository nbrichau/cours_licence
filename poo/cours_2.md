## Classes d'objets
Une classe est une définition de type d'objet  
Une classe a plusieurs instances d'objets différents

## Classes en Java
Un fichier .java -> Une classe (et inversement)  
Les fichiers doivent etre nommé pareil que le nom de la classe
```java
//fichier Rectangle.java
class Rectangle {

	/*
	Des propriétés/attributs
	*/
	double largeur;
	double hauteur;

	/*
	Constructeur de la classe. Pas de type de retour (en fait ça retourne une référence de l'objet en mémoire)
	*/
	Rectangle(double largeur, double hauteur){
		/*
		Du point de vu d'un objet, le mot clef this sert à pointer vers soi-même donc this.largeur est ma largeur. largeur sans this. pointe vers le paramètre de la fonction.
		this permet de faire la différence entre les attributs de l'objet et les paramètre de la méthode/constructeur si ils ont les même nom
		*/
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	/*
	Surcharge du constructeur (même nom mais type différent)
	Cela permet de faire des choses différentes de l'autre constructeur
	*/
	Rectangle(double size){
		//this(<params>) référence un constructeur que l'on est en train de surcharger
		this(size, size);
	}

	/*
	Une méthode/fonction
	*/
	double surface(){
		return largeur*hauteur;
	}

	/*
	le type void : retourne rien
	*/
	void increment(){
		largeur++;// pareil que largeur=largeur+1; et pareil que largeur+=1;
		hauteur++;
	}

	String toText(){
		return "Rectangle("+largeur+", "+hauteur+")";//concaténation de string et double avec les +
	}

}
```

```java
//fichier App.java
class App{
	/*
	fonction qui est lancé au début du programme
	*/
	public static void main(String[] args){
		System.out.println("Bonjour");//= printf("Bonjour");

		Rectangle r1 = new Rectangle(2,3);
		Rectangle r2 = r1;//r2 = valeur de r1 donc la référence de l'objet r1

		r1.increment();// r2 est aussi affecté car il pointe sur le même objet que r1

		System.out.println(r1.toText());
		System.out.println(r2.toText());
		//output : Rectangle(3.0, 4.0)
		//         Rectangle(3.0, 4.0)
	}

}
```

## Surcharge en Java
- Même nom
- Signature différente. La signature c'est les paramètres de la méthode (le type de retour n'en fait pas partis)
- le type de retour n'est pas pris en compte.

```java
int fonction(){};//définition initiale

int fonction(double a){};//surcharge car signature différente
double fonction(double a){};//impossible car la méthode a déjà été défini avant. Le type de retour n'est pas pris en compte
```

## Types primitif
`boolean` -

`char` 8 bits

`byte` 16 bits

nombres entiers  
`short` 16 bits  
`int` 32 bits  
`long` 64 bits  

nombre décimaux  
`float` 32 bits  
`double` 64 bits

`void` -

## types construits
toutes les classes.  
il existe déjà des classes de "base" dans le Java, comme String par exemple.  
Elles sont données dans le JDK
