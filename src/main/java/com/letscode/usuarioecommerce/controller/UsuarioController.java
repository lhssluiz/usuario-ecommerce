package com.letscode.usuarioecommerce.controller;

import com.letscode.usuarioecommerce.domain.Usuario;
import com.letscode.usuarioecommerce.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/usuario")
public class UsuarioController {

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    private final UsuarioRepository usuarioRepository;

    @PostMapping(path= "/adicionar")
    public @ResponseBody String adicionarUsuario(@RequestParam String nome, @RequestParam String email, @RequestParam String apelido){
        Usuario usuario = new Usuario();

        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setApelido(apelido);
        usuarioRepository.save(usuario);
        return "Usuario Criado";
    }

    @GetMapping(path = "/all") public @ResponseBody Iterable<Usuario> getAllUsuario(){
        return usuarioRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Usuario> getUsuario(@PathVariable Integer idUsuario){

        Optional<Usuario> usuario = this.usuarioRepository.findById(idUsuario);

        if(usuario.isPresent() == false){
            return usuario;
        }

        return usuario;
    }

}
