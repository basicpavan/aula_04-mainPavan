# aula_04-mainPavan
Tarefa do dia 13/03/2026


# Gerenciador de Tarefas (To-Do List)

Aplicação web desenvolvida em Java com Spring Boot e Thymeleaf para o gerenciamento de tarefas do dia a dia.

## 🚀 Tecnologias

- Java 21
- Spring Boot 4.0.3
- Thymeleaf
- Maven
- Bean Validation (Jakarta Validation)
- HTML5 & CSS3 (Interface customizada e responsiva)

## ⚙️ Como Executar

### Pré-requisitos
- Java 21 instalado em sua máquina.
- Maven instalado (ou você pode utilizar o wrapper `./mvnw` incluído no projeto).

### Executando a Aplicação
Abra o terminal na pasta raiz do projeto e execute um dos comandos abaixo:

```bash
# Usando o Maven Wrapper (Recomendado se não tiver o Maven instalado globalmente)
./mvnw spring-boot:run

# Ou usando o Maven global
mvn spring-boot:run
```

Após a inicialização, a aplicação estará disponível no seu navegador no endereço: **http://localhost:8080/tarefas**

## 🔗 URLs Disponíveis

| URL                            | Método | Descrição                                  |
|--------------------------------|--------|--------------------------------------------|
| `/tarefas`                     | GET    | Listar todas as tarefas (com suporte a filtros) |
| `/tarefas?filtro=pendentes`    | GET    | Listar apenas as tarefas pendentes         |
| `/tarefas?filtro=concluidas`   | GET    | Listar apenas as tarefas concluídas        |
| `/tarefas/novo`                | GET    | Exibir formulário para nova tarefa         |
| `/tarefas/editar/{id}`         | GET    | Exibir formulário para editar uma tarefa   |
| `/tarefas/salvar`              | POST   | Salvar tarefa (criar ou atualizar)         |
| `/tarefas/excluir/{id}`        | POST   | Excluir uma tarefa                         |
| `/tarefas/status/{id}`         | GET    | Alternar status da tarefa (Pendente/Concluída) |

## 📁 Estrutura do Projeto

```text
com.biopark.tarefas/
├── TarefasAppApplication.java    # Classe principal de inicialização
├── controller/
│   └── TarefaController.java     # Controlador MVC (Rotas e regras de tela)
├── service/
│   └── TarefaService.java        # Regras de negócio
├── repository/
│   └── TarefaRepository.java     # Armazenamento de dados em memória
└── model/
    └── Tarefa.java               # Entidade Tarefa
```

## ✨ Funcionalidades

- **CRUD Completo:** Criar, visualizar, editar e excluir tarefas.
- **Filtros de Status:** Filtragem dinâmica na tela inicial para exibir "Todas", "Pendentes" ou "Concluídas".
- **Contador Dinâmico:** Resumo na tela informando o total de tarefas e as quantidades por status.
- **Alternância Rápida:** Botão prático para alternar o status entre "Pendente" e "Concluída" diretamente da lista.
- **Validação:** Validação de formulários (Bean Validation) com mensagens de erro na tela.
- **Feedback Visual:** Mensagens flash de sucesso/erro após ações do usuário.
- **Dados Iniciais:** 3 tarefas de exemplo pré-cadastradas na memória para facilitar os testes.
- **Design Moderno:** Interface estilizada com CSS customizado, incluindo status em formato de "pílulas" coloridas.
