package com.Myproject.Entities;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students {
    @Id
    @JsonProperty("Student ID")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Father Name")
    private String fathername;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("City")
    private String city;
    @JsonProperty("Class Name")
    private String clas;

    public static void setid(int id) {
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

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public Students(int id, String name, String fathername, String email, String city, String clas) {
        this.id = id;
        this.name = name;
        this.fathername = fathername;
        this.email = email;
        this.city = city;
        this.clas = clas;
    }

    public Students() {
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fathername='" + fathername + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", clas='" + clas + '\'' +
                '}';
    }
}
