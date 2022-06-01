package com.letscode.usuarioecommerce.repository;

import com.letscode.usuarioecommerce.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}
