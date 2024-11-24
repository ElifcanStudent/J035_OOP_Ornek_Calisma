package com.elifcan.repository;

import com.elifcan.entity.Arac;

import java.util.UUID;

public class AracRepository implements Repository <Arac>{

    public void save(Arac entity) {

    }

    public void delete(Arac entity) {

    }

    public void update(Arac entity) {

    }

    public Arac[] findAll() {
        return new Arac[0];
    }

    public Arac findById(UUID uuid) {
        return null;
    }

    public boolean existById(UUID uuid) {
        return false;
    }

    public int count() {
        return 0;
    }
}
