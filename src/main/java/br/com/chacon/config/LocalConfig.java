package br.com.chacon.config;

import br.com.chacon.domain.User;
import br.com.chacon.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    @Primary
    public UserRepository startDB(){
        User u1 = new User(null, "Vitoria", "vitoria@mail.com", "1234");
        User u2 = new User(null, "Luiz", "luiz@mail.com", "1234");

        repository.saveAll(List.of(u1,u2));
        return repository;
    }
}
