<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_1.md)

# Convolution

C'est une transformation locale : utilisation du voisinage de chaque pixel.

# Familles de filtres

filtre passe-bas : atténue le bruit et les détails.  
filtre passe-haut : accentue les détails et les contours.

On appelle aussi un filtre masque ou noyau.

## Calcul

Un filtre est une matrice impaire (3x3, 5x5, ...).  

On fait une moyenne de la valeur des pixels. Le masque donne les coefficient des valeurs dans la moyenne.

Code : pour le pixel aux coordonnées x,y. I la matrice des pixels, K la matrice du filtre, n la taille du filtre.

```java
int r = 0;
for (int u=-n; u<=n; u++) {
	for (int v=-n; v<=n; v++) {
		r = r + I(x+u, y+v)*K(u+n, v+n);
	}
}
```

## Calcul des bords de l'image

Un masque ne permet pas de calculer directement les pixels sur le bord de l'image.  
Il y a plusieurs possibilités pour les calculer :
- mettre à zéro
- convolution partielle (en utilisant qu'une partie de l'image)
- compléter les valeur manquantes (plusieurs stratégies possibles, exemple : miroir de l'image)

## Filtre moyenneur

C'est un filtre passe-bas qui :
- lisse l'image (effet de flou)
- réduit le bruit
- réduit les détails

Le masque est :

\\(\begin{bmatrix} 1/9 & 1/9 & 1/9 \\\ 1/9 & 1/9 & 1/9 \\\ 1/9 & 1/9 & 1/9 \end{bmatrix} \\)


Plus la matrice est grand plus l'effet du filtre est fort.

## Filtre Gaussien

Le filtre gaussien donne un meilleur lissage et une meilleure réduction du bruit que le filtre moyenneur.

les valeurs de la matrice sont calculé par la formule : $$exp(-(\frac{x^2+y^2}{2\sigma^2}))$$  
$$\sigma$$ est un écart type des valeurs de la matrice. Plus $$\sigma$$ est grand plus le flou sera grand.

Un exemple de masque :
$$\frac{1}{98}\times\begin{bmatrix}1 & 2 & 3 & 2 & 1 \\\ 2 & 6 & 8 & 6 & 2 \\\ 3 & 8 & 10 & 8 & 3 \\\ 2 & 6 & 8 & 6 & 2 \\\ 1 & 2 & 3 & 2 & 1 \end{bmatrix}$$

[Index](./index.md)  
[Cours précédant](./cours_1.md)
