package br.com.raizen.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseData<T> {

    private T data;
    private Object errors;

    public void addErrorMsgToResponse(String msgError) {
        ResponseError error = new ResponseError()
                .setDetails(msgError)
                .setTimestamp(LocalDateTime.now());
        setErrors(error);
    }
}
