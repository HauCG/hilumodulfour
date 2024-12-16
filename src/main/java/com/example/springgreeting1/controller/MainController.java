package com.example.springgreeting1.controller;

import com.example.springgreeting1.model.Customer;
import com.example.springgreeting1.service.CustomerService;
import com.example.springgreeting1.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller

public class MainController {

    @GetMapping("/mayTinh")
    public String showSpices(Model model) {
        return "caculator";
    }


    @PostMapping("/caculating")
    public String chooseSpices(@RequestParam("numOne") int numOne,
                               @RequestParam("mark") String mark,
                               @RequestParam("numTwo") int numTwo,
                               Model model) {
        int result = 0;

        switch (mark) {
            case "cong":
                result = numOne + numTwo;
                break;
            case "tru":
                result = numOne - numTwo;
                break;
            case "nhan":
                result = numOne * numTwo;
                break;
            case "chia":
                if (numTwo != 0) {
                    result = numOne / numTwo;
                } else {
                    result = 0;
                }
                break;
        }

        model.addAttribute("result", result);
        return "caculator";
    }

}


