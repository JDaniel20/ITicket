package com.Repository;

import com.Entity.Lugar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LugarRepository extends CrudRepository<Lugar, Long> {

}
