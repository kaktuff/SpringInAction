package com.springinaction.springidol;

public class City {
    private String name;
    private String state;
    private String population;

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getPopulation() {
        return population;
    }

    public City() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    @Override
    public String toString(){
        return "name - " + name +
                ", state - " + state +
                ", population - " + population;
    }
}
