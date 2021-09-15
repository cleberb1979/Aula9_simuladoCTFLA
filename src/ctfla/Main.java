package ctfla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("#########################################################################################");
        System.out.println("#################################  Simulado CTFL 1  #####################################");
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
                        System.out.println("Qual das seguintes respostas descreve uma condição de teste?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Uma característica distinta de um componentente ou sistema");
                        System.out.println("2- Um aspecto testável de um componente ou sistema identificãdo como base " +
                                "para os testes");
                        System.out.println("3- O grau em que um produto de software fornece funções que atendem às " +
                                "necessidades declaradas e implícitas quando o software é utilizado sob condições " +
                                "específicas");
                        System.out.println("4- Casos de teste projetados para executar combinações de condiçoes e ações" +
                                " resultantes delas");
                        System.out.println("\nResposta: ");
                        resp = entrada.nextInt();
                        System.out.println("-------------------------------------------------------------------------");
                        if (resp == 2){
                            System.out.println(nome + " Você acertou!");
                            pt = pt + 2;
                            System.out.println("---------------------------------------------------------------------");
                        }else {
                            System.out.println(nome + " Resposta incorreta");
                            pt = pt + 0;
                            System.out.println("---------------------------------------------------------------------");
                        }

                        System.out.println("Questão 2\n");
                        System.out.println("Qual das seguintes declarações é um objetivo válido para os testes?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- O teste deve começar o mais tarde possível para que o desenvolvimento " +
                                "tenha tempo suficiente para criãr um bom produto");
                        System.out.println("2- Para validar se o objeto de teste funciona como esperado pelos usuários e" +
                                " outras partes interessadas");
                        System.out.println("3- Para provar que todos os possíveis defeitos são identificados");
                        System.out.println("4- Para provar que qualquer defeito remanescente não causará nenhuma falha");
                        System.out.println("\nResposta: ");
                        resp = entrada.nextInt();
                        System.out.println("-------------------------------------------------------------------------");
                        if (resp == 2){
                            System.out.println(nome + " Você acertou!");
                            pt = pt + 2;
                            System.out.println("---------------------------------------------------------------------");
                        }else {
                            System.out.println(nome + " Resposta incorreta");
                            pt = pt + 0;
                            System.out.println("---------------------------------------------------------------------");
                        }

                        System.out.println("Questão 3\n");
                        System.out.println("Qual das seguintes declarações descreve corretamente a diferença entre " +
                                "teste e depuração?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Os testes identificam a fonte dos defeitos; a depuração analisa os " +
                                "defeitos e propõe atividades de prevenção");
                        System.out.println("2- Os testes dinãmicos mostram falhas causadas por defeitos; a depuração" +
                                " elimina os defeitos, que são a fonte das falhas");
                        System.out.println("3- Os testes não removem as falhas; mas a depuração remove os defeitos " +
                                "que causam as falhas");
                        System.out.println("4- Os testes dinâmicos previnem as causas dãs falhas; a depuração remove " +
                                "as falhas");
                        System.out.println("\nResposta: ");
                        resp = entrada.nextInt();
                        System.out.println("-------------------------------------------------------------------------");
                        if (resp == 2){
                            System.out.println(nome + " Você acertou!");
                            pt = pt + 2;
                            System.out.println("---------------------------------------------------------------------");
                        }else {
                            System.out.println(nome + " Resposta incorreta");
                            pt = pt + 0;
                            System.out.println("---------------------------------------------------------------------");
                        }

                        System.out.println("Questão 4\n");
                        System.out.println("Qual das declarações abaixo descreve a situação mais comum para uma falha" +
                                " descoberta durante os testes ou na produção?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- O produto falhou quando o usuário selecionou uma opção em uma caixa de" +
                                " diálogo");
                        System.out.println("2- A versão errada de um arquivo de código fonte compilado foi incluída " +
                                "na compilação");
                        System.out.println("3- O algoritmo de computação utilizou as variáveis de entrada erradas");
                        System.out.println("4- O desenvolvedor interpretou erroneamente a exigência do algoritmo");
                        System.out.println("\nResposta: ");
                        resp = entrada.nextInt();
                        System.out.println("-------------------------------------------------------------------------");
                        if (resp == 1){
                            System.out.println(nome + " Você acertou!");
                            pt = pt + 2;
                            System.out.println("---------------------------------------------------------------------");
                        }else {
                            System.out.println(nome + " Resposta incorreta");
                            pt = pt + 0;
                            System.out.println("---------------------------------------------------------------------");
                        }

                        System.out.println("Questão 5\n");
                        System.out.println("O Sr. Test tem testado aplicações de software em dispositivos móveis por" +
                                " um período de 5 anos. Ele tem uma grande experiência em testar aplicãções móveis e" +
                                " alcança os melhores resultados em um tempo mais curto do que outros. Durante vários" +
                                " meses, o Sr. Test não modificou os casos de testes automatizados existentes e não" +
                                " criou casos de testes. Isto leva a que cada vez menos defeitos sejam encontrados" +
                                " através da execução dos testes. Que princípio de teste o Sr. Test não observou?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Os testes dependem do ambiente");
                        System.out.println("2- Não é possível realizar testes exaustivos");
                        System.out.println("3- A repetição dos mesmos testes não encontrará novos defeitos");
                        System.out.println("4- Defeitos agrupados");
                        System.out.println("\nResposta: ");
                        resp = entrada.nextInt();
                        System.out.println("-------------------------------------------------------------------------");
                        if (resp == 3){
                            System.out.println(nome + " Você acertou!");
                            pt = pt + 2;
                            System.out.println("---------------------------------------------------------------------");
                        }else {
                            System.out.println(nome + " Resposta incorreta");
                            pt = pt + 0;
                            System.out.println("---------------------------------------------------------------------");
                        }

                        System.out.println("Questão 6\n");
                        System.out.println("De que forma os testes podem ser parte da Garantia de Qualidade?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Ela garante que os requisitos sejam suficientemente detalhados");
                        System.out.println("2- Os testes reduzem o risco de má qualidade do software");
                        System.out.println("3- Assegura que as normas da organização sejam seguidas");
                        System.out.println("4- Mede a qualidade do software em termos de número de casos de teste" +
                                " executados");
                        System.out.println("\nResposta: ");
                        resp = entrada.nextInt();
                        System.out.println("-------------------------------------------------------------------------");
                        if (resp == 2){
                            System.out.println(nome + " Você acertou!");
                            pt = pt + 2;
                            System.out.println("---------------------------------------------------------------------");
                        }else {
                            System.out.println(nome + " Resposta incorreta");
                            pt = pt + 0;
                            System.out.println("---------------------------------------------------------------------");
                        }

                        System.out.println("Questão 7\n");
                        System.out.println("Qual das seguintes atividades faz parte da atividade principal" +
                                " \"análise de teste\" no processo de teste?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Identificação de qualquer infraestrutura e ferramentas necessárias");
                        System.out.println("2- Criação de conjuntos de teste a partir de scripts de teste");
                        System.out.println("3- Análise das lições aprendidas para a melhoria do processo");
                        System.out.println("4- Avaliando a base de teste de testabilidade");
                        System.out.println("\nResposta: ");
                        resp = entrada.nextInt();
                        System.out.println("-------------------------------------------------------------------------");
                        if (resp == 4){
                            System.out.println(nome + " Você acertou!");
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
