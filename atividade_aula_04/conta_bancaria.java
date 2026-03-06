//classe
public class conta_bancaria {
    
    //atributos
    private String numeroConta;
    private String titular;
    private double saldo;


    //construtores
    public conta_bancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //metodos
    public void depositar (double valor){
    if(valor > 0){
        this.saldo += valor;
        System.out.println("Você depositou R$ "+ valor);
        return;
        }
        else{
            System.out.println("Você não pode depositar valor igual ou inferior a zero");
        }
    }

    public void sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Erro: Saldo insuficiente!");
            return;
        }
        else{
            this.saldo -= valor;
            
            
            System.out.println("Saque no valor de R$ "+ valor + " Realizado com sucesso!");
        }
    }

    




    public double getSaldo(){
        return this.saldo;
    }

}
