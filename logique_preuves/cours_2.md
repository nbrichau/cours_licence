<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_1.md)

### Preuves formelles
On cherche à prouver une assertion donnée dans un contexte donné (sous certaines hypothèses).
On cherche à prouver des séquents.

Sens d'une preuve : en supposant $$H_1, ..., H_n$$ on arrive à prouver $$A$$.

### Format général d'une règle de raisonnement

$$\frac{\Gamma \vdash A \implies B ;\ \Gamma \vdash A}{\Gamma \vdash B} mp$$

- sous la barre : le séquent que l'on cherche à prouver
- sur la barre : plusieurs séquents
- la règle à un nom et possiblement des conditions d'utilisations

##### Interprétation :
Pour prouver le séquent, il faut prouver tout les séquents du dessus et invoquer cette règle.  

##### Définition d'une preuve :
Un preuve du séquent est composée de l'invocation d'une règle de raisonnement avec un preuve de chacun des séquents que cette règle place au-dessus de la barre ("obligations de preuve").

### Logique minimale

##### Formules :
- chaque variable $$v \in V$$ constitue une formule
- pour toutes formules $$A$$ et $$B$$, $$A\implies B$$ constitue une formule

*pas de connecteurs $$\neg, \land, \lor$$.*

##### Exemples de formules :
$$P\implies Q\implies R$$  
$$(P\implies Q)\implies (Q\implies R)\implies (P\implies R)$$  
$$P\implies (P\implies Q)\implies Q$$  
$$((P\implies Q)\implies P)\implies P$$

##### Exemples de séquents :
$$\vdash P \implies P$$  
$$P, P\implies Q \vdash Q$$  
$$Q, P\implies Q\implies R \vdash P\implies R$$  
$$P, Q, R, P\implies Q\implies R \implies S \vdash S$$  
$$\vdash ((P\implies Q)\implies P)\implies P$$  
$$P\implies Q, Q\implies R \vdash P\implies R$$  

### Règle d'hypothèse

Si la conclusion fait partie des hypothèses, alors on peut conclure en invoquant la règle d'hypothèse.

$$\frac{}{\Gamma \vdash A}hyp(A\in \Gamma)$$

### Règle du *modus ponens* (règle d'élimination de l'implication)
Si, avec un même jeu d’hypothèses, on peut prouver à la fois $$A\implies B$$ et $$A$$, alors avec ce même jeu d’hypothèses on peut prouver $$B$$ en invoquant le *modus ponens*.

$$\frac{\Gamma \vdash A\implies B ;\ \Gamma \vdash A}{\Gamma \vdash B}mp$$

### Règle d'introduction de l'implication (règle d'abstraction)

Si, en ajoutant $$A$$ à un jeu d’hypothèses, on peut prouver $$B$$, alors on peut, en invoquant la règle d’introduction de l’implication, prouver $$A\implies B$$ sous le jeu d’hypothèses original.

$$\frac{\Gamma , A \vdash B}{\Gamma \vdash A \implies B}\implies i$$

### Preuve en arbre de $$P\implies Q, Q\implies R \vdash P\implies R$$

Dans cette preuve, $$\Gamma = \{P\implies Q, Q\implies R\}$$.

$$\frac{\frac{}{\Gamma, P\vdash Q\implies R}hyp\ \ \frac{\frac{}{\Gamma, P\vdash P\implies Q}hyp\ \ \frac{}{\Gamma , P\vdash P}hyp}{\Gamma, P\vdash Q}mp}{\frac{\Gamma, P\vdash R}{\Gamma \vdash P\implies R}\implies i}mp$$

### Preuve linéaire de $$P\implies Q, Q\implies R \vdash P\implies R$$

1) Supposons $$P\implies Q$$  
2) Supposons $$Q\implies R$$  
3) { Supposons $$P$$  
4) &nbsp;&nbsp;$$Q$$ [mp, 1, 3]  
5) &nbsp;&nbsp;$$R$$ [mp, 2, 4]  
6) }  
7) $$P\implies R$$ [$$\implies i$$, 3, 5]  

### Cohérence de la logique minimale

Si un séquent $$\Gamma \vdash A$$ admet une preuve en logique minimale alors ce séquent est valide.

Par contraposée :  
Si un séquent n'est pas valide, il n'admet pas de preuve.

*Attention : La réciproque n'est pas vraie. Un séquent valide n'est pas toujours prouvable.*

### Règle dérivée

C'est une règle de raisonnement telle que, si on l'ajoute à la panoplie des règles utilisables, tout séquent prouvable en utilisant les règles de base et la règle dérivée, est également prouvable en n'utilisant que les règles de base.

#### Règle dérivée : affaiblissement

$$\frac{\Gamma\vdash A}{\Gamma,\Delta\vdash A}aff$$

Si on peut prouver quelque chose avec certaines hypothèses, on peut toujours prouver la même chose en ajoutant des hypothèses

[Cours précédant](./cours_1.md)  
[Index](./index.md)
