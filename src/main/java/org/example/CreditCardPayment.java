public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("paga con carta di credito");
    }

    @Override
    public void sicurezza() {
        System.out.println("è meno sicura di paypal e di satispay ma è comunque buona");
    }
}
