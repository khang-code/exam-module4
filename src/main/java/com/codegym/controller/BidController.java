package com.codegym.controller;

import com.codegym.model.Bid;
import com.codegym.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bids")
public class BidController {
    @Autowired
    private BidService bidService;

    @PostMapping
    public Bid placeBid(@RequestBody Bid bid) {
        return bidService.placeBid(bid);
    }
}
