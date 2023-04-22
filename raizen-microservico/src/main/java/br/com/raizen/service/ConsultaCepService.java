package br.com.raizen.service;

import br.com.raizen.client.ConsultaCepClient;
import br.com.raizen.domain.dto.ResponseData;
import br.com.raizen.domain.dto.cep.ConsultaCepResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaCepService {

    @Autowired
    private ConsultaCepClient consultaCepClient;

    public ConsultaCepResponse consultaCep(String cep) {
        return consultaCepClient.consultaCep(cep).getBody();
    }

}
