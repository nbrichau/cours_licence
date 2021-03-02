<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédant](./cours_4.md)

## Propriété du préfixe valide
L'item $$A\to \alpha \bullet \beta$$ est valable sur $$[i, j]$$ s'il existe $$\gamma \delta$$ tels que :
- \\(S \Rightarrow^* \gamma A \delta\\)
- \\(\gamma \Rightarrow^* a_1 ... a_i\\)
- \\(\alpha \Rightarrow^* a_{i+1} ... a_j\\)

## Analyse Earley

Généralisation de l'analyse CYK grâce au préfixe valide.

Un item valide $$(A \to \alpha \bullet \beta, i, j)$$ explicite l'idée que la séquence $$a_1 a_2 ... a_i a_{i + 1} ... a_j ... a_k$$ a été analysée jusqu'à $$j$$, et que la séquence $$a_{i + 1} ... a_j$$ est dérivée de $$\alpha$$, préfixe de la partie droite de la règle $$A \to \alpha \beta$$.

On remplace l'axiome de CYK par les règles suivantes :
- Soit un item $$(A \to \alpha \bullet B \beta, i, j)$$ dans $$$I_j$$, s'il existe une règle $$B \to \gamma$$, alors l'item $$(B \to \bullet \gamma, j, j)$$ est ajouté à $$I_j$$.
- Soit une séquence $$a_1 ... a_m ... a_i ... a_j ... a_k$$. Si un item $$(A \to \alpha \bullet, i, j)$$ appartient à un ensemble $$I_j$$, cela signifie que la règle $$A \to \alpha$$ a été appliquée sur $$a_i ... a_j$$. Alors on peut déduire de l'item $$(m, i, B \to \gamma \bullet A \delta)$$, le nouvel item $$(m, j, B \to \gamma A \bullet \delta)$$ que l'on ajoute à $$I_j$$.
- Soit une séquence $$a_1 ... a_i ... a_k$$. Si un item $$(A \to \alpha \bullet a_i \beta, n, i - 1)$$ appartient à un ensemble $$I_{i - 1}$$, cela signifie qu'un nouvel ensemble $$I_i$$ pourra être construit après la lecture de $$a_i$$, c'est-à-dire que ce nouvel ensemble contient l'item $$(A \to \alpha a_i \bullet \beta, n, i)$$

## Analyse LR, automates à pile

On fait à peu près la même chose mais on forme un automate à pile avec les items.

L'analyse LR suppose un automate dont chacun des états correspond à une classe d'équivalence sur un ensemble d'items.

1. L'état initial contient $$S \to \bullet \alpha$$ s'il existe $$S \to \alpha \in R$$
2. Dans chaque état, on construit une équivalence $$A \to \alpha \bullet B \beta \equiv B \to \bullet \gamma$$ s'il existe $$B \to \gamma \in R$$
3. SI l'état $$Q$$ contient $$A \to \alpha \bullet X \beta$$, construire une transition vers l'état $$Q' = A \to \alpha X \bullet \beta$$ avec le symbole $$X$$ en empilant $$Q$$.
4. SI l'état $$Q$$ contient $$A \to \alpha \bullet$$, aller ver l'état au sommet de la pile - $$| \alpha |$$ (dépiler) avec la lettre suivante de $$A$$

[Index](./index.md)  
[Cours précédant](./cours_4.md)
