-----------------------------------------------
<h1>Seção 01 - Introdução</h1>

<h2>Introdução à UML</h2>

* GoF(Gang of Four)
	* Erich Gamma
	* Richard Helm
	* Ralph Johnson
	* John Vlissides

* 23 Padrões de Projeto

* UML - Unified Modeling Language
* Linguagem Unificada de Modelagem
* Especificação, documentação.
	* Não é uma métodologia de desenvolvimento
	* Oferece conjunto de ferramentas para a modelagem de ferramentas. Ex: Diagrama de Classes

* GoF
	* Diagrama de Classe
	* Diagrama de Sequencia
	* Os dois diagramas utilizados para demonstrar os padrões GoF

<h2>Diagrama de Classes</h2>

* Mostra um conjunto de classes, interfaces e colaborações e seus relacionamneto, Os diagramas de classes abrangem a visão estática do projeto de um sistema; um diagrama que mostra a coleção de elementos declarativos (estáticos).

<img src="imgs/01.png"/>

* Atributos -> Fields - Características e estados do Objeto.
* Métodos -> Representam as operações e comportamentos do objeto.

<h2>Associação entre Classes</h2> 

* Um relacionamento estrutural que descreve um conjunto de vínculos, em que o vínculo é uma conexão entre Objetos.
* Associações podem ser:
	* Unárias ou Reflexiva -> Classe relacionada com ela mesma
	* Binárias -> Classe se relaciona com outra classe
	* Múltiplas -> Classe se relaciona a duas ou mais classes

* Cardinalidade ou Multiplicidade
	* Determina quantos objetos no sistema são possíveis em cada vértice da associação.

* Navegação
	* Se é possível para cada objeto acessar outro objeto da mesma associação.
	* Bidirecional
	* Unilateral

<h2>Herança entre Classes</h2>

* É um relacionamento do tipo generalização/ especialização, onde uma classe pode ser derivada (subclasse) de outra mais geral (superclasse), absorvendo todas as características fundamentais e adicionando outras novas características, de tal modo a torná-las mais especilazada.

<img src="imgs/02.png"/>

* Identificando especializações:
	* Pessoa Física é um Cliente
	* Pessoa Jurídica é um Cliente

<h2>Relacionamento de Agregação e Composição</h2>

* Agregação
	* Tipo de relacionamento com características todo-parte.
	* Certo grau de independência entre as classes.

<img src="imgs/03.png"/>

* Composição
	* Tipo de relacionamento com característica todo-parte
	* Alto grau de coesão entre o todo e as partes.

<img src="imgs/04.png"/>


<h2>Dependência entre Classes</h2>

* Relacionamento entre duas classes: cliente (client) e fornecedor (supplier).
* Classe cliente usa/depende da classe fornecedor.
* A alteração da classe independente poderá afetar a semântica da classe dependente.

----------------------------------------------------------------
<h1>Seção 02 - Introdução aos padrões GOF</h1>

<img src="imgs/05.png"/>

* Composto por 23 padrões
* Tipos dos padrões do projeto:
	* Criação
	* Estruturais
	* Comportamentais

* Descrevem soluções para problemas recorrentes no desenvolvimento de sistemas orientado a objetos.
	* Possui um nome
	* Define o problema
	* Define a solução
	* Quando aplicar esta solução
	* Consequências

* Padrões de Criação (Criacionais) - Possui 5 Padrões GoF
	* Aplicam-se em situações que envolvem a criação de objetos.
	* Ajudam a fazer um sistema independente de como seus objetos são criados, compostos e representados.

* Os padrões não foram feitos para aprender na primeira vez que faça. Fazendo várias vezes será compreendido.

* Padrões Estruturais - Possui 7 Padrões GoF
	* De que maneira as classes e objetos são compostos para a formação de grandes estruturas.

* Padrões Comportamentais - 11 Padrões de Projeto GoF
	* Procupam-se com algoritmos e atribuição de responsabilidades entre objetos. Descrevem, também, um padrão de comunicação entre classes ou objetos.

--------------------------------------------------------------------------
<h2>Seção 03 - GoF - Criação</h2>


<h2>Singleton #1</h2>

* Padrões de Criação (Criacionais) - 5
	* Eles disponibilizam uma maneira para criar objetos ocultando os detalhes da sua criação, ao invés de utilizar o operador new diretamente. Isto dá mais flexibilidade na hora de decidir quais objetos precisam ser criados para um determinado caso.

* Intenção: Garantir que uma determinada classe tenha uma, e somente uma instância, mantendo um ponto global de acesso para a mesma.

* Padrão nível 4

<img src="imgs/06.png"/>

<h2>Factory Method #2</h2>

* Intenção: Definir uma interface para criar um objeto, mas deixar as subclasses decidierem que calsse instanciar.
* Cria uma instância de várias classes derivadas.
* Nível de frequência - 5 - Alto
* Boa expansividade

<img src="imgs/07.png"/>

<img src="imgs/08.png"/>

<h2>Abstract Factory #3</h2>

* Intenção: Fornecer uma interface para criação de famílias de objetos relacionados ou dependentes sem especificar suas classes concetras.
* Cria uma instância de várias famílias de classes.
* Nível de frequência - 5 - Alto.

<img src="imgs/09.png"/>









