
package com.example.accountservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping
    public String getAccounts() {
        return "Account Service is working!";
    }

    @GetMapping("/{id}")
    public String getAccount(@PathVariable int id) {
        return "Account details for ID: " + id;
    }
}
