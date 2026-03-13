public class main{

    public static void main(String[] args){
        funcionario f1 = new funcionario("Eduardo Meneses", 20, "Gestor Operacional");
        
        cliente c1 = new cliente("Bruno Meneses", 22, "bruno@gmail.com", "000.000.000.00");

        System.out.println("--- DADOS DO FUNCIONARIO ---");
        f1.exibirDados();

        System.out.println("--- DADOS DO CLIENTE ---");
        c1.exibirDados();

    }


}
