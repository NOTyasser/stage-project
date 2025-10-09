PROJECT DIAGRAM

stage-project/
│
├── src/
│   ├── main/
│   │   ├── java/ma/yasser/stageproject/
│   │   │   ├── StageProjectApplication.java   ← point d’entrée
│   │   │   ├── controller/                   ← pour les APIs
│   │   │   ├── service/                      ← logique métier
│   │   │   ├── model/                        ← classes des données
│   │   │   └── repository/                   ← gestion des données (DB)
│   │   └── resources/
│   │       ├── application.properties        ← configuration
│   │       └── static/ & templates/          ← HTML, CSS (optional)
│   └── test/                                 ← tests unitaires
│
└── pom.xml                                   ← dépendances Maven



src/
 └── main/
     └── java/
         └── ma/yasser/stageproject/
             ├── StageProjectApplication.java   ← Principal File
             ├── model/                         ← User.java
             ├── controller/                    ← LoginController.java
             └── service/                       ← LoginService.java
