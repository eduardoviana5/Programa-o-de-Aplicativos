public class moto extends veiculo{
    
    int cilindradas;

    //construtores
    public moto(String marca, int ano, int cilindradas){
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    //metodos
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println(this.cilindradas + " Cilindradas");
    }

}

