# Magic 8 Ball Alexa App
Magic 8 Ball Alexa App


[https://developer.amazon.com/alexa/](https://developer.amazon.com/alexa/)
[https://developer.amazon.com/alexa/console/ask](https://developer.amazon.com/alexa/console/ask)
[https://aws.amazon.com/lambda/](https://aws.amazon.com/lambda/)


### Step 1 Create new Java Intellij Maven Project (Choose version as Java 11)

### Step 2 Add the following dependency for Alexa SDK

    `<dependencies>
        <dependency>
            <groupId>com.amazon.alexa</groupId>
            <artifactId>ask-sdk</artifactId>
            <version>2.43.0</version>
        </dependency>
    </dependencies>`


### Step 3 Add the following build in the pom.xml

`    <build>
        <plugins>
            <plugin>
                <artifactId>maven-assembly-plugin</artifactId>
                <version>2.5.3</version>
                <configuration>
                    <archive>
                        <manifest>
                            <mainClass>com.zackdawood.main.MagicEBallStreamHandler</mainClass>
                        </manifest>
                    </archive>
                    <descriptorRefs>
                        <descriptorRef>jar-with-dependencies</descriptorRef>
                    </descriptorRefs>
                </configuration>
                <executions>
                    <execution>
                        <id>make-assembly</id> <!-- this is used for inheritance merges -->
                        <phase>package</phase> <!-- bind to the packaging phase -->
                        <goals>
                            <goal>single</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>

        </plugins>
    </build>`
