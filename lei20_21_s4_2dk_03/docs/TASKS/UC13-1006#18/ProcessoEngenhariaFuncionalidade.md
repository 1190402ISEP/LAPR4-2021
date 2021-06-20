# UC13 - Desenvolver tarefa automática 
=======================================

# 1. Requisitos

*Nesta secção a equipa deve indicar a funcionalidade desenvolvida bem como descrever a sua interpretação sobre a mesma e sua correlação e/ou dependência de/com outros requisitos.*

### Pré-requisitos
*É necessário o utilizador estar previamente registado como colaborador*

### Pós-requisitos
*É definida uma atividade automática*
*Uma atividade automática é adicionada à biblioteca de atividades*

# Informações da parte do cliente:

## Monday, 17 de May de 2021 às 12:54

Relativamente às User Stories:

"US 1005 - Como Gestor de Projeto, eu pretendo que seja desenvolvida a componente representativa de uma tarefa manual dedicada à apresentação e recolha de informação a/de um utilizador no âmbito de um pedido e que a mesma seja adicionada à biblioteca de atividades típicas do sistema para, dessa forma, poder ser usada na definição de fluxos de atividades." e

"US 1006 - Como Gestor de Projeto, eu pretendo que seja desenvolvida a componente representativa de uma tarefa automática dedicada à execução de um script no âmbito de um pedido e que a mesma seja adicionada à biblioteca de atividades típicas do sistema para, dessa forma, poder ser usada na definição de fluxos de atividades."


    urge esclarecer o seguinte:

    1. Estas US não devem ser vistas como casos de uso onde há um ator e uma UI para realizar a mesma. Pelo contrário, notem que quem aparece associado às US é o "Gestor de Projeto" que não é ator em nenhuma das aplicações em desenvolvimento.

    2. Assim, estas duas US correspondem a itens de trabalho de caracter mais técnico que visam permitir ao sistema como um todo (e não apenas à aplicação X ou Y) reconhecer e lidar com diferentes tipos de atividades. De momento, o sistema apenas precisa de reconhecer dois tipos de atividades (i) manual e (ii) automática baseada em script. Contudo, o sistema deve estar preparado para facilmente suportar outros tipos de atividades (e.g. executar uma bash file).

    3. O conjunto de tipos de atividades reconhecidos pelo sistema é denominado de "biblioteca de atividades típicas". Portanto, cada uma destas US visa tecnicamente acrescentar um tipo de atividades a esta biblioteca.

    4. As atividades a incluir no fluxo de atividades de um serviço (no máximo duas) têm que ser de um tipo de de atividade existente nesta biblioteca. Neste caso ou serão do tipo "manual" ou do tipo "automática baseada em script". Contudo, notem que futuramente podem ser de outro tipo. O tipo de atividade determina a informação a solicitar para que a atividade fica especificada.

    Espero que esta informação/esclarecimento vos seja proveitoso e evite confusões desnecessárias.


#Tuesday, 18 de May de 2021 às 09:48

Gostaria de esclarecer uma dúvida que nos surgiu com este esclarecimento.
Existem estas duas componentes, estes dois tipos de atividades: manual e automática (baseada em script), reconhecidas pelo sistema na tal "biblioteca de atividades". E parece-me natural que possam ser adicionados outros tipos futuramente.

No entanto, fico na dúvida na inter-relação destas componentes com os conceitos de atividade de aprovação e de resolução (e outros que também possam surgir):
- Uma maneira simples de pensar seria que um Gestor de Serviços, ao especificar o fluxo de um serviço, escolhia se a um determinado ponto do fluxo (claro que neste caso o fluxo está simplificado) quer uma atividade manual ou automática, e essa atividade seria estão, por exemplo, a de resolução. Ou seja, os conceitos de atividade de aprovação, resolução, etc. não seriam conceitos "reais", mas apenas nomes "relativos". Exemplo: O fluxo do serviço X tem uma atividade manual (corresponde a de aprovação) e de seguida uma automática (resolução).

O problema principal desta interpretação é que, como o sistema não conheceria realmente os conceitos de aprovação e resolução, não é possível garantir regras do género "uma atividade de aprovação é sempre manual", pois o "cargo" de ser atividade de aprovação não seria algo reconhecido.
- A única forma que vemos, para já, que resolva esta situação seria haver duas "bibliotecas" de conceitos. Numa, o sistema reconhece tipos de atividade: manuais, automáticas, etc., e outra reconhece conceitos como atividade de aprovação, de resolução, etc. (e então cada uma poderia ter restrições quanto ao seu tipo de atividade).

Mas claro, isto é uma interpretação muito especulativa. Queríamos, por isso, confirmar com o cliente se tem alguma outra interpretação/solução mais adequada em mente para esta situação, ou se de facto nos escapou algo na interpretação destas funcionalidades/esclarecimentos.

#Tuesday, 18 de May de 2021 às 15:15

