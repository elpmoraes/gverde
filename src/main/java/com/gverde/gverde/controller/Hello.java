package com.gverde.gverde.controller;
import java.util.concurrent.atomic.AtomicLong;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.gverde.gverde.model.Greeting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@RestController
public class Hello {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

    @Controller
    public class GreetingController {
    
        private static final String template = "Hello, %s!";
        private final AtomicLong counter = new AtomicLong();
    
        @GetMapping("/greeting")
        public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
            model.addAttribute("name", name);
            return "greeting";
        }
    }
}