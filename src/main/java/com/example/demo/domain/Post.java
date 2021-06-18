package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int voto;

    public Post() {
    }

    public Post(String name, int voto) {
        this.name = name;
        this.voto = voto;
    }

    public Post(Long id, String name, int voto) {
        this.id = id;
        this.name = name;
        this.voto = voto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }
}
