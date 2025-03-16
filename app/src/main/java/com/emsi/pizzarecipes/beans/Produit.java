package com.emsi.pizzarecipes.beans;

public class Produit {
    private int id;
    private String nom;
    private int nbrIngredients;
    private String duree;
    private int photo;
    private String description;
    private String preparation;
    private String detaisIngred;
    private int comp;

    public Produit() {
    }

    public Produit(String nom, int nbrIngredients, int photo, String duree, String detaisIngred, String description, String preparation) {
        this.id = ++comp;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.duree = duree;
        this.photo = photo;
        this.detaisIngred = detaisIngred;
        this.description = description;
        this.preparation = preparation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public String getDetaisIngred() {
        return detaisIngred;
    }

    public void setDetaisIngred(String detaisIngred) {
        this.detaisIngred = detaisIngred;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", duree=" + duree +
                ", photo='" + photo + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                ", detaisIngred='" + detaisIngred + '\'' +
                '}';
    }
}
