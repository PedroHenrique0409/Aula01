package com.example.demo.Service;

import com.example.demo.Entity.Carro;
import com.example.demo.Entity.UsuarioAula;
import com.example.demo.Repository.CarroRepository;
import com.example.demo.Repository.RepositoryAula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class CarroService {
    @Autowired
    private CarroRepository carroRepository;

    public Carro save(Carro carro) {
        return carroRepository.save(carro);
    }
}