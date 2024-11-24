package com.elifcan.repository;

import com.elifcan.entity.Bakim;

import java.util.UUID;

public class BakimRepository implements Repository <Bakim> {

    public void save(Bakim entity) {

    }

    public void delete(Bakim entity) {

    }

    public void update(Bakim entity) {

    }

    public Bakim[] findAll() {
        return new Bakim[0];
    }

    public Bakim findById(UUID uuid) {
        return null;
    }

    public boolean existById(UUID uuid) {
        return false;
    }

    public int count() {
        return 0;
    }
}
