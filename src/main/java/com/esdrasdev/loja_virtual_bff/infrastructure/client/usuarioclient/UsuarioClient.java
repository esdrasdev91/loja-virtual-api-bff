package com.esdrasdev.loja_virtual_bff.infrastructure.client.usuarioclient;

import com.esdrasdev.loja_virtual_bff.api.request.UsuarioRequestDTO;
import com.esdrasdev.loja_virtual_bff.api.response.UsuarioResponseDTO;
import org.springframework.web.bind.annotation.*;

public class UsuarioClient {

    @PostMapping("/user")
    UsuarioResponseDTO gravaDadosUsuario(@RequestBody UsuarioRequestDTO usuarioRequestDTO);

    @GetMapping("/user")
    UsuarioResponseDTO buscaUsuarioPorEmail(@RequestParam("email") String email);

    @DeleteMapping("/user")
    Void deletaDadosUsuario(@RequestParam("email") String email);

}
