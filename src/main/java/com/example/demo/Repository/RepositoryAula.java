package com.example.demo.Repository;

import com.example.demo.Entity.UsuarioAula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryAula extends JpaRepository<UsuarioAula, Long> {
}
