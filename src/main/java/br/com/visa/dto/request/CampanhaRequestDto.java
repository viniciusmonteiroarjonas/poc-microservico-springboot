package br.com.visa.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CampanhaRequestDto {

    @NotNull(message = "Campo documento é obrigatório.")
    private String document;
}
