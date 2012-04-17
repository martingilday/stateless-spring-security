package org.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.Writer;

@Controller
@RequestMapping("/secure")
public class SecureController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/")
    public void hello(Model model, Writer writer) throws IOException {
        log.info("ACCESS: root");
        writer.write("Hello, this is SECURE!");
    }

    @RequestMapping("/{id}")
    public void helloParam(@PathVariable int id, Model model, Writer writer) throws IOException {
        log.info("ACCESS: secure " + id);
        writer.write("Hello, this is SECURE with ID " + id);
    }

}
