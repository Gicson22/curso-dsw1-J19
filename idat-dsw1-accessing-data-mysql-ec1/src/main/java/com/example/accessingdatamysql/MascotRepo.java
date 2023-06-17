package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

public interface MascotRepo extends CrudRepository<Mascot, Integer>{
    
}
