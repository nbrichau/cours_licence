[Index](./index.md)  
[Cours précédant](./cours_2.md)

### Le concept des fichiers

Unix : tout est fichier :
- fichiers normaux
- terminal
- périphérique
- etc

Pour le noyau, c'est juste une liste de bytes.
taille connue, peu grandir ou rapetissir
droit d'accès
a un ou plusieurs liens d'accès

### Manipuler des fichiers
Il faut ouvrir un fichier avant de lire/écrire.  
Le noyau vérifie si le chemin du fichier existe et que l'on a les droit d'y accéder et traverser les répertoires du chemin.  
Le noyau nous garantie qu'après ouverture du fichier, celui-ci nous reste accessible jusqu'à sa fermeture, peu importe ce qu'il se passe sur le disque.  
Les droits peuvent être changé ou le fichier supprimé, on pourra toujours y accéder tant qu'il est ouvert.

Ces vérifications ne sont pas faites dans des lectures/écritures pour que ça soit plus rapide et efficace.

Après ouverture du fichier, le noyau nous retourne une clef `file descriptor` qui permet d'accélérer les prochaines lectures/écritures.

[Index](./index.md)  
[Cours précédant](./cours_2.md)
