[Index](./index.md)  
[Cours suivant](./cours_2.md)

#### Interruption
C'est un signal envoyé au programme.  
Il y a beaucoup d'interruption. Tout les périphériques en envoient presque tout le temps.


#### Time Sharing
Le kernel(noyau) met en place un timer (≈10ms) qui déclenche des interruptions.  
Cela permet au noyau de récupérer la main et executer son propre code..  
Le noyau empile les données du processus au début, et dépile les données du processus à la fin. Pour le processus, il n'a jamais été interrompus (sauf si il a une montre très précise).

Le noyau peux faire alterner les programmes en cours d'exécution.  
Ex : plus d'application que de cœurs alors le noyau alterne entre les programmes pour faire "comme si" ils s'exécutent en même temps

### Restreindre les privilèges des processus
Il existe une liste d'instruction interdite par les processus normaux et sont seulement autorisé au noyau.

Le processeur vérifie avant chaque instruction s'il a le droit de l'exécuter  
Il a deux modes d'exécution :
- mode protégé : mode utilisateur
- mode réel : mode noyau

Son mode d'exécution est enregistré dans un registre de contrôle

Si il n'a pas le droit ne faire une instruction alors le processeur lève une exception.  
Le noyau récupère la main et décide de quoi faire (habituellement le noyau kill le processus).  


Juste avant le jump du noyau, celui-ci change le mode du processeur en mode utilisateur.  

Quand une interruption se produit, elle change le processeur en mode noyau automatiquement.  
Elle stocke le mode dans lequel le processeur était. Au retour d'interruption, on récupère le mode qui était stocké.  

Donc un processus ne s'exécute plus à l'infini et est limité dans ses actions.


### Demander des privilèges
Un processus n'a pas accès au matériel (comme le clavier ou l'écran).  
Il doit demander l'autorisation au noyau.

Un processus enregistre le numéro de la fonction qu'il veut utiliser dans un registre et lance une interruption avec un code spécifique (`syscall`).

Ensuite le noyau reprend la main grâce à l'interruption, il regarde le numéro de la routine dans le registre et si ça lui semble correct alors il execute la fonction.

`strace` liste les appels systèmes d'un processus

### Structure d'un système
processus + api syscall + noyau

[Index](./index.md)  
[Cours suivant](./cours_2.md)
