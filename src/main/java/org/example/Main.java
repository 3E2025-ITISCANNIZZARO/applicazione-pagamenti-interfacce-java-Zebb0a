public class Main {
    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart(new CreditCardPayment(),new CreditCardPayment());
        ShoppingCart cart2=new ShoppingCart(new PayPalPayment(),new PayPalPayment());
        ShoppingCart cart3=new ShoppingCart(new satispayPayment(),new satispayPayment());

        cart.pay();
        cart2.pay();
        cart3.pay();
        System.out.println();
        cart2.sicurezza();
        cart3.sicurezza();
        cart.sicurezza();

    }
}
