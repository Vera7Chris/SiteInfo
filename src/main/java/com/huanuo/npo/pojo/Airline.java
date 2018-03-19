package com.huanuo.npo.pojo;

import javax.persistence.*;

@Entity
@Table(name = "t_airline")
public class Airline {
    @EmbeddedId
    private AirlinePK pk;
    private String name;
    public Airline() {

    }

    public Airline(AirlinePK pk, String name) {
        this.pk = pk;
        this.name = name;
    }

    public Airline(String startCity, String endCity, String name) {
        pk = new AirlinePK(startCity, endCity);
        this.name = name;
    }

    public AirlinePK getPk() {
        return pk;
    }

    public void setPk(AirlinePK pk) {
        this.pk = pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airline [pk=" + pk + ", name=" + name + "]";
    }

}