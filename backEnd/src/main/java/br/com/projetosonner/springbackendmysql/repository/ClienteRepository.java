package br.com.projetosonner.springbackendmysql.repository;

import br.com.projetosonner.springbackendmysql.model.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findById(Long id);

    List<Cliente> findByNome(String name);

    List<Cliente> findByCpf(String cpf);


}
