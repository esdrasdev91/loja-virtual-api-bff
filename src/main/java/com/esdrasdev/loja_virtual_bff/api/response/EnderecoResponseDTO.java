package com.esdrasdev.loja_virtual_bff.api.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoResponseDTO {

    private String rua;

    private Long numero;

    private String bairro;

    private String complemento;

    private String cidade;

    private String cep;

}
