# UC32 - Realizar tarefa pendente
=======================================

# 1. Requisitos

O colaborador realiza a tarefa pendente a ele assinada.

**Informações apontadas pelo cliente:**

## Thursday, 10 de June de 2021 às 13:06

Na US 3023 (Como utilizador, eu pretendo realizar uma tarefa que tenho como pendente.), temos como critérios de
aceitação que "As expressões da linguagem/gramática desenvolvida devem ser executadas/interpretadas (e.g. validação do
formulário associado).". Significa então que após o utilizador selecionar uma tarefa para realizar, serão solicitados os
campos (atributos) do formulário associado a essa tarefa a preencher e à medida que são introduzidos os dados, devemos
invocar os listeners e visitors da nossa gramática de modo a validar o que é inserido?

    RESPOSTA: sto não me parece exatamente um pergunta para cliente... é mais técnica (listeners e visitors)!
    Contudo, parece-me que estás no bom caminho. Saliento apenas que o script de validação de formulário normalmente é executado após os dados do formulário estarem todos preenchidos... portanto, pode não ser "à medida que são introduzidos os dados".

## Saturday, 5 de June de 2021 às 00:05

Um utilizador que realize uma tarefa de aprovação deve indicar se aprova a tarefa antes ou depois de preencher o
formulário de aprovação?

    RESPOSTA: Parece-me que nem é antes nem depois: é em simultâneo.
    Isto é, quando o utilizador indica que pretende realizar uma tarefa de aprovação que tem pendente, 
    o sistema mostra-lhe os dados do pedido respetivo e solicita-lhe o preenchimento do respetivo formulário e consequente decisão (aprova ou rejeita). 
    Após preenchimento destas duas coisas, o sistema regista a informação e prossegue em conformidade.
    Não é suposto o utilizador preencher o formulário e não indicar a sua decisão ou vice-versa. Tem que preencher toda a informação.

# 2. Análise

## Regras de Negócio:

- As expressões da linguagem/gramática desenvolvida devem ser executadas/interpretadas.

## Alterações ao Modelo de Domínio

- Nenhuma.

## Pré-Requisitos

Existir uma tarefa atribuída ao colaborador.

## Pós-Requisitos

A tarefa é finalizada.

# 3. Design

## 3.1. Realização da Funcionalidade

![SD](SD.svg)

## 3.2. Padrões Aplicados

*Nesta secção deve apresentar e explicar quais e como foram os padrões de design aplicados e as melhores práticas.*

# 4. Implementação

*Nesta secção a equipa deve providenciar, se necessário, algumas evidências de que a implementação está em conformidade
com o design efetuado. Para além disso, deve mencionar/descrever a existência de outros ficheiros (e.g. de configuração)
relevantes e destacar commits relevantes;*

*Recomenda-se que organize este conteúdo por subsecções.*

# 5. Integração/Demonstração

*Nesta secção a equipa deve descrever os esforços realizados no sentido de integrar a funcionalidade desenvolvida com as
restantes funcionalidades do sistema.*

# 6. Observações

*Nesta secção sugere-se que a equipa apresente uma perspetiva critica sobre o trabalho desenvolvido apontando, por
exemplo, outras alternativas e ou trabalhos futuros relacionados.*