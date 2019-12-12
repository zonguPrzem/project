package com.rental.project.services;

import com.rental.project.model.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.rental.project.dtos.UserRegistration;
import com.rental.project.model.Role;
import com.rental.project.repositories.UsersRepository;
import java.util.Optional;

@Service
public class UserService {

    private UsersRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public UserService(
            UsersRepository userRepository,
            PasswordEncoder passwordEncoder
    ) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Optional<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public boolean checkIfMailIsTaken(String email) {
        return userRepository.checkIfMailExists(email);
    }

    public boolean checkIfNameIsTaken(String email) {
        return userRepository.checkIfNameExists(email);
    }

    public void createUser(UserRegistration registration) {
        var user = new User();
        user.setName(registration.getName());
        user.setLastName(registration.getLastName());
        user.setEmail(registration.getEmail());
        user.setAddres(registration.getAddres());
        user.setRole(Role.USER);
        user.setActive(true);
        user.setPassword(passwordEncoder.encode(registration.getPassword()));
        userRepository.save(user);
    }
}
