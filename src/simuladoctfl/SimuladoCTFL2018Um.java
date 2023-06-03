package simuladoctfl;

import java.util.Scanner;

public class SimuladoCTFL2018Um {

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
                                "tenha tempo suficiente para criar um bom produto");
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
                        System.out.println("4- Os testes dinâmicos previnem as causas das falhas; a depuração remove " +
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
                                " um período de 5 anos. Ele tem uma grande experiência em testar aplicações móveis e" +
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

                        System.out.println("Questão 21\n");
                        System.out.println("A seguinte declaração se refere a cobertura de decisões:\n" +
                                "\"Quando o código contém apenas uma única declaração 'se' e sem loops ou declarações " +
                                "CASE, e sua execução não está aninhada dentro do teste, qualquer caso de teste único " +
                                "que executarmos resultará em 50% de cobertura de decisão\".\n" +
                                "Qual das seguintes afirmações é correta?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- A declaração é verdadeira. Qualquer caso de teste único fornece 100% " +
                                "de cobertura de decisão e, portanto, 50% de cobertura de decisão.");
                        System.out.println("2- A afirmação é verdadeira. Qualquer caso isolado de teste faria com que" +
                                " o resultado da declaração \"se\" fosse verdadeiro ou falso.");
                        System.out.println("3- A afirmação é falsa. Um único caso de teste so pode garantir uma " +
                                "cobertura de decisão de 25% neste caso.");
                        System.out.println("4- A afirmação é falsa. A declaração é muito ampla. Ela pode estar " +
                                "correta ou não, dependendo do software testado.");
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

                        System.out.println("Questão 22\n");
                        System.out.println("Qual das seguintes é a descrição da cobertura das declarações?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- É uma métrica, que é a porcentagem de casos de teste que foram " +
                                "executados");
                        System.out.println("2- É uma métrica, que é a porcentagem de declarações no código fonte " +
                                "que foram executadas");
                        System.out.println("3- É uma métrica, que é o número de declarações no código fonte que " +
                                "foram executadas por casos de teste que são aprovados");
                        System.out.println("4- É uma métrica, que dá uma confirmação verdadeira/falsa se todas as" +
                                " declarações são cobertas ou não.");
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

                        System.out.println("Questão 23\n");
                        System.out.println("Qual declaração sobre a relação entre a cobertura de declarações e a " +
                                "cobertura de decisões é verdadeira?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- 100% de cobertura de decisão também garante 100% de cobertura de " +
                                "declaração");
                        System.out.println("2- 100% de cobertura de declaração também garante 100% de cobertura" +
                                " de decisão");
                        System.out.println("3- 50% de cobertura de decisão também garante 50% de cobertura de " +
                                "declaração");
                        System.out.println("4- A cobertura de decisão nunca pode chegar a 100%.");
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

                        System.out.println("Questão 24\n");
                        System.out.println("Para qual das seguintes situações é adequado o teste exploratório?\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Quando a pressão do tempo requer a aceleração da execução de testes" +
                                " já especificados");
                        System.out.println("2- Quando o sistema é desenvolvido de forma incremental, e não há carta " +
                                "de teste disponível");
                        System.out.println("3- Quando houver testadores disponíveis que tenham conhecimento " +
                                "suficiente de aplicações e tecnologias similares");
                        System.out.println("4- Quando já existe um conhecimento avançado do sistema, e é necessário" +
                                " fornecer provas de que ele deve ser testado intensivamente");
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

                        System.out.println("Questão 25\n");
                        System.out.println("O bônus de um funcionário deve ser calculado. Não pode ser negativo, " +
                                "mas pode ser calculado até zero. O bônus é baseado na duração do emprego:\n" +
                                "• menor ou igual a 2 anos\n" +
                                "• mais de 2 anos, mas menos de 5 anos\n" +
                                "• 5 a 10 anos, inclusive\n" +
                                "• mais de 10 anos\n" +
                                "Qual é o número mínimo de casos de teste necessário para cobrir todas as " +
                                "partições de equivalência válidas para o cálculo do bônus?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- 3");
                        System.out.println("2- 5");
                        System.out.println("3- 2");
                        System.out.println("4- 4");
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

                        System.out.println("Questão 26\n");
                        System.out.println("Um sistema de controle de velocidade e relatórios tem as seguintes " +
                                "características:\n" +
                                "• Se você dirigir 50 km/h ou menos, nada vai acontecer.\n" +
                                "• Se você dirigir mais rápido que 50 km/h, mas não mais que 55 km/h, você será " +
                                "avisado.\n" +
                                "• Se você dirigir mais rápido que 55 km/h, mas não mais que 60 km/h, você será " +
                                "multado.\n" +
                                "• Se você dirigir a mais de 60 km/h, sua carteira de habilitação será suspensa. - A " +
                                "velocidade em km/h está disponível para o sistema como um valor inteiro.\n" +
                                "Qual seria o conjunto mais provável de valores (km/h) identificado pela aplicação" +
                                " da análise de valores limite, onde apenas os valores nos limites das classes de " +
                                "equivalência são selecionados?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- 0, 49, 50, 54, 59, 60");
                        System.out.println("2- 50, 55, 60");
                        System.out.println("3- 49, 50, 54, 55, 60, 62");
                        System.out.println("4- 50, 51, 55, 56, 60, 61");
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

                        System.out.println("Questão 27\n");
                        System.out.println("Os funcionários de uma empresa recebem bônus se trabalharem mais de um" +
                                " ano na empresa e atingirem uma meta que tenha sido acordada individualmente antes.\n" +
                                "Estes fatos podem ser mostrados em uma tabela de decisão:\n\n" +
                                "|Test ID   |                          |T1 |T2|T3|T4 |\n" +
                                "|Condição 1|Emprego por mais de 1 ano?|YES|NO|NO|YES|\n" +
                                "|Condição 2|Objetivo acordado?        |NO|NO|YES|YES|\n" +
                                "|Condição 3|Alcançado o objetivo?     |NO|NO|YES|YES|\n" +
                                "|Ação      |Pagamento de bônus?       |NO|NO|NO|YES |\n" +
                                "\nQual dos seguintes casos de teste representa uma situação que pode acontecer na " +
                                "vida real, e está faltando na tabela de decisão acima?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Condição1 = SIM, Condição2 = NAO, Condição3 = SIM, Ação = NAO");
                        System.out.println("2- Condição1 = SIM, Condição2 = SIM, Condição3 = NAO, Ação = SIM");
                        System.out.println("3- Condição1 = NAO, Condição2 = NAO, Condição3 = SIM, Ação= NAO");
                        System.out.println("4- Condição1 = NAO, Condição2 = SIM, Condição3 = NAO, Ação= NAO");
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

                        System.out.println("Questão 28\n");
                        System.out.println("Qual das seguintes afirmações sobre o diagrama de transição de estado " +
                                "dado é tabela de casos de teste é VERDADEIRA?\n" +
                                "|Estado inicial |S1       |S2       |S2   |S3    |S3       |\n" +
                                "|Entrada        |Power On |Power Off|RC On|RC Off|Power Off|\n" +
                                "|Saída esperada |S2       |S1       |S3   |S2    |S1       |\n");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Os casos de teste em questão cobrem transições válidas e inválidas" +
                                " no diagrama de transição estatal");
                        System.out.println("2- Os casos de teste em questão representam todas as transições válidas " +
                                "possíveis no diagrama de trãnsição estatal");
                        System.out.println("3- Os casos de teste em questão representam algumas das transições " +
                                "válidas no diagrama de transição estatal");
                        System.out.println("4- Os casos de teste em questão representam pares de transições no " +
                                "diagrama de transição estatal");
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

                        System.out.println("Questão 29\n");
                        System.out.println("Uma aplicação de vídeo tem a seguinte exigência: O aplicativo deve " +
                                "permitir a reprodução de um vídeo na seguinte resolução de tela:\n" +
                                "• 640x480\n" +
                                "• 1280x720\n" +
                                "• 1600x1200\n" +
                                "• 1920x1080\n" +
                                "Qual dos seguintes casos de teste é resultado da aplicação da técnica de teste de" +
                                " equivalência de partição para testar este requisito?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Verificar se a aplicação pode reproduzir um vídeo em uma tela de " +
                                "tamanho 1920x1080 (1 caso de teste)");
                        System.out.println("2- Verificar se a aplicação pode reproduzir um vídeo em um display de " +
                                "tamanho 640x480 e 1920x1080 (2 casos de teste)");
                        System.out.println("3- Verificar se a aplicação pode reproduzir um vídeo em cada um dos " +
                                "tamanhos de exibição na exigência (4 casos de teste)");
                        System.out.println("4- Verificar se a aplicação pode reproduzir um vídeo em qualquer um dos" +
                                " tamanhos de tela na exigência (1 cãso de teste)");
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

                        System.out.println("Questão 30\n");
                        System.out.println("Qual das seguintes declarações MELHOR descreve como as tarefas são " +
                                "divididas entre o gerente de testes e o testador?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- O gerente de testes planeja as atividades de teste e escolhe os " +
                                "padrões a serem seguidos, enquanto o testador escolhe as ferramentas e estabelece as" +
                                " diretrizes de uso das ferramentas");
                        System.out.println("2- O gerente de testes planeja, coordena e controla as atividades de " +
                                "teste, enquanto o testador automatiza os testes");
                        System.out.println("3- O gerente de testes planeja, monitora e controla as atividades de teste," +
                                " enquanto o testador projeta os testes e decide sobre a liberação do objeto de teste");
                        System.out.println("4- O gerente de testes planeja e organiza os testes e especifica os casos" +
                                " de teste, enquanto o testador executa os testes");
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

                        System.out.println("Questão 31\n");
                        System.out.println("Qual das seguintes métricas seria a mais útil para monitorar durante " +
                                "a execução do teste?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Porcentagem de casos de teste executados");
                        System.out.println("2- Número médio de testadores envolvidos na execução do teste");
                        System.out.println("3- Cobertura dos requisitos por código fonte");
                        System.out.println("4- Porcentagem de casos de teste já criados e revisados");
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

                        System.out.println("Questão 32\n");
                        System.out.println("Qual dos seguintes aspectos pode afetar e fazer parte do planejamento " +
                                "(inicial) do teste?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Limitações orçamentárias");
                        System.out.println("2- Diário de testes");
                        System.out.println("3- Taxa de falha");
                        System.out.println("4- Casos de uso");
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

                        System.out.println("Questão 33\n");
                        System.out.println("Qual das listas a seguir contém apenas os critérios típicos de saída" +
                                " dos testes?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Medidas de confiabilidade, cobertura do teste, cronograma e status " +
                                "sobre a correção de defeitos e riscos remanescentes");
                        System.out.println("2- Medidas de confiabilidade, cobertura de teste, grau de independência" +
                                " do testador e completude do produto");
                        System.out.println("3- Medidas de confiabilidade, cobertura de teste, custo do teste, " +
                                "disponibilidade do ambiente de teste, tempo de colocação no mercado e completude do" +
                                " produto");
                        System.out.println("4- Tempo para comercialização, defeitos restantes, qualificação do " +
                                "testador, disponibilidade de casos de uso testável, cobertura de teste e custo do" +
                                " teste");
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

                        System.out.println("Questão 34\n");
                        System.out.println("Qual dos itens a seguir NÃO está incluído em um relatório resumido de" +
                                " teste?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Definição de critérios de aprovação/reprovação e objetivos dos testes");
                        System.out.println("2- Desvios da abordagem de teste");
                        System.out.println("3- Medições do progresso real em relação aos critérios de saída");
                        System.out.println("4- Avaliação da qualidade do objeto de teste");
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

                        System.out.println("Questão 35\n");
                        System.out.println("O projeto desenvolve um termostato de aquecimento \"inteligente\". Os " +
                                "algoritmos de controle do termostato foram modelados como modelos Matlab/Simulink e " +
                                "executados no servidor conectado a Internet. O termostato usa as especificações do " +
                                "servidor para acionar as válvulas de aquecimento.\n" +
                                "O gerente de teste definiu a seguinte estratégia/abordagem de teste no plano de " +
                                "teste:\n" +
                                "• O teste de aceite para todo o sistema é executado como um teste baseado na " +
                                "experiência.\n" +
                                "• Os algoritmos de controle no servidor são verificados em relação ao padrão do " +
                                "regulamento de economia de energia.\n" +
                                "• O teste funcional do termostato é executado como um teste baseado em risco.\n" +
                                "• Os testes de segurança de dados / comunicação via internet são executados em " +
                                "conjunto com especialistas externos em segurança.\n" +
                                "\nQue quatro tipos comuns de estratégias/abordagens de teste o gerente de testes " +
                                "implementou no plano de teste?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- metódico, analítico, reativo e avesso à regressão");
                        System.out.println("2- analítico, conforme às normas, consultivo e reativo");
                        System.out.println("3- baseada em modelos, metódica, analítica e consultiva");
                        System.out.println("4- regressão-aversão, consultiva, reativa e metódica");
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

                        System.out.println("Questão 36\n");
                        System.out.println("Qual das seguintes é a característica de uma abordagem baseada em " +
                                "métricas para a estimativa de teste?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Orçamento que foi utilizado por um projeto de teste anterior semelhante");
                        System.out.println("2- Experiência geral coletada em entrevistas com gerentes de testes");
                        System.out.println("3- Estimativa de esforço para automação de testes acordada na equipe de" +
                                " teste");
                        System.out.println("4- Média dos cálculos coletados de especialistas empresariais");
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

                        System.out.println("Questão 37\n");
                        System.out.println("Como gerente de testes, voce é responsável por testar as seguintes partes" +
                                " dos requisitos:\n" +
                                "• R1 - Anomalias de processo\n" +
                                "• R2 - Sincronização\n" +
                                "• R3 - Aprovação\n" +
                                "• R4 - Solução de problemas\n" +
                                "• R5 - Dados financeiros\n" +
                                "• R6 - Dados do diagrama\n" +
                                "• R7 - Mudanças no perfil do usuário\n" +
                                "Notação: Dependências de requisitos lógicos (A -> B significa que B depende de A):\n" +
                                "Qual das seguintes opções estrutura cronograma de execução de testes de acordo " +
                                "com as dependências de requisitos?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- R1 -> R3 -> R4 -> R7 -> R2 -> R5 -> R6");
                        System.out.println("2- R1 -> R3 -> R2 -> R4 -> R7 -> R5 -> R6");
                        System.out.println("3- R1 -> R3 -> R2 -> R5 -> R6 -> R4 -> R7");
                        System.out.println("4- R1 -> R3 -> R2 -> R5 -> R6 -> R4 -> R7");
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

                        System.out.println("Questão 38\n");
                        System.out.println("Você está testando uma nova versão de software para uma máquina de café." +
                                " A máquina pode preparar diferentes tipos de café com base em quatro categorias, ou" +
                                " seja, tamanho do café , açúcar, leite e xarope. Os critérios são os seguintes:\n" +
                                "• Tamanho do café (pequeno, médio, grande)\n" +
                                "• Açúcar (nenhum, 1 unidade, 2 unidades, 3 unidades, 4 unidades)\n" +
                                "• Leite (sim ou não)\n" +
                                "• xarope de sabor café (sem xarope, caramelo, avelã, baunilha)\n" +
                                "Agora você está escrevendo um relatório de defeito com as seguintes informações:\n" +
                                "• Título: Baixa temperatura do café.\n" +
                                "• Breve resumo: Quando você seleciona café com leite, o tempo para preparar o café " +
                                "é muito longo e a temperatura da bebida é muito baixa (menos de 40 °C).\n" +
                                "• Resultado esperado: A temperatura do café deve ser padrão (cerca de 75 °C).\n" +
                                "• Grau de risco: Médio\n" +
                                "• Prioridade: Normal\n" +
                                "Que informações valiosas foram omitidas no relatório de defeitos acima?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Os resultados reais dos testes");
                        System.out.println("2- Identificação da versão testada do software");
                        System.out.println("3- Status do defeito");
                        System.out.println("4- Idéias para melhorar o caso teste");
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

                        System.out.println("Questão 39\n");
                        System.out.println("Qual dos seguintes é o MAIS provável que seja um benefício das " +
                                "ferramentas de execução de testes?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- É fácil criar testes de regressão");
                        System.out.println("2- É fácil manter o controle de versão dos ativos de teste");
                        System.out.println("3- É fácil projetar testes para testes de segurança");
                        System.out.println("4- É fácil executar testes de regressão");
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

                        System.out.println("Questão 40\n");
                        System.out.println("Qual das seguintes ferramentas de teste é mais adequada para " +
                                "desenvolvedores do que para testadores?");
                        System.out.println("Selecione uma opção\n");
                        System.out.println("1- Ferramentas de gerenciamento de requisitos");
                        System.out.println("2- Ferramentas de gerenciamento da configuração");
                        System.out.println("3- Ferramentas de gerenciamento de defeitos");
                        System.out.println("4- Ferramentas de teste de desempenho");
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
