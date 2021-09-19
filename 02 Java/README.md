# Installing Java, Compiling and Running your First Java program in Windows / Mac OS / Linux Console

### **Prerequisite:** Developers must have basic understanding of the console and commands

---

### Download & Install Java 15 (Amazon Corretto https://aws.amazon.com/corretto/ )


###  [Amazon Corretto Java 15](https://docs.aws.amazon.com/corretto/latest/corretto-15-ug/downloads-list.html)

### Windows users install msi package (Microsoft Installer)
### Mac users install pkg format (Package)
### Linux users install .deb / .rpm (Redhat/CentOS users use RPM format, Debian/Ubuntu Users use .deb format)

### :note: rpm stands for Redhat Package Manager

---
## Setting Environment Variables in Windows (⊞ Win )
#### 1) Open Windows Explorer - Right Click `This PC` - `Properties`
#### 2) Search for Environment Variables `Edit the system environment variables`
#### 3) Click `Environment variables...`
#### 4) Set `JAVA_HOME`
Example path `C:\Program Files\Amazon Corretto\jdk15.0.2_7`
#### 5) Set `Path`  
`%JAVA_HOME%\bin`
#### 6) Set `classpath`
`.;`
#### 7) Launch Command Prompt and test the environment variables
`echo %JAVA_HOME%`
`echo %PATH%`
`echo %classpath%`
#### 8) Test Java version in command prompt
`java -version`

---

## Setting Environment Variables in MacOS (⌘ MacOS )
#### 1) Launch Terminal and find the shell
`echo $SHELL`
#### :memo:  For bash shell, we can put the environment variables at ~/.bash_profile or ~/.bashrc.
#### :memo:  For zsh shell, we can put the environment variables at ~/.zshenv or ~/.zshrc.
#### 2) Add Environment Variables, Set JAVA_HOME, PATH, CLASSPATH
`sudo nano ~/.bash_profile
export JAVA_HOME="/Library/Java/JavaVirtualMachines/amazon-corretto-15.jdk/Contents/Home"
export PATH=$JAVA_HOME/bin:$PATH
export CLASSPATH=${CLASSPATH}:.:`

or

`sudo nano ~/.zshenv
export JAVA_HOME="/Library/Java/JavaVirtualMachines/amazon-corretto-15.jdk/Contents/Home"
export PATH=$JAVA_HOME/bin:$PATH
export CLASSPATH=${CLASSPATH}:.:`

### :note:  May required to run chmod `sudo chmod 755 .bashrc`  or `sudo chmod 755 .zshenv`

### 3) Launch Terminal and execute the bash profile
`. ~/.bash_profile`

#### 3) Launch Terminal and test the environment variables
`echo $JAVA_HOME`
`echo $PATH`
`echo $CLASSPATH`

#### 4) Test Java version in Terminal
`which java`
`java -version`


---

## Setting Environment Variables in LinuxOS ($ LinuxOS )

#### 1) Launch Terminal and find the shell
`echo $SHELL`
#### :memo:  For bash shell, we can put the environment variables at ~/.bash_profile or ~/.bashrc.
#### :memo:  For zsh shell, we can put the environment variables at ~/.zshenv or ~/.zshrc.
#### 2) Add Environment Variables, Set JAVA_HOME, PATH, CLASSPATH
`sudo nano ~/.bash_profile
export JAVA_HOME="/usr/lib/jvm/java-15-amazon-corretto/"
export PATH=$JAVA_HOME/bin:$PATH
export CLASSPATH=${CLASSPATH}:.:`

or

`sudo nano ~/.bashrc
export JAVA_HOME="/usr/lib/jvm/java-15-amazon-corretto/"
export PATH=$JAVA_HOME/bin:$PATH
export CLASSPATH=${CLASSPATH}:.:`

### :note:  May required to run chmod `sudo chmod 755 .bashrc`  or `sudo chmod 755 .bash_profile`

