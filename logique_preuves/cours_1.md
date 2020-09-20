[Index](./index.md)

## Vocabulaire de la logique

#### Proposition
Une proposition est un énoncé (mathématique, informatique, mais pas
que) susceptible d’être démontré ou réfuté, pour lequel il fait sens de parler
de vérité.  

#### Logique minimale
Formules atomiques et implication comme seul connecteur:  
`(P→Q→R)→(Q→P→R)`

#### Logiques propositionnelles
On ajoute à la logique minimale la contradiction ⊥, la négation ∼ (ou ¬), et les connecteurs ∨, ∧, ⟷  
`P ∨ ⊥ → P`  
`∼(P→Q→R) → P ∧ Q ∧ ∼R`

#### Calcul des prédicats
Notions de prédicat, de relation; quantificateurs existentiel et universel  
`(∀ x, ∃ y, x ≠ y)→∼(∀ x y, x = y)`

### Séquents
Un séquent est une structure composée:
* d’un contexte formé d’un ensemble Γ de propositions appelées prémisses ou hypothèses,
* d’une proposition A appelée conclusion du séquent

Notations usuelles :  
`H₁, H₂, ..., Hₙ ⊢ A`  
`Γ⊢A`  
`⊢A`

#### Validité d'un séquent
Intuitivement, un séquent est valide si, chaque fois que toutes ses hypothèses sont simultanément vraies, alors sa conclusion est vraie.  
Un séquent peut être valide par contradiction de ses hypothèses.  
*si hypothèses contradictoires alors séquent valide, mais veux pas dire que les hypothèses sont valides*

#### Notions de preuve
Une preuve est un discours (plus ou moins symbolique, plus ou moins détaillé) dont l’objectif est de convaincre qu’une certaine affirmation est vraie.  

#### Convaincre la validité
* ###### Approche Sémantique :
Définir la valeur de vérité de toute proposition, puis vérifier que chaque fois que toutes les hypothèses dans Γ sont vraies, alors A est vraie.  
Exemple : tables de vérité en logique propositionnelle
* ###### Approche Syntaxique :
Définir ce qu’est une preuve de Γ⊢A. On définit un langage pour les preuves, avec ses règles de correction, comme les langages de programmation. Une preuve devient un objet informatique, comme un programme.

### Priorité des signes

|-| | |+|
|-|-|-|-|
|→|∨|∧|¬|

Si il y a plusieurs fois le même signe à la même hauteur dans l'expression :   
Il faut les executer de la fin vers le début.  
ex : `a→b→c` : les signes → sont tous à la même hauteur.  
donc `a→b→c` correspond à `a→(b→c)`

### Arbre

`(P∧Q∧R)→S = (P∧(Q∧R))→S`
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

|`P`|`Q`|`¬P`|`P∧Q`|`P∨Q`|`P→Q`|
|:-:|:-:|:--:|:---:|:---:|:---:|
| V | V | F  |  V  |  V  |  V  |
| V | F | F  |  F  |  V  |  F  |
| F | V | V  |  F  |  V  |  V  |
| F | F | F  |  F  |  F  |  V  |

### Forme Normale Conjonctive

La forme normale conjonctive est une conjonction (∧) de clause.  
Une clause est une disjonction (∨) du littéraux (P ou ¬P).  
Ex : `(P∨Q)∧(¬Q∨R)`

### Lois de Morgan

`¬(A∨B) = (¬A)∨(¬B)`  
`¬(A∧B) = (¬A)∧(¬B)`  
`¬(¬A) = A`  
`A→B = (¬A)∨B`

### Associativité

`(A∨B)∨C = A∨(B∨C) = A∨B∨C`  
`(A∧B)∧C = A∧(B∧C) = A∧B∧C`

### Commutativité

`A∨B = B∨A`  
`A∧B = B∧A`

### Distributivité

`(A∧B)∨C = (A∨C)∧(B∨C)`  
`(A∨B)∧C = (A∧C)∨(B∧C)`


[Index](./index.md)
