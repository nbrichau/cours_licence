<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/viz.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/full.render.js"></script>
<script>var viz = new Viz();</script>

[Index](./index.md)  
[Cours précédent](./cours_4.md)  
[Cours suivant](./cours_6.md)

## Expression rationnelle vers AF (suite)

### Algorithme de Glushkov

C'est un algorithmique de conversion d'expressions rationnelles en automate fini sans $$\epsilon$$-transition.

1. On renomme les lettres de l'expression e afin d'avoir des noms uniques (Linéarisation).  
Exemple : $$a(ab + b^*)^*b \to a_1(a_2b_3 + b_4^*)^*b_5$$
2. Chaque état de l'automate fini correspond à une de ces nouvelles lettres. On rajoute un état supplémentaire (appelé état $$\epsilon$$ ou 0), le seul état initial.
3. Les transitions depuis l'état 0 vont vers les états dont les lettres peuvent commencer un mot du langage.  
Il y a une transition de l'état $$a_i$$ vers l'état $$b_j$$ si il existe un mot du langage qui contient le facteur $$a_ib_j$$.
4. Les états finaux sont les états étiquetés par les lettres qui peuvent terminer un mot du langage.
5. L'étiquette d'une transition sera donnée par la lettre de l'état destination.  
Exemple : Une transition de l'état $$a_i$$ vers $$b_j$$ sera étiquetée $$b$$.
6. On re-etiquette les état par le numéro de la lettre.  
Exemple : L'état $$a_i$$ devient l'état $$j$$.

Exemple :  
expression rationnelle : $$a(ab+b)^*b$$  
Linéarisation : $$a_1(a_2b_3+b_4)^*b_5$$

<div id="graphe"></div>
<script>
viz.renderSVGElement(` 
	digraph Graphe {
		2 [label="a2"];
		i -> 0;
		3 [label="b3"];
		1 [label="a1"];
		4 [label="b4"];
		5 [label="b5"];
		
		0 -> 1 [label="a"];
		1 -> 2 [label="a"];
		1 -> 4 [label="b"];
		1 -> 5 [label="b"];
		2 -> 3 [label="b"];
		3 -> 2 [label="a"];
		3 -> 4 [label="b"];
		3 -> 5 [label="b", constraint=false];
		4 -> 2 [label="a"];
		4 -> 4 [label="b"];
		4 -> 5 [label="b"];
		5 -> f;
		
		f [style=invis];
		i [style=invis];
		{ rank=same; 2 3 }
		{ rank=same; i 0 1 4 }
		{ rank=same; 5 f }
	}
`).then(elem => document.getElementById("graphe").appendChild(elem)).catch(error=> console.log(error));
</script>

Remarques :
- Le nombre d'états est égal au nombre de lettres de l'expression plus un.
- L'automate fini obtenu n'est pas déterministe

## Automate fini vers expression rationnelle

### Lemme d'Ardem

Il permet de convertir un automate fini vers une expression rationnelle. Il existe plusieurs algorithmes pour cela : Algorithme de McNaughton et Yamada, de Brzozowski et McCluskey, etc ...

Le lemme d'Ardem permet de résoudre des équations dont les inconnues (et constantes) sont des langages.  
On peut l'utiliser pour calculer, à partir d'un automate fini donné, une expression rationnelle qui décrit le langage reconnu par l'automate.

Il existe deux versions symétriques du lemme suivant la forme de l'équation que l'on considère.

Définition :  
Soit $$X$$, $$K$$ et $$L$$ des langages tels que $$\epsilon \notin K$$.  
Si $$X=K.X+L$$, alors $$X=K^*.L$$  
Si $$X=X.K+L$$, alors $$X=L.K^*$$

[Index](./index.md)  
[Cours précédent](./cours_4.md)  
[Cours suivant](./cours_6.md)
