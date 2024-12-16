package com.example.springgreeting1.controller;

import com.example.springgreeting1.model.Customer;
import com.example.springgreeting1.service.CustomerService;
import com.example.springgreeting1.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {
    private static final double EXCHANGE_RATE = 23000.0; // USD to VND exchange rate

    @GetMapping("/form")
    public String showForm() {
        return "form"; // The form to input USD and exchange rate
    }

    @PostMapping("/convert")
    public String convertCurrency(@RequestParam("usd") double usd, Model model) {
        double vnd = usd * EXCHANGE_RATE;
        model.addAttribute("usd", usd);
        model.addAttribute("vnd", vnd);
        return "result";
    }
}