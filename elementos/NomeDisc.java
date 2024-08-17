package elementos;

/**
 * Escreva a descrição da classe NomeDisc aqui.
 * 
 * @author Pedro Evaristo de Oliveira
 * @version 16/05/2024
 */
public class NomeDisc extends Texto{
    private String nome;
    
    public NomeDisc(String nome){
        super(nome);
        setNome(getTxt());
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

}
