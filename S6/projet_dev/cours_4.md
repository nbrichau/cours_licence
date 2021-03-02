[Index](./index.md)  
[Cours précédent](./cours_3.md)  
[Cours suivant](./cours_5.md)

# Modèle client - serveur

- Le client demande l'exécution d'un serveur.
- Le serveur réalise le service
- Client et serveur sont souvent localisés sur deux machines distinctes (mais pas obligatoire)

Il y a une **communication par message** : Le client envoie une requête au serveur puis le serveur renvoie une réponse au client. Cette communication peut être synchrone (attente de la réponse de serveur, le programme est bloqué en attente) ou asynchrone (le client n'attend pas la réponse et continue l'exécution de son programme)

**Application Web** : Ensemble d'applications serveur ayant comme interface client un navigateur internet. La communication est via le protocole HTTP.

# Protocole HTTP

C'est un protocole sans état. Il n'y a aucune information conservée entre deux connexions.

## Format des requêtes

- Commandes HTTP : `GET` `POST` `HEAD` `PUT` `DELETE` `TRACE` `OPTIONS` `CONNECT`
- URL à partir de la racine du serveur
- Version HTTP
- En-têtes : `<nom>:<valeur>`
- Ligne vide
- Contenu/corps

### Méthode `GET`

Méthode standard de requête d'un document.Le corps de la requête est toujours vide.  
Toute les données sont en clair.  
L'URL a une taille limitée à 4 Ko.

```http
GET /cgi-bin/prog.cgi?email=toto@site.fr&pass=toto&s=login HTTP/1.1
```

### Méthode `POST`

Comme la méthode get mais avec transmission de données dans le corps de la requête.  
Les données sont transmise en clair, mais pas dans l'URL.
```http
POST /cgi-bin/prog.cgi HTTP/1.1
User-Agent: Mozilla/5.0 (compatible;MSIE 6.0;Windows NT 5.1) Host: localhost
Accept: */*
Content-type: application/x-www-form-urlencoded
Content-length: 36

email=toto@site.fr&pass=toto&s=login
```

## Format des réponses
- Type de la réponse 
	- version HTTP
	- code de la réponse
	- description du code
- En-têtes
- ligne vide
- contenu/corps

### Codes de réponses

1xx : information
2xx : Succès
3xx : redirection
4xx : échec dû au client
5xx : échec dû au serveur

[Liste des codes HTTP](https://fr.wikipedia.org/wiki/Liste_des_codes_HTTP)

# Programmation côté serveur en Java

Principe général :
1. Réception de la requête http - Serveur web
2. Encapsulation de la requête dans un objet Java `HTTPServletRequest` - Moteur de servlets
3. Traitement de la requête et génération de la réponse sous forme d'objet Java `HTTPServletResponse` - Composants Java
4. Désencapsulation de la réponse - Moteur de servlets
5. Envoi de la réponse au client - Serveur web

Serveurs de références :
- Tomcat (Apache)
- Jetty (Eclipse Foundation)

## Servlet

Implémentation Java d'un mécanisme de requête/réponse.  

Un servlet est un objet Java lié à un URL sur le serveur. Il est dans un conteneur, il n'a pas accès direct au serveur.

C'est pratique mais à un inconvénient : Il y a beaucoup de `out.println()`.

## Java Server Pages (JSP)

C'est du code HTML avec du code Java à l'intérieur. c'est ensuite compilé en code Java pur. Cela a les mêmes caractéristiques qu'un Servlet.

## JavaBeans

Un composant logiciel réutilisable. Il a un structure contrainte : constructeur sans paramètre, toute les méthodes et attributs sont privé, sauf les getters/setters.  

## Framework Spring

Architecture autour d'un conteneur léger. Les composants sont tous des objets Java pur.  
Il intègre déjà des bibliothèques open source : Hibernate, JUnit, ...

[Index](./index.md)  
[Cours précédent](./cours_3.md)  
[Cours suivant](./cours_5.md)
