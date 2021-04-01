package br.com.julianepires.fullstackweek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.julianepires.fullstackweek.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
