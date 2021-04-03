#sudo apt-get install build-essential openjdk-7-jdk
export JAVA_HOME='/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home'
javac NativeJava.java
javah -jni NativeJava
gcc -shared -fpic -o libMain.so -I${JAVA_HOME}/include \
  -I${JAVA_HOME}/include/linux NativeJava.c
java -Djava.library.path=. NativeJava

#/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home/bin/javah