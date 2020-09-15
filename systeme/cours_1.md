[Index](./index.md)  
[Cours suivant](./cours_2.md)

*Il manque du cours, j'ai pas pris de notes. C'est les rappels du cours_1 dans le cours_2.*

#### Interruption
C'est un signal envoyé au programme.  
Il y a beaucoup d'interruption. Tout les périphériques en envoient presque tout le temps.


#### Time Sharing
Le kernel(noyau) met en place un timer (≈10ms) qui déclenche des interruptions.  
Cela permet au noyau de récupérer la main et executer son propre code..  
Le noyau empile les données du processus au début, et dépile les données du processus à la fin. Pour le processus, il n'a jamais été interrompus (sauf si il a une montre très précise).

Le noyau peux faire alterner les programmes en cours d'exécution.  
Ex : plus d'application que de cœurs alors le noyau alterne entre les programmes pour faire "comme si" ils s'exécutent en même temps

[Index](./index.md)  
[Cours suivant](./cours_2.md)
