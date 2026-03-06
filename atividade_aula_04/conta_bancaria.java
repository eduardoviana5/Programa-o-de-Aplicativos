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

            int valorAux = (int) valor;

            int n100 = valorAux / 100;
            valorAux = valorAux % 100;
            
            int n50 = valorAux / 50;
            valorAux = valorAux % 50;
            
            int n20 = valorAux / 20;
            valorAux = valorAux % 20;

            int n10 = valorAux / 10; 
            valorAux = valorAux % 10;
            
            int n5 = valorAux / 5;
            valorAux = valorAux % 5;

            int n2 = valorAux / 2;
            valorAux = valorAux / 2;
            
            int n1 = valorAux; 

            System.out.println("Cédulas: " + n100 + " de 100, " + n50 + " de 50, " + n5 + " de 5, " + n1 + " de 1.");
            }
        }   



        public double getSaldo(){
            return this.saldo;
        }

    }
