package com.caiotayota.springbootconfig.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    
    @Value("${app.message}")
    private String appMessage;
    
    @Value("${ENV_DB_URL:NONE}") // command line: export ENV_DB_URL={new variable};
    private String dbEnvironmentVariable;
    
    @GetMapping("/")
    public String getAppMessage() {
        return appMessage;
    }
    @GetMapping("/envVariable")
    public String getDbEnvironmentVariable() {
        return "The following environment variable was given: " + dbEnvironmentVariable;
    }
}
