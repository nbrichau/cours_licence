## Vocabulaire de la logique

#### Proposition :
Une proposition est un énoncé (mathématique, informatique, mais pas
que) susceptible d’être démontré ou réfuté, pour lequel il fait sens de parler
de vérité.  

#### Logique minimale :
Formules atomiques et implication comme seul connecteur:  
`(P→Q→R)→(Q→P→R)`  

#### Logiques propositionnelles :
On ajoute à la logique minimale la contradiction ⊥, la négation ∼ (ou ¬), et les connecteurs ∨, ∧, ⇐⇒  
`P ∨ ⊥ → P`  
`∼(P→Q→R) → P ∧ Q ∧ ∼R`

#### Calcul des prédicats :
Notions de prédicat, de relation; quantificateurs existentiel et universel  
`(∀ x, ∃ y, x 6= y)→∼(∀ x y, x = y)`

### Séquents :
Un séquent est une structure composée:
* d’un contexte formé d’un ensemble Γ de propositions appelées prémisses ou hypothèses,
* d’une proposition A appelée conclusion du séquent  

Notations usuelles :  
`H₁, H2₂, ..., Hₙ ⊢ A`  
`Γ⊢A`  
`⊢A`  

#### Validité d'un séquent :
Intuitivement, un séquent est valide si, chaque fois que toutes ses hypothèses sont simultanément vraies, alors sa conclusion est vraie.  
Un séquent peut être valide par contradiction de ses hypothèses.  
*si hypothèses contradictoires alors séquent valide, mais veux pas dire que les hypothèses sont valides*  


#### Notions de preuve
Une preuve est un discours (plus ou moins symbolique, plus ou moins détaillé) dont l’objectif est de convaincre qu’une certaine affirmation est vraie.  

#### Convaincre la validité :
* ###### Approche Sémantique :
Définir la valeur de vérité de toute proposition, puis vérifier que chaque fois que toutes les hypothèses dans Γ sont vraies, alors A est vraie.  
Exemple : tables de vérité en logique propositionnelle
* ###### Approche Syntaxique :
Définir ce qu’est une preuve de Γ⊢A. On définit un langage pour les preuves, avec ses règles de correction, comme les langages de programmation. Une preuve devient un objet informatique, comme un programme.
