package com.rental.project.repositories;

import com.rental.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<com.rental.project.model.User> findByEmail(String email);

    @Query("select count(u) > 0 from User u where u.email = ?1")
    boolean checkIfMailExists(String email);

    @Query("select count(u) > 0 from User u where u.name = ?1")
    boolean checkIfNameExists(String name);
}
