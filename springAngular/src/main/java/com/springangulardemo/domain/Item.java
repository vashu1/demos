package com.springangulardemo.domain;

import java.util.ArrayList;
import java.util.List;

public class Item {
    static Long currentId = new Long(1);

    private Long id = currentId++;
    private String name;
    private String comment;
    List<Item> subitems = new ArrayList<Item>();

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Item> getSubitems() {
        return subitems;
    }

    public void setSubitems(List<Item> subitems) {
        this.subitems = subitems;
    }
}
