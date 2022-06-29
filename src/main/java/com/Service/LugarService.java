package com.Service;

import com.Entity.Lugar;
import com.Repository.LugarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LugarService implements ILugarService {

    @Autowired
    private LugarRepository lugarRepository;

    @Override
    public List<Lugar> listLugar() {
        return (List<Lugar>) lugarRepository.findAll();
    }

}
