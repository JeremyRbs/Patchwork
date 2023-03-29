# Patchwork
 Projet JAVA : LSI-2 - 1ère année cycle ingénieur EFREI - Promo 2025
 
 Participants :
 
    - RIBES Jérémy
    - LABBE Luc
    - TERKI Lydia
 
 Sujet :
 
![image](https://user-images.githubusercontent.com/71068295/201080871-66d9e762-62b9-487e-af06-6241ef7ad82e.png)
![image](https://user-images.githubusercontent.com/71068295/201080927-f9801658-ffcf-417f-b290-a71d9ebe08f2.png)

Un patchwork ressemble à ceci :

...

Diagramme de classes (v1) :
 
![image](https://user-images.githubusercontent.com/71068295/201080697-32940f9a-53c7-496d-b98e-1a48c8a7329d.png)

Action initiale (10/11/2022, Jérémy) :

L'architecture a été créée et les méthodes de périmètre et surface ont été réalisées.

Le main n'est pas initialisé, les tests ne sont pas encore créés mais tout le code est commenté et complété par de la Javadoc.

Prochaines étapes :

 1. Tester les méthodes déjà présentes via le main -> Cercle, Ellipse, Point, Ligne ✅  (10/11/2022, Jérémy)
 
  ⚠️ Problème : Polygone peut être divisé en rectangle, losange, etc -> classe incomplète -> à rediscuter   (10/11/2022, Jérémy)
 
 2. Compléter les méthodes suivantes dans chaque classe qui héritent de "FormeGeometrique" :
 
    - Homothetie
    - Translation
    - Rotation
    - Symétrie centrale
    - Symétrie axiale
    
 3. Compléter l'affichage pour faire apparaître pour chaque :
 
    - Les formes
    - Les images
    - Les dessins
 
 4. Compléter le main avec un menu permettant d'afficher la fresque
 
 5. Créer les tests unitaires pour chaque méthode
 
 6. Rédiger un rapport
 
ATTENTION ⚠️

Ne pas oublier :

   - Appliquer une transformation sur une image impacte les formes et sur un dessin impacte les images
   - La copie d'un dessin revient à la copie des images
   - D'effectuer un tri des formes d'une image selon le périmètre
   - D'effectuer un tri des images d'un dessin selon l'aire
   - D'utiliser la classe "Matrice" déjà créée permettant de réaliser les méthodes héritant de "FormeGeometrique"
   - D'utiliser la classe Collections pour les doublons
   - De s'occuper de la gestion des exceptions
   - D'utiliser le mot-clé final lorsque c'est nécessaire
   - De respecter les conventions de codage Java (voir extension ou plugin java permettant d'aller plus vite)
