package com.javanauta.aprendendo_spring.Infrastructure.Repository;

import com.javanauta.aprendendo_spring.Infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
