public class carro extends veiculo{
    
    private int portas;

    public carro(String marca, int ano, int portas){
        super(marca, ano);
        this.portas = portas;
    }

    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println(this.portas + " Portas") ;
    }
}
