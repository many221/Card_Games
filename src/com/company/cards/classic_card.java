package com.company.cards;

public class classic_card extends Card{

    public final String SUIT;

    public classic_card(String CARD_VALUE, String CARD_COLOR, int CARD_NUM, String SUIT) {
        super ( CARD_VALUE, CARD_COLOR, CARD_NUM );
        this.SUIT = SUIT;
    }


}
