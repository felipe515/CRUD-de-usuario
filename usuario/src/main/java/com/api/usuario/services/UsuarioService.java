/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.usuario.services;

import com.api.usuario.model.UsuarioModel;
import com.api.usuario.repositores.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author felip
 */
@Service
public class UsuarioService {
    
    final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    
    @Transactional
    public UsuarioModel save(UsuarioModel usuarioModel){
        return usuarioRepository.save(usuarioModel);
    }
    
    public List<UsuarioModel> findAll(){
        return usuarioRepository.findAll();
    }
    
    public Optional<UsuarioModel> findById(UUID id){
        return usuarioRepository.findById(id);
    }
    
    public void delete(UsuarioModel usuarioModel){
        usuarioRepository.delete(usuarioModel);
    }    
}
