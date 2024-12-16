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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {
    private static final double EXCHANGE_RATE = 23000.0; // USD to VND exchange rate

    @GetMapping("/form")
    public String showForm() {
        return "form";
    }

    @PostMapping("/convert")
    public String convertCurrency(@RequestParam("usd") double usd, Model model) {
        double vnd = usd * EXCHANGE_RATE;
        model.addAttribute("usd", usd);
        model.addAttribute("vnd", vnd);
        return "result";
    }



    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("goodbye", "tạm biệt");
        dictionary.put("cat", "mèo");
        dictionary.put("dog", "chó");
    }

    @GetMapping("/translateForm")
    public String showFormEx() {
        return "indexTranForm";
    }

    @GetMapping("/translate")
    public String translate(@RequestParam("word") String word, Model model) {
        String result = dictionary.get(word);
        if (result == null) {
            model.addAttribute("message", "Không tìm thấy từ");
        } else {
            model.addAttribute("message", "Nghĩa của từ: " + result);
        }
        return "indexTranForm";
    }
}