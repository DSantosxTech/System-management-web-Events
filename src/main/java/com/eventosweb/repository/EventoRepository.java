package com.eventosweb.repository;

import com.eventosweb.model.Evento;
import org.springframework.data.repository.CrudRepository;

// Interface que estende CrudRepository para operações de CRUD relacionadas à entidade Evento
public interface EventoRepository extends CrudRepository<Evento, String> {
    // Esta interface fornece métodos padrão, como salvar, buscar, atualizar e excluir eventos.
}
