<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_8.md)

# Quantificateur universel $$\forall$$

### Introduction

$$\frac{\Gamma,x: X\vdash P}{\Gamma\vdash\forall x: X,P}\forall_i$$

Pour prouver "tout objet de type X à la propriété P" :
- on prend un objet de type X quelconque, nommé au moyen d'une variable
- on prouve que cet objet a la propriété P

Le caractère quelconque est capturé par la condition qu'aucune hypothèses de $$\Gamma$$ ne doit avoir cet objet comme variable libre.


### Élimination

$$\frac{\Gamma\vdash\forall x:X,P\ \ \ \Gamma\vdash t:X}{\Gamma\vdash P[x/t]}\forall_e;t$$

*P[x/t] : P dont tout les x libre sont remplacés par t.*

Si on sait que tout type X a la propriété P, alors on peut prendre n'importe quel individu de X et affirmer qu'il possède la propriété P.

# Quantificateur existentiel $$\exists$$

### Introduction

$$\frac{\Gamma\vdash t:X\ \ \ \Gamma\vdash P[x/t]}{\Gamma\vdash\exists x:X,P}\exists_i;t$$

Pour prouver "il existe au moins un x de type X qui à la propriété P", on en exhibe un.

### Élimination

$$\frac{\Gamma\vdash\exists x:X,P\ \ \ \Gamma;y:X;P[x/y]\vdash A}{\Gamma\vdash A}\exists_e$$

*La variable y ne doit pas apparaître comme variable libre dans $$\Gamma$$.*

Pour exploiter le fait qu'il existe au moins un x de type X ayant la propriété P, on peut s'en faire servir un.

# Égalité

### Introduction

$$\frac{}{\Gamma\vdash t=t}=_i$$

t est égal à t, c'est tout

### Élimination

$$\frac{\Gamma\vdash t=t'\ \ \ \Gamma\vdash P[x/t]}{\Gamma\vdash P[x/t']}=_e$$

si t=t' et que t a la propriété P, alors t' a la propriété P

# Séquent valide

Un séquent est valide si sa conclusion est vraie dans tout modèle.

Un séquent $$\Gamma\vdash A$$ est valide si tout modèle de $$\Gamma$$ est également un modèle de $$\Gamma\cup\{A\}$$ *(si tout modèle de $$\Gamma$$ interprète également A par vrai)*

Le séquent $$\Gamma\vdash\bot$$ est valide si l'environnement $$\Gamma$$ n'a aucun modèle

## Modèle

Un modèle pour un univers et des hypothèses est la description de :
- pour chaque type de base T : un ensemble [[T]]
- pour chaque fonction $$f : T \to T'$$ : une fonction [[f]] de [[T]] dans [[T']]
- pour chaque propriété P sur un type T : une fonction [[P]] de [[T]] vers {vrai, faux}
- pour chaque variable x : T : un élément [[x]] $$\in$$ [[T]]

Chaque connecteur s'interprète de manière naturelle.  
Chaque hypothèse s'évalue en vrai.

[Index](./index.md)  
[Cours précédant](./cours_8.md)
