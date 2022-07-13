# SpringBoot Playground

**Install Open JDK 17 with sdkman**
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
# This export might be necessary to prevent maven issues
$ export MAVEN_OPTS="--add-exports jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED   --add-exports jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED   --add-exports jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED   --add-exports jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED   --add-exports jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED"

$ mvn git-code-format:format-code
```
