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
