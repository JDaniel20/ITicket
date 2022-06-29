package com.Controller;

import com.Entity.Evento;
import com.Entity.Lugar;
import com.Service.IEventoService;
import com.Service.ILugarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PostMapping;

@Controller 
public class EventoController {

    @Autowired
    private IEventoService eventoService;

    @Autowired
    private ILugarService lugarService;

    @GetMapping("/evento")
    public String index(Model model) {
        List<Evento> listaEvento = eventoService.getAllEvento();
        model.addAttribute("titulo", "Tabla Eventos");
        model.addAttribute("eventos", listaEvento);
        return "eventos";
    }

    @GetMapping("/eventoN")
    public String crearEvento(Model model) {
        List<Lugar> listaLugares = lugarService.listLugar();
        model.addAttribute("evento", new Evento());
        model.addAttribute("psises", listaLugares);
        return "crear";
    }

    @PostMapping("/save")
    public String guardarEvento(@ModelAttribute Evento evento) {
        eventoService.saveEvento(evento);
        return "redirect:/evento";
    }

    @GetMapping("/editEvento/{id}")
    public String editarEvento(@PathVariable("id") Long idEvento, Model model) {
        Evento evento = eventoService.getEventoById(idEvento);
        List<Lugar> listaLugares = lugarService.listLugar();
        model.addAttribute("evento", evento);
        model.addAttribute("lugares", listaLugares);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String eliminarEvento(@PathVariable("id") Long idEvento) {
        eventoService.delete(idEvento);
        return "redirect:/evento";
    }
}
