[Index](./index.md)  
[Cours précédant](./cours_3.md)  
[Cours suivant](./cours_5.md)

### Changer l'offset d'un fichier

```c
off_t lseek(int fildes, off_t offset, int whence);
```
`offset` : nombre de déplacement de l'offset   
`whence` :
- SEEK_SET : a partir du début
- SEEK_CURRENT : a partir de la position courante
- SEEK_END : a partie de la fin

Ex :
```c
lseek(fd, 3, SEEK_CURRENT);
// on avance l'offset de 3.
```
l'offset ne peux pas être négatif

*il existe des fichiers (non disque) où l'offset ne peux pas être manipulé*

### Duplication de file descriptor

```c
int dup(int fildes);
int dup2(int src_fd, int dst_fd);
//dup2 ferme le fd à la destination
```

### Fichiers avec la lib C

fopen, fwrite, fread, ... ont un buffer interne qui permet d'éviter des appels système a chaque fois.

[Index](./index.md)  
[Cours précédant](./cours_3.md)  
[Cours suivant](./cours_5.md)
