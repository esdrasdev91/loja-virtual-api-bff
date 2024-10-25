package com.esdrasdev.loja_virtual_bff.api.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioRequestDTO {

    private String nome;
    private String email;
    private String documento;
    private EnderecoRequestDTO endereco;

}
