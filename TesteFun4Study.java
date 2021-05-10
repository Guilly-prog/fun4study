package testefun4study;

import java.util.Scanner;

/**
 * @author Guilherme Lopes de Almeida
 * @version 14/04/2021
 */
public class TesteFun4Study {

    /**
     * @param args
     * @throws InterruptedException Achei muito feio tudo aprecendo na tela muito rapido, então adcionei um delay
     */
    public static void main(String[] args) throws InterruptedException {
        //Inicialização das variaveis
        int code = 0;
        String description = null;
        String uf = null;

        Scanner scan = new Scanner(System.in);
        System.out.println("Cadastre a primeira Cidade: ");

        int resposta = 0;

        do {
            int i = 0;
            Cidade c1 = new Cidade(code, description, uf);
            c1.setCode(code);
            c1.setDescription(description);
            c1.setUf(uf);
            /*
             * Exibindo dados da cidade
             */
            System.out.println("**********************************");
            System.out.printf("\nOs dados da cidade são:\n");
            Thread.sleep(500);
            c1.exibeDados();

            do {
                /*
                 * Criação dos objetos estudantes da cidade
                 */
                System.out.println("\nCadastre o Estudante: ");
                Thread.sleep(500);
                int cod1 = 0;
                String nam1 = null;
                String data1 = null;
                String em1 = null;
                String se1 = null;
                Estudante e1 = new Estudante(cod1, nam1, data1, em1, se1, c1);
                e1.setCode(cod1);
                e1.setName(nam1);
                e1.setBirthDate(data1);
                e1.setEmail(em1);
                System.out.println("Qual a senha? ");
                se1 = scan.nextLine();
                e1.setPassword(se1);

                /*
                 * Exibindo dados do estudante
                 */
                Thread.sleep(500);
                System.out.printf("\nOs dados do estudante são:\n");
                Thread.sleep(500);
                e1.exibeData();
                Thread.sleep(500);

                /*
                 * Alterando algum dado do estudante
                 */
                System.out.println("Gostaria de alterar algum dado do estudante? digite");
                System.out.println("1 para alterar o Nome");
                System.out.println("2 para alterar a Data de aniversário");
                System.out.println("3 para alterar o Email");
                System.out.println("4 para alterar a Senha");
                System.out.println("5 para não alterar nada");
                int switchy = scan.nextInt();

                switch (switchy) {
                    case 1:
                        String nam = null;
                        e1.setName(nam);
                        break;
                    case 2:
                        String data = null;
                        e1.setBirthDate(data);
                        break;
                    case 3:
                        String gmail = null;
                        e1.setEmail(gmail);
                    case 4:
                        //Atualizando a senha

                        System.out.println("Por favor digite sua antiga senha");
                        String senha = scan.nextLine();
                        if (e1.getPassword().equals(senha)) {
                            System.out.println("Por favor digite a nova senha");
                            String novaSenha = scan.nextLine();
                            System.out.println("Por favor redigite a senha");
                            String reSenha = scan.nextLine();
                            if (novaSenha.equals(reSenha)) {
                                System.out.println("Senha atualizada com sucesso");
                                e1.setPassword(novaSenha);
                            } else
                                System.out.println("As senhas não coincidem");
                        } else {
                            System.out.println("Senha incorreta");
                        }

                    default:
                        System.out.println("Nada será alterado ");
                        continue;
                }

                i++; // controle para garantir no minimo 4 estudantes por cidade
                System.out.println("Gostaria de criar outro estudante? se não digite 0 ou aperte qualquer tecla para continuar");
                resposta = scan.nextInt();

                if (i <= 3 && resposta == 0) {
                    System.out.println("Você precisa criar pelo menos 4 estudantes por cidade");
                }


            } while (resposta != 0 && i <= 4);
            /*
             * fim do loop de criação de estudantes
             */
            System.out.println("Gostaria de criar outra cidade? se não digite 0 ou aperte qualquer tecla para continuar");
            resposta = scan.nextInt();


        } while (resposta != 0);
        /*
         * fim do loop de criação de cidades
         */
    }
}
