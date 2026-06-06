# Aspectos

Comparación de AOP (Programación Orientada a Aspectos) vs OOP (Programación Orientada a Objetos) mediante la implementación de los patrones de diseño **Adapter** y **Singleton**.

## Estructura del proyecto

```
Aspectos/
├── pom.xml          (POM padre multi-módulo)
├── AOP/             (Implementación con AspectJ / AOP)
│   ├── pom.xml
│   └── src/main/java/aspectos/
│       ├── adapter/
│       └── singleton/
└── POO/             (Implementación con OOP tradicional)
    ├── pom.xml
    └── src/main/java/aspectos/
        ├── adapter/
        └── singleton/
```

## Módulos

- **AOP** - Implementación usando Aspect-Oriented Programming
- **POO** - Implementación usando Object-Oriented Programming

## Requisitos

- Java 17+
- Apache Maven 3.8+
