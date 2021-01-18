[Index](./index.md)  

# Traitement d'image

## Image numérique

Une image numérique est une matrice de pixels (largeur w, hauteur h).

## Codage des valeurs des pixels

### En niveau de gris
valeur est son intensité lumineuse (entre 0 et 255)

### En couleur
codage avec trois valeur, RGB, chacune de 0 à 255.

## Histogramme

A chaque valeur on associe le nombre de pixels de l'image ayant cette valeur.  
On les stocke dans un tableau d'entiers

## Luminance

La luminance (ou brillance) est définie comme la moyenne de tous les pixels de l'image.

Pour augmenter la luminance, on peut ajouter une valeur constante à tous les pixels.  
L'histogramme est décalé.

## Contraste

C'est l'écart à la moyenne des niveau de gris.

### Extension linéaire de dynamique

La dynamique est l'écart entre les niveau de gris min et max.  
On étire la dynamique en rééchelonnant les niveaux de gris entre 0 et 255

Limite : Si la dynamique est déjà maximale, le contraste ne pourra pas être changé par extension de dynamique.

### Egalisation d'histogramme

On cherche à aplanir l'histogramme.

On étend l'histogramme puis on rassemble des niveau de gris dans la même valeur.

[Index](./index.md)  
