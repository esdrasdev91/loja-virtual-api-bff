package com.esdrasdev.loja_virtual_bff.business;

import com.esdrasdev.loja_virtual_bff.api.response.ProductsDTO;
import com.esdrasdev.loja_virtual_bff.infrastructure.client.produtosclient.ProdutosClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutosService {

    private final ProdutosClient client;

    public List<ProductsDTO> buscaTodosProdutos() {
        return client.buscaTodosProdutos();
    }

    public ProductsDTO buscaProdutosPorNome(String nome) {
        return client.buscaProdutoPorNome(nome);
    }

}
