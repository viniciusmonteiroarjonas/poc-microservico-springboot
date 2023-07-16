package br.com.visa.service;

import br.com.visa.dto.request.ClienteRequestDto;
import br.com.visa.dto.response.ClienteResponseDto;
import br.com.visa.model.Cliente;
import br.com.visa.repository.ClienteRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ClienteService {

    @Autowired
    ClienteRespository clienteRespository;

    Logger logger = LoggerFactory.getLogger(ClienteService.class);

    @Transactional
    public ResponseEntity<ClienteResponseDto> save(ClienteRequestDto cliente) {
        try{
            Cliente data = clienteRespository.save(new Cliente(cliente.getNome(), cliente.getCpf(), cliente.getEmail()));
            return new ResponseEntity<>(ClienteRequestDto.convertToDto(data), HttpStatus.CREATED);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
