#PLAY / REDIS / WEBSOCKET

Test d'une application qui met à jours des données sur le navigateur en websocket en provenance d'un PUBLISH dans REDIS

**Fonctionne seulement avec Safari**

##Fonctionnement 
Lancer l'application play

``play run``

Lancer le server redis 

``redis-server`` 

Lancer un client redis

``redis-cli`` 

Lancer un ou plusieurs navigateur sur ``http://localhosth:9000``


Publier des messages depuis le client redis

``PUBLISH playChanel "Message 1"``

Le message doit apparaitre dans les navigateurs :)

## Auteur 
Fabien AMICO

[![endorse](http://api.coderwall.com/fabienamico/endorsecount.png)](http://coderwall.com/fabienamico)

