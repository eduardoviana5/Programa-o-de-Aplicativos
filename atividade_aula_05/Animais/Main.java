public class Main {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro("Nelson", 40, "pastor-alemão;");
        c1.mostrarAnimal();
        System.out.println("Raça: " + c1.getRaca());

        System.out.println();

        Gato g1 = new Gato("Talita", 10, "Branco");
        g1.mostrarAnimal();
        System.out.println("Cor: " + g1.getCor());
    }
}
