package com.atexo.cardgame.service;

import com.atexo.cardgame.model.Card;

import java.util.List;

public interface GenerateRandomCardsService {
    List<Card> generateRandomCards(int numberOfCards);
    Card randomCard();
}
