
package testefun4study;

import java.util.Scanner;

/**
 * @author Guilherme Lopes
 */
public class Estudante {
    private int code;
    private String name;
    private String birthDate;
    private String email;
    private String password;
    private Cidade city;
    Scanner scan = new Scanner(System.in);

    //Contructor
    public Estudante(int code, String name, String birthDate, String email, String password, Cidade cidade) {
        this.code = code;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
        city = cidade;

        cidade.adicionaNovoEstudante();
    }

    /*
     * Setters
     */
    public void setCode(int cod) {
        System.out.println("Qual é o código do estudante? ");
        cod = scan.nextInt();
        code = cod;
        scan.nextLine();//esvazia o buffer do teclado
    }

    public void setName(String nam) {
        System.out.println("Qual é o nome do estudante? ");
        nam = scan.nextLine();
        name = nam.substring(0, 1).toUpperCase() + nam.substring(1);
    }

    public void setBirthDate(String birth) {
        System.out.println("Qual é a data de nascimento do estudante? ");
        birth = scan.nextLine();
        birthDate = birth;
    }

    public void setEmail(String mail) {
        System.out.println("Qual é o endereço de email do estudante? ");
        mail = scan.nextLine();
        email = mail;
    }

    public void setPassword(String key) {
        password = key;
    }

    /*
     * Getters
     */
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Cidade getCidade() {
        return city;
    }

    /*
     *Metodo para exibir dados da classe Estudante
     */
    public void exibeData() {
        System.out.println("O código do estudante é " + code);
        System.out.println("O nome do estudante é " + name);
        System.out.println("Nascido no dia " + birthDate);
        System.out.println("Seu endereço de email é: " + email);
        System.out.println("A senha é: " + password);
        System.out.println("E a sua cidade é: " + city);
    }
}            

