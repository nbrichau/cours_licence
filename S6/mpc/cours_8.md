<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/viz.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/full.render.js"></script>
<script>var viz = new Viz();</script>

[Index](./index.md)  
[Cours précédent](./cours_7.md)  
[Cours suivant](./cours_9.md)

## Algorithme de minimisation de Moore

Cet algorithme prend en entrée un automate fini déterministe complet et retourne les classes d'équivalence de Nerode et l'automate minimal reconnaissant le langage reconnu par l'automate d'entrée.  
L'algorithme calcule lettre par lettre les mots séparant les états. C'est-à-dire qu'il calcule les classes d'équivalence de Nerode.  
Après examen de longueurs de mots possible, un bilan est fait. Attribution d'une étiquète à chaque classe $$\equiv_n$$.

- Construire un tableau dont les colonnes sont les différents états de l'automate fini.
- La 1ère ligne de bilan s'obtient en séparant par $$\epsilon$$ les états finaux et les autres.
- Numéroter I l'état de la première colonne.
- Numéroter I ou II les états des autres colonnes de façon que tous ces états finaux sont numérotés de la même manière et que tous les états non-finaux sont numérotés de l'autre manière.
- Les lignes suivantes du tableau sont construite une par une en regardant, pour chaque état, dans quelle clase d'état mène la transition respective et en notant la classe à laquelle  appartient cet état dans la ligne.
- Un nouveau bilan est effectué, en prenant en compte le bilan précédent et toutes les lignes qu'on a remplit. Deux colonnes différentes donnent Deux classes différentes.
- On répète les deux opérations précédentes jusqu'à obtenir deux lignes de bilan identiques.

### Construction de l'automate à partir du tableau

Les états sont les classes de la dernière ligne du bilan.  
Les transitions se lisent dans la table entre l'avant-dernière et dernière ligne du bilan.  
L'état initial est la classe contenant l'état initial de l'automate fini de départ.
Les états finaux sont les classes d'équivalence contenant des état finaux de l'automate final initial.

<div id="graphe"></div>
<script>
viz.renderSVGElement(`
	digraph Graphe {
		i -> 0;
		0 -> 2 [label="a"];
		0 -> 1 [label="b"];
		1:se -> 1:sw [label="b"];
		1 -> 2 [label="a"];
		2:ne -> 2:nw [label="b"];
		2 -> 3 [label="a"];
		3 -> 4 [label="b"];
		3 -> 5 [label="a"];
		4:se -> 4:sw [label="b"];
		4 -> 5 [label="a"];
		5:ne -> 5:nw [label="b"];
		5 -> 6 [label="a"];
		6 -> 5 [label="a"];
		6 -> 7 [label="a"];
		7 -> 5 [label="a"];
		7:se -> 7:sw [label="b"];
		0 -> f;
		3 -> ff;
		4 -> fff;
		6 -> ffff;
		7 -> fffff;

		i [style=invis];
		f [style=invis];
		ff [style=invis];
		fff [style=invis];
		ffff [style=invis];
		fffff [style=invis];
		{ rank=same; i 0 2 3 5 6 ffff }
		{ rank=same; f 1 4 7 fffff }
	}
`).then(elem => document.getElementById("graphe").appendChild(elem)).catch(error=> console.log(error));
</script>


|     |0  |1  |2  |3  |4  |5  |6  |7  |
|:----|:--|:--|:--|:--|:--|:--|:--|:--|
|$$\epsilon$$|I|II|II|I|I |II |I  |I  |
|a    |II |II |I  |II |II |I  |II |II |
|b    |II |II |II |I  |I  |II |I  |I  |
|bilan|I  |II |III|IV |IV |III|IV |IV |
|a    |III|III|IV |III|III|IV |III|III|
|b    |II |II |III|IV |IV |III|IV |IV |
|bilan|I  |II |III|IV |IV |III|IV |IV |

Les deux lignes de bilan sont les mêmes dont le tableau est terminé.

<div id="graphe2"></div>
<script>
viz.renderSVGElement(`
	digraph GrapheMinimal {
		i -> I
		I -> III [label="a"];
		I -> II [label="b"];
		III:ne -> III:nw [label="b"];
		III -> IV [label="a"];
		II:se -> II:sw [label="b"];
		II -> III [label="a"];
		IV -> III [label="a"];
		IV:ne -> IV:nw  [label="b"];
		IV -> f;
		I -> ff;

		i [style=invis];
		f [style=invis];
		ff [style=invis];
		{ rank=same; i I III IV f }
	}
`).then(elem => document.getElementById("graphe2").appendChild(elem)).catch(error=> console.log(error));
</script>

# Grammaire hors-contexte (non-contextuelle / algébrique)

Les grammaires hors-contexte sont des modèles pour la génération d'expressions satisfaisant une syntaxe plus évoluée que les expressions régulières.

Une grammaire algébrique est donnée par :
- un alphabet fini $$V$$ de symboles (lettres) non-terminaux (variables)
- un alphabet $$T$$de symboles terminaux
	- ces deux alphabets sont disjoint
- une variable distinguée $$S$$, axiome, appartenant à l'alphabet $$V$$
- un ensemble fini $$P$$ de production (règle de production). $$A \mapsto \alpha, A\in V, \alpha \in (V\cup T)*$$. C'est un mot sur $$V \cup T$$

*Cette grammaire est une "machine à écrire", à cause de lettres de productions.*  
*Le terme "hors-contexte" provient du fait qu'on remplace $$A \in V$$ par $$w$$ sans tenir compte du contexte où $$A$$ apparaît.*

Soit $$A \to beta$$ une production d'une grammaire $$G$$ et $$\alpha A \gamma$$ un mot sur $$V \cup T$$. On dit que $$\alpha A \gamma$$ dérive en $$\alpha \beta \gamma$$.

Le langage $$L(G)$$ engendré par la grammaire $$G$$ est l'ensemble de mots sur $$T$$ (mots terminaux qui ne contiennent plus de variables) qui dérive de l'axiome $$S$$

[Index](./index.md)  
[Cours précédent](./cours_7.md)  
[Cours suivant](./cours_9.md)
