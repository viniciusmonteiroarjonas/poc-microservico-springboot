package br.com.visa.dto.request;

import br.com.visa.dto.response.ClienteResponseDto;
import br.com.visa.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequestDto {

    @NotBlank(message = "Campo cpf não pode ser vazio.")
    private String cpf;

    @NotBlank(message = "Campo nome não pode ser vazio.")
    private String nome;

    @NotBlank(message = "Campo email não pode ser vazio.")
    @Email(message = "Informe um email válido.")
    private String email;

    public static ClienteResponseDto convertToDto(Cliente cliente) {
        return new ClienteResponseDto(cliente.getCpf(), cliente.getEmail(), cliente.getNome());
    }
}
