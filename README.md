# Version

- **1.0.0-SNAPSHOT** : initialisation du projet

# Objectif

Serveur d'autorisation Oauth2 basé sur le grant _authorization_code_.

# Technique

Les services enregistrés sont les suivants :
- service d'interaction bancaire : http://localhost:8200/login
\
Lien github : https://github.com/langston8182/service-interaction

Le formulaire de login est celui par defaut de spring security. il est situé au sein du serveur d'autorisation. 
\
Port d'écoute : 8090

**Liens oauth2** :
- Récupérer le token : http://localhost:8090/auth/oauth/token
- Autorisation : http://localhost:8090/auth/oauth/authorize
- Information de l'utilisateur : http://localhost:8090/auth/user/me

**Postman** :
Se loguer pour récupérer le token JWT

![postman](images/postman.png)
\
![postman](images/postman2.png)
\
![postman](images/postman3.png)

# Docker

Utiliser docker-compose pour lancer le serveur.
`docker-compose up`

## Mariadb

Utiliser docker-compose dans le repertoire docker/db pour lancer le serveur mariadb.
`docker-compose up`

Pour le premier démarrage configurer la base de donnée afin d'ajouter l'utilisateur _spring_ avec le mot de passe _spring_ et tous les privileges.
```
docker exec -ti mariadb bash
mysql -u root -p
<Mot de passe root>
CREATE USER ’spring’@‘localhost' IDENTIFIED BY ‘spring’;
GRANT ALL PRIVILEGES ON * . * TO ‘spring’@‘localhost';
FLUSH PRIVILEGES;
use bank;
show tables;
```

# Maven

Pour compiler le projet et créer l'image docker exécuter :
\
`mvn package`

Pour push l'image sur dockerHug, exécuter:
\
`mvn dockerfile:push`

# Contributeur

Cyril Marchive (cyril.marchive@gmail.com)
