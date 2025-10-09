package ma.yasser.stage_project.service;

import ma.yasser.stage_project.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class loginService {

    @Cacheable("logins")
    public String verifyLogin(User user) {
        System.out.println(" Vérification en cours..."); 

        if ("admin@gmail.com".equals(user.getEmail()) && "1234".equals(user.getPassword())) {
            return "Connexion réussie";
        } else {
            return "Identifiants invalides";
        }
    }
}
