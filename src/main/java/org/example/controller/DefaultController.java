package org.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.Writer;

@Controller
@RequestMapping("/")
public class DefaultController {

    private Logger log = LoggerFactory.getLogger(getClass());
    
    @RequestMapping("/login.html")
    public String login() {

        return "login";
    }
    
    @RequestMapping("/")
    public void hello(Model model, Writer writer) throws IOException {
        log.info("ACCESS: root");
        writer.write("Hello, this is public!");
    }

}
