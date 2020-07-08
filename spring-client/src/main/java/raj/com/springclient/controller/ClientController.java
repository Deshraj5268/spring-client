package raj.com.springclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
@PropertySource("application.properties")
public class ClientController {


    @Value("${message}")
    private String message;
    @Value("${language}")
    private String language;

    @GetMapping("/message-test")
    public String getMessage(){
        return message;
    }

    @GetMapping("/language-test")
    public String getLanguage(){
        return language;
    }

}
