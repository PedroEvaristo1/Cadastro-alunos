
/**
 * Escreva a descrição da interface ICadastro aqui.
 * 
 * @author Pedro Evaristo de Oliveira
 * @version 16/05/2024
 */

public interface ICadastro
{
    public void inserir(Aluno a);

    public boolean remover(String ra);
    
    public void mostrar();
    
    public boolean estaVazia();
}
