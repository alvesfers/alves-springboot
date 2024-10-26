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
            usuario.setTaskUsuario(0);
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
        Optional<Usuario> usuarioExistente = usuarioRepository.findById(id);

        if (usuarioExistente.isPresent()) {
            Usuario usuario = usuarioExistente.get();
            usuario.setNomeUsuario(usuarioAtualizado.getNomeUsuario());
            usuario.setEmailUsuario(usuarioAtualizado.getEmailUsuario());
            usuario.setNumEnderecoUsuario(usuarioAtualizado.getNumEnderecoUsuario());
            usuario.setComplementoUsuario(usuarioAtualizado.getComplementoUsuario());
            usuario.setCepUsuario(usuarioAtualizado.getCepUsuario());
            usuario.setNivelUsuario(usuarioAtualizado.getNivelUsuario());
            usuario.setUsuarioAtivo(usuarioAtualizado.getUsuarioAtivo());

            if (usuarioAtualizado.getSenhaUsuario() != null && !usuarioAtualizado.getSenhaUsuario().isEmpty()) {
                usuario.setSenhaUsuario(passwordEncoder.encode(usuarioAtualizado.getSenhaUsuario()));
            }

            return usuarioRepository.save(usuario);
        } else {
            throw new RuntimeException("Usuário não encontrado.");
        }
    }

    // Excluir usuário
    public void deletarUsuario(String id) {
        usuarioRepository.deleteById(id);
    }

    // Autenticar usuário por email e senha
    public boolean autenticar(String email, String senha) {
        Optional<Usuario> usuario = usuarioRepository.findByEmailUsuario(email);
    
        if (usuario.isPresent()) {
            boolean senhaValida = passwordEncoder.matches(senha, usuario.get().getSenhaUsuario());
            System.out.println("Usuário encontrado: " + usuario.get().getEmailUsuario());
            System.out.println("Senha válida: " + senhaValida);
            return senhaValida;
        }
    
        System.out.println("Usuário não encontrado.");
        return false;
    }
}