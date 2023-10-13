package com.eventosweb.repository;

import com.eventosweb.model.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento,String> {
}
