package br.com.visa.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CampanhaRequestDto {

    @NotBlank(message = "Informe um número de cpf.")
    private String cpf;
}
