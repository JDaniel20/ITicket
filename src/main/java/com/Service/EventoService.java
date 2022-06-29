
package com.Service;

import com.Entity.Evento;
import com.Repository.EventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService implements IEventoService{
    
    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public List<Evento> getAllEvento() {
       return (List<Evento>) eventoRepository.findAll();
    }

    @Override
    public Evento getEventoById(long id) {
        return eventoRepository.findOne(id);
    }

    @Override
    public void saveEvento(Evento evento) {
        eventoRepository.save(evento);
    }

    @Override
    public void delete(long id) {
        eventoRepository.delete(id);
    }
    
}
