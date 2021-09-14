package cards;

public abstract class Card {

    public final String CARD_VALUE;

    public final String CARD_COLOR;

    public final int CARD_NUM;

    public Card(String CARD_VALUE, String CARD_COLOR, int CARD_NUM) {
        this.CARD_VALUE = CARD_VALUE;
        this.CARD_COLOR = CARD_COLOR;
        this.CARD_NUM = CARD_NUM;
    }
}
