public class main {
    public static void main (String[] args) {
        carro c = new carro("BMW", 300);

        c.acelerar(100);
        System.out.println("Velocidade: " + c.getVelocidadeAtual());

        c.frear(20);
        System.out.println("Velocidade após frear: " + c.getVelocidadeAtual());

        c.acelerar(250);
        System.out.println("Velocidade no limite: " + c.getVelocidadeAtual());

        c.frear(200); 
    }
}
