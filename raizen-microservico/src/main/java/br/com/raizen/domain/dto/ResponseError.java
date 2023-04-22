package br.com.raizen.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class ResponseError {

    @NotNull(message="Timestamp cannot be null")
    private LocalDateTime timestamp;

    @NotNull(message="Details cannot be null")
    private String details;

}
