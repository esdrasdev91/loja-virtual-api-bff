package com.esdrasdev.loja_virtual_bff.infrastructure.client.produtosclient;

import com.esdrasdev.loja_virtual_bff.api.response.ProductsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "produtos-api", url = "localhost:8181")
public class ProdutosClient {

    @GetMapping("/produtos/")
    List<ProductsDTO> buscaTodosProdutos();

    @GetMapping("/produtos/{nome}")
    ProductsDTO buscaProdutoPorNome(@PathVariable("nome") String nome);

}
