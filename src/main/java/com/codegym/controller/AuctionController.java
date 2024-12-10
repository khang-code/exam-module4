package com.codegym.controller;

import com.codegym.model.Item;
import com.codegym.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AuctionController {

    private final ItemService itemService;

    public AuctionController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/")
    public String homePage(Model model) {
        List<Item> items = itemService.getAllItems();
        model.addAttribute("items", items);
        return "auction";
    }
}
