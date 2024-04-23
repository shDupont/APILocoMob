package com.shdupont.apilocomob.Service;

import com.shdupont.apilocomob.Controller.SignUpRequest;
import com.shdupont.apilocomob.Model.Login;
import com.shdupont.apilocomob.Model.User;
import com.shdupont.apilocomob.Repositories.LoginRepository;
import com.shdupont.apilocomob.Repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;


@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LoginRepository loginRepository;

    public User getUser(String id) {
        Optional<User> hasUser = userRepository.findById(id);
        return hasUser.orElseThrow(() -> new RuntimeException("User not found"));
    }

    public Boolean createUser(SignUpRequest signUpRequest){
        String id = UUID.randomUUID().toString();
        User user = new User();
        user.setId(id);
        user.setEmail(signUpRequest.getEmail());
        user.setName(signUpRequest.getName());

        Login login = new Login();
        login.setId(id);
        login.setUsername(signUpRequest.getUsername());
        login.setPassword(signUpRequest.getPassword());

        try {
            userRepository.save(user);
            loginRepository.save(login);
        } catch (Exception e) {
            log.error(e.getMessage());
            return false;
        }

        return true;
    }
}
