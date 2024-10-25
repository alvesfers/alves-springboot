package com.example.demo.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Criar um novo usuário com valores padrão
    public Usuario criarUsuario(Usuario usuario) {
        usuario.setIdUsuario(UUID.randomUUID().toString());
        usuario.setSenhaUsuario(passwordEncoder.encode(usuario.getSenhaUsuario()));
        
        if (usuario.getTaskUsuario() == 0) {
            usuario.setTaskUsuario(0); // Valor padrão se não for fornecido
        }
        
        return usuarioRepository.save(usuario);
    }

    // Listar todos os usuários
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    // Buscar usuário por email
    public Optional<Usuario> buscarPorEmail(String email) {
        return usuarioRepository.findByEmailUsuario(email);
    }

    // Atualizar usuário
    public Usuario atualizarUsuario(String id, Usuario usuarioAtualizado) {
        usuarioAtualizado.setIdUsuario(id);
        return usuarioRepository.save(usuarioAtualizado);
    }

    // Excluir usuário
    public void deletarUsuario(String id) {
        usuarioRepository.deleteById(id);
    }

    // Autenticar usuário por email e senha
    public boolean autenticar(String email, String senha) {
        Optional<Usuario> usuario = usuarioRepository.findByEmailUsuario(email);
        return usuario.isPresent() && passwordEncoder.matches(senha, usuario.get().getSenhaUsuario());
    }
}