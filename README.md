# Java 9 introduced several key features:

1. **Java Platform Module System (JPMS)** - Also known as Project Jigsaw, modularizes the JDK to improve scalability and security.
2. **JShell (REPL)** - A command-line tool for running and testing Java code interactively.
3. **Collection Factory Methods** - Convenient methods to create immutable lists, sets, and maps.
4. **Private Interface Methods** - Allows private methods within interfaces to avoid redundancy.
5. **Stream API Improvements** - Adds new methods like `takeWhile`, `dropWhile`, and `iterate`.
6. **Optional Enhancements** - Adds methods like `ifPresentOrElse` and `or`.
7. **HTTP/2 Client (Incubator)** - Introduces an API for HTTP/2 and WebSocket communication (later standardized in Java 11).
8. **Multi-Release JAR Files** - Supports different versions of Java in a single JAR.

These enhancements focused on modularization, developer productivity, and improved API features.
<br/><br/>

<b> Collection Factory Methods - </b><br/>

This provide a quick way to create immutable collections—meaning collections that cannot be modified once created. These methods are available in the List, Set, and Map interfaces, allowing developers to create unmodifiable collections more succinctly.<br/><br/>
**Characteristics** <br/>
**Immutable:** Attempting to add or remove elements from these collections will throw UnsupportedOperationException.<br/>
**Compact Syntax:** Reduces the verbosity of initializing collections, especially small ones.<br/>
<br/>
These factory methods are highly useful for creating constant collections and simplifying code structure.
<br/>

**JShell** is a **Read-Eval-Print Loop (REPL)** introduced in Java 9, providing a tool for developers to quickly run and test Java code snippets interactively without the need to create a full Java class or method. It is the first REPL for the Java language, making experimentation and learning much easier.

Key Features of JShell:
1. **Instant Feedback**: You can type Java code directly into JShell and immediately see the results. This is particularly helpful for trying out code snippets, learning, and debugging.
   
2. **Simplifies Experimentation**: You don’t need a full program structure. Simply type expressions, statements, or method declarations, and they will be evaluated immediately.

3. **Command Shortcuts**:
   - **`/vars`**: Lists all defined variables.
   - **`/methods`**: Lists all defined methods.
   - **`/classes`**: Lists all defined classes.
   - **`/exit`**: Exits the JShell session.
   - **`/help`**: Provides help on available commands.

4. **Code Snippet Support**: You can write partial code snippets such as statements, expressions, and imports, without needing a main method.

5. **Automatic Imports**: Common Java packages like `java.util.*` are pre-imported, allowing you to use them without manual import statements.

### Benefits of JShell:
- **Learning**: Ideal for beginners as it allows them to try out Java syntax and concepts in real time.
- **Testing**: Developers can test and debug small code blocks without setting up a full project.
- **Rapid Prototyping**: Quick experiments with code logic can help in iterative development.

JShell is a powerful tool for interactive development in Java, enhancing productivity and learning by allowing quick feedback.
