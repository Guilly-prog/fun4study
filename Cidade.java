
package testefun4study;

import java.util.Scanner;

/**
 * @author Guilherme Lopes de Almeida
 */
public class Cidade {
    private int code;
    private String description;
    private String uf;
    private int studentQuantity;
    Scanner scan = new Scanner(System.in);

    //Constructor
    public Cidade(int code, String description, String uf) {
        this.code = code;
        this.description = description;
        this.uf = uf;
    }

    /*
     * Getters
     */
    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getUf() {
        return uf;
    }

    public int getstudentQuantity() {
        return studentQuantity;
    }

    /*
     * Setters
     */
    public void setCode(int co) {
        System.out.println("Qual é o código da cidade?");
        co = scan.nextInt();
        code = co;
        scan.nextLine();
        /*
         * Esvazia o buffer do teclado necessario
         * Quando for ler uma String depois de um int
         */
    }

    public void setDescription(String des) {
        System.out.println("Como deseja descrever essa cidade? ");
        des = scan.nextLine();
        description = des;
    }

    public void setUf(String state) {
        System.out.println("Qual é a sigla do estado(UF)? ");
        state = scan.nextLine();
        uf = state;
    }

    //Metodo para adicionar estudantes
    public void adicionaNovoEstudante() {
        studentQuantity += 1;
    }

    /**
     * Metodo para exibir os dados da classe Cidade
     */
    public void exibeDados() {
        System.out.println("O código da cidade é " + code);
        System.out.println("A descrição da cidade é :" + description);
        System.out.println("A cidade esta no estado: " + uf);
        System.out.printf("A cidade tem %d alunos %n", studentQuantity);
    }
}
