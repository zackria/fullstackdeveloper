# Complete the following exercises 
- 0) Create a Java Class name HelloWorld.java
- 1) Create a variable called carName, assign the value Volvo to it.
- 2) Create a variable called x, assign the value 50 to it.
- 3) Print the sum of 5 + 10, using two variables: x and y.
- 4) Create a variable called z, assign x + y to it, and display the result.
- 5) Declare three variables with the following names and values:

	firstName = "John"
	lastName = "Doe"
	age = 35

- 6) Multiply 10 with 5, and display the result:
- 7) Divide 10 by 2, and display the result:
- 8) Divide 10 by 2, and display the remainder result:
- 9) Use the correct assignment operator that will result in x being 15 (same as x = x + y).



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
