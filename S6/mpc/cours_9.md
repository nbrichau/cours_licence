<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML"></script>

[Index](./index.md)  
[Cours précédent](./cours_8.md)

# Des grammaires algébriques à la combinatoire

## Chemins de Dyck et grammaires

Soit un alphabet A={a, b}. On se donne la fonction de poids $$\Omega$, \Omega(a) = 1, \Omega(b) = -1$.
Un mot est représenté par un chemin avec un pas Nord-Est pour a et Sud-Est pour b.

Exemple : aababb : $$\Omega(aababb) = 1 + 1 - 1 + 1 - 1 - 1 = 0$$

Les mots de Dyck sont donnée par $$D = \{ w \in (a+b)^*$$ tels que $$ \Omega(w) = 0, \Omega(w[1..i]) \geq 0, \forall i \in [O, |w|]$$  
w[1..i] est le sous-mot formé par les i premières lettres.  
$$\Omega(w) = 0$$ implique que le mot a autant de a que de b.

Exemple : aababb est un mot de Dyck, aab n'en est pas un.

Bijection entre les mots de Dyck et les parenthèses correctement assemblées. Un a représente une parenthèse ouvrante et b une parenthèse fermante.  
Exemple : aababb <-> (()())

|w| = 2n, n=3 : aaabbb, ababab, abaabb, aabbab, aababb : 5 mots de Dyck

### Propriété 1 des mots de Dyck

Un mot de Dyck est :
- le mot vide
- la concaténation de deux mots de Dyck non vide
- un mot de la forme awb, où w est un mot de Dyck

Grammaire engendrée :  
$$G_1 = (\Sigma, T, S, R)$$  
$$\Sigma = \{x\}, T = \{a, b\}, S = x, R = x \to \epsilon + xx + axb$$  
$$L(G_1) = D$$

### Propriété 2 des mots de Dyck

Un mot de Dyck est :
- le mot vide
- un mot de la forme $$aw_1bw_2$$, où $$w_1, w_2$$ sont deux mots de Dyck

Grammaire engendrée :  
$$G_2 = (\Sigma, T, S, R)$$  
$$\Sigma = \{x\}, T = \{a, b\}, S = x, R = x \to \epsilon + axbx$$  
$$L(G_2) = D$$

## Nombres de Catalan

Les mots de Dyck sont comptés par les nombres de catalan $$C_n$$.

$$C_{n+1} = \sum^n_{k=0} C_k C_{n-k}$$  
$$C_0 = 1, C_1 = 1$$  
$$C_n = \frac{1}{n+1} \binom{2n}{n} = \frac{(2n)!}{n!(n+1)!}$$

Les nombres de catalan comptent un grand nombre d'objets en combinatoire :
- Les mots de Dyck
- Les nombres de façons de découper en triangles un polygone convexe à m+2 côtés en reliant les m sommets
- Le nombre d'arbres binaire entiers à n+1 feuilles
- Le nombre d'arbres planaires enracinés à n arêtes

# Automates à pile

Un automate à pile sur l'alphabet A est la donnée d'un 7-uplet :
- $$A$$ alphabet
- $$\Pi$$ alphabet fini (alphabet de pile)
- $$Q$$ ensemble fini d'états
- $$\delat$$ ensemble des transitions $$\Pi^* \times Q \times (\epsilon + A) \to P(\Pi^* \times Q)$$
- $$Z_0 \in \Pi$$ symbole initial de la pile
- $$q_0 \in Q$$ l'état initial
- $$F \subseteq S$$ ensemble des états finaux

[Index](./index.md)  
[Cours précédent](./cours_8.md)
