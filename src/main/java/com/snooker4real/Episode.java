package com.snooker4real;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Episode extends PanacheEntity {

    public String title;
    public String description;

}
