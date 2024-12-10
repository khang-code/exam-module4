package com.codegym.service;

import com.codegym.model.Bid;
import com.codegym.repository.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidService {
    @Autowired
    private BidRepository bidRepository;

    public Bid placeBid(Bid bid) {
        return bidRepository.save(bid);
    }
}

