<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/viz.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/full.render.js"></script>
<script>var viz = new Viz();</script>

[Index](./index.md)  
[Cours précédent](./cours_6.md)

## Calcul de résiduels

Soit un langage $$L$$ et un alphabet $$A$$, le but est de calculer les résiduels de $$L$$, noté $$L_0$$, $$L_1$$, ...

Le 1er résiduel est $$L_0 = \epsilon^{-1}L = L$$.
Ensuite, tant que de nouveaux ensembles apparaissent :
	- Calculer les résiduels par rapport aux lettres de $$A$$ en partant des ensembles (résiduels) précédemment obtenu.
	- Numéroter au fur et à mesure les langages distincts reconnus.

Exemple :  
$$L = (a+b)^*ab$$
$$\epsilon^{-1}L = \epsilon^{-1}((a+b)^*ab) = (a+b)^*ab = L_0$$
$$a^{-1}L_0 = a^{-1}((a+b)^*ab) = (a+b)^*ab + b = L_1$$
$$b^{-1}L_0 = b^{-1}((a+b)^*ab) = (a+b)^*ab$$
$$a^{-1}L_1 = a^{-1}((a+b)^*ab + b) = (a+b)^*ab + b$$
$$b^{-1}L_1 = b^{-1}((a+b)^*ab + b) = (a+b)^*ab + \epsilon = L_2$$
$$a^{-1}L_2 = a^{-1}((a+b)^*ab + \epsilon) = (a+b)^*ab + b$$
$$b^{-1}L_2 = b^{-1}((a+b)^*ab + \epsilon) = (a+b)^*ab + b$$

Les résiduels sont donc $$L_0, L_1, L_2$$.

## Théorème de Myhll-Nerode

Un langage est reconnaissable si et seulement si le nombre de ses résiduels est fini.

## Automate des résiduels

L'automate fini déterministe minimal complet reconnaissant un langage $$L$$ est l'automate fini dont :
- Les états sont numérotés de 0 à n - 1, où n est le nombre de résiduels de $$L$$
- Chaque résiduels $$L_i$$ correspond à un état i.
- L'état initial est $$L_0$$.
- Il existe une transition $$(i, \alpha, j)$$ si et seulement $$L_j = \alpha^{-1}L_i, \alpha \in A$$.
- L'état i est un état final si et seulement si $$\epsilon \in L_i$$

L'automate fini ainsi obtenu est appelé **l'automate des résiduels**.

Exemple (en reprenant les résiduels de l'exemple précédent) :  

<div id="graphe"></div>
<script>
viz.renderSVGElement(` 
	digraph Graphe {
		i -> L0;
		L0:ne -> L0:se [label="b"];
		L0 -> L1 [label="a"];
		L1:ne -> L1:se [label="a"];
		L1 -> L2 [label="b"];
		L2 -> L1 [label="a"];
		L2 -> L0 [label="b"];
		L2 -> f;
		
		f [style=invis];
		i [style=invis];
		{ rank=same; i L0 L1 L2 f }
	}
`).then(elem => document.getElementById("graphe").appendChild(elem)).catch(error=> console.log(error));
</script>

## Remarques

L'automate fini minimal d'un langage rationnel donné est l'automate fini ayant un nombre minimal d'état.

Tout langage rationnel possède un automate fini déterministe minimal unique.

# Minimisation d'automates

## États séparés

Deux états d'un automate fini déterministe complet sont **séparés** par un mot si le chemin étiqueté par ce mot et partant de l'un de ces deux états aboutit dans un état final, tandis que le chemin étiqueté par ce mot et partant de l'autre état aboutit dans un état non final.

Exemple :

<div id="graphe2"></div>
<script>
viz.renderSVGElement(` 
	digraph Graphe {
		i -> 1;
		1:ne -> 1:se [label="b"];
		1 -> 2 [label="a"];
		2:ne -> 2:se [label="b"];
		2 -> 3 [label="a"];
		2 -> f;
		3:ne -> 3:se [label="a"];
		3 -> 1 [label="b"];
		
		f [style=invis];
		i [style=invis];
		{ rank=same; i 1 2 3 f }
	}
`).then(elem => document.getElementById("graphe2").appendChild(elem)).catch(error=> console.log(error));
</script>

(1, 2) sont des états séparés car $$\epsilon$$ les sépare.

### Théorème

Un automate fini déterministe complet est minimal si et seulement si pour tout couple d'état (p,q) il existe un mot qui les sépare.

Ce résultat donne un moyen de montrer qu'un automate fini donné est minimal. Il suffit d'exhiber pour chaque couple d'état un mot qui les sépare.

### Relation d'équivalence de Nerode (classes de Nerode)

Soit (p, q) un couple d'états.  
On note $$p \sim q$$ (ou $$p \equiv q$$) si p et q ne sont séparés par aucun mot.  
$$p \equiv_n q$$ ne sont séparés par aucun mot de longueur $$\leq n$$.

## Algorithme de minimisation de Moore

Cet algorithme prend en entrée un automate fini déterministe complet et retourne les classes d'équivalence de Nerode et l'automate minimal reconnaissant le langage reconnu par l'automate d'entrée.  
L'algorithme calcule lettre par lettre les mots séparant les états. C'est-à-dire qu'il calcule les classes d'équivalence de Nerode.  
Après examen de longueurs de mots possible, un bilan est fait. Attribution d'une étiquète à chaque classe $$\equiv_n$$.

[Index](./index.md)  
[Cours précédent](./cours_6.md)
