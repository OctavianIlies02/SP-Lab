package com.example.designpatternslab2023.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.designpatternslab2023.Difexamples.ClientComponent;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class HelloController {

    private final ClientComponent clientComponent;
    private final ClientComponent clientComponent2;

    public String hello() {
        String helloMessage = "Hello from ClientComponent = %s\n%s".formatted(clientComponent, clientComponent2);
        return helloMessage;
    }
}
