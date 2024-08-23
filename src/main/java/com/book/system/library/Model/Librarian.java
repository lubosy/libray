package com.book.system.library.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Librarian {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String level;

    public Librarian(String id, String name, String level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public Librarian() {
    }


}
