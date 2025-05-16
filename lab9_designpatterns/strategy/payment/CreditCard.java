package lab9_designpatterns.strategy.payment;

public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cardVerificationValue;

    CreditCard(String number, String date, String cardVerificationValue) {
        this.amount = 100000;
        this.number = number;
        this.date = date;
        this.cardVerificationValue = cardVerificationValue;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String getNumber() {
        return number;
    }
}
