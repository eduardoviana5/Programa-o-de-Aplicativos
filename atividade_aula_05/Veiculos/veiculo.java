public class veiculo {
    
    private String marca;
    private int ano;

    //construtor
    public veiculo(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    public void exibirInformacoes(){
        System.out.println("Marca: "+ this.marca);
        System.out.println("Ano: "+ this.ano);
    }
}
