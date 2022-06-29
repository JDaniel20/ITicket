package com.Repository;

import com.Entity.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends CrudRepository<Evento, Long>{

}
