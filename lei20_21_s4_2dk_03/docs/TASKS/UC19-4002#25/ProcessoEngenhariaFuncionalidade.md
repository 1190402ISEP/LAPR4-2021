# UC19 - O motor de fluxo de atividades disponibilize os dados necessários
=======================================

# 1. Requisitos

## Informações dadas pelo cliente

->Deve ser usado o protocolo de aplicação fornecido (SDP2021).

->Deve ser suportado o processamento simultaneo de pedidos.

->Sugere-se que desde já seja considerada a adoção de mecanismos concorrente (e.g. threads) e partilha de estado entre
esses mecanismos.

->Neste sprint, para efeitos de demonstração, é aceitável que o processamento associado a algumas destas comunicações
seja apenas simulado (mock).

# 2. Análise

## Regras de negócio

->Será necessário usar o protocolo de aplicação fornecido (SDP2021), c.f.
[Protocolo de Comunicação](https://moodle.isep.ipp.pt/pluginfile.php/126996/mod_resource/content/1/LEI-2020-21-Sem4-Projeto_v0-ProtocoloComunicacao.pdf)

->Devemos usar threads por exemplo para que o processamento em simultaneo de pedidos permita a partilha de estado entre
os mecanismos.

## Testes a Efetuar

->Testes em que o processamento as comunicações seja simulado, utilizando mock.

## Alterações ao Modelo de Domínio

**Não será necessária para já qualquer alteração ao modelo de domínio sendo que este representa bem os conceitos.**

# 3. Design

## 3.1. Realização da Funcionalidade

Exemplos de código nas classes TcpCliSum e TcpSrvSum disponibilizadas.

# 4. Implementação

Esta UC seguiu o código disponibilizado pelos professores de RCOMP.

# 5. Integração/Demonstração

*Nesta secção a equipa deve descrever os esforços realizados no sentido de integrar a funcionalidade desenvolvida com as
restantes funcionalidades do sistema.*

# 6. Observações

Algumas dificuldades nas conexões.