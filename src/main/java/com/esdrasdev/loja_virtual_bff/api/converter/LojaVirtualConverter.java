package com.esdrasdev.loja_virtual_bff.api.converter;

import com.esdrasdev.loja_virtual_bff.api.request.CartaoRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class LojaVirtualConverter {

    public CartaoRequestDTO paraCartaRequestoDTO(String nome, CompraRequestDTO compraRequestDTO, BigDecimal valor,
                                                 EnderecoResponseDTO enderecoResponseDTO) {

        return CartaoRequestDTO.builder()
                .nome(nome)
                .enderecoRequestDTO(paraEnderecoRequestDTO(enderecoResponseDTO))
                .numeroCartao(compraRequestDTO.getNumeroCartao())
                .ano(compraRequestDTO.getAno())
                .mes(compraRequestDTO.getMes())
                .cvv(compraRequestDTO.getAno())
                .valor(valor)
                .build();

    }

    private EnderecoRequestDTO paraEnderecoRequestDTO(EnderecoResponseDTO enderecoResponseDTO) {
        return EnderecoRequestDTO.builder()
                .bairro(enderecoResponseDTO.getBairro())
                .cep(enderecoResponseDTO.getCep())
                .cidade(enderecoResponseDTO.getCidade())
                .complemento(enderecoResponseDTO.getComplemento())
                .numero(enderecoResponseDTO.getNumero())
                .rua(enderecoResponseDTO.getRua())
                .build();
    }

}
