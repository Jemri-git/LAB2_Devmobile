# LAB2_Devmobile
## Description
Application Android permettant de calculer les impôts locaux d'une habitation
en fonction de sa surface, du nombre de pièces et de la présence d'une piscine.

## Fonctionnalités
- Saisie du nom et de l'adresse du propriétaire
- Saisie de la surface du logement (en m²)
- Saisie du nombre de pièces
- Option piscine (CheckBox)
- Calcul et affichage de :
  - L'impôt de base
  - L'impôt supplémentaire
  - L'impôt total

## Formule de calcul
- Impôt de base        = surface × 2
- Impôt supplémentaire = (nombre de pièces × 50) + (100 si piscine)
- Impôt total          = impôt de base + impôt supplémentaire

## Structure du projet
app/
├── manifests/
│   └── AndroidManifest.xml
├── java/
│   └── com.example.calculdimpots/
│       └── MainActivity.java
└── res/
    ├── layout/
    │   └── activity_main.xml
    └── values/
        └── strings.xml


# L'implémentation de l'activité
Créer une méthode calculer_impots() pour calculer les impots depuis les informations retournées des champs de saisis.
<img width="400" height="500" alt="lab2_onstart" src="https://github.com/user-attachments/assets/11dcc014-ad69-4576-aecf-bcf72fe6bd53" />

Après remplissage des champs avec les informations nécessaires, on obtient le résultat des impots locaux
<img width="400" height="500" alt="lab2_screen" src="https://github.com/user-attachments/assets/02e8d910-2044-4a76-b2bb-200bdd359892" />

# L'implémentation des tests unitaires
Les tests sont définis dans main/test/java/com/example/calculdimpots/ExampleUnitTest.java comme suit:
- testImpotBase
- testImpotAvecPiscine
- testImpotSansPiscine
- testImpotTotal
<img width="1000" height="202" alt="Tests_unitaires" src="https://github.com/user-attachments/assets/d58ccf3f-9a98-4e99-a5dc-43193c79600c" />


