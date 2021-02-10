<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_2.md)  
[Cours suivant](./cours_4.md)

# Analyse Syntaxique

JFlex permet de traduire des expressions rationnelles en automates finis.  
Cependant, il n'est pas conçu pour réaliser un analyseur syntaxique qui reconnaît un langage qui ne serait pas rationnel.

## Système de réécriture

Un système de réécriture est défini par le quadruplet $$(\Sigma, N, R, S)$$ où :
1. $$\Sigma$$ est un alphabet fini (symboles terminaux)
2. $$N$$ est un ensemble fini de symboles (symboles non terminaux)
3. $$S$$ est un élément distingué de $$N$$ (terme initial de la grammaire)
4. $$R$$ est une relation de réécriture $$\{(\alpha,\beta)\}$$ où $$\alpha\in(\Sigma\cup N)^*-\{\epsilon\}$$, et $$\alpha\in(\Sigma\cup N)^*$$. On écrit $$\alpha \to \beta$$

Une grammaire formelle est ce qui permet de définir un langage sur le monoïde libre $$\Sigma^*$$.  
Un système de réécriture permet de définir les éléments du langage par une opération qui fait intervenir une succession de réécritures depuis le terme initial jusqu’aux chaînes de lettres. Il s’agit donc d’une grammaire

### Dérivation

On définit une relation $$\Rightarrow$$ entre deux éléments du monoïde libre $$(\Sigma\cup N)^*$$

$$\forall\mu_1, \alpha, \mu_2, \beta \in (\Sigma\cup N)^*, \mu_1\alpha\mu_2 \Rightarrow \mu_1\beta\mu_2$$

vérifiée si et seulement si il existe une règle $$\alpha\to\beta$$ de $$R$$.

On définit une **dérivation** par la fermeture réflexive-transitive $$\overset{*}{\Rightarrow}$$

La fermeture réflexive-transitive d'une relation $$R$$, noté $$R^*$$, se définit ainsi : $$\forall x,y \in E, xR^*y$$ si et seulement si
1. \\(\forall x \in E, xR^*x\\)
2. $$\forall x, y, z \in E, xRy$$ et $$yRz \Rightarrow xR^*z$$

Autrement dit, tout élément se dérive vers lui-même (réflexivité), et un élément $$x$$ se dérive vers un élément $$z$$ s'il se dérive vers un élément
$$y$$ qui se dérive vers $$z$$ (transitivité).

### Langage engendré par une grammaire

Le langage engendré par la grammaire $$G$$, noté $$L_G$$, est l'ensemble de tout les mots qui se dérivent de l'élément initial.  
On note : $$L_G=\{\alpha\in\Sigma^* : S\overset{*}{\Rightarrow}\alpha\}

### Types de grammaires

1. Grammaire rationnelle : Ses règles sont de la forme :
	- $$A \to a$$
	- $$A \to aB$$
2. Grammaire indépendante de contexte : Elle n'a qu'un élément de N en partie gauche. Leur dérivation $$\mu_1\alpha\mu_2\Rightarrow\mu_1\beta\mu_2$$ est vérifiée seulement si la règle $$\alpha\to\beta$$ appartient à $$R$$.
3. Grammaire contextuelle : Elle accepte les règles $$x\alpha y\to x\beta y$$ dont la séquence $$\alpha$$ n'est pas plus longue que la séquence $$\beta$$. Une dérivation $$\mu_1\alpha\mu_2\Rightarrow\mu_1\beta\mu_2$$ est vérifiée si $$mu_1$$ ou $$mu_2$$ est connus.
4. Grammaire non contrainte (ou grammaire récursivement énumérable) : Les autres grammaires. Leur seule contrainte est d'avoir une séquence vide en partie gauche.

[Index](./index.md)  
[Cours précédant](./cours_2.md)  
[Cours suivant](./cours_4.md)
