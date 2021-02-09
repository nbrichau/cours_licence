<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/viz.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/full.render.js"></script>
<script>var viz = new Viz();</script>

[Index](./index.md)  
[Cours précédent](./cours_3.md)

## Propriétés de clotures des automates finis

Un langage reconnaissable est un langage pour lequel il existe un automate fini qui reconnait ce langage.

###### Théorème :

Si $$L\subseteq A^*$$ est un langage reconnaissable, alors son complémentaire $$A^*\setminus L$$ est aussi reconnaissable.

### Union et intersection de langages

#### Produit cartésien d'AF

Soit $$A_i(A, Q_i, I_i, F_i, \delta_i), i=1,2$$ deux AF.  
Soit :
- $$Q = Q_1 \times Q_2$$
- $$I = I_1 \times I_2$$
- $$F_{\cup} = \{(q_1, q_2)\in Q \setminus q_1\in F_1 OU q_2\in F_2\}$$
- $$F_{\cap} = \{(q_1, q_2)\in Q \setminus q_1\in F_1 ET q_2\in F_2\}$$
- $$\delta=\{((p_1, p_2), \alpha, (q_1, q_2))\in Q\times A\times Q \setminus (p_1, \alpha, q_1)\in \delta_1 ET (p_2, \alpha, q_2)\in \delta_2\}$$

Soit $$A_{\cap}=(A,Q,I,F_{\cap},\delta)$$ et $$A_{\cup}=(A,Q,O,F_{\cup},\delta)$$

##### Théorèmes :

L'AF $$A_{\cap}$$ reconnait l'intersection des langages reconnus par A_1 et A_2.

Si $$A_1$$ et $$A_2$$ sont complets, $$A_{\cup}$$ reconnait l'union des langages reconnus par $$A_1$$ et $$A_2$$.

Si $$L_1$$ et $$L_2$$ sont deux langages reconnaissables alors $$L_1\cap L_2$$ et $$L_1\cup L_2$$ sont aussi reconnaissable.  
La classe de langages reconnaissable est clot par union ou intersection des langages.

##### Exemple

<div id="grapheA1"></div>
<script>
viz.renderSVGElement(` 
	digraph A1 {
		i -> q1;
		q1:ne -> q1:se [label="a,b"];
		q1 -> q2 [label="b"];
		q2 -> q3 [label="a"];
		q3:ne -> q3:se [label="a,b"];
		q3 -> f;
		
		f [style=invis];
		i [style=invis];
	}
`).then(elem => document.getElementById("grapheA1").appendChild(elem)).catch(error=> console.log(error));
</script>

<div id="grapheA2"></div>
<script>
viz.renderSVGElement(` 
	digraph A2 {
		i -> q4;
		q4 -> q4 [label="a,b"];
		q4 -> q5 [label="a"];
		q5 -> q6 [label="b"];
		q6 -> q6 [label="a,b"];
		q6 -> f;
		
		f [style=invis];
		i [style=invis];
		{ rank=same; i q4 q5 q6 f }
	}
`).then(elem => document.getElementById("grapheA2").appendChild(elem)).catch(error=> console.log(error));
</script>

<div id="grapheAMix"></div>
<script>
viz.renderSVGElement(` 
	digraph AMix {
		i -> 14;
		14 -> 14 [label="a,b"];
		14 -> 15 [label="a"];
		15 -> 16 [label="b"];
		16 -> 16  [label="a,b"];
		14 -> 24 [label="a,b"];
		25;
		15 -> 26 [label="b", constraint=false];
		16 -> 26 [label="b"];
		24 -> 34 [label="a"];
		34 -> 34 [label="a,b"];
		24 -> 35 [label="a"];
		34 -> 35 [label="a"];
		26 -> 36 [label="a"];
		35 -> 36 [label="b"];
		36 -> 36 [label="a,b"];
		
		f [style=invis];
		i [style=invis];
		{ rank=same; i 14 15 16 }
		{ rank=same; 24 25 26 }
		{ rank=same; 34 35 36 }
	}
`).then(elem => document.getElementById("grapheAMix").appendChild(elem)).catch(error=> console.log(error));
</script>

$$F_{\cup} = \{(q_3,q_4), (q_3,q_5), (q_3,q_6), (q_1,q_6), (q_2,q_6)\}$$

$$F_{\cap} = \{(q_3,q_6)\}$$

## AF avec $$\epsilon-transitions$$

C'est un AFM, mais il peuvent avoir des transitions sur le mot vide $$\epsilon$$ ($$\epsilon-transition$$).

#### $$\epsilon$$-cloture

$$clot(q) = p \setminus p\in Q$$ tels qu'il existe un chemin étiquetté $$\epsilon$$ qui va de l'état $$q$$ à $$p$$.

## Passage entre AF et expressions rationnelles

### Théorème de Kleene

On peut convertir de manière algorithmique une expression rationnelle en AF qui reconnait le même langage.  
Et inversement, on peut convertir de manière algorithmique un AF en expression rationnelle qui reconnait le même langage.

### Expression rationnelle vers AF

Algorithme de Thompson :  
Input : expression rationnelle  
Output : un AF $$\epsilon-transition$$  

Les AF construits ont un unique état initial sur lequel n'arrive aucune transition et un unique état final duquel ne part aucune transition.

On suppose qu'on sait faire un AF pour les expressions régulières l1 et l2.

##### A reconnait l1+l2 :  
On créé un nouveau sommet initial qui a des $$\epsilon-transition$$ vers les états initiaux de l1 et l2.  
On créé des nouvelles $$\epsilon-transition$$ des états finaux de l1 et l2 vers un même nouvel état final.

##### A reconnait l1.l2 :  
On créé une $$\epsilon$$-transition qui va de l'état final de l1 vers l'état initial de l2.

##### A reconnait l1* :  
On créé un nouvel état initial qui a une $$\epsilon$$-transition vers l'état initial de l1 et vers un nouvel état final.
On rajoute une $$\epsilon$$-transition de l'état final de l1 vers le nouveau état final et l'état initial de l1.

[Index](./index.md)  
[Cours précédent](./cours_3.md)
