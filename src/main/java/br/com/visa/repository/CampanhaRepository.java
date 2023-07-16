package br.com.visa.repository;

import br.com.visa.model.Campanha;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CampanhaRepository extends JpaRepository<Campanha, UUID> {
    
}