### 3) Launch Terminal and execute the bash profile
`. ~/.bash_profile`

or

`. ~/.bashrc`

#### 4) Test the environment variables
`echo $JAVA_HOME`
`echo $PATH`
`echo $CLASSPATH`

#### 5) Test Java version in Terminal
`which java`
`java -version`

---

#### 1) Download & Install atom.io (https://atom.io/ )

#### 2) Launch atom

---

Exercise
- [x] Attend the class
- [ ] 1) Install Java (Amazon Corretto https://aws.amazon.com/corretto/ )
- [ ] 2) Set Environment Variables JAVA_HOME
- [ ] 3) Set Path
- [ ] 4) Set Classpath
- [ ] 5) Test Environment Variables
- [ ] 6) Test Java Version
- [ ] 7) Install Atom.io

---

#### :memo:

## Launching MacOS Terminal Console  

Mac OS command key (⌘)
Click

Click `(⌘) + spacebar ` key (Spotlight) + Type `Terminal`

or

Click Launchpad + Type `Terminal` Click to Open


## Launching Windows Command Console  

Click `(⊞ Win ) + R ` key Type `cmd`

or

Click `(⊞ Win )` key Type `cmd`


## Launching Linux Terminal Console  

Click  `(⊞ Win/(⌘)) Key` + Type `Terminal`

or

Click activites + Type `Terminal` Click to Open


# Visual Studio Code Java Plugins

### Name: Language Support for Java(TM) by Red Hat
Id: redhat.java
Description: Java Linting, Intellisense, formatting, refactoring, Maven/Gradle support and more...
Version: 0.82.0
Publisher: Red Hat
VS Marketplace Link: [https://marketplace.visualstudio.com/items?itemName=redhat.java](https://marketplace.visualstudio.com/items?itemName=redhat.java)

### Name: Code Runner
Id: formulahendry.code-runner
Description: Run C, C++, Java, JS, PHP, Python, Perl, Ruby, Go, Lua, Groovy, PowerShell, CMD, BASH, F#, C#, VBScript, TypeScript, CoffeeScript, Scala, Swift, Julia, Crystal, OCaml, R, AppleScript, Elixir, VB.NET, Clojure, Haxe, Obj-C, Rust, Racket, Scheme, AutoHotkey, AutoIt, Kotlin, Dart, Pascal, Haskell, Nim, 
Version: 0.11.5
Publisher: Jun Han
VS Marketplace Link: [https://marketplace.visualstudio.com/items?itemName=formulahendry.code-runner](https://marketplace.visualstudio.com/items?itemName=formulahendry.code-runner)


### Name: Extension Pack for Java
Id: vscjava.vscode-java-pack
Description: Popular extensions for Java development that provides Java IntelliSense, debugging, testing, Maven/Gradle support, project management and more
Version: 0.18.4
Publisher: Microsoft
VS Marketplace Link: [https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

### Name: Test Runner for Java
Id: vscjava.vscode-java-test
Description: Run and debug JUnit or TestNG test cases
Version: 0.31.3
Publisher: Microsoft
VS Marketplace Link: [https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-test](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-test)


### Name: Debugger for Java
Id: vscjava.vscode-java-debug
Description: A lightweight Java debugger for Visual Studio Code
Version: 0.35.0
Publisher: Microsoft
VS Marketplace Link: [https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug)


### Name: Project Manager for Java
Id: vscjava.vscode-java-dependency
Description: Manage Java projects in Visual Studio Code
Version: 0.18.7
Publisher: Microsoft
VS Marketplace Link: [https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-dependency](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-dependency)

### Name: Maven for Java
Id: vscjava.vscode-maven
Description: Manage Maven projects, execute goals, generate project from archetype, improve user experience for Java developers.
Version: 0.33.0
Publisher: Microsoft
VS Marketplace Link: [https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-maven](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-maven)
