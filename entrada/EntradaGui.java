package entrada;
import javax.swing.JOptionPane;

/**
 * Escreva a descrição da classe EntradaGui aqui.
 * 
 * @author Pedro Evaristo de Oliveira
 * @version 16/05/2024
 */
public class EntradaGui implements IEntrada
{
    public void lerDados(){
        
        
    }
    
    public String lerNome(){
        String nome = JOptionPane.showInputDialog("Forneca o nome: ");
        return nome;
    }
}
