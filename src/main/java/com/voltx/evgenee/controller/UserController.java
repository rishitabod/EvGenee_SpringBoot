package com.voltx.evgenee.controller;

import com.voltx.evgenee.dto.requests.UserRequestDto;
import com.voltx.evgenee.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(UserRequestDto obj) {
        String status = userService.register(obj);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody String obj) {
        return ResponseEntity.ok("Accepted");
    }
}
