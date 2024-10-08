package com.example.demo.Controller;

import com.example.demo.Entity.UsuarioAula;
import com.example.demo.Service.ServiceAula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class ControllerAula {
    @Autowired
    private ServiceAula serviceAula;

    @PostMapping("/save" +
            "")
    public ResponseEntity<UsuarioAula> salvar(@RequestBody UsuarioAula usuarioAula){
        try {
            return new ResponseEntity<>(serviceAula.save(usuarioAula), HttpStatus.CREATED);

        } catch (Exception e ){
            throw new RuntimeException(" Erro ao criar usuario");
        }
    }



}
