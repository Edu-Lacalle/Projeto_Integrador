package com.eFAS.ecommerce.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eFAS.ecommerce.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	public Optional<Usuario> findByEmail(String email);
}
