package com.springangulardemo;

import com.springangulardemo.domain.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemRestController {
    static Item rootItem;

    ItemRestController() {
        rootItem = new Item();
        rootItem.setName("root");
        rootItem.setComment("root element");

        List<Item> items = new ArrayList();
        Item tempItem = new Item();
        tempItem.setName("subelement");
        tempItem.setComment("subelement");
        items.add(tempItem);

        rootItem.setSubitems(items);
    }

    @RequestMapping(value = "/rest/item/list", method = RequestMethod.GET)
    @ResponseBody
    public Item list() {
        return rootItem;
    }

    private boolean deleteSubItem(Long id, Item item) {
        if(item.getSubitems() != null)
            for(Item tempItem : item.getSubitems()) {
                if(tempItem.getId().equals(id)) {
                    item.getSubitems().remove(tempItem);
                    return true;
                }
                if(deleteSubItem(id, tempItem))
                    return true;
            }
        return false;
    }

    @RequestMapping(value = "/rest/item/delete", method = RequestMethod.POST)
    public void delete(
            @RequestParam("id") Long id
    ) {
        if(rootItem.getId().equals(id))
            throw new RuntimeException("Can't delete root!");

        if(! deleteSubItem(id, rootItem))
            throw new RuntimeException("Can't find id!");
    }

    private Item findItem(Long id, Item item) {
        if(item.getId().equals(id))
            return item;
        if(item.getSubitems() != null)
            for(Item tempItem : item.getSubitems()) {
                Item foundItem = findItem(id, tempItem);
                if(foundItem != null)
                    return foundItem;
            }
        return null;
    }

    @RequestMapping(value = "/rest/item/edit", method = RequestMethod.POST)
    public void edit(
            @RequestParam("id") Long id,
            @RequestParam("name") String name,
            @RequestParam("comment") String comment
    ) {
            Item item = findItem(id, rootItem);
            if(item == null)
                throw new RuntimeException("Can't find id!");
            item.setName(name);
            item.setComment(comment);
    }

    @RequestMapping(value = "/rest/item/add", method = RequestMethod.POST)
    public void add(
            @RequestParam("id") Long id,
            @RequestParam("name") String name,
            @RequestParam("comment") String comment
    ) {
        Item item = findItem(id, rootItem);
        if(item == null)
            throw new RuntimeException("Can't find id!");
        Item newItem = new Item();
        newItem.setName(name);
        newItem.setComment(comment);
        item.getSubitems().add(newItem);
    }
}
