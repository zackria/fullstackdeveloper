# Packages 

### **Prerequisite:** Java Ex01, Ex02, Ex03 must be completed


- ##### Packages


 
 ---

 [https://atom.io/packages/platformio-ide-terminal](https://atom.io/packages/platformio-ide-terminal)

 [https://atom.io/packages/script](https://atom.io/packages/script)

 [https://atom.io/packages/atom-ide-ui](https://atom.io/packages/atom-ide-ui)

 [https://atom.io/packages/ide-java](https://atom.io/packages/ide-java)


### Command to install if there is an error installing via the User Interface

`apm config set strict-ssl false`

`apm update`

`apm install platformio-ide-terminal`

`apm install script`

`apm install atom-ide-ui`

`apm install ide-java`


 ### Atom Snippets (Atom-Snippets or File -- Snippets)


 `'.source.java':`

  `'SysOut':`

    `'prefix': 'sysout'`

    `'body': 'System.out.println($1); '`

 ---

 ## :bulb: Tips

 - Practice all programs on the day of the session to learn fast. It will be easy to follow the sessions if you practice.

 ---
 Exercise
 - [x] Attend the class
 - [ ] 1) Create, Compile and Execute  FirstPackage.java
 - [ ] 2) Create, Compile and Execute  PackageAccess.java
 - [ ] 3) Create, Compile and Execute  StaticVariable.java
 - [ ] 4) Create, Compile and Execute  StaticPackageAccess.java
 - [ ] 5) Create, Compile and Execute  StaticPackageAccessAll.java
 - [ ] 6) Create, Compile and Execute  LocalVariable.java
 - [ ] 7) Create, Compile and Execute  ClassVariable.java
 - [ ] 8) Create, Compile and Execute  ExecutionOrder.java
 - [ ] 9) Create, Compile and Execute  ExecutionOrder.java
 - [ ] 10) Create, Compile and Execute  AssignmentOperators05.java
 - [ ] 11) Create, Compile and Execute  ShiftOperators.java
 - [ ] 12) Create, Compile and Execute  ComparisonOperators.java
 - [ ] 13) Create, Compile and Execute  ComparisonOperators01.java
 - [ ] 14) Create, Compile and Execute  ComparisonOperators02.java
 - [ ] 15) Create, Compile and Execute  ComparisonOperators03.java
 - [ ] 16) Create, Compile and Execute  LogicalOperators.java
 - [ ] 17) Create, Compile and Execute  JavaArrays.java

---

`javac -d . com/cgi/fullstack/FirstPackage.java`

`java com.cgi.fullstack.FirstPackage`

`java -cp . com.cgi.fullstack.FirstPackage`

`java -classpath . com.cgi.fullstack.FirstPackage`


`javac -classpath . PackageAccess.java`

`java -cp . PackageAccess`


`javac -d . com/cgi/fullstack/StaticVariable.java`

`java -cp . com.cgi.fullstack.StaticVariable`

`javac -classpath . StaticPackageAccess.java`

`java -cp . StaticPackageAccess`

`javac -classpath . StaticPackageAccessAll.java`

`java -cp . StaticPackageAccessAll`

`javac MathPackage.java`

`java MathPackage`


`javac LocalVariable.java`

`java LocalVariable`

`javac ClassVariable.java`

`java ClassVariable`

`javac ExecutionOrder.java`

`java ExecutionOrder`

