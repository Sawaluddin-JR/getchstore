package com.thymeleaf.getchstore.models;

public class Laptob {
    private String id;
    private String merk;
    private String tipe;
    private String harga;

    public Laptob() {
    }

    public Laptob(String id, String merk, String tipe, String harga) {
        this.id = id;
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMerk() {
        return merk;
    }

    public void setMetk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
