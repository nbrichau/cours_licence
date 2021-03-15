<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_8.md)

## A-star

### Principe

Avec s, le départ, t la cible, et u un somment entre s et t appartenant au plus court chemin entre s et t.

Le principe est comme Dijkstra (croissance d'un arbre à partir de s et ajout des feuilles) sauf que le choix du sommet u ce fait selon le score de u.  
Le score est une valeur qui dépend du coût de u et d'une estimation de la distance entre u et t.

L'estimation de la distance est une fonction heuristique qui est sensée fournir une information sur la distance entre un sommet x et le sommet cible t.

Cette fonction est fourni par l'utilisateur car elle dépend du type de graphe. Une graphe d'un plan géographique n'est pas le même qu'un graphe des combinaisons d'un Rubik's cube. Leur fonction heuristique sont différentes.

### Algorithme

- Poser $$P=\emptyset, Q=\{s\}, cout[s]=0, score[u]=cout[u]+heuristique(u,t), parent[s]=\bot$$
- Tant que $$Q \neq \emptyset$$
	- Choisir $$u \in Q$$ tel que $$score[u]$$ est minimum et le supprimer de $$Q$$
	- Si $$u == t$$, alors renvoyer le chemin de $$s$$ à $$t$$ grâce à la relation $$parent[u]$$ : $$t\to parent[t] \to parent[parent[t]] \to ... \to s$$
	- Ajouter $$u$$ à $$P$$
	- Pour tout voisin $$v \notin P$$ de $$u$$
		- Poser $$c = cout[u] + w(u, v)$$
		- Si $$v \notin Q$$, ajouter $$v$$ à $$Q$$
		- Sinon, si $$c \geq cout[v]$$ continuer la boucle
		- $$cout[v]=c$$, $$parent[v]=u, score[v]=c+heuristique(v,t)$$
- Renvoyer l'erreur "le chemin n'a pas été trouvé"

### Heuristique

La fonction est monotone si $$h(x, t) \leq w(x, y) + h(y, t) \forall x, y\ voisins$$

La fonction sous-estime la distance si $$h(x, y) \leq dist(x, y) \forall x, y$$ où h est défini.

[Index](./index.md)  
[Cours précédant](./cours_8.md)
