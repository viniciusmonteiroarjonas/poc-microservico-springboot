package br.com.raizen.controller;

import br.com.raizen.domain.dto.ResponseData;
import br.com.raizen.domain.dto.cep.ConsultaCepResponse;
import br.com.raizen.exeption.cep.CepNotFoundExeption;
import br.com.raizen.service.ConsultaCepService;
import feign.FeignException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class ConsultaCepController {

    Logger logger = LoggerFactory.getLogger(ConsultaCepController.class);

    @Autowired
    private ConsultaCepService consultaCepService;

    @GetMapping(name = "ConsultaCep", value = "/consulta/{cep}", produces = "application/json")
    public ResponseEntity<ResponseData<ConsultaCepResponse>> consultaCep(@PathVariable("cep") String cep) {
        logger.info("Iniciando chamada do webservice viaCep, informando o CEP: " + cep);

        try {
            ConsultaCepResponse dadosCep = consultaCepService.consultaCep(cep);

            if(!Objects.isNull(dadosCep) && dadosCep.getCep() != null) {
                return ResponseEntity.ok().body(new ResponseData<>(dadosCep, null));
            } else {
                throw new CepNotFoundExeption(dadosCep.getCep());
            }
        } catch (Exception error) {
            logger.error("Exception -> " + error.getMessage());
            throw new CepNotFoundExeption(cep);
//            throw new RuntimeException(error.getMessage());
        }
    }


}
