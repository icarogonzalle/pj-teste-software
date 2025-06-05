# Projeto de Teste da Classe Pedido

Este é um projeto acadêmico simples desenvolvido para a disciplina de Teste de Software.  
Seu objetivo é aplicar testes unitários com **JUnit 5** sobre a classe `Pedido`, que simula o controle de pedidos de um cliente.

## 💡 Sobre o Projeto

A classe `Pedido` permite:

- Adicionar itens com nome, preço e quantidade.
- Calcular o total do pedido.
- Verificar a quantidade total de itens.
- Finalizar e cancelar o pedido, respeitando regras de negócio.

O sistema implementa validações como:

- Impedir adição de itens após o pedido ser finalizado.
- Proibir finalização de pedidos vazios.
- Proibir cancelamento após finalização.

## ✅ Testes Automatizados

Os testes foram desenvolvidos utilizando o **JUnit 5** e cobrem os seguintes pontos:

- Adição de itens válidos
- Cálculo do valor total
- Contagem de itens
- Finalização e cancelamento de pedidos
- Lançamento de exceções em cenários inválidos
- Testes dos getters principais

## 🛠️ Tecnologias Utilizadas

- Java 17+
- JUnit 5
- IntelliJ IDEA (recomendado)

## 🚀 Como executar os testes

1. Clone este repositório:
   ```bash
   git clone git@github.com:icarogonzalle/pj-teste-software.git
