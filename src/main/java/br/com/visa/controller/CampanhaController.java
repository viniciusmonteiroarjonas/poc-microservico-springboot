package br.com.visa.controller;

import br.com.visa.dto.request.CampanhaRequestDto;
import br.com.visa.dto.request.ClienteRequestDto;
import br.com.visa.dto.response.ClienteResponseDto;
import br.com.visa.service.ClienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/campanhas")
public class CampanhaController {

    @Autowired
    ClienteService clienteService;

    Logger logger = LoggerFactory.getLogger(CampanhaController.class);

    @PostMapping()
    public ResponseEntity<Object> cadastroCampanha(@Valid @RequestBody CampanhaRequestDto requestDto) {
        return ResponseEntity.ok("test");
    }

    @PostMapping("/clientes")
    public ResponseEntity<ClienteResponseDto> cadastroCliente(@RequestBody @Valid ClienteRequestDto cliente) {
        return clienteService.save(cliente);
    }

}
