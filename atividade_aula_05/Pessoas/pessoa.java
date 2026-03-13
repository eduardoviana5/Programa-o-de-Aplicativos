public class pessoa{

    private String nome;
    private int idade;


    //construtor
    public pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //metodos
    public void exibirDados(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade + " anos");
    }

}
