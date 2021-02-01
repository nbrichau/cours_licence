<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_2.md)

## Contour

C'est la frontière entre deux objets.  
C'est une discontinuité de l'image, une variation brusque d'intensité.

Toute discontinuité n'est pas nécessairement située à la frontière d'un objet.

Principe de la détection de contour :  
Étude de la dérivée de la luminosité dans l'image, recherche de valeurs élevées de dérivée.

Le **gradient** est la dérivée première de l'image, il permet donc de trouver les contours de l'image.  
La norme du vecteur gradient mesure la force du contour.

## Calcul du gradient

Il est possible de calculer le gradient avec une convolution.

Les deux masques de convolutions, un pour chaque axe, sont :

$$\begin{bmatrix}-1 & 0 & 1\end{bmatrix}$$

$$\begin{bmatrix}-1 \\\ 0 \\\ 1\end{bmatrix}$$

Cependant, le bruit de l'image peux fausser ces contours. D'autres masques sont plus performant car ils limitent les effets du bruit.  
*Tourner les matrices de 90° pour avoir l'autre axe.*

Opérateur de Prewitt (filtre moyenneur) :

$$\begin{bmatrix}-1 & 0 & 1 \\\ -1 & 0 & 1 \\\ -1 & 0 & 1\end{bmatrix}$$

Opérateur de Sobel (filtre gaussien) :

$$\begin{bmatrix}-1 & 0 & 1 \\\ -2 & 0 & 2 \\\ -1 & 0 & 1\end{bmatrix}$$

# Images en couleurs

On peut représenter les couleurs de l'image sous forme de valeurs RGB (Red-Blue-Green) mais aussi sous forme HSV (Hue-Saturation-Value).

Il existe des formules pour passer d'une représentation à une autre.

[Index](./index.md)  
[Cours précédant](./cours_2.md)