Após novas reuniões em equipa e de reanalisar todos os requisitos e discussões sobre este tema, detetamos que tínhamos interpretado erradamente alguns conceitos, o que estava a gerar complicação desnecessária.
Por causa disso, apesar desta pergunta que coloquei anteriormente tocar nalguns aspetos importantes, as alternativas que apresentamos como possíveis soluções deixaram de fazer grande sentido à luz do que é requisitado pelo cliente.

    Resposta: Aproveito e reforço o que eu já disse transmitindo-vos uma indicação que o meu suporte técnico considera útil para vós.
    O resultado prático expectável destas duas US é basicamente duas classes java (uma por cada US) correspondentes aos conceitos em causa e a capacidade do sistema reconhecer as mesmas bem como suportar facilmente a adição futura de outras semelhantes (e.g. atividade automática para executar uma bash file).

#Friday, 14 de May de 2021 às 00:01

Existe alguma diferença na especificação da tarefa manual e automática além do seu tipo? Eu sei que estas são executadas por colaboradores no caso de serem manuais, ou por scripts no caso de serem automáticas, mas isso só será necessário especificar por quais dos colaboradores ou scripts é que irá ocorrer, na adição da tarefa a um fluxo de atividades, na sua especificação isso informação será irrelevante. Ou estou a ver as coisas da forma errada?

    Resposta:
    Eu acho que na tua própria pergunta já identificaste diferenças entre os dois tipos de tarefas e informação associada a cada uma.
    Não compreendo é a parte em que concluís que essa informação é irrelevante. É irrelevante para o quê?
    Tens que tentar perceber em que momento essa informação é recolhida e posteriormente usada.

#Tuesday, 1 de June de 2021 às 23:45

Após ter lido a sua resposta à seguinte pergunta: https://moodle.isep.ipp.pt/mod/forum/discuss.php?d=8529, fiquei com uma pequena dúvida. Para além dos dados que referiu, não devia ser apresentada uma pequena descrição relacionada com a tarefa a realizar? Como é que o utilizador vai saber o que fazer aquando da realização de uma tarefa se esta não possui título nem descrição quando é listada?

    Resposta:
    Na informação que indiquei consta (i) o serviço e (ii) o tipo de tarefa (aprovação ou realização).
    Essa informação é suficiente para enquadrar o utilizador com o objetivo da tarefa.
    Posteriormente, aquando da realização da tarefa (US 3023) a informação do pedido (ticket) em que a tarefa é executada deve ser exibida ao utilizador de modo a contextualiza-lo com o que é efetivamente suposto ser feito.
    Por exemplo, o mesmo utilizador pode ter duas tarefas manuais de realização (i.e. T1 e T2) sendo cada uma respeitante a um pedido distinto, P1 e P2 respetivamente, e ambos os pedidos serem relativos ao mesmo serviço S que visa solicitar cotações de produtos. Aquando da realização da tarefa T1 o sistema deve apresentar ao utilizador a informação constante do pedido P1 onde, por exemplo, consta um pedido de cotação para o produto Y. Por outro lado, aquando da realização da tarefa T2 o sistema deve apresentar ao utilizador a informação constante do pedido P2 onde, por exemplo, consta um pedido de cotação para o produto Z.
    Portanto, o objetivo de ambas as tarefas é o mesmo mas o "alvo" é distinto e depende da informação constante no pedido.

# 2. Análise

*Neste secção a equipa deve relatar o estudo/análise/comparação que fez com o intuito de tomar as melhores opções de design para a funcionalidade bem como aplicar diagramas/artefactos de análise adequados.*

- Um colaborador possui uma lista de atividades(tarefas).
- Cada atividade é identificada pelo IdAtividade,posssui um estado (EstadoAtividade), um delay e pode ser Automática ou Manual.
- Atividades automáticas utilizam um script e recorrem a uma linguagem.

## Regras de Negócio:

- Cada atividade está devidamente formulada;
- O script é associado à atividade automática quando esta é definida;
- Somente atividades no estado pendente devem ser mostradas ao colaborador;
- A definição de uma atividade automática está inclusa aquando da sua inclusão num fluxo de atividades;

## Alterações ao Modelo de Domínio

**Não será necessária para já qualquer alteração ao modelo de domínio sendo que este representa bem os conceitos.**

# 3. Design

*Nesta secção a equipa deve descrever o design adotado para satisfazer a funcionalidade. Entre outros, a equipa deve apresentar diagrama(s) de realização da funcionalidade, diagrama(s) de classes, identificação de padrões aplicados e quais foram os principais testes especificados para validar a funcionalidade.*

*Para além das secções sugeridas, podem ser incluídas outras.*

## 3.1. Realização da Funcionalidade

*Nesta secção deve apresentar e descrever o fluxo/sequência que permite realizar a funcionalidade.*

### Diagrama de sequência

*A definição de uma tarefa automática é executada na user story 2002, onde ao definir um serviço se define também um fluxo de atividades e nele se colocam e definem todas as atividades.*

