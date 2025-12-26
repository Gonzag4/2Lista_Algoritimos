# lista_2_Algoritimos

# Lista de Exercícios 02 – Listas Lineares e Algoritmos de Ordenação

## 📘 Descrição Geral

Este repositório contém as soluções desenvolvidas para a **Lista de Exercícios 02** da disciplina **Algoritmos e Estruturas de Dados (06214)**, do curso de **Bacharelado/Licenciatura em Ciência da Computação**, ofertada pelo **Departamento de Computação da Universidade Federal Rural de Pernambuco (UFRPE)**.

O trabalho tem como objetivo a **implementação manual de estruturas de dados e algoritmos clássicos**, respeitando rigorosamente as restrições impostas pela disciplina, sem o uso de estruturas prontas ou algoritmos otimizados fornecidos pelas linguagens de programação.

---

## 🏫 Informações Acadêmicas

- **Universidade:** Universidade Federal Rural de Pernambuco (UFRPE)  
- **Disciplina:** Algoritmos e Estruturas de Dados   
- **Professor:** Luciano Demétrio Santos Pacífico  
- **Lista:** Exercícios 02   
---

## ⚙️ Regras Atendidas

As implementações presentes neste repositório **atendem integralmente às regras definidas na lista**, dentre as quais destacam-se:

- ❌ Não utilização de estruturas de dados prontas da linguagem  
- ✅ Uso exclusivo de **arrays com alocação estática**  
- ✅ Implementação manual de:
  - Inserção  
  - Remoção  
  - Busca  
  - Visualização  
- ❌ Não utilização de algoritmos de ordenação prontos  
- ❌ Não utilização de métodos otimizados da linguagem  
- ✅ Uso apenas de:
  - Tipos primitivos  
  - Estruturas condicionais  
  - Estruturas de repetição  
  - Sub-rotinas (funções/métodos)  
  - Arrays e estruturas (structs/classes)  

---

## 🧩 Questões Implementadas

### 🔹 Questão 01 – Lista Linear Sequencial Ordenada (3,0 pontos)

Implementação de uma **Lista Linear Sequencial Ordenada em ordem crescente**, com as seguintes características:

- Capacidade inicial **M definida pelo usuário**
- Lista inicialmente vazia
- Impressão da lista exibindo posições não ocupadas como **NIL**
- Inserção ordenada
- Busca sequencial
- Remoção de elementos existentes
- Tratamento de erros para operações inválidas

#### 🔄 Redimensionamento da Estrutura
Quando a lista atinge sua capacidade máxima:
- Um novo array estático com capacidade **2 × M** é criado
- Todos os elementos são copiados manualmente
- O array antigo é substituído
- A nova capacidade é exibida ao usuário

#### 🧑‍💻 Interação
O programa possui um **menu interativo**, permitindo ao usuário executar todas as operações conforme desejado.

---

### 🔹 Questão 02 – Merge Sort (2,0 pontos)

Implementação completa do algoritmo **Merge Sort**, com instrumentação detalhada para acompanhamento da execução:

- Impressão do vetor original
- Impressão de mensagens a cada chamada:
  - `mergesort <p> <r>: empilhado!`
  - `mergesort <p> <r>: desempilhado!`
- Impressão de chamadas ao procedimento `merge <p> <q> <r>`
- Impressão do vetor após cada execução do `merge`
- Contagem total de chamadas ao procedimento `mergesort`

Toda a lógica de divisão, conquista e intercalação foi implementada manualmente.

---

### 🔹 Questão 03 – Quick Sort (2,5 pontos)

Implementação do **Quick Sort**, conforme a variação apresentada em sala de aula:

- Pivô definido como o **elemento mais à direita**
- Impressão do vetor original
- Impressão de mensagens a cada chamada:
  - `quicksort <p> <r>: empilhado!`
  - `quicksort <p> <r>: desempilhado!`
- Impressão das chamadas ao procedimento `particionar <p> <r>`
- Impressão do vetor após cada particionamento
- Contagem total de chamadas ao procedimento `trocar`

---

### 🔹 Questão 04 – Heap Sort (2,5 pontos)

Implementação completa do algoritmo **Heap Sort**, com:

- Impressão do vetor original
- Construção manual do **Max Heap**
- Impressão do vetor após `construirMaxHeap`
- Impressão de mensagens a cada chamada:
  - `maxheapfy <i>`
- Impressão do vetor após cada execução do `maxHeapfy`
- Contagem total:
  - de chamadas ao procedimento `trocar`
  - de chamadas ao procedimento `maxHeapfy`

---

## 🗂️ Organização dos Arquivos

Os arquivos seguem o padrão exigido pela disciplina:



 colocando atualização 