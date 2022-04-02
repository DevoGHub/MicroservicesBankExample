package com.devus.cards.controller;

import java.util.List;

import com.devus.cards.model.Cards;
import com.devus.cards.model.Customer;
import com.devus.cards.repository.CardsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @Autowired
    private CardsRepository cardsRepository;

    @PostMapping("/myCards")
    public List<Cards> getCardsDetails(@RequestBody Customer customer){
        List<Cards> cards = cardsRepository.findByCustomerId(customer.getCustomerId());

        return cards;
    }
}
