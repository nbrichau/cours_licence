<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_6.md)  
[Cours suivant](./cours_8.md)

## Le tiers exclus

Le tiers exclu sur une formule $$A$$ c'est la formule $$A\lor \neg A$$.  
C'est une tautologie.  
On ne prend donc pas le risque de prouver des séquents non valide.

$$\frac{}{\Gamma\vdash A\lor\neg A}exm_i$$

C'est une règle de la logique classique.  
*Elle peut être appliqué sur n'importe quelle formule.*

### Double négation

Avec $$\Gamma = {\neg\neg P, \neg P}$$

$$\frac{\frac{}{\neg\neg P\vdash P\lor\neg P}exm_i\ \ \ \frac{}{\neg\neg P, P\vdash P}hyp\ \ \ \frac {\frac{}{\Gamma\vdash\neg P}hyp\ \ \ \frac{}{\Gamma\vdash\neg\neg P}hyp}{\Gamma\vdash P}abs}{\neg\neg P\vdash P}\lor_e$$

### Formule de Peirce

Avec $F = ((P\implies Q)\implies P)\implies P$$

$$\frac{\frac{}{\vdash F\lor\neg F}exm_i\ \ \ \frac{}{F\vdash F}hyp\ \ \ \frac{\frac{}{\neg F\vdash\neg F}hyp\ \ \ \frac{prouvé\ dans\ ex\ feuille\ 3}{\neg F\vdash\neg\neg F}*}{\neg F\vdash F}abs}{\vdash F}\lor_e$$

### Règle de Morgan

Prouver : $$\neg(A\land B)\Leftrightarrow\neg A\lor\neg B$$  
On note $$F = \neg(A/land B)$$

$$\frac{\frac{}{F\vdash A\lor\neg A}exm_i\ \ \ \frac{\frac{\frac{\frac{}{F,A,B\vdash\neg(A\land B)}hyp\ \ \ \frac{\frac{}{F,A,B\vdash A}hyp\ \ \ \frac{}{F,A,B\vdash B}hyp}{F,A,B\vdash A\land B}\land_i}{F,A,B\vdash\bot}mp}{F,A\vdash\neg B}\to_i}{F,A\vdash\neg A\lor\neg B}\lor_{i,2}\ \ \ \frac{\frac{}{F,\neg A\vdash\neg A}hyp}{F,\neg A\vdash\neg A\lor\neg B}\lor_{i,1}}{F\vdash\neg A\lor\neg B}\lor_e$$


# Théorèmes sur la logique classique

- Les méta-théorèmes
	- de cohérence
	- de substitution uniforme
	- de remplacement
- Théorème de complétude (tout séquent valide est prouvable)

# Règles dérivées

### Élimination du tiers exclus

$$\frac{\Gamma,A\vdash B\ \ \ \Gamma,\neg A\vdash B}{\Gamma\vdash B}exm_e$$

### Absurde classique

$$\frac{\Gamma,\neg A\vdash\bot}{\Gamma\vdash A}abs_k$$

### Élimination de la double négation

$$\frac{}{\neg\neg A\vdash A}dn_e$$

[Index](./index.md)  
[Cours précédant](./cours_6.md)  
[Cours suivant](./cours_8.md)
