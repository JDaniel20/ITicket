package com.Service;

import com.Entity.Evento;
import java.util.List;

public interface IEventoService {

    public List<Evento> getAllEvento();

    public Evento getEventoById(long id);

    public void saveEvento(Evento evento);

    public void delete(long id);
}
