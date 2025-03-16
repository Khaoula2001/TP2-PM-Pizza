package com.emsi.pizzarecipes.service;

import com.emsi.pizzarecipes.beans.Produit;
import com.emsi.pizzarecipes.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {
    private List <Produit> fruits;
    private static ProduitService instance;

    private ProduitService() {
        this.fruits = new ArrayList<>();
    }

    public static ProduitService getInstance() {
        if(instance == null)
            instance =  new ProduitService();
        return instance;
    }

    @Override
    public boolean create(Produit o) {
        return fruits.add(o);
    }

    @Override
    public boolean update(Produit o) {
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return fruits.remove(o);
    }

    @Override
    public Produit findById(int id) {
        for(Produit f : fruits){
            if(f.getId() == id)
                return f;
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return fruits;
    }
}
