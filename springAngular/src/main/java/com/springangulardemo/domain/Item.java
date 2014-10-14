package com.springangulardemo.domain;

import java.util.ArrayList;
import java.util.List;

public class Item implements Cloneable {
    static Long currentId = new Long(1);

    private Long id = currentId++;
    private String name;
    private long data = currentId % 10;
    private String comment;
    List<Item> subitems = new ArrayList<Item>();

    @Override
    public Item clone() {
        try {
            return (Item)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
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

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
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
