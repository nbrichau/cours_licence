<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>  
<link rel="stylesheet" type="text/css" href="https://tikzjax.com/v1/fonts.css">  
<script src="https://tikzjax.com/v1/tikzjax.js"></script>

[Index](./index.md)  
[Cours précédant](./cours_1.md)  
[Cours suivant](./cours_3.md)

## Notations asymptotiques

#### Notation $$O$$ ("grand o")
$$O(g(n)) = \{f() \mid \exists c \in \mathbb{R^+}, \exists n_0 \in \mathbb{N}, \forall n \geq n_0, 0 \leq f(n) \leq c\times g(n)\}$$

*le "=" n'est pas symétrique*

#### Notation $$\Omega$$
$$\Omega (g(n)) = \{f(n)\mid \exists c \in \mathbb{R^+}, \exists n_0 \in \mathbb{N}, \forall n \geq n_0, 0 \leq c \times g(n) \leq f(n)\}$$

#### Notation $$\Theta$$
$$\Theta (g(n)) = \{f(n) \mid \exists c_1, c_2 \in \mathbb{R^+}, \exists n_0 \in \mathbb{N}, \forall n \geq n_0, 0 \leq c_1 \times g(n) \leq f(n) \leq c_2 \times g(n)\}$$

#### Théorèmes
$$f(n) = O(g(n)) \Leftrightarrow g(n) = \Omega (f(n))$$
$$f(n) = \Theta (g(n)) \Leftrightarrow f(n) = O(g(n))\ et\ f(n) = \Omega (g(n))$$
$$f(n) = \Theta (g(n)) \Leftrightarrow f(n) = O(g(n))\ et\ g(n) = O(f(n))$$

#### Taille mémoire selon la représentation

- Matrice d'adjacence : $$O(n^2)$$
- Matrice d'incidence : $$O(n\times m)$$
- Liste d'adjacence : $$O(n+m)$$

## Complexité

#### Existence d'une arête ou d'un arc entre deux sommets
- Matrice d'adjacence : $$O(1)$$
- Matrice d'incidence : $$O(m)$$
- Liste d'adjacence : $$O(\Delta (G)) = O(n)$$

#### Degré d'un sommet
- Matrice d'adjacence : $$O(n)$$
- Matrice d'incidence : $$O(m)$$
- Liste d'adjacence : $$O(\Delta (G)) = O(n)$$

#### Degré de tous les sommets
- Matrice d'adjacence : $$O(n^2)$$
- Matrice d'incidence : $$O(n\times m)$$
- Liste d'adjacence : $$O(n + m)$$

## Parcours en largeur
On examine les sommets du graphe à partir d'un sommet source s.  
Tout les sommets accessibles depuis s par une chaîne ou un chemin seront visités, et seulement ceux-là.
Les sommets sont examinés un par un. Ils sont blancs tant qu'il n'ont pas été visité, puis gris quand ils sont présents dans la file d'attente, puis noir après avoir été sortis de la file d'attente.  
Quand on examine un sommet, on ajoute tout ses voisins ou successeurs dans la file d'attente et l'on met à jour leur distance par rapport au sommet source.

On prend le sommet source, on regarde tout ses enfants directs, puis tout les enfants directs des enfants du sommet source et ainsi de suite.

Complexité : $$O(n+m)$$

L'objectif est de calculer $$d(v)$$ qui contient en sortie $$d(s,v)$$ : La distance dans le graphe $$G$$ entre $$s$$ et tout sommet $$v$$ du graphe

### Exemple

<script type="text/tikz">
\begin{tikzpicture}
	\tikzstyle{sommet}=[circle, draw=black!50,  thick]
	\node[sommet] (A) at (0,2) {$A$};
	\node[sommet] (B) at (2,2) {$B$}
		edge node {} (A);
	\node[sommet] (C) at (2,0) {$C$}
		edge node {} (A)
		edge node {} (B);
	\node[sommet] (D) at (0,0) {$D$}
		edge node {} (A)
		edge node {} (C);
	\node[sommet] (E) at (4,1) {$D$}
		edge node {} (B)
		edge node {} (C);
\end{tikzpicture}
</script>

|  Sommet v   | A | B | C | D | E |
|:-----------:|:-:|:-:|:-:|:-:|:-:|
|Distance d(v)| 0 | 1 | 1 | 1 | 2 |
|    Père     | - | A | A | A | B |

[Index](./index.md)  
[Cours précédant](./cours_1.md)  
[Cours suivant](./cours_3.md)  
