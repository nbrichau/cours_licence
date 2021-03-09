<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_7.md)

# Navigation

Rappels :
- Le coût d'un chemin C d'un sommet u à v dans G est la somme des poids.
- C est de coût minimum si c'est celui avec le plus petit coût parmi tous les chemins de u à v. On dit aussi que C est plus court chemin.

## Dijkstra (algorithme modifié)

- Poser $$P=\emptyset, Q=\{s\}, cout[s]=0, parent[s]=\bot$$
- Tant que $$Q \neq \emptyset$$
	- Choisir $$u \in Q$$ tel que $$cout[u]$$ est minimum et le supprimer de $$Q$$
	- Si $$u == t$$, alors renvoyer le chemin de $$s$$ à $$t$$ grâce à la relation $$parent[u]$$ : $$t\to parent[t] \to parent[parent[t]] \to ... \to s$$
	- Ajouter $$u$$ à $$P$$
	- Pour tout voisin $$v \notin P$$ de $$u$$
		- Poser $$c = cout[u] + w(u, v)$$
		- Si $$v \notin Q$$, ajouter $$v$$ à $$Q$$
		- Sinon, si $$c \geq cout[v]$$ continuer la boucle
		- $$cout[v]=c$$, $$parent[v]=u$$
- Renvoyer l'erreur "le chemin n'a pas été trouvé"

[Index](./index.md)  
[Cours précédant](./cours_7.md)
