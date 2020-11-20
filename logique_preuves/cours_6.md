<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_5.md)  
[Cours suivant](./cours_7.md)


# Logique propositionnelle

## La conjonction ($$\land$$)

$$A \land B$$ est vrai si A est vrai et B est vrai

|$$A$$|$$B$$|$$A\land B$$|
|-|-|-|
|V|V|V|
|V|F|F|
|F|V|F|
|F|F|F|

### Règle d'introduction

$$\frac{\Gamma\vdash A\qquad\Gamma\vdash B}{\Gamma\vdash A\land B}\land_i$$

### Règle d'élimination

$$\frac{\Gamma\vdash A\land B\qquad\Gamma, A, B\vdash C}{\Gamma\vdash C}\land_e$$


### Règles dérivées sur la conjonction

- Commutativité

$$\frac{\Gamma \vdash A \land B}{\Gamma \vdash B \land A} \land ,comm$$

- Elimination alternative

$$\frac{\Gamma , A, B \vdash C}{\Gamma , A\land B \vdash C} \land '_e$$


## La disjonction ($$\lor$$)

$$A \lor B$$ est vrai si A est vrai ou B est vrai

|$$A$$|$$B$$|$$A\lor B$$|
|-|-|-|
|V|V|V|
|V|F|V|
|F|V|V|
|F|F|F|

Pour prouver $$A\lor B$$ il faut soit prouver A soit prouver B.

### Règles d'introductions

$$\frac{\Gamma \vdash A}{\Gamma \vdash A \lor B} \lor _{i, 1}$$

$$\frac{\Gamma \vdash B}{\Gamma \vdash A \lor B} \lor _{i, 2}$$

### Règle d'élimination

$$\frac{\Gamma \vdash A \lor B \ \ \ \ \Gamma , A \vdash C \ \ \ \ \Gamma , B \vdash C}{\Gamma \vdash C}\lor _e$$

## Logique propositionnelle intuitionniste

- règle d'hypothèses, élimination de la contradiction
- règles sur l'implication
- règles sur la conjonction
- règles sur la disjonction

#### Les pièges de l'introduction prématurée

Une erreur très fréquente est de faire, si le but est une disjonction, **trop tôt** une introduction sur la disjonction.

*Il faut faire un choix entre la branche de droite ou de gauche mais il est possible que les deux soient impossibles à prouver.*

## Equivalence ($$\leftrightarrow$$)

$$A\leftrightarrow B$$ est une contraction de $$(A\to B) \lor (B\to A)$$

|$$A$$|$$B$$|$$A\leftrightarrow B$$|
|-|-|-|
|V|V|V|
|V|F|F|
|F|V|F|
|F|F|V|

### Jugements

Un jugement n'est pas un séquent mais une méta-affirmation sur un séquent.

$$\Gamma \models A$$ : Le séquent $$\Gamma \vdash A$$ est valide.  

$$\Gamma \vdash _j A$$ : Le séquent $$\Gamma \vdash A$$ est prouvable en logique intuitionniste

$$\Gamma \equiv_j B$$ : Le séquent $$\vdash A \leftrightarrow B$$ est prouvable en logique intuitionniste

### Equivalence et réécriture

On admet le méta-théorème de remplacement.

Si $$A\equiv_j B$$ alors $$\Gamma\vdash A\equiv_j\Gamma\vdash B$$

*On peux remplacer tout les A par des B*

## Séquents valides non prouvables

- Peirce $$\vdash ((P\to Q)\to P)\to P$$
- double négation $$\vdash \neg\neg P \to P$$
-  $$\vdash P \lor \neg P$$  

[Index](./index.md)  
[Cours précédant](./cours_5.md)
[Cours suivant](./cours_7.md)
