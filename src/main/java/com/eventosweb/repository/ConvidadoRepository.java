package com.eventosweb.repository;

import com.eventosweb.models.Convidado;
import com.eventosweb.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
	Iterable<Convidado> findByEvento(Evento evento);

	Convidado findByRg(String rg);
}
