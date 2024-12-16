package com.example.springgreeting1.controller;

import com.example.springgreeting1.model.Customer;
import com.example.springgreeting1.service.CustomerService;
import com.example.springgreeting1.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {


    @GetMapping("/form")
    public String showForm() {
        return "formInputEmail";
    }

    @PostMapping("/form")
    public String processForm(@RequestParam("email") String email, Model model) {
        String message;
        if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            message = "Email đã hợp lệ";
        } else {
            message = "Email không hợp lệ";
        }
        model.addAttribute("mgs", message);
        return "formInputEmail";
    }
}