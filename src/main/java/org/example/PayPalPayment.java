public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("paga con paypal");
    }

    @Override
    public void sicurezza() {
        System.out.println("pay pal è la migliore in sicurezza");
    }
}
