<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours suivant](./cours_2.md)

## Vocabulaire de la logique

#### Proposition
Une proposition est un énoncé (mathématique, informatique, mais pas
que) susceptible d’être démontré ou réfuté, pour lequel il fait sens de parler
de vérité.  

### Axiome :
C'est une proposition $$H$$ que l'on admet vraie, et qui peut être utilisée dans une preuve de $$B$$.

### Hypothèse :
C'est une proposition $$H$$ que l'on admet vraie seulement dans une partie d'une preuve.  
Si dans cette portée on montre la proposition $$B$$, on obtient alors une preuve de $$H\to B$$ et non une preuve de $$B$$.

#### Logique minimale
Formules atomiques et implication comme seul connecteur:  
$$(P \to Q \to R) \to (Q \to P \to R)$$

#### Logiques propositionnelles
On ajoute à la logique minimale la contradiction $$\bot$$, la négation $$\sim$$ (ou $$\neg$$), et les connecteurs $$\lor$$, $$\land$$, $$\leftrightarrow$$  
$$P \lor \bot \to P$$  
$$\sim (P \to Q \to R) \to P \land Q \land \sim R$$

#### Calcul des prédicats
Notions de prédicat, de relation; quantificateurs existentiel et universel  
$$(\forall x, \exists y, x \neq y) \to \neg (\forall x y, x = y)$$

### Séquents
Un séquent est une structure composée:
* d’un contexte formé d’un ensemble $$\Gamma$$ de propositions appelées prémisses ou hypothèses,
* d’une proposition $$A$$ appelée conclusion du séquent

Notations usuelles :  
$$H_1, H_2, ..., H_n \vdash A$$  
$$\Gamma \vdash A$$  
$$\vdash A$$

#### Validité d'un séquent
Intuitivement, un séquent est valide si, chaque fois que toutes ses hypothèses sont simultanément vraies, alors sa conclusion est vraie.  
Un séquent peut être valide par contradiction de ses hypothèses.  
*si hypothèses contradictoires alors séquent valide, mais veux pas dire que les hypothèses sont valides*

#### Notions de preuve
Une preuve est un discours (plus ou moins symbolique, plus ou moins détaillé) dont l’objectif est de convaincre qu’une certaine affirmation est vraie.  

#### Convaincre la validité
* ###### Approche Sémantique :
Définir la valeur de vérité de toute proposition, puis vérifier que chaque fois que toutes les hypothèses dans $$\Gamma$$ sont vraies, alors $$A$$ est vraie.  
Exemple : tables de vérité en logique propositionnelle
* ###### Approche Syntaxique :
Définir ce qu’est une preuve de $$\Gamma \vdash A$$. On définit un langage pour les preuves, avec ses règles de correction, comme les langages de programmation. Une preuve devient un objet informatique, comme un programme.

### Priorité des signes

|    $$-$$    |      |       |  $$+$$  |
|:-------:|:----:|:-----:|:---:|
|$$\to$$|$$\lor$$|$$\land$$|$$\neg$$|

Si il y a plusieurs fois le même signe à la même hauteur dans l'expression :   
Il faut les executer de la fin vers le début.  
ex : $$a \to b \to c$$ : les signes $$\to$$ sont tous à la même hauteur.  
donc $$a \to b \to c$$ correspond à $$a \to (b \to c)$$

### Arbre

$$ (P \land Q \land R) \to S = (P \land (Q \land R)) \to S$$
```arbre
    →
   / \
  ∧   S
 / \
P   ∧
   / \
  Q   R
```


### Table de vérité

|$$P$$|$$Q$$|$$\neg P$$|$$P \land Q$$|$$P \lor Q$$|$$P \to Q$$|
|:-:|:-:|:--:|:---:|:---:|:---:|
| V | V | F  |  V  |  V  |  V  |
| V | F | F  |  F  |  V  |  F  |
| F | V | V  |  F  |  V  |  V  |
| F | F | F  |  F  |  F  |  V  |

### Forme Normale Conjonctive

La forme normale conjonctive est une conjonction ($$\land$$) de clause.  
Une clause est une disjonction ($$\lor$$) du littéraux ($$P$$ ou $$\neg P$$).  
Ex : $$(P \lor Q) \land ( \neg Q \lor R)$$

### Lois de Morgan

$$\neg (A \lor B) = (\neg A) \lor (\neg B)$$  
$$\neg (A \land B) = (\neg A) \land (\neg B)$$  
$$\neg (\neg A) = A$$  
$$A \to B = (\neg A) \lor B$$

### Associativité

$$(A \lor B) \lor C = A \lor (B \lor C) = A \lor B \lor C$$  
$$(A \land B) \land C = A \land (B \land C) = A \land B \land C$$

### Commutativité

$$A \lor B = B \lor A$$  
$$A \land B = B \land A$$

### Distributivité

$$(A \land B) \lor C = (A \lor C) \land (B \lor C)$$  
$$(A \lor B) \land C = (A \land C) \lor (B \land C)$$

[Index](./index.md)  
[Cours suivant](./cours_2.md)
