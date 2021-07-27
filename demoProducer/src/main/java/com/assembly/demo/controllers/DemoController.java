package com.assembly.demo.controllers;

import com.assembly.demo.model.Message;
import com.assembly.demo.services.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private ProducerService service;

    @GetMapping("/{msg}")
    public void sendMessage(@PathVariable String msg) {
        var message = new Message(msg);
        service.sendMessage(message);
    }

}
