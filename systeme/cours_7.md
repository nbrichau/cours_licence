[Index](./index.md)  
[Cours précédant](./cours_6.md)  
[Cours suivant](./cours_8.md)

# Signaux

Un signal sert à notifier des événements, provenant de l'os, d'une application ou du cpu.

# Recuperer les signaux

`sigaction(SIGINT, my_func);`

au rattrapage, lance la fonction et continue l'execution du programme

```c
void my_sig_handler(int sig){
	//somme code
}
int main(int argc, char const *argv[]) {
	struct sigaction sa;

	sa.sa_flags = 0;
	sigemptyset(&sa.sa_mask);
	sa.sa_handler = my_sig_handler;

	sigaction(SIGINT, &sa, NULL);

	return 0;
}
```

[Index](./index.md)  
[Cours précédant](./cours_6.md)  
[Cours suivant](./cours_8.md)
