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

                        System.out.println("Questão 8\n");
                        System.out.println("Combine os seguintes produtos de trabalho de teste (1-4) com a descrição" +
                                " correta (A-D).\n" +
                                "I- Conjunto de teste\n" +
                                "II- Caso de teste\n" +
                                "III- Roteiro de teste\n" +
                                "IV- Carta de teste\n\n" +
                                "A- Um conjunto de scripts de teste a serem executados em uma execução de teste" +
                                " específica\n" +
                                "B- Um conjunto de instruções para a execução de um teste\n" +
                                "C- Contém os resultados esperados\n" +
                                "D- Documentação das atividades de teste em testes exploratórios baseados em " +
                                "sessões\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- I-A, II-C, III-B, IV-D");
                        System.out.println("2- I-D, II-B, III-A, IV-C");
                        System.out.println("3- I-A, II-C, III-D, IV-B");
                        System.out.println("4- I-D, II-C, III-B, IV-A");
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

                        System.out.println("Questão 9\n");
                        System.out.println("Como os testes caixa-branca podem ser aplicados durante os testes de" +
                                " aceite?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Para verificar se grandes volumes de dados podem ser transferidos" +
                                " entre sistemas integrados");
                        System.out.println("2- Para verificar se todas as declarações de código e caminhos de decisão" +
                                " de código foram executadas");
                        System.out.println("3- Verificar se todos os fluxos do processo de trabalho foram cobertos");
                        System.out.println("4- Para cobrir todas as navegações da página web");
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

                        System.out.println("Questão 10\n");
                        System.out.println("Qual das seguintes declarações comparando testes de componentes e testes" +
                                " de sistemas é VERDADEIRA?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- O teste de componentes verifica a funcionalidade de módulos de " +
                                "software, objetos de programa e classes que são testados separadamente, enquanto o" +
                                " teste de sistema verifica interfaces entre componentes e interações entre " +
                                "diferentes partes do sistema");
                        System.out.println("2- Os casos de teste para teste de componentes são geralmente derivados" +
                                " das especificações de componentes, especificações de projeto ou modelos de dados," +
                                " enquanto os casos de teste para teste de sistemas são geralmente derivados das" +
                                " especificações de requisitos ou casos de uso");
                        System.out.println("3- O teste de componentes concentra-se apenas nas características" +
                                " funcionais, enquanto o teste de sistemas concentra-se nas características funcionais" +
                                " e não-funcionais");
                        System.out.println("4- Os testes de componentes são de responsabilidade dos testadores," +
                                " enquanto os testes de sistemas são tipicamente de responsabilidade dos usuários");
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

                        System.out.println("Questão 11\n");
                        System.out.println("Qual das seguintes opções é VERDADEIRA?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- O objetivo do teste de regressão é verificar se a correção foi" +
                                " implementada com sucesso, enquanto o objetivo do teste de confirmação é confirmar" +
                                " que a correção não tem efeitos colaterais");
                        System.out.println("2- O objetivo do teste de regressão é detectar efeitos colaterais não" +
                                " intencionais, enquanto o objetivo do teste de confirmação é verificar se o sistema" +
                                " ainda está funcionando em um novo ambiente");
                        System.out.println("3- O objetivo do teste de regressão é detectar efeitos colaterais não" +
                                " intencionais, enquanto o objetivo do teste de confirmação é verificar se o defeito" +
                                " original foi corrigido");
                        System.out.println("4- O objetivo do teste de regressão é verificar se a nova funcionalidade" +
                                " está funcionando, enquanto o objetivo do teste de confirmação é verificar se o" +
                                " defeito original foi corrigido");
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

                        System.out.println("Questão 12\n");
                        System.out.println("Qual das seguintes definições é a MELHOR definição de um modelo de" +
                                " desenvolvimento incremental?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Definição de requisitos, projeto de software e testes são feitos em" +
                                " fases em que em cada uma parte do sistema é adicionada");
                        System.out.println("2- Uma fase no processo de desenvolvimento deve começar quando a fase" +
                                " anterior estiver concluída");
                        System.out.println("3- Os testes são vistos como uma fase separada que ocorre após a conclusão" +
                                " do desenvolvimento");
                        System.out.println("4- Os testes são adicionados ao desenvolvimento como um incremento");
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

                        System.out.println("Questão 13\n");
                        System.out.println("Qual dos seguintes itens NÃO deve ser um gatilho para testes de" +
                                " manutenção?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Decisão de testar a possibilidade de manutenção do software");
                        System.out.println("2- Decisão de testar o sistema após a migração para uma nova plataforma" +
                                " operacional");
                        System.out.println("3- Decisão de testar se os dados arquivados são possíveis de serem" +
                                " recuperados");
                        System.out.println("4- Decisão de testar após \"hot fixes\"");
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

                        System.out.println("Questão 14\n");
                        System.out.println("Quais das seguintes opções são papéis em uma revisão formal?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Desenvolvedor, Moderador, Líder de revisão, Revisor, Testador.");
                        System.out.println("2- Autor, Moderador, Gerente, Revisor, Desenvolvedor.");
                        System.out.println("3- Autor, Gerente, Líder de revisão, Revisor, Designer.");
                        System.out.println("4- Autor, Moderador, Líder de revisão, Revisor, Redator");
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

                        System.out.println("Questão 15\n");
                        System.out.println("Quais atividades são realizadas no âmbito do planejamento de uma revisão" +
                                " formal?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Coleta de métricas para a avaliação da eficácia da revisão");
                        System.out.println("2- Responder a quaisquer perguntas que os participantes possam ter");
                        System.out.println("3- Definição e verificação do cumprimento dos critérios de entrada para a" +
                                " revisão");
                        System.out.println("4- Avaliação dos resultados da revisão em relação aos critérios de saída");
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

                        System.out.println("Questão 16\n");
                        System.out.println("Qual dos tipos de revisão abaixo é a MELHOR opção para escolher quando a" +
                                " revisão deve seguir um processo formal baseado em regras e listas de verificação?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Revisão Informal");
                        System.out.println("2- Revisão Técnica");
                        System.out.println("3- Inspeção");
                        System.out.println("4- Passagem");
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

                        System.out.println("Questão 17\n");
                        System.out.println("Quais das seguintes afirmações sobre testes estáticos são as mais" +
                                " verdadeiras?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Os testes estáticos são uma forma barata de detectar e remover defeitos");
                        System.out.println("2- Os testes estáticos tornam os testes dinâmicos menos desafiadores");
                        System.out.println("3- Os testes estáticos permitem encontrar problemas de tempo de execução" +
                                " no início do ciclo de vida");
                        System.out.println("4- Ao testar um sistema crítico de segurança, os testes estáticos tem" +
                                " menos valor porque os testes dinâmicos encontram melhor os defeitos");
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

                        System.out.println("Questão 18\n");
                        System.out.println("Voce será convidado para uma revisão. O produto de trabalho a ser revisado" +
                                " é uma descrição do processo de criação de documentos internos. O objetivo da" +
                                " descrição é apresentar a distribuição do trabalho entre os diferentes papéis" +
                                " envolvidos no processo de uma forma que possa ser claramente compreendida por" +
                                " todos.\n" +
                                "Você será convidado para uma revisão baseada em checklist. A lista de verificação" +
                                " também será enviada a você. Ela inclui os seguintes pontos:\n\n" +
                                "I. A pessoa que executa a atividade é claramente identificada para cada atividade?\n" +
                                "II. Os critérios de entrada estão claramente definidos para cada atividade?\n" +
                                "III. Os critérios de saída estão claramente definidos para cada atividade?\n" +
                                "IV. Os papéis de apoio e seu escopo de trabalho estão claramente definidos para cada" +
                                " atividade?\n\n" +
                                "A seguir mostramos um trecho do resultado do trabalho a ser revisto, para o qual você" +
                                " deve utilizar a lista de verificação acima:\n" +
                                "\"Depois de verificar a documentação do cliente para verificar se está completa e" +
                                " correta, o arquiteto do software cria a especificação do sistema\".\n" +
                                "Uma vez que o arquiteto de software tenha concluído a especificação do sistema, ele" +
                                " convida os testadores e verificadores para a revisão. Uma lista de verificação" +
                                " descreve o escopo da revisão. Cada revisor convidado cria comentários de revisão -" +
                                " se necessário - e conclui a revisão com um comentário oficial de revisão\".\n" +
                                "Qual das seguintes declarações sobre sua revisão é correta?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- O ponto II da lista de verificação foi violado porque não está claro" +
                                " qual condição deve ser preenchida para convidar para a revisão.");
                        System.out.println("2- Voce percebe que além do verificador e do verificador, o validador" +
                                " também deve ser convidado. Como este item não faz parte de sua lista de verificação," +
                                " você não cria um comentário correspondente");
                        System.out.println("3- O ponto III da lista de verificação foi violado, pois não está claro o" +
                                " que marca a revisão como concluída.");
                        System.out.println("4- O ponto I da lista de verificação foi violado porque não está claro" +
                                " quem está fornecendo a lista de verificação para o convite para a revisão");
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

                        System.out.println("Questão 19\n");
                        System.out.println("O que é teste baseado em checklist?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Uma técnica de teste na qual os testes são derivados com base no" +
                                " conhecimento do testador sobre falhas do passado, ou conhecimento geral de falhas");
                        System.out.println("2- Uma técnica de teste baseada em uma análise da especificação de um" +
                                " componente ou sistema");
                        System.out.println("3- Uma técnica de teste baseada na experiência em que o testador experiente" +
                                " usa uma lista de itens a serem anotados, verificados ou lembrados, ou um conjunto" +
                                " de regras ou critérios contra os quais um produto deve ser verificado");
                        System.out.println("4- Uma abordagem aos testes onde os testadores projetam e executam" +
                                " dinamicamente testes baseados em seu conhecimento, exploração do item de teste e nos" +
                                " resultados dos testes anteriores");
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

                        System.out.println("Questão 20\n");
                        System.out.println("Qual das seguintes opções é classificada como uma técnica de teste" +
                                " caixa-preta?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Uma técnica baseada na análise da arquitetura");
                        System.out.println("2- Uma técnica que verifica se o objeto de teste está funcionando de" +
                                " acordo com o projeto detalhado");
                        System.out.println("3- Uma técnica baseada no conhecimento de falhas do passado, ou" +
                                " conhecimento geral de falhas");
                        System.out.println("4- Uma técnica baseada em requisitos formais");
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
