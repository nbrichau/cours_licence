[Index](./index.md)  
[Cours précédant](./cours_4.md)

## Processus

### Espace d'adressage

Process composé de régions de mémoire non contiguës

Régions :
- Code du programme (segment texte)
- Données
	- variables statiques
	- données initialisé et non initialisé séparé en deux segments
- Tas (Heap)
	- allocations dynamique
	- géré par la libc
- Pile (Stack)
	- allocation des paramètres de fonction et variables locales
	- grandis automatiquement
- Bibliothèques partagés
	- libc, libm, libGL, ...

Accès à une adresse hors des segments attribués : Segmentation Fault

### Attributs de Processus

Le noyau stocke en plus :
- process id
- priorité du processus
- user id (real/effective) = propriétaire du processus
- file descriptor table
- espace pour backup enregistrés

### Création de Processus

`pid_t fork()`

clone le processus  
espace d'adressage dupliqué  


Fork retourne :
- côté père : pid du fils
- côté fils : 0
























[Index](./index.md)  
[Cours précédant](./cours_4.md)
