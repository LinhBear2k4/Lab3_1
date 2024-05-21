package com.example.lab3.API;

import com.example.lab3.Entity.User;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/Lab3")
public class ObjectAPI {
    @GetMapping("/getObjectInfomation")
    public ResponseEntity<?> getObjectInfomation(User user) {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Hello World");
        result.put("satus", true);
        result.put("data",user);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/postObjectInfomation")
    public ResponseEntity<?> getObjectInfomation2(@Valid @RequestBody User user) {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Hello World");
        result.put("satus", true);
        result.put("data",user);
        return ResponseEntity.ok(result);
    }
}
