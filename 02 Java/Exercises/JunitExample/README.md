### Maven Testing Project
## mvn clean test

`<dependencies>
<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter</artifactId>
<version>5.8.2</version>
<scope>test</scope>
</dependency>
</dependencies>`

`<build>
<plugins>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-surefire-plugin</artifactId>
<version>2.22.2</version>
</plugin>
</plugins>
</build>
`