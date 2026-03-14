public class Main {
    
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Eduardo", 20, "Engenheiro");
        System.out.println("\n--- DADOS DO FUNCIONÁRIO ---");
        f1.exibirDados(); 
        System.out.println("Cargo: " + f1.getCargo());

        System.out.println();

        Cliente c1 = new Cliente("Bruno", 18, "bruno@gmail.com");
        System.out.println("--- DADOS DO CLIENTE ---");
        c1.exibirDados();
        System.out.println("E-mail: " + c1.getEmail());
    }
}
