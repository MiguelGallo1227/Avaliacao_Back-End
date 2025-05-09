#Documentação - Avaliação Gerenciador de Tarefas

O que torna essa aplicação um software back-end web?
Essa aplicação é um software back-end web porque gerencia as operações de dados do sistema, incluindo a lógica de negócio e a manipulação das entidades Tarefas e Usuario. Toda a persistência de dados é simulada em memória utilizando listas (ArrayList). A interação com o usuário é feita através de uma API RESTful, onde o back-end processa as requisições e envia as respostas, realizando operações de CRUD para as entidades.

#Padrões de Design Utilizados
Factory Method

Um padrão de design criacional que fornece uma interface para criar objetos em uma superclasse, permitindo que as subclasses alterem os objetos criados.
Embora não tenha sido explicitamente implementado, Factory Method poderia ser aplicado para criar objetos Tarefas e Usuario, de forma a separar a lógica de instância das classes que os utilizam, tornando o código mais flexível e desacoplado.

Abstract Factory

Um padrão de design criacional que permite criar grupos de objetos relacionados sem especificar suas classes concretas.
Este padrão não foi implementado diretamente, mas poderia ser utilizado caso houvesse a necessidade de criar diferentes tipos de Banco de Dados ou Controladores que dependem de uma hierarquia de objetos.

Builder

Um padrão de design criacional que permite construir objetos complexos passo a passo.
Embora não implementado diretamente, Builder poderia ser utilizado para construir entidades mais complexas, como Tarefas e Usuario, se essas classes precisassem de um número maior de parâmetros ou validações durante sua criação.

Prototype

Um padrão de design criacional que permite copiar objetos existentes sem tornar o código dependente de suas classes padrões.
Não foi implementado nesse sistema, mas poderia ser útil, por exemplo, para clonar tarefas ou usuários com base em outras instâncias, mantendo o código desacoplado.

Singleton

Um padrão de design criacional que garante que uma classe tenha apenas uma instância, mas que possa ser acessada globalmente.
Embora não esteja implementado explicitamente, as classes BancoUsuario e BancoTarefa poderiam se beneficiar do padrão Singleton, garantindo uma única instância de acesso ao banco de dados em memória, evitando inconsistências em ambientes multi-threaded.

Adaptor

Um padrão de design estrutural que permite que objetos com interfaces incompatíveis colaborem.
Este padrão não foi utilizado diretamente, mas poderia ser aplicado caso fosse necessário integrar esse sistema com outras APIs ou serviços de terceiros que possuam interfaces diferentes.

Bridge

Um padrão de design estrutural que permite separar a abstração da implementação.
Não foi implementado nesse código, mas Bridge poderia ser útil, caso fosse necessário implementar diferentes tipos de interfaces de persistência (banco de dados, arquivos, etc.), mantendo o código de negócio desacoplado da implementação de persistência.

Composite

Um padrão de design estrutural que permite compor objetos em estruturas de árvore, permitindo trabalhar com eles de forma separada.
Esse padrão não é diretamente aplicável aqui, já que o sistema não trabalha com componentes hierárquicos, mas poderia ser usado se o sistema tivesse entidades mais complexas com relacionamento entre objetos.

Decorator

Um padrão de design estrutural que permite anexar novos comportamentos a objetos de forma dinâmica.
Não foi implementado, mas poderia ser útil, por exemplo, para adicionar funcionalidades extras, como o monitoramento de status ou logs de auditoria, sem modificar diretamente as classes de modelo ou controlador.

Observer

Um padrão de design comportamental que permite que um objeto observe mudanças em outro objeto.
Esse padrão não foi implementado, mas poderia ser utilizado para notificar diferentes partes da aplicação quando uma tarefa for atualizada, ou quando houver uma mudança de status, alertando sistemas externos ou componentes do front-end.

Visitor

Um padrão de design comportamental que permite separar algoritmos dos objetos com os quais eles interagem.
Não foi utilizado nesse projeto, mas poderia ser útil para realizar operações complexas ou específicas nas entidades Tarefas e Usuario sem modificar suas classes diretamente.

#Componentes da Aplicação

BancoTarefa
A classe BancoTarefa é responsável pela persistência em memória das tarefas do sistema. Ela oferece métodos para listar, inserir, atualizar e deletar tarefas.

BancoUsuario
A classe BancoUsuario é responsável pela persistência em memória dos usuários do sistema. Ela permite listar, buscar por ID, inserir, atualizar e deletar usuários.

ControllerTarefas
A classe ControllerTarefas serve como intermediária entre o BancoTarefa e a camada de visualização (API REST). Ela implementa os métodos de interação com a lógica de negócio relacionada às tarefas.

ControllerUsuario
A classe ControllerUsuario serve como intermediária entre o BancoUsuario e a camada de visualização (API REST). Ela implementa os métodos de interação com a lógica de negócio relacionada aos usuários.

TarefaView
A classe TarefaView é responsável pela camada View do sistema, implementando os endpoints da API REST para interação com as tarefas. Os métodos correspondem às operações CRUD: listar, buscar por ID, inserir, atualizar e deletar tarefas.

UsuarioView
A classe UsuarioView implementa a camada View para os usuários, expondo uma API REST com os métodos CRUD: listar, buscar por ID, inserir, atualizar e deletar usuários.
