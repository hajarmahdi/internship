package com.atexo.cardgame;

import com.atexo.cardgame.model.Card;
import com.atexo.cardgame.service.GenerateRandomCardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {
    @Autowired
    private GenerateRandomCardsService generateRandomCardService;

    @RequestMapping("/cards")
    public List<Card> retrieveRundomCards(){
        return generateRandomCardService.generateRandomCards(10);

    }

}
