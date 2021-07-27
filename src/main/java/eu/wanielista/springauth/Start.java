package eu.wanielista.springauth;

import eu.wanielista.springauth.model.AppUser;
import eu.wanielista.springauth.repository.AppUserRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Start {
    private AppUserRepository appUserRepository;

    public Start(AppUserRepository appUserRepository, PasswordEncoder passwordEncoder) {
        this.appUserRepository = appUserRepository;

        AppUser ap = new AppUser();
        ap.setUsername("janusz");
        ap.setPassword(passwordEncoder.encode("janush321"));
        ap.setRole("ROLE_ADMIN");

        appUserRepository.save(ap);
    }
}
