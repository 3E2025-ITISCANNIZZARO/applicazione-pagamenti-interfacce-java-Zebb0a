public class satispayPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("paga con satispay");
    }

    @Override
    public void sicurezza() {
        System.out.println("satispay ha un livello di sicurezza quasi pari a paypal");
    }
}
