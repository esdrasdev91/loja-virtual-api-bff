package com.esdrasdev.loja_virtual_bff.business;

import com.esdrasdev.loja_virtual_bff.api.request.UsuarioRequestDTO;
import com.esdrasdev.loja_virtual_bff.api.response.UsuarioResponseDTO;
import com.esdrasdev.loja_virtual_bff.infrastructure.client.usuarioclient.UsuarioClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioClient usuarioClient;

    public UsuarioResponseDTO cadastrarUsuario(UsuarioRequestDTO usuarioRequestDTO) {
        return usuarioClient.gravaDadosUsuario(usuarioRequestDTO);
    }

    public UsuarioResponseDTO buscaUsuarioPorEmail(String email) {
        return usuarioClient.buscaUsuarioPorEmail(email);
    }

    public void deletaUsuarioPorEmail(String email) {
        usuarioClient.deletaDadosUsuario(email);
    }

}
