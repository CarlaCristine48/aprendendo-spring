package com.javanauta.aprendendo_spring.Infrastructure.Repository;

import com.javanauta.aprendendo_spring.Infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
