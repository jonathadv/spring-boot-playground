# Spring Boot Playground

**Install Open JDK 17 with [sdkman](https://sdkman.io/)**
```bash
$ sdk install java 17-open
```

**Install Maven**
```bash
$ sdk install maven
```

**Install Google Java Style git hook**
```bash
$ mvn git-code-format:install-hooks
```

**Run Google Java Style manually**

```bash
$ mvn git-code-format:format-code
```

## IntelliJ
- Install [google-java-format](https://plugins.jetbrains.com/plugin/8527-google-java-format)
- [Disable wildcard imports](https://www.jetbrains.com/help/idea/creating-and-optimizing-imports.html#disable-wildcard-imports)