public class main_conta_bancaria {
    public static void main(String[] args) {
    conta_bancaria conta = new conta_bancaria("12345", "Eduardo", 1000);
    
    System.out.println(conta.getSaldo());
    conta.depositar(500);
    System.out.println(conta.getSaldo());

    conta.sacar(256);

    System.out.println("Saldo Atual: "+conta.getSaldo());
    }
}
