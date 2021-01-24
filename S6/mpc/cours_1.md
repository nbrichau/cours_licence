<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/viz.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/full.render.js"></script>
<script>var viz = new Viz();</script>

[Index](./index.md)  

# Mots et langage formel

Un mot est une suite ordonnée de lettres.

Un langage formel est l'ensemble des mots.

Le mot vide $$\epsilon$$ ne contient aucune lettre


## Notation

A : Alphabet de lettres

A* : Ensemble de tout les mots formés sur l'alphabet A.

$$\emptyset$$  : Langage vide (langage qui ne contient aucun mots)  
*$$\emptyset  \neq \{\epsilon\}$$*

\|u\| : Longueur du mot u (nombre de lettres).

u.v : uv : Concaténation (coller les deux mots u et v)

# Expressions rationnelles (ou régulières)

Les expressions rationnelles définissent les langages rationnels.

On part des lettres d'un alphabet A donné et le mot vide $$\epsilon$$ puis on va utiliser trois opérations rationnelles (opérations simples).

## Opérations simples

### Union (+)

\\(L_1 \cup L_2 = \{ u \setminus (u \in L_1\ ou\ u \in L_2) \}\\)

exemple : $$\{a, aa, bab\} \cup \{aa, bb\} = \{a, aa, bab, bb \}$$

### Produit (Concaténation) (.)

\\(L_1.L_2 = \{u_1.u_2 \setminus u_1 \in L_1, u_2 \in L_2\}\\)

exemple : {a, ab}.{c, ab} = {ac, aab, abc, abab}

remarque : Le produit n'est pas commutatif. $$L_1.L_2 \neq L_2.L_2$$

### Etoile (*)

$$L^* : L^0 \cup L^1 \cup L^2 \cup ...$$  
$$L^0 = \{\epsilon\}$$  
$$L^1 = L$$  
$$L^2 = L.L$$  
$$L^n = L^{n-1}.L$$  


## Expressions

L(e) : Le langage désigné par l'expression e  
$$L(e_1+e_2) = L(e_1) \cup L(e_2)$$  
$$L(e_1.e_2) = L(e_1).L(e_2)$$  
$$L(e^k) = (L(e))^k$$

Exemples :
A = {a, b}

- Ensemble des mots de A qui commencent par la lettre a : $$a.(a+b)^*$$
- Ensemble des mots de A qui finissent par la lettre a : $$(a+b)^*.a$$

\\(e^+ = e.e^*\\)

$$L(e^+)$$ : Le langage des mots qui sont concaténation d'au moins un mot du langage donné par e.

$$L^+ = L \cup L^2 \cup ...$$  
$$L^* = \{\epsilon\} \cup L \cup L^2 \cup ... = \{\epsilon\} \cup L^+$$

# Automates finis

## Définition

Un automate fini (AF) est un quintuplet  (A, Q, $$\delta$$, I, F).  
A : L'Alphabet  
Q : L'ensemble d'états  
$$\delta$$ : L'ensemble des transitions, $$\delta \subseteq Q\times A\times Q$$  
I : L'ensemble d'états initiaux, $$I \subseteq Q$$  
F : L'ensemble d'états finaux, $$F \subseteq Q$$

Exemple :  
A={a, b},  
Q={1, 2, 3},  
I={1},  
F={2},  
$$\delta$$={(1,a,2), (2,b,2), (2,b,3), (3,a,1), (3,b,1)}

Il est possible de représenté l'automate sous forme de graphe orienté étiquetté. Q est l'ensemble des sommets. $$\delta$$ est la liste des arêtes.

<div id="graphe"></div>
<script>
viz.renderSVGElement(` 
	digraph Graphe {
		i->1;
		1->2[label="a"];
		2:nw->2:ne[label="b"];
		2->3[label="b"];
		3->1[label="a,b"];
		2->f[];
		
		f[style=invis];
		i[style=invis];
		{ rank=same; i 1 2 f }
	}
`).then(elem => document.getElementById("graphe").appendChild(elem)).catch(error=> console.log(error));
</script>

[Index](./index.md)  
