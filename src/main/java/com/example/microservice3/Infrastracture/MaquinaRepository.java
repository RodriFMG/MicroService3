package com.example.microservice3.Infrastracture;
import com.example.microservice3.Domain.Maquina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaquinaRepository extends JpaRepository<Maquina,Long> {
}

