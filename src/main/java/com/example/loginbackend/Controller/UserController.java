//package com.example.loginbackend.Controller;
//
//import com.example.loginbackend.Services.JwtService;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.loginbackend.Entity.LoginRequest;
//import com.example.loginbackend.Entity.User;
//import com.example.loginbackend.Services.UserInfoDetails;
//import com.example.loginbackend.Services.UserInfoService;
//
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//
//
//
//@RestController
//public class UserController{
//
//@Autowired
//private AuthenticationManager authenticationManager;
//
//@Autowired
//private JwtService jwtservice;
//
//@Autowired
//private CustomUserDetailsService customUserDetailsService;
//
//@Autowired
//private PasswordEncoder passwordEncoder;
//
//@Autowired
//private UserInfoService service;
//
//@PostMapping("/login")
//public ResponseEntity<username> authenticateUser(@RequestBody LoginRequest loginRequest) {
//
//    Authentication authentication = authenticationManager.
//    authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
//
//    String token = jwtservice.generateToken((UserDetails) authentication.getPrincipal());
//    return ResponseEntity.ok(new JwtAuthenticationResponse(token));
//}
//@PostMapping("/register")
//public String registerNewUser(@RequestBody User user) {
//
//
//    return service.registerNewUser(user);
//}
// @GetMapping("/places")
//    public String userProfile(){
//        return "WElcome to the profile, user";
//    }
// @GetMapping("/places/{id}")
// public ResponseEntity<Page> getPageByUserId(@PathVariable Long id){
//
//}
//
//
//
//
//
//
//}
