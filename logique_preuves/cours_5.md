<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_4.md)  
[Cours suivant](./cours_6.md)

## Incomplétude de la logique minimale

### Logique minimale

- Assez "pauvre" : seulement deux connecteurs (implication et négation)
- Propriété de cohérence : tout séquent prouvable est valide
- Pas de propriété de complétude : réciproque tout séquent valide est prouvable : impossible en logique minimale

### Arbre de preuves

Les preuves sont sous forme d'arbres, sans règles dérivées.  
Chaque nœud porte un séquent.  
Les nœuds sont :  
- "hyp" pour les feuilles
- "$$\implies _i$$" ou "$$\bot _e$$" pour les nœuds unaires
- "mp" pour les nœuds binaires

### Formule de Peirce

$$((P\implies Q)\implies P)\implies P$$

C'est une tautologie donc ce séquent est valide.  
Mais il n'admet pas de preuve en logique minimale.

### Préservation locale des hypothèses

Dans tout arbre de preuve correct, dans le séquent de chaque nœud autre que la racine, on trouve au moins toutes les hypothèses du séquent du parent de ce nœud.

## Coupures

Dans un arbre de preuve, on appelle coupure la configuration de deux nœuds suivante :
- un nœud s : $$\Gamma \vdash B$$ utilisant la règle du modus ponens
- un nœud t : $$\Gamma \vdash A\implies B$$, fils de gauche de s, utilisant la règle d'introduction de l'implication

### Élimination de la coupure

$$\frac{\Gamma\vdash A,\Delta\qquad\Gamma',A\vdash\Delta'}{\Gamma,\Gamma'\vdash\Delta,\Delta'}$$

Ou en plus simple :

$$\frac{\Gamma\vdash A\qquad\Pi,A\vdash B}{\Gamma,\Pi\vdash B}$$

## Sous-formules

Une formule est un arbre. Une sous-formule est sous-arbre.

Exemple : $$(P\implies Q)\implies R\implies S$$  
Les sous-formules sont :
- $$P, Q, R, S$$.
- $$P\implies Q$$.
- $$R\implies S$$.
- $$(P\implies Q)\implies R\implies S$$.

Attention : $$(P\implies Q)\implies R$$ n'est pas une sous-formule de $$(P\implies Q)\implies R\implies S$$.

[Index](./index.md)  
[Cours précédant](./cours_4.md)  
[Cours suivant](./cours_6.md)
