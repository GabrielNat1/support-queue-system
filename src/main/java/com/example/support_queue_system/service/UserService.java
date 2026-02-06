package com.example.support_queue_system.service;

import com.example.support_queue_system.dto.RegisterRequest;
import com.example.support_queue_system.model.User;
import com.example.support_queue_system.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User register(RegisterRequest request) {

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setTelephone(request.getTelephone());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole("ROLE_USER");

        return userRepository.save(user);
    }

    public Optional<User> findByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
