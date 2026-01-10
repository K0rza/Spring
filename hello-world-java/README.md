# Hello World Java

Basit bir Maven tabanlı Java uygulaması.

## Gereksinimler
- Java 17+ (gerektiğinde `pom.xml` içindeki `maven.compiler.source` ve `target` değerleri değiştirilebilir)
- Maven

## Derleme ve Çalıştırma
1. Proje köküne gidin:

   ```sh
   cd "C:\Users\h_ene\Desktop\Java\Spring\hello-world-java"
   ```

2. Derleyin ve paketleyin:

   ```sh
   mvn package
   ```

3. Uygulamayı çalıştırın:

   ```sh
   java -jar target/hello-world-java-1.0-SNAPSHOT.jar
   ```

Alternatif olarak Maven ile doğrudan çalıştırmak isterseniz:

```sh
mvn -q -Dexec.mainClass="com.example.App" exec:java
```

