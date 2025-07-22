# eBank - Sistema Bancário em Java

Um projeto acadêmico de sistema bancário simples desenvolvido em Java, utilizando conceitos de Programação Orientada a Objetos (POO), herança, classes abstratas e a biblioteca Lombok para reduzir o código boilerplate.

---

## 🚀 Funcionalidades

As principais funcionalidades deste sistema incluem:

* **Criação de Contas**: Permite a abertura de Contas Correntes e Contas Poupança.
* **Gestão de Clientes**: Associação de clientes às suas respectivas contas.
* **Operações Bancárias Básicas**:
    * Depósito
    * Saque
    * Transferência entre contas (futura implementação)
* **Herança e Polimorfismo**: Utilização de uma classe abstrata `Conta` para modelar comportamentos comuns e subclasses específicas para `ContaCorrente` e `ContaPoupanca`.

---

## 🛠️ Tecnologias Utilizadas

* **Java 17+**: Linguagem de programação principal.
* **Lombok**: Para geração automática de getters, setters, construtores, etc., simplificando o código.

---

## ⚙️ Como Executar o Projeto

Siga os passos abaixo para clonar e executar o projeto em sua máquina local.

### Pré-requisitos

Certifique-se de ter os seguintes softwares instalados:

* **Java Development Kit (JDK)** versão 17 ou superior.
* Uma **IDE** como IntelliJ IDEA, Eclipse ou VS Code com o plugin do Java.
* **Plugin do Lombok** instalado na sua IDE (essencial para que a IDE reconheça os métodos gerados pelo Lombok).
* **Git** (para clonar o repositório).

### Passos

1.  **Clone o repositório:**
    ```bash
    git clone git@github.com:nobregasylvio/ebank-DIO.git
    cd ebank-DIO
    ```

2.  **Abra o projeto na sua IDE:**
    * **IntelliJ IDEA**: `File > Open > Selecione a pasta 'ebank-DIO'`.
    * **Eclipse**: `File > Import > Maven > Existing Maven Projects > Selecione a pasta 'seu-projeto-banco'`.

3.  **Instale as dependências (se estiver usando Maven/Gradle):**
    * Sua IDE geralmente fará isso automaticamente ao importar o projeto. Se não, no terminal na raiz do projeto:
        ```bash
        # Para Maven
        mvn clean install
        ```
      *(Você pode pular este passo se não estiver usando Maven/Gradle e estiver compilando manualmente.)*

4.  **Execute a aplicação:**
    * Localize o arquivo `App.java` (ou `Main.java`) na pasta `src/main/java/com/seuprojeto/banco/`.
    * Clique com o botão direito no arquivo e selecione `Run 'App.main()'` (ou opção similar na sua IDE).

---

Desenvolvido por Sylvio Nóbrega Soares durante o bootcamp Santander | DIO 🚀

