# 📚 Sistema de Gerenciamento de Livraria

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![POO](https://img.shields.io/badge/Paradigma-POO-blue?style=for-the-badge)

Este projeto é uma simulação acadêmica de uma livraria desenvolvida em **Java**. O objetivo principal foi aplicar conceitos avançados de Programação Orientada a Objetos (POO) e seguir princípios de escrita de código limpo (*Clean Code*) para criar um sistema de gestão de estoque e vendas.

## 🎯 Objetivo do Projeto
Desenvolver uma aplicação funcional que permita o cadastro de produtos, controle de estoque, aplicação de regras de negócio (como descontos) e processamento de vendas, garantindo a integridade dos dados e a facilidade de manutenção.

---

## 🛠️ Tecnologias e Conceitos Aplicados

Neste projeto, foram implementados os pilares fundamentais da POO:

* **Abstração:** Criação de classes que representam entidades do mundo real de forma simplificada.
* **Encapsulamento:** Proteção dos dados através de modificadores de acesso e métodos acessores (Getters/Setters).
* **Herança:** Reaproveitamento de código através de uma classe base `Produto` para especializações.
* **Polimorfismo:** Métodos que se comportam de formas diferentes dependendo do tipo do objeto (ex: cálculo de descontos).

### Boas Práticas Utilizadas
* **Princípios SOLID:** Foco em Responsabilidade Única (SRP) para manter as classes coesas.
* **Tratamento de Exceções:** Uso de `try-catch` e exceções personalizadas para lidar com erros de estoque ou entrada.
* **Clean Code:** Nomes de variáveis semânticos, métodos curtos e código legível.

---

## 🏗️ Estrutura do Projeto

A organização do código segue o seguinte padrão:

* `models/`: Entidades principais do sistema (Livro, Revista, Ebook, etc.).
* `services/`: Classes responsáveis pela lógica de negócio e regras de venda.
* `repository/`: Simulação da persistência de dados em memória.
* `Main.java`: Ponto de entrada para execução da simulação.

---

## 🚀 Como Executar

1. Certifique-se de ter o **JDK 11** ou superior instalado.
2. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/nome-do-repositorio.git](https://github.com/seu-usuario/nome-do-repositorio.git)
