package armazenagem.ED_ListaDuplamenteLigadaCircular; 

/**
 * @author Pedro Evaristo de Oliveira
 * @version 16/05/2024
 */
public interface IListaDuplamenteLigadaCircular{
    public boolean estaVazia(); 
    
    public void inserirInicio(Object novo); 

    public void inserirFim(Object novo);
    
    public boolean inserirApos(long chave, Object novo);

    public Object removerInicio();

    public Object removerFim();
    
    public Object remover(long chave);
    
    public String toStringDoFim();
    
    public No getInicio();

    public No getFim();
}
