package com.elifcan.repository;

import com.elifcan.entity.Musteri;

import java.util.UUID;

public class MusteriRepository implements Repository<Musteri>{
    public void save(Musteri entity) {

    }

    public void delete(Musteri entity) {

    }

    public void update(Musteri entity) {

    }

    public Musteri[] findAll() {
        return new Musteri[0];
    }

    public Musteri findById(UUID uuid) {
        return null;
    }

    public boolean existById(UUID uuid) {
        return false;
    }

    public int count() {
        return 0;
    }
}
