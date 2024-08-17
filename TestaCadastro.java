import entrada.*;
import elementos.*;
/**
 * Escreva a descrição da classe Aplicacao aqui.
 * 
 * @author Pedro Evaristo de Oliveira 
 * @version 16/05/2024
 */
public class TestaCadastro
{
    public static void main(String args[]){
        ICadastro cadAluno = new Cadastro();

        //IEntrada ent = new EntradaGui();
        //String nome = ent.lerNome();

        Disciplinas discs = new Disciplinas();
        Disciplina d1 = new Disciplina ("Lab Est Dinamicas", "LED", 8.9f);
        Disciplina d2 = new Disciplina ("Computacao Grafica e Processamento de Imagens", 
                "CGPI", 5.6f);
        discs.inserir(d1);                 
        discs.inserir(d2);  

        Aluno a1 = new Aluno("Ze1", 21, "aa1", "dd1", 1, discs);
        Aluno a2 = new Aluno("Ze2", 22, "aa2", "dd2", 2, discs);
        Aluno a3 = new Aluno("Ze3", 23, "aa3", "dd3", 3, discs);
        Aluno a4 = new Aluno("Ze4", 24, "aa4", "dd4", 4, discs);
        Aluno a5 = new Aluno("Ze5", 25, "aa5", "dd5", 5, discs);
        cadAluno.inserir(a1);
        cadAluno.inserir(a2);
        cadAluno.inserir(a3);
        cadAluno.inserir(a4);
        cadAluno.inserir(a5);

        cadAluno.mostrar();

        cadAluno.remover("dd2");

        System.out.println("(removido dd2): ");
        cadAluno.mostrar();

        Aluno a6 = new Aluno("Ze6", 26, "aa6", "dd6", 6, discs);
        Aluno a7 = new Aluno("Ze7", 27, "aa7", "dd7", 7, discs);
        cadAluno.inserir(a6);
        cadAluno.inserir(a7);
        System.out.println("(inserido dd6, dd7): ");
        cadAluno.mostrar();
        cadAluno.remover("dd3");
        cadAluno.remover("dd5");
        System.out.println("(removido dd3, dd5): ");
        cadAluno.mostrar();
        cadAluno.remover("dd1");
        cadAluno.remover("dd4");
        System.out.println("(removido dd1, dd4): ");
        if (!cadAluno.estaVazia()){
            cadAluno.mostrar();
        } else {
            System.out.println("\nLista Vazia");
            cadAluno.mostrar();
        }
        cadAluno.remover("dd6");
        cadAluno.remover("dd7");
        System.out.println("(removido dd6, dd7): ");
        if (!cadAluno.estaVazia()){
            cadAluno.mostrar();
        } else {
            System.out.println("\nLista Vazia");
            cadAluno.mostrar();
        }
    }


}
