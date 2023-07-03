package sprint06.string;

public class CardNumberMasker {
    public String maskCardNumber(String cardNumber) {
     	 // реализуйте вашу версию метода здесь
        return cardNumber.substring(0,4)+" **** **** "+cardNumber.substring(cardNumber.length() - 4);
    }

    public static void main(String[] args) {
        CardNumberMasker masker = new CardNumberMasker();
        System.out.println(masker.maskCardNumber("1234567890123456"));
    }
}
