public class Main {
    
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", "2020", 2);
        c1.exibirInformacoes();
        System.out.println("Portas: " + c1.getPortas());

        System.out.println();

        Moto m1 = new Moto("Honda", "2022", 200);
        m1.exibirInformacoes();
        System.out.println("Cilindradas: " + m1.getCilindradas());
    }
}
