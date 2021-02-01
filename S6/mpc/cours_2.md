<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/viz.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/full.render.js"></script>
<script>var viz = new Viz();</script>

[Index](./index.md)  
[Cours précédent](./cours_1.md)

# Mots et langages acceptés part un automate fini

Un calcul (ou un run) d'un AF sur un mot est un chemin de transitions consécutives qui part de l'état initial de l'AF.  
Un calcul acceptant est un calcul qui termine dans un état final.  
Un mot accepté est un mot pour lequel il existe au moins un calcul acceptant sur l'AF de ce mot.  
Un langage reconnue par un AF est l'ensemble des mots reconnus, noté L(A).

Il existe des algorithmes qui permettent d'exprimer sous la forme d'une expression rationnelle le langage accepté par un automate fini.

### Automates finis et matrices d'adjacence.

On peut representer un AF par la matrice d'adjacence M du graphe orienté associé.  
$$(M^k)_{ij}$$ correspond aux mots de longueur k reconnu par l'AF quand on va de l'état i à l'état j.

# Automates complets

Un automate fini $$C = (A, Q, I, F, \delta)$$ est un automate complet si pour chaque état $$q\in Q$$ et pour chaque lettre $$a \in A$$, il existe au moins une transition étiqueté par $$a$$ sortant de l'état $$q$$.

Exemple :

<div id="graphe"></div>
<script>
viz.renderSVGElement(` 
	digraph Graphe {
		i -> 1;
		1 -> 2 [label="a"];
		2:nw -> 2:ne [label="b"];
		2 -> 3 [label="b"];
		3 -> 1 [label="a,b"];
		2 -> f;
		1 -> ff;
		
		f [style=invis];
		ff [style=invis];
		i [style=invis];
		{ rank=same; i 1 2 f }
	}
`).then(elem => document.getElementById("graphe").appendChild(elem)).catch(error=> console.log(error));
</script>

De l'état 1 il n'y a pas de transition avec b, de même pour l'état 2 avec a. Donc l'automate n'est pas complet.

### Construction d'un automate complet

Soit $$C=(A, Q, I, F, \delta)$$ un automate fini et $$D=(A, Q\cup\{q\}, I, F, \delta')$$ où $$q$$ est un nouvel état, $$\delta' = \delta\cup\{(p, \alpha, q)\setminus p\in Q, \alpha\in A,$$ il n'y a pas de transition de la forme  $$(p,\alpha, p')\in \delta\} \cup \{(q,\alpha, q)\ \forall \alpha \in A\}$$.  
Alors, l'automate D, appelé le complété de C, est un automate complet et L(C) = L(D)

Preuve : Les nouvelles transitions n'ont pas d'impact sur les mots reconnus.

Exemple :

Graphe non complet C :

<div id="noncomplet"></div>
<script>
viz.renderSVGElement(` 
	digraph non_complet {
		i -> 1;
		1 -> 2 [label="a"];
		2:nw -> 2:ne [label="b"];
		2 -> f;
		
		f [style=invis];
		i [style=invis];
		{ rank=same; i 1 2 f }
	}
`).then(elem => document.getElementById("noncomplet").appendChild(elem)).catch(error=> console.log(error));
</script>

L(C) = ab*

Graphe complet D :
<div id="complet"></div>
<script>
viz.renderSVGElement(` 
	digraph complet {
		i -> 1;
		1 -> 2 [label="a"];
		2:nw -> 2:ne [label="b"];
		2 -> f;
		1 -> q [label="b"];
		2 -> q [label="a"];
		q:sw -> q:se [label="b,a"];
		
		f [style=invis];
		i [style=invis];
		{ rank=same; i 1 2 f }
	}
`).then(elem => document.getElementById("complet").appendChild(elem)).catch(error=> console.log(error));
</script>

L(D) = ab* = L(C)

# Automates déterministes

Un automate fini $$C=(A,Q,I,F,\delta)$$ est déterministe si :
1. Il y a un seul état initial
2. Pour tout état $$q\in Q$$ et pour toute lettre $$\alpha\in A$$, il y a au plus une transition étiqueté $$\alpha$$ qui sort de l'état $$q$$.

Exemple :

<div id="nondeterministe"></div>
<script>
viz.renderSVGElement(` 
	digraph non_deterministe {
		i -> 1;
		1 -> 2 [label="b"];
		2 -> 3 [label="a"];
		3 -> 4 [label="b"];
		1:nw -> 1:ne [label="a,b"];
		4:nw -> 4:ne [label="a,b"];
		4 -> f;
		
		f [style=invis];
		i [style=invis];
		{ rank=same; i 1 2 3 4 f }
	}
`).then(elem => document.getElementById("nondeterministe").appendChild(elem)).catch(error=> console.log(error));
</script>

Cet automate n'est pas déterministe car il y a deux transitions étiquetés b qui sortent de 1.

<div id="deterministe"></div>
<script>
viz.renderSVGElement(` 
	digraph deterministe {
		i -> 1;
		1 -> 2 [label="b"];
		2 -> 3 [label="a"];
		2:nw -> 2:ne [label="b"];
		3 -> f;
		
		f [style=invis];
		i [style=invis];
		{ rank=same; i 1 2 3 f }
	}
`).then(elem => document.getElementById("deterministe").appendChild(elem)).catch(error=> console.log(error));
</script>

Cet automate est déterministe.

## Complémentaire

Soit $$C = (A, Q, I, F, \delta)$$ un automate complet et déterministe.  
Soit $$D = (A, Q, I, Q\setminus F, \delta)$$ (on rend les états finaux non-finaux et vice-versa).  
Alors l'automate fini D reconnait le langage complémentaire de celui reconnu par C.  
L(D) = A*\L(C)

Le complémentaire (ou complément) d'un ensemble $$L\subseteq A^*$$ est l'ensemble A*\L.

[Index](./index.md)  
[Cours précédent](./cours_1.md)
