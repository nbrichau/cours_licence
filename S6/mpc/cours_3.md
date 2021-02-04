<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/viz.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/full.render.js"></script>
<script>var viz = new Viz();</script>

[Index](./index.md)  
[Cours précédent](./cours_2.md)

## Déterminisation d'automates

Objectif : À partir d'un automate fini non-déterministe (AFN) A, construire un automate fini déterministe (AFD) B tels que L(A) = L(B).

Ensemble de sous-ensembles :   
Q un ensemble fini, |Q| = n  *(Q a n éléments)*  
$$2^Q$$ l'ensemble des sous-ensembles de Q.  
\\(Q = \{Q_1, Q_2, ..., Q_n\}\\)  
\\(2^Q = \{\emptyset, \{Q_1\}, \{Q_2\}, ..., \{Q_n\}, \{Q_1, Q_2\}, \{Q_1, Q_3\}, ..., \{Q_1, Q_n\}, ..., \{Q_1, Q_2, ..., Q_n\}\}\\)  
\\(|2^Q| = \binom{n}{0} + \binom{n}{1} + \binom{n}{2} + ... + \binom{n}{n} = 2^n\\)

### Méthode de sous-ensembles

Soit AA (A, Q, I, F, $$\delta$$) un AFN.  
On construit l'automate BB tels que :
- L'ensemble d'états est $$2^Q$$
- L'unique état initial est $$\{I\} \in 2^Q$$
- Un état $$P \in 2^Q$$ est état final de BB si $$P \cap F \neq \emptyset$$
- La fonction de transition de BB est donnée par $$\delta_{BB}(P, a) = \bigcup_{p\in P}\delta_{AA}(p, a), \forall P\in 2^Q, \forall a\in A$$

Proposition :  
L'automate fini B construit ainsi est un automate fini déterministe complet et L(A) = L(B)

Exemple :  
Q = {p, q, r}  
I = {p}  
F = {r}

<div id="grapheA"></div>
<script>
viz.renderSVGElement(` 
	digraph A {
		i -> p;
		p -> q [label="a"];
		p:nw -> p:ne [label="a,b"];
		q -> r [label="b"];
		r:nw -> r:ne [label="a,b"];
		r -> f;
		
		f [style=invis];
		i [style=invis];
		{ rank=same; i p q r f }
	}
`).then(elem => document.getElementById("grapheA").appendChild(elem)).catch(error=> console.log(error));
</script>

\\(Q_B = 2^Q = \{\{\emptyset\}, \{p\}, \{q\}, \{r\}, \{p, q\}, \{p, r\}, \{q, r\}, \{p, q, r\}\}\\)

B a donc 8 états.

Tableau des transition de A :

|$$\delta_A$$|p|q|r|
|:-:|:-:|:-:|:-:|
|a|{p,q}|$$\emptyset$$|{r}|
|b|{p}|{r}|{r}|

Liste des transitions de B :

\\(\delta_B(\{p\}, a) = \delta_A(p, a) = \{p, q\}\\)

<div id="deltaBpa"></div>
<script>
viz.renderSVGElement(` 
	digraph deltaBpa {
		p -> q [label="a"];
		
		p [label="{p}"];
		q [label="{p,q}"];
		f [style=invis];
		i [style=invis];
		{ rank=same; p q }
	}
`).then(elem => document.getElementById("deltaBpa").appendChild(elem)).catch(error=> console.log(error));
</script>

\\(\delta_B(\{p\}, b) = \delta_A(p, b) = \{p\}\\)

\\(\delta_B(\{q\}, a) = \emptyset\\)

\\(\delta_B(\{q\}, b) = \{r\}\\)

\\(\delta_B(\{r\}, a) = \{r\}\\)

\\(\delta_B(\{r\}, b) = \{r\}\\)

\\(\delta_B(\{p, q\}, a) = \delta_A(p, a)\cup\delta_A(q, a) = \{p, q\}\cup\emptyset = \{p, q\}\\)

\\(\delta_B(\{p, q\}, b) = \{p, r\}\\)

\\(\delta_B(\{p, r\}, a) = \{p, q, r\}\\)

\\(\delta_B(\{p, r\}, b) = \{p, r\}\\)

\\(\delta_B(\{q, r\}, a) = \{r\}\\)

\\(\delta_B(\{q, r\}, b) = \{r\}\\)

\\(\delta_B(\{p, q, r\}, a) = \{p, q, r\}\\)

\\(\delta_B(\{p, q, r\}, b) = \{p, r\}\\)

\\(\delta_B(\emptyset, a) = \emptyset\\)

\\(\delta_B(\emptyset, b) = \emptyset\\)

\\(I_B = \{I\} = \{p\}\\)

\\(F_B = \{\{r\}, \{p,r\}, \{q,r\}, \{p,q,r\}\}\\)

<div id="grapheB"></div>
<script>
viz.renderSVGElement(` 
	digraph B {
		i -> 1;
		1:nw -> 1:ne [label="b"];
		1 -> 2 [label="a"];
		2:nw -> 2:ne  [label="a"];
		2 -> 3 [label="b"];
		3:nw -> 3:ne [label="b"];
		3 -> f1;
		3 -> 4 [label="a"];
		4 -> 3 [label="b"];
		4:nw -> 4:ne [label="a"];
		4 -> f2;
		5:nw -> 5:ne [label="a,b"];
		6 -> 5 [label="a", constraint=false];
		6 -> 7 [label="b"];
		7:nw -> 7:ne [label="a,b"];
		7 -> f3;
		8 -> 7 [label="a,b", constraint=false];	
		8 -> f4;
		
		1 [label="{p}"];
		2 [label="{p,q}"];
		3 [label="{p,r}"];
		4 [label="{p,q,r}"];
		5 [label="&empty;"];
		6 [label="{q}"];
		7 [label="{r}"];
		8 [label="{q,r}"];
		
		f1 [style=invis];
		f2 [style=invis];
		f3 [style=invis];
		f4 [style=invis];
		i [style=invis];
		{ rank=same; i 1 2 3 4 }
		{ rank=same; 5 6 7 8 }
	}
`).then(elem => document.getElementById("grapheB").appendChild(elem)).catch(error=> console.log(error));
</script>

La partie de droite (les sommets $$\emptyset$$, {q}, {r} et {q,r}) n'est pas accessible. Il est possible de l'enlever pour simplifier le graphe.


[Index](./index.md)  
[Cours précédent](./cours_2.md)
