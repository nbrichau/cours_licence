[Index](./index.md)  
[Cours précédant](./cours_4.md)  
[Cours suivant](./cours_6.md)

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

### Attendre la fin d'un fils

`pid_t wait(int* stat_loc);`

`pid_t waitpid(pid_t pid, int* stat_loc, int options);`  
(peux être non bloquant)

### transformation de processus

un processus peux redémarrer et executer un nouveau programme

`int execlp(char* file, char* arg0, ..., NULL);`

ex : `execl("/bin/ls", "ls", "-l", NULL);`

un exec efface tout son espace d'adressage pour mettre un nouveau code à la place.  
les attributs du processus sont pas effacé (ex: file descriptor table).  
Ainsi les redirections d'input/output sont conservées.

### Etat d'un processus

Ready -> Running -> Blocked

[Index](./index.md)  
[Cours précédant](./cours_4.md)  
[Cours suivant](./cours_6.md)
