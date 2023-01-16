package com.atexo.cardgame.service.Impl;

import com.atexo.cardgame.model.Card;
import com.atexo.cardgame.model.CardColor;
import com.atexo.cardgame.model.CardValue;
import com.atexo.cardgame.service.GenerateRandomCardsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service("GenerateRandomCardsService")
public class GenerateRandomCardsServiceImpl implements GenerateRandomCardsService {

    private static final CardColor[] CARD_COLORS = CardColor.values();
    private static final CardValue[] CARD_VALUES = CardValue.values();
    private static final Random RANDOM = new Random();

    private Card randomCard;

    public List<Card> generateRandomCards(int numberOfCards){

        List<Card> cards = new ArrayList<>();
        while(cards.size() < numberOfCards){
            randomCard = randomCard();
            if(!cards.stream().filter(card-> card.equals(randomCard))
                    .findAny()
                    .isPresent()){
                cards.add(randomCard);
            }
        }
        return cards;
    }
    /**
     * Genarate a random Object of Card.
     *
     * @return a random Card.
     */
    public Card randomCard(){
        return new Card(randomColor(),randomValue());
    }


    /**
     * Pick a random value of the CardColor enum.
     *
     * @return a random CardColor.
     */
    public CardColor randomColor() {
        return CARD_COLORS[RANDOM.nextInt(CARD_COLORS.length)];
    }

    /**
     * Pick a random value of the CardValue enum.
     *
     * @return a random CardValue.
     */
    public CardValue randomValue() {
        return CARD_VALUES[RANDOM.nextInt(CARD_VALUES.length)];
    }

}
