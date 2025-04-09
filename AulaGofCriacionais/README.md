**Aula: Padrões de Projeto Criacionais (GoF)**

**1. Introdução**

### **📌 O que são Padrões de Projeto (GoF)?**

- São soluções **testadas e comprovadas** para resolver problemas comuns no desenvolvimento de software.
- Promovem reuso e ajudam a tornar sistemas mais robustos e de fácil manutenção.
- Nomeados após o famoso livro “Gang of Four” (GoF).

### **📌 Benefícios dos Padrões de Projeto:**

- Maior qualidade e clareza no código.
- Facilidade na manutenção e evolução do sistema.
- Simplificam comunicação entre desenvolvedores com uma linguagem comum.

### **📌 Categorias dos Padrões (GoF):**

1. **Criacionais:** Gerenciam e abstraem o processo de criação de objetos.
2. **Estruturais:** Facilitam a composição de objetos e estruturas de classes.
3. **Comportamentais:** Gerenciam comunicação e responsabilidades entre objetos.

### **🎯 Foco da Aula de Hoje:**

- **Padrões Criacionais**: Singleton, Factory Method, Abstract Factory, Builder e Prototype.

---

**2. Singleton** 

•	**Explicação**:

•	Garante que uma classe tenha somente uma instância e fornece um ponto global de acesso.

•	Exemplos práticos: configuração do sistema, conexão com banco de dados.

•	**Diagrama UML**:

```
Singleton
------------
-instance: Singleton
------------
+getInstance(): Singleton
```

•	**Exemplo Java**:

```java
public class GlobalCounter {
    private static GlobalCounter instance;
    private int count = 0;

    private GlobalCounter() {}

    public static GlobalCounter getInstance() {
        if (instance == null) {
            instance = new GlobalCounter();
        }
        return instance;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

// Exemplo de uso em aula:
public class Main {
    public static void main(String[] args) {
        GlobalCounter counter1 = GlobalCounter.getInstance();
        GlobalCounter counter2 = GlobalCounter.getInstance();

        counter1.increment();
        counter2.increment();

        System.out.println("Contador: " + counter1.getCount()); // saída será 2
    }
}
```

---

**3. Factory Method** 

•	**Explicação**:

•	Define uma interface para criar um objeto, mas permite às subclasses decidir qual classe instanciar.

•	Uso: desacoplar a criação dos objetos do uso.

•	**Diagrama UML**:

```
Product <|.. ConcreteProduct
Creator o-- Product
Creator <|-- ConcreteCreator
```

•	**Exemplo Java**:

---

**4. Abstract Factory** 

```java
interface Produto {
    void usar();
}

class ProdutoConcreto implements Produto {
    public void usar() {
        System.out.println("Usando produto concreto!");
    }
}

abstract class Criador {
    abstract Produto factoryMethod();
}

class CriadorConcreto extends Criador {
    Produto factoryMethod() {
        return new ProdutoConcreto();
    }
}
```

•	**Explicação**:

•	Fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

•	Ideal para manter consistência entre objetos criados.

•	**Diagrama UML**:

```
AbstractFactory <|.. ConcreteFactory
AbstractProductA <|.. ProductA1
AbstractProductA <|.. ProductA2
```

•	**Exemplo Java**:

```java
interface Botao {
    void render();
}

class BotaoWindows implements Botao {
    public void render() {
        System.out.println("Renderizando botão Windows");
    }
}

interface GUIFactory {
    Botao criarBotao();
}

class WindowsFactory implements GUIFactory {
    public Botao criarBotao() {
        return new BotaoWindows();
    }
}
```

---

**5. Builder** 

•	**Explicação**:

•	Separação da construção de um objeto complexo de sua representação, permitindo o mesmo processo criar diferentes representações.

•	**Diagrama UML**:

```
Director o--> Builder
Builder <|.. ConcreteBuilder
```

•	**Exemplo Java**:

```java
class Pizza {
    String massa;
    String molho;
    String cobertura;
}

interface PizzaBuilder {
    void buildMassa();
    void buildMolho();
    void buildCobertura();
    Pizza getPizza();
}

class PepperoniPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    public void buildMassa() { pizza.massa = "grossa"; }
    public void buildMolho() { pizza.molho = "tomate"; }
    public void buildCobertura() { pizza.cobertura = "pepperoni"; }
    public Pizza getPizza() { return pizza; }
}
```

---

**6. Prototype**

•	**Explicação**:

•	Cria novos objetos ao copiar um objeto protótipo existente.

•	Uso: criação rápida e barata de objetos semelhantes.

•	**Diagrama UML**:

```
Prototype <|.. ConcretePrototype
```

•	**Exemplo Java**:

```java
interface Prototype extends Cloneable {
    Prototype clone();
}

class ConcretePrototype implements Prototype {
    String atributo;

    public Prototype clone() {
        ConcretePrototype copy = new ConcretePrototype();
        copy.atributo = this.atributo;
        return copy;
    }
}
```

---


**Referências adicionais**

•	[Refactoring Guru (Criacionais)](https://refactoring.guru/pt-br/design-patterns/creational-patterns)

•	[Gang of Four Design Patterns](https://springframework.guru/gang-of-four-design-patterns/)