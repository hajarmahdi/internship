package com.atexo.cardgame.service;

import com.atexo.cardgame.model.Card;
import com.atexo.cardgame.service.Impl.GenerateRandomCardsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class GenerateRandomCardsServiceTest {
    @InjectMocks
    private GenerateRandomCardsServiceImpl generateRandomCardsService;

    private Card card;
    private List<Card> cardList;
    @BeforeEach
    void set(){
        card = generateRandomCardsService.randomCard();
        cardList = generateRandomCardsService.generateRandomCards(10);
    }


    @Test
    public void generateRandomCardTest(){
        System.out.println(card.getCardColor()+" "+ card.getCardValue());
        assertThat(card).isNotNull();
    }
    @Test
    public void generateRandomCards_isNotEmpty(){
        System.out.println(cardList.size());
        for (Card card:cardList) {
            System.out.println(card.getCardColor()+" "+ card.getCardValue());
        }
        assertThat(cardList).isNotNull().isNotEmpty();
        assertEquals(10,cardList.size(),"List size should be 10");
    }

}
