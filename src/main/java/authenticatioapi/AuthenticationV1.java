 ```java
// code-start

package com.example.loginapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.MultiValueValidator;

@RestController
@CrossOrigin(origins = "localhost:3000")
public class LoginController {

    private static final String LOGIN_ENDPOINT = "/api/login";

    @RequestMapping(value = LOGIN_ENDPOINT, method = RequestMethod.POST)
    public ResponseEntity<String> login(@Valid @Size(min = 1, max = 50) @NotNull String username, @Valid @Size(min = 1, max = 50) @NotNull String password) {
        // Security: Validate user input to prevent injection attacks
        // Implement login logic here
        return ResponseEntity.ok("User logged in successfully!");
    }
}

// code-end
```