![DefinirFluxoDeAtividade.svg](../../../../../../../UC13-1006%2318%20Tarefa%20Automática/DefinirFluxoDeAtividade.svg)

## 3.2. Padrões Aplicados

*Nesta secção deve apresentar e explicar quais e como foram os padrões de design aplicados e as melhores práticas.*

3.2.1 User Interface

O padrão User Interface é usado a fim de providenciar uma interface de uso simples ao Utilizador, para que haja separação das restantes partes do sistema.

3.2.2 Controller

O padrão Controller foi utilizado para que exista um controlador, que possa funcionar como organizador da lógica do caso de uso.

3.2.3 Information Expert

Este padrão atribui às classes a responsabilidade por aquele domínio de negócio que ela representa, como é o caso de Atividade.

3.2.4 Creator

Geralmente regra 1 e 2, neste caso de uso o creator foi utilizado por Colaborador para instanciar um colaborador.

3.2.5 High-Cohesion, Low-Coupling

Padrão utilizado para diminuir o acoplamento entre as classes e ao mesmo tempo só lhes atribuir associações que realmente sejam coesas com o seu propósito.
Em todo este caso de uso tentam-se restringir as responsabilidades próprias a cada classe e assim minimizar as associações ao necessário apenas.

3.2.6 Repository e Factory

O padrão Repository e o Factory ajudam na persistência, armazenamento e acesso aos dados. É utilizado na camada da Persistence, de modo a garantir a instanciação de AtividadeRepository, onde se guarda e se pode aceder às atividades, e ColaboradorRepository, onde se guarda e se pode aceder aos Colaboradores da organização.
Porém, antes dessa instanciação é utilizada a interface PersistenceContext para se poder aceder à fábrica de repositórios RepositoryFactory e nela ir buscar os repositórios ditos anteriormente, entrando em harmonia com a estrutura do projeto. Abstrai os detalhes de métodos que modificam o estado deste objeto.

## 3.3. Testes
**Os testes seguintes seguem as regras de negócio de atividade e de atividade automática, sendo que todas as entidades envolventes às atividades também estão testadas**

**Teste 1:** Recusar Delay de Atividade menor que zero

	@Test(expected = IllegalArgumentException.class)
    public void recusarDelayMenorQueZero() {
        Atividade at = new Atividade("desc", -2);
    }

**Teste 2:** Recusar Delay de Atividade Igual a zero

    @Test(expected = IllegalArgumentException.class)
    public void recusarDelayIgualAZero() {
        Atividade at = new Atividade("desc", 0);
    }

**Teste 3:** Aceitar Delay de Atividade Maior que zero

    @Test
    public void aceitarDelayMaiorQueZero() {
        Atividade at = new Atividade("desc", 2);
    }

**Teste 4:** Não aceitar Descrição de Atividade Nula

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoNull() {
        DescricaoAtividade desc = new DescricaoAtividade(null);
    }

**Teste 5:** Não aceitar Descrição de Atividade com mais de 500 caracteres

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoComMaisDe500Caracteres() {
    DescricaoAtividade desc = new DescricaoAtividade("tmeppmnorbgowrbgowujgbwrogbrwugbrwogbrugbrgefefe" +
    "rgorwugborwgubrgobrgourwgborugbrowugborworwbrwobrugbrogrbgourbgwffffffffffffffffffffffffffffffffffffffff" +
    "rwgrowgbwrogrwogrwfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff33333f3f3" +
    "gorweeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeiehoeihboubfoubfoççbobouqbofbqoeqbqbfoqfboqebfo" +
    "gorwfffffffffffffffffffffffffffffffeeeeeeeeeeeeeeeeeeeeeeeelfqlfqneqlfkqlfeqnlfeqnflkqeflqfnqelnfeqkfq" +
    "ogrwgbrowugbrwogbrwogbrwogbrwogubrgbrogbrubrwogbrwofipeqfpenvjq ojegpqejgqgeqgqegeqg");
    }

**Teste 6:** Não aceitar Descrição de Atividade Vazia

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoVazia() {
        DescricaoAtividade desc = new DescricaoAtividade("");

    }

**Teste 7:** Aceitar Descrições de Atividade válidas

    @Test
    public void aceitarDescricaoValida() {
        DescricaoAtividade desc = new DescricaoAtividade("Programar");
    }
# 4. Implementação

*Nesta secção a equipa deve providenciar, se necessário, algumas evidências de que a implementação está em conformidade com o design efetuado. Para além disso, deve mencionar/descrever a existência de outros ficheiros (e.g. de configuração) relevantes e destacar commits relevantes;*

*Recomenda-se que organize este conteúdo por subsecções.*

# 5. Integração/Demonstração

*Nesta secção a equipa deve descrever os esforços realizados no sentido de integrar a funcionalidade desenvolvida com as restantes funcionalidades do sistema.*

# 6. Observações

*Nesta secção sugere-se que a equipa apresente uma perspetiva critica sobre o trabalho desenvolvido apontando, por exemplo, outras alternativas e ou trabalhos futuros relacionados.*
