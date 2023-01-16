package com.atexo.cardgame.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
 public class Card {

    @Getter
    @Setter
    private CardColor cardColor;
    @Getter
    @Setter
    private CardValue cardValue;

    @Override
   public boolean equals(Object o){
        if (o == this)
            return true;
        if (!(o instanceof Card))
            return false;
        Card other = (Card) o;
        boolean valueEquals = (this.cardValue == null && other.cardValue == null)
                || (this.cardValue != null && this.cardValue.equals(other.cardValue));
        boolean colorEquals = (this.cardColor == null && other.cardColor == null)
                || (this.cardColor != null && this.cardColor.equals(other.cardColor));
        return valueEquals && colorEquals;

    }


}
