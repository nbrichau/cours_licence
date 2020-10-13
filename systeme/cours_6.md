[Index](./index.md)  
[Cours précédant](./cours_5.md)

## Pipes (tubes)

`ls | grep pattern`  
`./prog | cat -n | less`

Redirige la sortie standard d'un programme vers l'entrée standard d'un autre.

Les pipes sont des objets FIFO avec une capacité fixé.

`int pipe(int fildes[2]);`

fildes[0] : lire  
fildes[1] : écrire

*pas de lseek*


[Index](./index.md)  
[Cours précédant](./cours_5.md)
