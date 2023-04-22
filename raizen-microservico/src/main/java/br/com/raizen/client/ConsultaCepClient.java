package br.com.raizen.client;

import br.com.raizen.domain.dto.ResponseData;
import br.com.raizen.domain.dto.cep.ConsultaCepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(
        url = "${servico.consulta.viacep.url}",
        name = "ConsultaViaCEP"
)
public interface ConsultaCepClient {

    @RequestMapping(value = "${servico.consulta.viacep.path}", headers = {"Content-Type: application/json"})
    ResponseEntity<ConsultaCepResponse> consultaCep(@PathVariable String cep);
}
