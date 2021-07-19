package cs.software.demo.controller;

import cs.software.demo.custom_exceptions.ResourceNotFoundException;
import cs.software.demo.data.entities.User;
import cs.software.demo.data.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import cs.software.demo.security.CurrentUser;
import cs.software.demo.security.UserPrincipal;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/profile")
    //@PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findByEmail(userPrincipal.getEmail())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getEmail()));
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return this.userRepository.findAll();
    }
}

