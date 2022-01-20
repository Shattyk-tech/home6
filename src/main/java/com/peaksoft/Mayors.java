package com.peaksoft;

public class Mayors {
    private int id;
    private String name;
    private String last_name;
    private String adress;
    private String nation;

    public Mayors(int id, String name, String last_name, String adress, String nation) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.adress = adress;
        this.nation = nation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Mayors" +
                "id " + id +
                ", name '" + name + '\'' +
                ", last_name '" + last_name + '\'' +
                ", adress '" + adress + '\'' +
                ", nation '" + nation + '\'' +
                '}';
    }
}