<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_4.md)  
[Cours suivant](./cours_6.md)

## Programmation dynamique (Held-Karp)

On suppose que la tournée se termine en $$v_{n-1}$$.

$$V^*=V\setminus \{v_{n-1}\}$$

$$D(t,S)$$ = la longueur d'un chemin allant de $$v_{n-1}$$ à $$t$$ et qui visite chacun des points de $$S$$. Avec $$S\subseteq V^*$$ et $$t\in S$$

$$OPT(V,d) = min_{t\in V^*} D(t,V^*) + d(t, v_{n-1})$$

*Les sous-chemins dans le chemin optimal sont eux aussi optimaux.*

D(t,S) =
- si |S| = 1 : $$d(v_{n-1},t)$$
- si |S| > 1 : $$min_{x\in S\setminus \{t\}} D(x, S\setminus\{t\}) + d(x,t)$$

*On cherche le plus cours chemin de S sans le dernier point t. On se ramène à un problème plus petit.*

On a ainsi une implémentation récursive de l'algorithme. (voir le pdf du cours pour l'algo)


Arbres des appels D(t,S) :
- (t,S) : |S| - 1 appels
- (x, S\\{t}) : |S| - 2 appels
- etc...

Il y a (|S|-1)! feuilles.  
La complexité est en $$\Omega((n-2)!)$$

*Est-ce qu'il y a des calculs inutiles ? Oui.*
Nombre d'appels différents dans l'arbre D(t,S) ?
- $$t \in \{0, ..., n-2\}$$ -> n-1 valeurs différentes
- $$S\subseteq V^* -> 2^{V^*}=2^{n-1}$$

Cela donne un nombre d'appels égal à $$(n-1)*2^{n-1}$$.  
Il est bien inférieur à (n-1)!.

On va mémoriser les résultats dans une table.

[Index](./index.md)  
[Cours précédant](./cours_4.md)  
[Cours suivant](./cours_6.md)
