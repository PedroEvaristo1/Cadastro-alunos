package entrada;
import java.util.Scanner;

/**
 * Escreva a descrição da classe EntradaConsole aqui.
 * 
 * @author Pedro Evaristo de Oliveira
 * @version 16/05/2024
 */

public class EntradaConsole implements IEntrada
{
    Scanner scan = new Scanner( System.in );

    public void lerDados(){ 
    }
    public String lerNome(){ 
        String nome;
        System.out.print("Forneca nome: ");
        nome = scan.next();
        return nome;
    }
}
