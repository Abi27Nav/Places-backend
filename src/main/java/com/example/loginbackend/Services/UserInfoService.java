package com.example.loginbackend.Services;

import com.example.loginbackend.Repository.UserRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.loginbackend.Entity.User;

@Service
public class UserInfoService implements UserDetailsService{


    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder encoder;
    

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userDetail = repository.findByUsername( username);
        User user = userDetail.orElseThrow(() -> new UsernameNotFoundException("User not found"+username));
        return org.springframework.security.core.userdetails.User.builder()
        .username(user.getUsername())
        .password(user.getPassword())
        .build();
    }

    @SuppressWarnings("unchecked")
    public String registerNewUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        repository.save(user);
        return "User saved succesfully";
    }
    

}
