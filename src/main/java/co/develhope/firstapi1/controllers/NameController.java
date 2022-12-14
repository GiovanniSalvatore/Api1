package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/nome")
public class NameController {
    @GetMapping(value = "/{nome}")
    public String getName(@PathVariable(required = true)String nome){
        return nome;
    }

    @PostMapping(value = "/{nome}")
    public String postName(@PathVariable(required = true)String nome){
        return new StringBuilder(nome).reverse().toString();
    }
}