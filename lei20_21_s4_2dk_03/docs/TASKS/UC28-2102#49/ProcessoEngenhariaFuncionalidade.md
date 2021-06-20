# UC28 - Comunicações realizadas através do protocolo estejam protegidas.-Serviços e RH
=======================================

# 1. Requisitos

Vai ser utilizado para garantir que as ligações estejam protegidas e os dados nao sao acedidos nem modificados por terceiros.

**Informações apontadas pelo cliente:**

- Nenhuma pergunta colocada no fórum.

# 2. Análise

## Regras de Negócio:

- Os TCP têm de ficar protegidos.

## Alterações ao Modelo de Domínio

- Nenhuma.

## Pré-Requisitos

Existir a aplicação Serviços e RH que implemente o protocolo SDP2021.

## Pós-Requisitos

As comunicações entre as aplicações estão protegidas.

# 3. Implementação

    // Trust these certificates provided by authorized clients
    System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
    System.setProperty("javax.net.ssl.trustStorePassword", KEYSTORE_PASS);

    // Use this certificate and private key as server certificate
    System.setProperty("javax.net.ssl.keyStore", TRUSTED_STORE);
    System.setProperty("javax.net.ssl.keyStorePassword", KEYSTORE_PASS);

# 4. Observações

- Proteção para as ligações ao servidor.