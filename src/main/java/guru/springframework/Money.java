package guru.springframework;

public class Money {
    protected int amount;


    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return this.amount == money.amount
                && this.getClass().equals(obj.getClass());   //check of ze beide van het zelfde type zijn.
    }
}
