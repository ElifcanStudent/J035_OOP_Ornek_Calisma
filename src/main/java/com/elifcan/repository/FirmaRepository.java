package com.elifcan.repository;

import com.elifcan.entity.Firma;

import java.util.UUID;

public class FirmaRepository implements Repository<Firma> {
    public void save(Firma entity) {

    }

    public void delete(Firma entity) {

    }

    public void update(Firma entity) {

    }

    public Firma[] findAll() {
        return new Firma[0];
    }

    public Firma findById(UUID uuid) {
        return null;
    }

    public boolean existById(UUID uuid) {
        return false;
    }

    public int count() {
        return 0;
    }
}
