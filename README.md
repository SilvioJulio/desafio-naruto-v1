## Desafio Naruto V1



## 🍥 Desafio Naruto V1 - Academia DB

Projeto desenvolvido em **Java 21** focado nos fundamentos de **Programação Orientada a Objetos (POO)**. O sistema simula o gerenciamento de personagens e técnicas do universo Naruto, aplicando conceitos de herança, polimorfismo e interfaces.

### 🏗️ Estrutura de Classes (Arquitetura POO)

O projeto está organizado para demonstrar a extensibilidade do código:

*   **`Personagem`**: Classe base (Abstrata) que define os atributos essenciais de qualquer indivíduo.
*   **`Ninja` (Interface)**: Define o contrato de habilidades que todo ninja deve implementar.
*   **Especializações de Classe**:
    *   `NinjaDeGenjutsu`: Implementações focadas em técnicas de ilusão.
    *   `NinjaDeNinjutsu`: Focado em manipulação elementar e jutsus clássicos.
    *   `NinjaDeTaijutsu`: Especialista em combate físico e força bruta.
*   **`ValidadorPersonagem`**: Lógica de negócio isolada para garantir a integridade dos dados dos personagens.
*   **`App`**: Classe principal com o método `main` para execução da lógica do programa.

### 🧪 Qualidade de Código e Testes

A validação das regras de negócio e da hierarquia de classes é garantida através de testes automatizados:
*   **`PersonagemTest`**: Suite de testes unitários utilizando **JUnit 5**.
*   Para rodar os testes via terminal:
    ```bash
    mvn test
    ```

### 🛡️ Segurança e Dependências

### Vulnerabilidade CVE-2025-22235
Embora o arquivo `pom.xml` contenha a dependência `springdoc-openapi`, este projeto **não está vulnerável** à falha de segurança **CVE-2025-22235 (CVSS 7.3)**.
- **Motivo:** A vulnerabilidade afeta especificamente o *Spring Boot Actuator* em ambientes web. Como este projeto é puramente **POO/Console** e não inicializa um servidor web ou o motor do Spring, a brecha não pode ser explorada.

### Nota sobre o Swagger
A dependência do Swagger está presente, mas por se tratar de um projeto de **POO Pura**, a interface gráfica (`swagger-ui`) não é inicializada automaticamente. Para visualização completa, seria necessário integrar o projeto ao framework **Spring Boot**.

### Como Executar

1.  **Compilar o projeto:**
    ```bash
    mvn clean compile
    ```
2.  **Rodar a aplicação:**
    ```bash
    mvn exec:java -Dexec.mainClass="com.academiadb.App"
    ```

---
*Este projeto faz parte do desafio da Academia DB.*
