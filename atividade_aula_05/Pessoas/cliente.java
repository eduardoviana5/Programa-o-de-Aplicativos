public class cliente extends pessoa{

    private String email;
    private String cpf;

    //construtor
    public cliente(String nome, int idade, String email, String cpf){
        super(nome, idade);
        this.email = email;
        this.cpf = cpf;
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("E-mail: "+ this.email);
        System.out.println("CPF: "+ this.cpf);
    }
}
