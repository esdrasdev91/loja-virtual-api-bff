package com.esdrasdev.loja_virtual_bff.api.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponseDTO {

    private Long id;

    private String nome;

    private String email;

    private String documento;

    private EnderecoResponseDTO endereco;

}
