package quizz;

import java.util.Scanner;

public class QuizzUm {

    public static void main(String[] args) {

        System.out.println("#########################################################################################");
        System.out.println("#################################  Quizz do Clebão  #####################################");
        System.out.println("#########################################################################################");

        Scanner entrada = new Scanner(System.in);
        int continua = 1;

        while (continua != 10) {
            System.out.println("                       \nEscolha uma das opções do menu\n                            ");
            System.out.println("                             _ _ _ _ _ _ _ _ _ _ _ _                                 ");
            System.out.println("                             |1 - Iniciar |2 - Sair|                                 ");
            System.out.println("\nNUMERO: ");
            int escolhaMenu = entrada.nextInt();

            switch (escolhaMenu){
                case 1:
                    int resp = 0;
                    System.out.println("                        \nConfigurações iniciais\n                               ");
                    try {
                        Thread.sleep(2000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    System.out.println("                   Escolha uma das opções abaixo:\n                              ");
                    System.out.println("            1- Responder     2- Voltar para o Menu ou Sair\n                     ");
                    System.out.println("NUMERO: ");

                    int opcresponder = entrada.nextInt();
                    switch (opcresponder){
                        case 1:
                            int pt = 0;

                            System.out.println("Digite o seu nome: ");
                            String nome = entrada.next();
                            System.out.println(" ");
                            System.out.println("Questão 1\n");
                            System.out.println("1. Normalmente, quantos litros de sangue uma pessoa tem? Em média, " +
                                    "quantos são retirados numa doação de sangue?\n");
                            System.out.println("Selecione uma opção\n");
                            System.out.println("1- Tem entre 2 a 4 litros. São retirados 450 mililitros");
                            System.out.println("2- Tem entre 4 a 6 litros. São retirados 450 mililitros");
                            System.out.println("3- Tem 10 litros. São retirados 2 litros");
                            System.out.println("4- Tem 7 litros. São retirados 1,5 litros");
                            System.out.println("5- Tem 0,5 litros. São retirados 0,5 litros");
                            System.out.println("\nResposta: ");
                            resp = entrada.nextInt();
                            System.out.println("-------------------------------------------------------------------------");
                            if (resp == 2){
                                System.out.println(nome + " Você acertou!\n" +
                                        "A quantidade de sangue varia de pessoa para pessoa. O volume de sangue é entre" +
                                        " 7% e 8% o peso corporal. Assim, um adulto com 50 e 80 quilos, pode ter entre" +
                                        " 4 e 6 litros de sangue, respectivamente.");
                                pt = pt + 2;
                                System.out.println("---------------------------------------------------------------------");
                            }else {
                                System.out.println(nome + " Resposta incorreta");
                                pt = pt + 0;
                                System.out.println("---------------------------------------------------------------------");
                            }

                            System.out.println("Questão 2\n");
                            System.out.println("De quem é a famosa frase “Penso, logo existo”?\n");
                            System.out.println("Selecione uma opção\n");
                            System.out.println("1- Platão");
                            System.out.println("2- Galileu Galilei");
                            System.out.println("3- Descartes");
                            System.out.println("4- Sócrates");
                            System.out.println("5- Francis Bacon");
                            System.out.println("\nResposta: ");
                            resp = entrada.nextInt();
                            System.out.println("-------------------------------------------------------------------------");
                            if (resp == 3){
                                System.out.println(nome + " Você acertou!\n" +
                                        "“Je pense, donc je suis” é a frase original, escrita em francês, do filósofo " +
                                        "René Descartes (1596-1650). Ela resume o pensamento e o método de Descartes, " +
                                        "para quem tudo tem início na dúvida.");
                                pt = pt + 2;
                                System.out.println("---------------------------------------------------------------------");
                            }else {
                                System.out.println(nome + " Resposta incorreta");
                                pt = pt + 0;
                                System.out.println("---------------------------------------------------------------------");
                            }

                            System.out.println("Questão 3\n");
                            System.out.println("De onde é a invenção do chuveiro elétrico?\n");
                            System.out.println("Selecione uma opção\n");
                            System.out.println("1- França");
                            System.out.println("2- Inglaterra");
                            System.out.println("3- Brasil");
                            System.out.println("4- Austrália");
                            System.out.println("5- Itália");
                            System.out.println("\nResposta: ");
                            resp = entrada.nextInt();
                            System.out.println("-------------------------------------------------------------------------");
                            if (resp == 3){
                                System.out.println(nome + " Você acertou!\n" +
                                        "Francisco Canhos é o nome do homem que, na década de 40, desenvolveu o primeiro" +
                                        " chuveiro elétrico seguro em Jaú-SP. O aparelho vinha sendo desenvolvido desde" +
                                        " os anos 30, mas apresentava riscos de curto-circuito.");
                                pt = pt + 2;
                                System.out.println("---------------------------------------------------------------------");
                            }else {
                                System.out.println(nome + " Resposta incorreta");
                                pt = pt + 0;
                                System.out.println("---------------------------------------------------------------------");
                            }

                            System.out.println("Questão 4\n");
                            System.out.println("Quais o menor e o maior país do mundo?\n");
                            System.out.println("Selecione uma opção\n");
                            System.out.println("1- Vaticano e Rússia");
                            System.out.println("2- Nauru e China");
                            System.out.println("3- Mônaco e Canadá");
                            System.out.println("4- Malta e Estados Unidos");
                            System.out.println("5- San Marino e Índia");
                            System.out.println("\nResposta: ");
                            resp = entrada.nextInt();
                            System.out.println("-------------------------------------------------------------------------");
                            if (resp == 1){
                                System.out.println(nome + " Você acertou!\n" +
                                        "O Vaticano, sede da igreja católica, tem apenas 44 hectares (0,44 km2). " +
                                        "A Rússia, localizada em dois continentes (Ásia e Europa), tem 17 milhões de km2.");
                                pt = pt + 2;
                                System.out.println("---------------------------------------------------------------------");
                            }else {
                                System.out.println(nome + " Resposta incorreta");
                                pt = pt + 0;
                                System.out.println("---------------------------------------------------------------------");
                            }

                            System.out.println("Questão 5\n");
                            System.out.println("Qual o nome do presidente do Brasil que ficou conhecido como Jango?\n");
                            System.out.println("Selecione uma opção\n");
                            System.out.println("1- Jânio Quadros");
                            System.out.println("2- Jacinto Anjos");
                            System.out.println("3- Getúlio Vargas");
                            System.out.println("4- João Figueiredo");
                            System.out.println("5- João Goulart");
                            System.out.println("\nResposta: ");
                            resp = entrada.nextInt();
                            System.out.println("-------------------------------------------------------------------------");
                            if (resp == 5){
                                System.out.println(nome + " Você acertou!\n" +
                                        "João Belchior Marques Goulart (1919-1976) foi o 24º presidente do Brasil, cujo" +
                                        " período de governo compreende os anos de 1961 a 1964. João Goulart abandonou" +
                                        " a presidência por ocasião do golpe militar.");
                                pt = pt + 2;
                                System.out.println("---------------------------------------------------------------------");
                            }else {
                                System.out.println(nome + " Resposta incorreta");
                                pt = pt + 0;
                                System.out.println("---------------------------------------------------------------------");
                            }

                            System.out.println("Questão 6\n");
                            System.out.println("Qual o grupo em que todas as palavras foram escritas corretamente?\n");
                            System.out.println("Selecione uma opção\n");
                            System.out.println("1- Asterístico, beneficiente, meteorologia, entertido");
                            System.out.println("2- Asterisco, beneficente, meteorologia, entretido");
                            System.out.println("3- Asterisco, beneficente, metereologia, entretido");
                            System.out.println("4- Asterístico, beneficiente, metereologia, entretido");
                            System.out.println("5- Asterisco, beneficiente, metereologia, entretido");
                            System.out.println("\nResposta: ");
                            resp = entrada.nextInt();
                            System.out.println("-------------------------------------------------------------------------");
                            if (resp == 2){
                                System.out.println(nome + " Você acertou!\n" +
                                        "Estas palavras são exemplos de barbarismo, um vício de linguagem em que as " +
                                        "palavras são pronunciadas ou escritas incorretamente.");
                                pt = pt + 2;
                                System.out.println("---------------------------------------------------------------------");
                            }else {
                                System.out.println(nome + " Resposta incorreta");
                                pt = pt + 0;
                                System.out.println("---------------------------------------------------------------------");
                            }

                            System.out.println("Questão 7\n");
                            System.out.println("Qual o livro mais vendido no mundo a seguir à Bíblia?\n");
                            System.out.println("Selecione uma opção\n");
                            System.out.println("1- O Senhor dos Anéis");
                            System.out.println("2- Dom Quixote");
                            System.out.println("3- O Pequeno Príncipe");
                            System.out.println("4- Ela, a Feiticeira");
                            System.out.println("5- Um Conto de Duas Cidades");
                            System.out.println("\nResposta: ");
                            resp = entrada.nextInt();
                            System.out.println("-------------------------------------------------------------------------");
                            if (resp == 2){
                                System.out.println(nome + " Você acertou!\n" +
                                        "Dom Quixote, de Miguel de Cervantes, é um clássico da literatura espanhola. " +
                                        "A obra foi escrita em duas partes, uma em 1605, e a outra em 1615.");
                                pt = pt + 2;
                                System.out.println("---------------------------------------------------------------------");
                            }else {
                                System.out.println(nome + " Resposta incorreta");
                                pt = pt + 0;
                                System.out.println("---------------------------------------------------------------------");
                            }

                            System.out.println("Questão 8\n");
                            System.out.println("Quantas casas decimais tem o número pi?\n");
                            System.out.println("Selecione uma opção\n");
                            System.out.println("1- Duas");
                            System.out.println("2- Centenas");
                            System.out.println("3- Infinitas");
                            System.out.println("4- Vinte");
                            System.out.println("5- Milhares");
                            System.out.println("\nResposta: ");
                            resp = entrada.nextInt();
                            System.out.println("-------------------------------------------------------------------------");
                            if (resp == 3){
                                System.out.println(nome + " Você acertou!\n" +
                                        "Ao longo dos tempos, vários estudiosos têm se dedicado a calcular o número pi" +
                                        " e já chegaram ao número de 5 bilhões de casas.");
                                pt = pt + 2;
                                System.out.println("---------------------------------------------------------------------");
                            }else {
                                System.out.println(nome + " Resposta incorreta");
                                pt = pt + 0;
                                System.out.println("---------------------------------------------------------------------");
                            }

                            System.out.println("Questão 9\n");
                            System.out.println("Atualmente, quantos elementos químicos a tabela periódica possui?\n");
                            System.out.println("Selecione uma opção\n");
                            System.out.println("1- 113");
                            System.out.println("2- 109");
                            System.out.println("3- 108");
                            System.out.println("4- 118");
                            System.out.println("5- 92");
                            System.out.println("\nResposta: ");
                            resp = entrada.nextInt();
                            System.out.println("-------------------------------------------------------------------------");
                            if (resp == 4){
                                System.out.println(nome + " Você acertou!\n" +
                                        "Os últimos elementos foram adicionados à tabela periódica em 2016. Eles são: " +
                                        "113 (Nihônio), 115 (Moscóvio), 117 (Tenessino) e 118 (Oganessônio).");
                                pt = pt + 2;
                                System.out.println("---------------------------------------------------------------------");
                            }else {
                                System.out.println(nome + " Resposta incorreta");
                                pt = pt + 0;
                                System.out.println("---------------------------------------------------------------------");
                            }

                            System.out.println("Questão 10\n");
                            System.out.println("Quais os países que têm a maior e a menor expectativa de vida do mundo?\n");
                            System.out.println("Selecione uma opção\n");
                            System.out.println("1- Japão e Serra Leoa");
                            System.out.println("2- Austrália e Afeganistão");
                            System.out.println("3- Itália e Chade");
                            System.out.println("4- Brasil e Congo");
                            System.out.println("5- Estados Unidos e Angola");
                            System.out.println("\nResposta: ");
                            resp = entrada.nextInt();
                            System.out.println("-------------------------------------------------------------------------");
                            if (resp == 1){
                                System.out.println(nome + " Você acertou!\n" +
                                        "No Japão, a expectativa de vida é em média 84 anos, enquanto na Serra Leoa é" +
                                        " 53 anos.");
                                pt = pt + 2;
                                System.out.println("---------------------------------------------------------------------");
                            }else {
                                System.out.println(nome + " Resposta incorreta");
                                pt = pt + 0;
                                System.out.println("---------------------------------------------------------------------");
                            }

                            System.out.println("\nVocê fez um total de : "+pt+" pontos\n");
                            break;
                    }
            }

            //Voltar para a barra de Menu
            System.out.println("\nDigite o número correspondente ao que deseja executar");
            System.out.println("1- Menu  2-Sair ");
            System.out.println("NUMERO: ");
            continua = entrada.nextInt();
            if (continua == 2){
                System.exit(0);
            }
        }
    }
}


