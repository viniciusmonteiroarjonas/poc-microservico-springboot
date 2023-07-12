package br.com.visa.controller;

import br.com.visa.dto.request.CampanhaRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/campanhas")
public class CampanhaController {

    @PostMapping()
    public ResponseEntity<Object> cadastroCampanha(@Valid @RequestBody CampanhaRequestDto requestDto) {
        return ResponseEntity.ok("test");
    }

}
