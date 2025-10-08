stage-project/
│
├── src/
│   ├── main/
│   │   ├── java/com/example/stageproject/
│   │   │   ├── StageProjectApplication.java   ← point d’entrée
│   │   │   ├── controller/                   ← pour les APIs
│   │   │   ├── service/                      ← logique métier
│   │   │   ├── model/                        ← classes des données
│   │   │   └── repository/                   ← gestion des données (DB)
│   │   └── resources/
│   │       ├── application.properties        ← configuration
│   │       └── static/ & templates/          ← HTML, CSS (si tu veux)
│   └── test/                                ← tests unitaires
│
└── pom.xml                                  ← dépendances Maven
