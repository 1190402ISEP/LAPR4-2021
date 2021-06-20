package eapli.base.app.servicoserecursoshumanos.presentation.servico;

import eapli.base.catalogoServico.domain.CatalogoServico;
import eapli.base.formulario.domain.TipoDadosBaseAtributo;
import eapli.base.servico.application.EspecificarServicoController;
import eapli.base.servico.domain.*;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Especificar servico ui.
 */
public class EspecificarServicoUI extends AbstractUI {
    private final EspecificarServicoController theController = new EspecificarServicoController();

    @Override
    protected boolean doShow() {
        int firstCheck = Console.readInteger("Quer criar um novo serviço?\n1-Sim|0-Nao");

        while (firstCheck == 1) {
            List<KeyWordServico> keyWords = new ArrayList<>();
            final String codigoUnicoServico = Console.readLine("\nCódigo Interno Único:");
            final String tituloServico = Console.readLine("\nTitulo:");
            final int qtdKeyWords = Console.readInteger("\nQuantas KeyWords pretende adicionar:");

            if (qtdKeyWords > 0) {
                for (int i = 0; i < qtdKeyWords; i++) {
                    final String keyWord = Console.readLine("\nKeyWord:");
                    KeyWordServico kws = new KeyWordServico(keyWord);
                    if (keyWords.isEmpty()) {
                        keyWords.add(kws);
                    } else {
                        if (!keyWords.contains(kws)) {
                            keyWords.add(kws);
                        } else {
                            System.out.print(StringColors.YELLOW + "\nKeyWord repetida." + StringColors.RESET);
                            i--;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Tem de colocar pelo menos 1 keyWord.");
            }

            this.theController.adicionarServico(codigoUnicoServico, tituloServico, keyWords);

            int decisaoIcon = Console.readInteger("\nDeseja Inserir um Ícone?\n1-Sim|0-Nao");

            if (decisaoIcon == 1) {
                String icone = Console.readLine("\nInsira o caminho para o ícone que pretende:");
                this.theController.associarIcone(icone);
            }

            int decisaoCatalogo = Console.readInteger("\nDeseja Inserir Catálogo?\n1-Sim|0-Nao");

            if (decisaoCatalogo == 1) {
                this.theController.showListOfCatalogos();
                String catID = Console.readLine("\nInsira o Código do catálogo Correspondente:");
                this.theController.associarCatalogo(catID);
            }

            int decisaoNivel = Console.readInteger("\nDeseja Inserir Nível?\n1-Sim|0-Nao");

            if (decisaoNivel == 1) {
                this.theController.showListOfNiveis();
                String eti = Console.readLine("\nInsira a etiqueta do nível correspondente:");
                this.theController.associarNivel(eti);
            }

            int decisaoDescBreve = Console.readInteger("\nDeseja associar Descrição Breve?\n1-Sim|0-Nao");

            if (decisaoDescBreve == 1) {
                String descBreve = Console.readLine("\nInsira a descrição breve:");
                this.theController.associarDescricaoBreve(descBreve);
            }

            int decisaoDescCompleta = Console.readInteger("\nDeseja associar Descrição Completa?\n1-Sim|0-Nao");

            if (decisaoDescCompleta == 1) {
                String descCompleta = Console.readLine("\nInsira a descrição completa:");
                this.theController.associarDescricaoCompleta(descCompleta);
            }

            int decisaoObjetivo = Console.readInteger("\nDeseja associar objetivo distinto?\n1-Sim|0-Nao");

            if (decisaoObjetivo == 1) {
                String objetivo = Console.readLine("\nInsira o objetivo distinto:");
                this.theController.associarObjetivo(objetivo);
            }

            int decisaoFormulario = Console.readInteger("\nDeseja associar formulário?\n1-Sim|0-Nao");

            if (decisaoFormulario == 1) {
                createFormulario(0);//Opção 0 cria formulário para serviço
            }

            int decisaoFluxoDeAtividade = Console.readInteger("\nDeseja criar um fluxo de atividade?\n1-Sim|0-Nao");
            if (decisaoFluxoDeAtividade == 1) {
                createFluxo();
                theController.associarFluxoDeAtividade();
            }

            try {
                this.theController.build();
            } catch (final IntegrityViolationException | ConcurrencyException e) {
                System.out.println(StringColors.YELLOW + "\nNão foi possível criar o serviço!" + StringColors.RESET);
            }
            System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                    "Serviço criado com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);

            firstCheck = Console.readInteger("\nQuer criar um novo serviço?\n1-Sim|0-Nao");
        }

        System.out.println(StringColors.CYAN + "\n\n--------------------------------------------------------------------------------" + StringColors.RESET);

        int secondCheck = Console.readInteger("\nAtualizar um serviço incompleto?\n1-Sim|0-Nao");

        while (secondCheck == 1) {
            this.theController.showListOfServicosIncompletos();
            String codigoServico = Console.readLine("\nCódigo do serviço: ");
            Servico servico = this.theController.getServico(codigoServico);

            if (servico.getCatalogo() == null) {
                int decisaoCatalogo = Console.readInteger("\nDeseja Inserir Catálogo?\n1-Sim|0-Nao");

                if (decisaoCatalogo == 1) {
                    this.theController.showListOfCatalogos();
                    String catID = Console.readLine("\nInsira o Código do catálogo Correspondente:");
                    CatalogoServico cat = this.theController.getCatalogo(catID);
                    servico.associarCatalogo(cat);
                }
            }

            if (servico.getDescBreve() == null) {
                int decisaoDescBreve = Console.readInteger("\nDeseja associar Descrição Breve?\n1-Sim|0-Nao");

                if (decisaoDescBreve == 1) {
                    String descBreve = Console.readLine("\nInsira a descrição breve:");
                    servico.associarDescricaoBreve(new DescricaoBreveServico(descBreve));
                }
            }

            if (servico.getDescCompleta() == null) {
                int decisaoDescCompleta = Console.readInteger("\nDeseja associar Descrição Completa?\n1-Sim|0-Nao");

                if (decisaoDescCompleta == 1) {
                    String descCompleta = Console.readLine("\nInsira a descrição completa:");
                    servico.associarDescricaoCompleta(new DescricaoCompletaServico(descCompleta));
                }
            }

            if (servico.getObjetivo() == null) {
                int decisaoObjetivo = Console.readInteger("\nDeseja associar objetivo distinto?\n1-Sim|0-Nao");

                if (decisaoObjetivo == 1) {
                    String objetivo = Console.readLine("\nInsira o objetivo distinto:");
                    servico.associarObjetivo(new ObjetivoServico(objetivo));
                }
            }

            if (servico.getFormulario() == null) {
                int decisaoFormulario = Console.readInteger("\nDeseja associar formulário?\n1-Sim|0-Nao");

                if (decisaoFormulario == 1) {
                    createFormulario(0);//Opção 0 cria formulário para serviço
                }
            }

            servico.checkNulls();
            this.theController.saveServico(servico);

            System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                    "Serviço atualizado com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);

            secondCheck = Console.readInteger("\nAtualizar um serviço incompleto?\n1-Sim|0-Nao");
        }

        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Função acabada com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);

        return false;
    }


    /**
     * Create fluxo.
     */
    public void createFluxo() {
        String dataDeEntradaEmVigor = Console.readLine("\nInsira a data de entrada em vigor do fluxo:(dd/mm/aaaa)");
        String horaDeEntradaEmVigor = Console.readLine("\nInsira a hora de entrada em vigor do fluxo: (hh:mm)");
        int sentidoDeAplicacao = Console.readInteger(StringColors.PURPLE + "\n==================SentidoAplicação==================\n1-> Sentido Lato\n2-> Sentido Restrito\n\nInsira o número do sentido que pretende:" + StringColors.RESET);

        this.theController.iniciarDefinicaoDeFluxoDeAtividade(dataDeEntradaEmVigor, horaDeEntradaEmVigor, sentidoDeAplicacao);

        int nrAtividades = Console.readInteger("\nInsira o número de atividades que pretende associar ao fluxo:");

        if (nrAtividades > 0) {
            for (int i = 0; i < nrAtividades; i++) {
                final int decisaoTipoAtividade = Console.readInteger(StringColors.PURPLE + "\n==================TipoAtividade==================\n1-> Manual\n2-> Automática\n\nInsira o número do tipo de atividade que pretende:" + StringColors.RESET);

                //atividade manual
                if (decisaoTipoAtividade == 1) {
                    String descricao = Console.readLine("\nInsira a descrição da atividade manual:");
                    int ordemExecucao = Console.readInteger("\nInsira a ordem de execução:");
                    int delay = Console.readInteger("\nInsira o delay:");
                    this.theController.novaAtividadeManual(descricao, delay);
                    int decisaoAdicionarColaboradoresOuEquipa = Console.readInteger("\nDeseja inserir equipa responsável ou colaboradores específicos:\n\n1-Equipa responsável\n2-Colaboradores específicos");

                    //equipa responsavel
                    if (decisaoAdicionarColaboradoresOuEquipa == 1) {
                        this.theController.mostrarTodasAsEquipas();
                        String equipa = Console.readLine("\nInsira o id da equipa:");
                        this.theController.adicionarEquipaParaResolver(equipa);
                    }

                    if (decisaoAdicionarColaboradoresOuEquipa == 2) {
                        this.theController.mostrarTodosOsColaboradores();
                        String mecanographicNumber = Console.readLine("\nIntroduza o numero mecanográfico:");
                        this.theController.associarColaborador(mecanographicNumber);
                        int decisaoAdicionarFormulario = Console.readInteger("\nDeseja associar um formulário?\n\n0-Não\n1-Sim");
                        if (decisaoAdicionarFormulario == 1) {
                            createFormulario(1);//Opção 1 cria formulário para Atividade Manual
                        }
                    }
                    this.theController.adicionarAtividadeManual(ordemExecucao);
                } else if (decisaoTipoAtividade == 2) { //Atividade Automática
                    String descricao = Console.readLine("\nInsira a descrição:");
                    int ordemExecucao = Console.readInteger("\nInsira a ordem de execução:");
                    int delay = Console.readInteger("\nInsira o delay:");
                    String ficheiroScript = Console.readLine("\nInsira o ficheiro do script para associar a atividade automática:");

                    this.theController.novaAtividadeAutomatica(descricao, delay, ficheiroScript, ordemExecucao);
                }
            }
        }
    }

    /**
     * Create formulario.
     *
     * @param option the option caso seja 0 associa um formulário ao serviço caso seja 1 associa à atividade manual
     */
    public void createFormulario(int option) {
        /*opção 0 equivale a formulário para serviço|opção 1 equivale a formulário para atividade*/
        System.out.println("\nInsira os dados do formulário:");

        //formulario
        String nomeFormulario = Console.readLine("\nInsira o nome do formulário:");
        this.theController.criarFormulario(nomeFormulario);
        int quantidadeAtributos = Console.readInteger("\nInsira a quantidade de atributos a adicionar:");

        for (int i = 0; i < quantidadeAtributos; i++) {
            //atributo requerido
            String nomeVariavelAtributo = Console.readLine("\nInsira o nome do atributo:");
            String etiquetaApresentacaoAtributo = Console.readLine("\nInsira a etiqueta de apresentação do atributo:");
            String descricaoAjudaAtributo = Console.readLine("\nInsira a descrição de ajuda do atributo:");

            this.theController.mostrarTipoDadosBaseAtributo();
            String tipoDadosBaseAtributo = Console.readLine("\nInsira o tipo de dados base do atributo:");
            TipoDadosBaseAtributo tipo = this.theController.confirmTipoDados(tipoDadosBaseAtributo);

            String expressaoRegularAtributos = Console.readLine("\nInsira a expressão regular do atributo:");
            this.theController.createAtributo(nomeVariavelAtributo, etiquetaApresentacaoAtributo, descricaoAjudaAtributo, tipo, expressaoRegularAtributos);
        }
        this.theController.guardarFormulario(option);
    }

    @Override
    public String headline() {
        return "EspecificarServicoUI";
    }
}