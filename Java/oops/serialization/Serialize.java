package com.anu.learning.oops.serialization;

import java.io.Serializable;

public class Serialize implements Serializable {
    int id;
    String name;

    public Serialize(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
