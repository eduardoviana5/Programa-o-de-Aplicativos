public class main {
    
    public static void main(String[] args){
        carro c1 =  new carro ("BMW", 2025, 2);

        moto m1 = new moto ("Suzuki", 2025, 700);

        System.out.println("--- INFORMAÇÕES DO CARRO ---");
        c1.exibirInformacoes();

        System.out.println("--- INFORMAÇÕES DA MOTO ---");
        m1.exibirInformacoes();
    }
}
