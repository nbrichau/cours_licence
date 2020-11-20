<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_7.md)

# Limite de la logique propositionnelle

- Dans un séquent il n'y a qu'un nombre fini de variables propositionnelles (=propositions élémentaires)
- On ne peut pas rendre compte des liens entre les propositions élémentaires

# Termes

Les termes sont des expressions qui vont désigner des objets.

Notation : `t:T` pour dire "le terme `t` a le type `T`"

Exemple :  
$$f: T\to T'\to T$$ désigne une fonction $$f$$ de deux variables de type $$T$$ et $$T'$$ qui retourne une valeur de type $$T$$.

# Formules (propositions)

Le type des propositions est `Prop` .  
Un prédicat sur le type $$T$$ c'est une fonction $$P$$ de type $$T\to Prop$$ : Pour chaque valeur v de type T, `P v` (notation préfixe) ou `P(v)` est une proposition.

On ajoute aussi deux façon de former des formules :
- Quantificateur universel (pour tout x de type T, P)
$$\forall x:T,P$$
- Quantificateur existentiel (il existe au moins un x de type T tel que P)
$$\exists x:T,P$$

Exemple :  
$$Pair(n)\to Premier(n)\to n=2$$  

# Variable libre, variable liée

Une variable peut être soit libre, soit liée à un quantificateur.  
Une variable peux varier si elle est libre.

Une formule avec seulement des variable liées est une **formule close**.

Il est possible de renommer les variables ($$\alpha-conversion$$) d'un quantificateur et toutes les variables qu'elle lie seulement si ça ne change pas les autres liaisons.

# Quantificateur universel $$\forall$$

### Introduction

$$\frac{\Gamma,x: X\vdash P}{\Gamma\vdash\forall x: X,P}\forall_i$$

### Élimination

$$\frac{\Gamma\vdash\forall x:X,P\ \ \ \Gamma\vdash t:X}{\Gamma\vdash P[x/t]}\forall_e;t$$

P[x/t] : P dont tout les x libre sont remplacés par t.

# Quantificateur existentiel $$\exists$$

### Introduction

$$\frac{\Gamma\vdash t:X\ \ \ \Gamma\vdash P[x/t]}{\Gamma\vdash\exists x:X,P}\exists_i;t$$

### Élimination

$$\frac{\Gamma\vdash\exists x:X,P\ \ \ \Gamma;y:X;P[x/y]\vdash A}{\Gamma\vdash A}\exists_e$$

*La variable y ne doit pas apparaître comme variable libre dans $$\Gamma$$.*

# Égalité

### Introduction

$\frac{}{\Gamma\vdash t=t}=_i$$$

### Élimination

$$\frac{\Gamma\vdash t=t'\ \ \ \Gamma\vdash P[x/t]}{\Gamma\vdash P[x/t']}=_e$$

[Index](./index.md)  
[Cours précédant](./cours_7.md)
