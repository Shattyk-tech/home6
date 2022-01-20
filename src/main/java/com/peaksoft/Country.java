package com.peaksoft;

public class Country {
    private  int id;
    private String name;
    private String population;
    private String nation;

    public Country(int id, String name, String population, String nation) {
        this.id = id;
        this.name = name;
        this.population = population;
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

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population='" + population + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }
}
