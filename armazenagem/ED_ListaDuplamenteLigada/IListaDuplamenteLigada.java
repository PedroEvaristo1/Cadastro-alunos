package armazenagem.ED_ListaDuplamenteLigada;
/**
 * Contem assinaturas dos metodos da TAD Lista Duplamente Ligada
 * 
 * @author Pedro Evaristo de Oliveira
 * @version 16/05/2024
 */
public interface IListaDuplamenteLigada{
    public boolean estaVazia(); 
    
    public void inserirInicio(Object novo); 

    public void inserirFim(Object novo);
    
    public boolean inserirApos(long chave, Object novo);

    public Object removerInicio();

    public Object removerFim();
    
    public Object remover(long chave);
    
    public No getInicio();

    public No getFim();
}
