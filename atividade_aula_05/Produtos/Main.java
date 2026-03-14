public class Main {
    public static void main(String[] args) {

        Eletronico e1 = new Eletronico("Celular", 2499.90, "12 Meses");
        e1.mostrarProduto();
        System.out.println("Garantia: " + e1.getGarantia()); 

        System.out.println();

        Alimento a1 = new Alimento("Ovos", 27.90, "30/03/2026");
        a1.mostrarProduto();
        System.out.println("Validade: " + a1.getDataValidade());
    }
}
