public class ShoppingCart {
    PaymentStrategy modalitàPagamento;
    PaymentStrategy sicurezza;

    ShoppingCart(PaymentStrategy modalitàPagamento,PaymentStrategy sicurezza){
        this.modalitàPagamento=modalitàPagamento;
        this.sicurezza=sicurezza;
    }
    void pay(){
        modalitàPagamento.pay();
    }
    void sicurezza(){
        sicurezza.sicurezza();
    }
}
