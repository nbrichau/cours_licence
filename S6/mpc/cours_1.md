<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>
<link rel="stylesheet" type="text/css" href="https://tikzjax.com/v1/fonts.css">  
<script src="https://tikzjax.com/v1/tikzjax.js"></script>

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

$$L_1.L_2 = \{u_1.u_2 \setminus u_1 \in L_1, u_2 \in L_2\}$$

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

$$e^+ = e.e^*$$

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
$$\delta$$={(1,a,2), (2,b,2), (2,b,3), (2,a,1), (3,b,1)}

Il est possible de représenté l'automate sous forme de graphe orienté étiquetté. Q est l'ensemble des sommets. $$\delta$$ est la liste des arêtes.

<script type="text/tikz">
\begin{tikzpicture}[->]
	\tikzstyle{sommet}=[circle, draw=black!50,  thick]
	\node[sommet] (A) at (0,1) {1};
	\node (I) at (-0.7,1) {}
		edge node {} (A);
	\node[sommet] (B) at (1,1) {2};
	\node[sommet] (C) at (0.5,0) {3};
	\node (F) at (1.7,1) {};
	\draw (A) edge node[above] {a} (B);
	\draw (B) edge node[right] {b} (C);
	\draw (C) edge node[left] {a,b} (A);
	\draw (B) edge (F);
\end{tikzpicture}
</script>

[Index](./index.md)  
