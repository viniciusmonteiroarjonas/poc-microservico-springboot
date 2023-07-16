package br.com.visa.repository;

import br.com.visa.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ClienteRespository extends JpaRepository<Cliente, UUID> {

    List<Cliente> findByCpf(String cpf);
}
