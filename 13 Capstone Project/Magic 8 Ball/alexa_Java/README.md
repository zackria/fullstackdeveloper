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

    `<build>
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


### Step 4 Create pack com.zackdawood.main in the src - main - java folder

### Step 5 Create Java Class in src - main - com.zackdawood.main  package MagicEBallStreamHandler


## Post Java Code
* Step 1 Create Skill in Amazon Alexa Developer console
* Step 2 Name your skill as magic eight ball
* Step 3 Primary locale as English(US)
* Step 4 Choose experience as Games & trivia
* Step 5 uncheck Sync Locales
* Step 6 Hosting service Provision your own
* Step 7 Start from Scratch
* Step 8 Create Skill
* Step 9 Invocations
* Step 10 Skill Invocation Name as "magic eight ball helper" & Save Model
* Step 11 Json editor, use the magic8ball_intent_schema.json & Save Model
* Step 12 Select EndPoint and copy skill id to MagicEBallStreamHandler.java
* Step 13 use the following command in the terminal or console to create the maven build
`mvn assembly:assembly -DdescriptorId=jar-with-dependencies package`
* Step 14 Check target folder in finder or explorer
`AlexaMagic8Ball-1.0-SNAPSHOT-jar-with-dependencies.jar`


* Step 15 Navigate to AWS Lambda Console
* Step 16 Create Function
* Step 17 Function name "magic8ball"
* Step 18 Choose runtime as Java 11 (Corretto)
* Step 19 Architecture x86_64
* Step 20 Add Trigger
* Step 21 Alexa Skill Kit
* Step 22 Paste the skill id from Amazon Alexa Developer consolde endpoind
* Step 23 Click Code & Code Source Upload from and select `AlexaMagic8Ball-1.0-SNAPSHOT-jar-with-dependencies.jar`
* Step 24 Edit Runtime Settings & use
`com.zackdawood.main.MagicEBallStreamHandler`
* Step 25 Copy Function ARN from Lamda to Alexa Developer console endpoint & Save Model & Build Model
* Step 25 Click Test Tab, Skill testing is enabled in: Development
