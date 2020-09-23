[Index](./index.md)  
[Cours précédant](./cours_2.md)

### Ouverture de fichier

`int open(const char *path, int oflag, ...)`  
- `oflag` : Comment ouvrir le fichier : `O_RDONLY`, `O_WRONLY`, `O_RDWR`
- `...` : Si fichier créé alors ce paramètre initialise les droits d'accès.  
Ex : 0750 = rwxr-x--- ; 0666 = rw-rw-rw-
```c
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>
char *filename = "file.txt";
int main(int argc, char const *argv[]) {
	if (argc > 1) {
		filename = argv[1];
	}
	int fd = open(filename, O_RDONLY);
	if (fd == -1) {
		perror("open");
		exit(EXIT_FAILURE);
	}
	printf("Cool! fd = %d\n", fd);

	close(fd);
	return EXIT_SUCCESS;
}
```

`hexdump` : affiche le code binaire d'un fichier
-C affiche les bits au format hexadecimal


`fd = open(file.txt, O_RDONLY)`  
Dans l'ordre :
- le kernel charge les informations du fichier (Size, access right, owner, ref counter) dans la table i-node.
- le kernel créé un nouveau champ dans la table opened files avec : mode d'ouverture, offset (pointeur courant, initialisé à 0, au début du fichier), ref counter, pointeur sur les info du fichier dans la table i-node.
- le kernel enregistre dans la table files descriptor un pointeur vers la position dans la table opened files correspondante, à la première position où la valeur est nulle.

i-node table et opened files table sont dans le noyau.  
files descriptor table est dans la partie noyau du processus.

### Lecture d'un fichier

`ssize_t read(int fildes, void *buf, size_t size)`

- `fildes` : file descriptor
- `*buf` : buffer qui va contenir ce qui est lu dans le fichier
- `size` : taille du buffer
- retourne la taille (nombre de caractères) de ce qui a été lu

A chaque lecture, l'offset est déplacé. Il n'est pas remis à zéro à chaque fin de lecture.


### Ecriture d'un fichier

Un fichier est automatiquement agrandi lorsqu'on écrit dedans.

### Structure de donnée

##### Ascii representation
Convertir int en string et écrire dans un fichier.  
Il faut choisir un séparateur.

\+ lecture comme du texte  
\+ portable

\- trouver le séparateur  
\- convertir string en int

##### Binary representation
Enregistre les nombres sous leur forme d'adresse binaire.

\+ lecture/écriture rapide

\- pas portable

### File descriptor déjà ouvert

0 : STDIN_FILENO  
1 : STDOUT_FILENO  
2 : STDERR_FILENO

Usuellement, ils pointent tous sur la même position de la i-node table mais pas avec les mêmes droits.

Utilité de faire deux `open` ?  
-> permet d'avoir deux offsets indépendants sur le même fichier.

[Index](./index.md)  
[Cours précédant](./cours_2.md)
