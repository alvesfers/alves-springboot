package com.example.demo.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Registrar um novo usuário
    @PostMapping("/registrar")
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.criarUsuario(usuario);
    }

    // Login de usuário
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario usuario) {
        boolean autenticado = usuarioService.autenticar(usuario.getEmailUsuario(), usuario.getSenhaUsuario());
    
        if (autenticado) {
            return ResponseEntity.ok("Login bem-sucedido!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciais inválidas!");
        }
    }

    // Buscar um usuário pelo email
    @GetMapping("/{email}")
    public Optional<Usuario> buscarPorEmail(@PathVariable String email) {
        return usuarioService.buscarPorEmail(email);
    }

    // Listar todos os usuários
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    // Atualizar um usuário existente
    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable String id, @RequestBody Usuario usuarioAtualizado) {
        return usuarioService.atualizarUsuario(id, usuarioAtualizado);
    }

    // Excluir um usuário
    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable String id) {
        usuarioService.deletarUsuario(id);
    }
}