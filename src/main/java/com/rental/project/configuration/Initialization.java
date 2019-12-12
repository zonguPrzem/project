package com.rental.project.configuration;

import org.apache.catalina.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.rental.project.repositories.UsersRepository;

import javax.annotation.PostConstruct;

@Configuration
public class Initialization {
//    private final UsersRepository usersRepository;
//    private final PasswordEncoder passwordEncoder;
//    //    @Value("${admin.password}")
//    private String adminPassword;
//    //    public Initialization(UsersRepository usersRepository, PasswordEncoder passwordEncoder) {
////        this.usersRepository = usersRepository;
////        this.passwordEncoder = passwordEncoder;
////    }
//    @PostConstruct
//    void initialize() {
//        if(!usersRepository.checkIfNameExists("admin")){
//            var user = new User();
//            user.setPassword(passwordEncoder.encode(Password));
//            user.setEmail("admin@admin.pl");
//            user.setName("admin");
//            user.setActive(true);
//            user.setRole(Role.ADMIN);
//            usersRepository.save(user);
//        }
//    }
}