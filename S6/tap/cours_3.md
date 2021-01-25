<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/viz.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/viz.js/2.1.2/full.render.js"></script>
<script>var viz = new Viz();</script>

[Index](./index.md)  
[Cours précédant](./cours_2.md)

# Partition d'un entier

Le nombre de partition d'un entier est le nombre de paquets différents que l'on peut faire avec cet entier.

Exemple : 4 = 4 = 3+1 = 2+2 = 2+1+1 = 1+1+1+1  
Il y a 5 différents paquets. L'entier 4 a 5 partitions.

Les premières valeurs sont :

|n|1|2|3|4|5|6|7|8|9|10|
|-|-|-|-|-|-|-|-|-|-|-|
|P(n)|1|2|3|5|7|11|15|22|30|42|

## Formule asymptotique

Il n'y a pas de formule close pour P(n).

La formule de Fibonacci semble s'approcher de P(n) mais n'est pas totalement ça.

Il y a cependant une formule asymptotique. Un formule dont le quotient avec p(n) s'approche de zéro.

$$p(n) \sim \frac{1}{4n\sqrt{3}}* exp(\pi \sqrt{2n/3}) \approx 2^{3.7\sqrt{n}}$$

## Approche exhaustive

Une approche exhaustive en codant les partitions sous forme de bits n'est pas optimal car il y a trop de possibilité

## Récurrence

On utilise une représentation graphique.

Exemple : Entier 4
```
             *
         *   *
*    **  *   *
***  **  **  *
```

Il y a deux type de partitions(diagrammes) :
- type 1 : dernière partition est 1
- type 2 : dernière partition n'est pas 1.

Pour le type 1 : on peut enlever la dernière colonne pour se ramener à un diagramme plus petit. On enlève une partition et on diminue l'entier de 1.  
Pour le type 2 : On peut enlever la ligne du bas pour se ramener à un diagramme plus petit. On diminue l'entier du nombre de partition.

$$p(n,k) = p_1(n,k) + p_2(n,k) = p(n-1,k-1)+p(n-k, k)$$
avec n l'entier et k le nombre de partitions.  
Il faut $$n \ge k > 1$$

### Code

```java
int p(int n, int k) {
	if (k>n)  return 0;
	if(n==1 || k==1) return 1;
}
int p_rec(int n) {
	int s=0;
	for (int k=1; k<=n; k++) {
		s += p(n, k);
	}
	return s;
}
```

### Arbre des appels

C'est un arbre dont les nœuds représentent les paramètres d'appels et les fils les différents appels. L'exécution de la fonction correspond à un parcours en profondeur de cet arbre, la racine représente les paramètres de 1er appel.

Arbre p_rec(6) :

<div id="prec6"></div>
<script>
viz.renderSVGElement(` 
	digraph p_rec_6 {
		node [shape=none];
		graph [tooltip="p_rec(6)"];
		
		0 -> {1 2 3 4 5 6};
		
		0[label="6"]; 1[label="(6,1)"]; 2[label="(6,2)"]; 3[label="(6,3)"]; 4[label="(6,4)"]; 5[label="(6,5)"]; 6[label="(6,5)"];
	}
`).then(elem => document.getElementById("prec6").appendChild(elem)).catch(error=> console.log(error));
</script>

Arbre p(6,3) :
<div id="p63"></div>
<script>
viz.renderSVGElement(` 
	ddigraph p_6_3 {
		node [shape=none];
		graph [tooltip="p(6,3)"];
		
		A -> {B C};
		B -> {D E};
		E -> {F G};
		
		A[label="(6,3)"]; B[label="(5,2)"]; C[label="(5,3)"]; D[label="(4,1)"]; E[label="(3,2)"]; F[label="(2,1)"]; G[label="(1,2)"];
	}
`).then(elem => document.getElementById("p63").appendChild(elem)).catch(error=> console.log(error));
</script>

[Index](./index.md)  
[Cours précédant](./cours_2.md)
