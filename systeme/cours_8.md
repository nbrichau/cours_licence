[Index](./index.md)  
[Cours précédant](./cours_7.md)  
[Cours suivant](./cours_9.md)

# Signaux

Les signaux sont délivré de manière asynchrone.  
Un signal est délivré quand c'est possible et pas immédiatement.  
Si plusieurs signaux de même nature sont envoyé dans un très cours laps de temps : il se peut que certains disparaissent.

#### Signaux masqué

Un processus peut differer la reception de signaux.  
Ces signaux sont alors stocké dans la table des signaux masqué et plus dans la table des signaux en attente.

Exemple : bloquer SIGQUIT

```c
sigset_t s;
sigemptyset(&s);
sigaddset(&s, SIGQUIT);
sigprocmask(SIG_SETMASK, &s, NULL);//remplacer toute la table
sigprocmask(SIG_BLOCK, &s, NULL);//remplace uniquement SIGQUIT dans la table
```

Durant le traitement d'un signal, celui-ci devient masqué.

# Rattraper les exceptions

```c
int *ptr = NULL;

void my_sig_handler(int sig) {
	printf("I receive a signal %d\n", sig);
}

int main(int argc, char const *argv[]) {
	struct sigaction sa;

	sigaction(SIGSEGV, my_sig_handler);
	*ptr = 12;
	return 0;
}
```
lors d'une exception, le kernel va lancer le traitement du signal puis retenter l'instruction fautive (le processus va boucler dans l'erreur si elle n'est pas géré).

Attention, seule l'instruction machine est re-exécutée, pas l'instruction c.

# Saut non-local

Idée : pouvoir sauvegarder l'état d'un processeur à un certain point et pouvoir y retourner plus tard en restaurant cet état.

```c
typedef struct {
	//espace pour sauvegarder l'état
} jmp_buf [1];

jmp_buf my_buff;
```
Sauvegarder l'état :
```c
jmp_buf my_buff;
int r = setjmp(my_buff);
```
Au premier appel : sauvegarde le registre dans `my_buff` et retourne 0.  
Au autres appels : retour différent de 0, un `longjmp()` vient d'être réalisé.

Restaurer l'état :
```c
longjmp(my_buff, val);
```
restaure les registres de `my_buff` puis retourne à l'instruction `setjmp()` et fait en sorte que le retour de `setjmp()` soit différent de 0.  
La valeur `val` de `longjmp()` sera le retour de `setjmp()` et doit être différent de 0.

[Index](./index.md)  
[Cours précédant](./cours_7.md)  
[Cours suivant](./cours_9.md)
