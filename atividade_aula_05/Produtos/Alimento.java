public class Alimento extends Produto{
    
    private String dataValidade;

    public Alimento(String nome, double preco, String dataValidade){
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public void setDataValidade(String dataValidade){
        this.dataValidade = dataValidade;
    }

    public String getDataValidade(){
        return this.dataValidade;
    }
}   
