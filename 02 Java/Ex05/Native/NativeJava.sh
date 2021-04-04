sudo apt-get install openjdk-8-jdk
export JAVA_HOME='/usr/lib/jvm/java-8-openjdk-amd64/bin/java'
export PATH=$JAVA_HOME/bin:$PATH
export classpath=.:
javac Main.java
javah -jni Main
sudo apt install gcc
gcc -shared -fpic -o libMain -I${JAVA_HOME}/include -I${JAVA_HOME}/include/linux Main.c
java -Djava.library.path=. Main

#export JAVA_HOME='/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home'
#export PATH=$JAVA_HOME/bin:$PATH
#export classpath=.:
#export LD_LIBRARY_PATH="/Users/zackdawood/Development/fullstackdeveloper/02 Java/Ex05/Native":$LD_LIBRARY_PATH
#/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home/bin/javac Main.java
#/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home/bin/javah -jni Main
#gcc -shared -fpic -o libMain.so -I${JAVA_HOME}/include -I${JAVA_HOME}/include/darwin Main.c
#/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home/bin/java -cp . -Djava.library.path=. Main