package com.example.designpatternslab2023.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.designpatternslab2023.Difexamples.ClientComponent;

@Controller
public class HelloController {

    private final ClientComponent clientComponent;

    @Autowired
    public HelloController(ClientComponent clientComponent) {
        this.clientComponent = clientComponent;
    }

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        String greeting = "Hello from ClientComponent = " + clientComponent.getGreeting();
        return greeting;
    }
}
