package br.com.API_REST.ProjectApi.Config;

import br.com.API_REST.ProjectApi.Domain.User;
import br.com.API_REST.ProjectApi.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {
    @Autowired
    private UserRepository repository;
    @Bean
    public void startDB(){
        User u1 = new User();
        u1.setId(null);
        u1.setName("Bruna");
        u1.setEmail("BrunaLopes@gmail.com");
        u1.setPassword("1234");

        User u2 = new User();
        u2.setId(null);
        u2.setName("Bruno");
        u2.setEmail("BrunoBaptismo@gmail.com");
        u2.setPassword("12345");

        repository.saveAll(List.of(u2,u1));

    }


}
