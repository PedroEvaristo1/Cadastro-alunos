import armazenagem.*;
//import armazenagem.ED_ListaLigada.*;
//import armazenagem.ED_ListaDuplamenteLigada.*;
import armazenagem.ED_ListaDuplamenteLigadaCircular.*;
/**
 * Escreva a descrição da classe CadastroAluno aqui.
 * 
 * @author Pedro Evaristo de Oliveira
 * @version 16/05/2024
 */

public class Cadastro implements ICadastro {
    // Armazenador
    public IArmazenador armazen;

    public Cadastro(){
       //this.armazen = new VetDin(); 
       //this.armazen = new ArrLista();
       //this.armazen = new ListaLigada();
       this.armazen = new ListaDuplaLigadaCircular();
  
    }

    public boolean estaVazia(){
        return (this.armazen.vazia());   
    }

    public void inserir(Aluno a){
        this.armazen.inserir(a);
        //return true;
    }

    public boolean remover(String ra){
        boolean ret = false;
        long indice = buscar(ra);
        if (this.armazen.remover(indice) != null){
            ret = true;
        } 
        return ret;
    }

    private long buscar(String ra) {
        long indice = -1;
        // Object vet[] = ((ArrLista)this.armazen).getVetor();
        // //Object vet[] = ((VetDin)this.armazen).getVetor();
        // if(vet != null){
            // for (int i = 0; i < vet.length; i++){
                // Aluno a = (Aluno) vet[i];
                // if (a.getRa().equals(ra)){
                    // indice = i;
                    // break;
                // }
            // } 
        // }
        
        IListaDuplamenteLigadaCircular lst = ((ListaDuplaLigadaCircular)this.armazen).getLst();
        if(lst != null){
            No temp = lst.getInicio();
            
            while (temp != null) {
                Aluno a = (Aluno)temp.getConteudo();
                if (a.getRa().equals(ra) ) {
                    indice = temp.getId();
                    break;
                }
                temp = temp.getProximo();
            }
        }
        
        return indice;
    }

    public void mostrar(){
        System.out.println(armazen);
    }

}
