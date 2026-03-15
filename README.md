## FoodSaver – Sistema de Controle de Alimentos

O FoodSaver é uma aplicação Java em console desenvolvida para ajudar no controle simples de alimentos cadastrados em uma lista.
O sistema permite registrar alimentos, visualizar itens cadastrados, buscar por nome, atualizar quantidades e remover itens da lista.
Este projeto foi criado com o objetivo de praticar conceitos fundamentais de Java e Programação Orientada a Objetos (POO).

# Problema

Muitas pessoas têm dificuldade em organizar alimentos que possuem em casa ou em pequenos negócios, como:

saber quais alimentos estão disponíveis;
controlar a quantidade de itens;
evitar compras duplicadas;
manter uma lista organizada de alimentos;

O FoodSaver resolve esse problema permitindo que o usuário registre e gerencie alimentos de forma simples diretamente pelo terminal.

# Funcionalidades

O sistema possui as seguintes funcionalidades:

Cadastrar um alimento;
Listar todos os alimentos cadastrados;
Buscar alimentos pelo nome;
Atualizar a quantidade de um alimento;
Remover um alimento da lista;
Exibir informações detalhadas dos alimentos;

Todos os dados são armazenados em memória utilizando uma lista (ArrayList).

# Conceitos de Java Utilizados

Este projeto utiliza apenas conceitos fundamentais da linguagem Java, como:

Programação Orientada a Objetos (POO);
Classes e Objetos;
Encapsulamento;
Construtores;
Estruturas condicionais;
Estruturas de repetição;
Listas (ArrayList);
Separação em camadas (Model, Repository, Service);

Nenhum framework ou biblioteca externa foi utilizado.

## Estrutura do Projeto

model

Contém as entidades do sistema.
Exemplo:

Food → representa um alimento com nome, categoria e quantidade.

repository

Responsável pelo armazenamento e manipulação dos dados, simulando um banco de dados utilizando uma lista (ArrayList).

Funções principais:

salvar alimentos;
buscar alimentos;
atualizar quantidade;
remover alimentos;
listar alimentos;

service

Contém a lógica de negócio do sistema, a camada de serviço faz a comunicação entre o menu do usuário e o repositório de dados.

main

Contém a classe responsável pela execução do programa e interação com o usuário, aqui está localizado o menu interativo do sistema.

## Fluxo de Funcionamento do Sistema

1 - O sistema inicia exibindo um menu no terminal
2 - O usuário escolhe uma opção
3 - O menu chama o FoodService para executar a ação
4 - O FoodService interage com o FoodRepository
5 - O FoodRepository manipula os dados armazenados na lista
6 - O resultado é exibido para o usuário no terminal

## Possíveis Melhorias Futuras

Algumas melhorias que podem ser implementadas no projeto:

Persistência de dados em arquivo;
Ordenação de alimentos por categoria;
Interface gráfica;
Controle de estoque mais avançado;
Criação de uma API REST;
Integração com banco de dados;

## Tecnologias Utilizadas

Java;
Git;
GitHub;
