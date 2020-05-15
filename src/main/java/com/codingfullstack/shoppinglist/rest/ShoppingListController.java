package com.codingfullstack.shoppinglist.rest;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ShoppingListController {
    
    @GetMapping
    public Iterable<String> getShoopingList() {
        return Arrays.asList("bread", "butter" , "egg" , "chicken");
    }
}