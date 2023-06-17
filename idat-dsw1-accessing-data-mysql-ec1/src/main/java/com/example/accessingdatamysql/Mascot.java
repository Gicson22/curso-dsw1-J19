package com.example.accessingdatamysql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mascot {
@Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String name;

  private String race;

  private String propietario;

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getRace() {
    return race;
}

public void setRace(String race) {
    this.race = race;
}

public String getPropietario() {
    return propietario;
}

public void setPropietario(String propietario) {
    this.propietario = propietario;
}

  

  
}
