public class funcionario extends pessoa{

    private String cargo;

    //construtor
    public funcionario(String nome, int idade, String cargo){
        super(nome, idade);
        this.cargo = cargo;
    }

    //metodos
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Cargo: " + this.cargo);
    }

}
