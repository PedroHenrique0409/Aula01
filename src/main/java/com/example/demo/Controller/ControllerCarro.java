package com.example.demo.Controller;

import com.example.demo.Entity.Carro;
import com.example.demo.Entity.UsuarioAula;
import com.example.demo.Service.CarroService;
import com.example.demo.Service.ServiceAula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class ControllerCarro {
    @Autowired
    private CarroService carroService;

    @PostMapping("/save")
    public ResponseEntity<Carro> salvar(@RequestBody Carro carro){
        try {
            return new ResponseEntity<>(carroService.save(carro), HttpStatus.CREATED);

        } catch (Exception e ){
            throw new RuntimeException(" Erro ao criar carro");
        }
    }



}