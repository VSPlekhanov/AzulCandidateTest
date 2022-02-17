# AzulCandidateTest

This is a simple project that proves this statement

>Java program’s behavior may vary depending on the order of the classpath arguments in the command line that launches it.

In order to execute it by yourself you should follow these instructions:


### Mac/Linux:
From the root folder (make sure you have Java installed) execute these commands in the terminal
```
javac src/main/Main.java src1/first/MyDummySingleton.java
javac src2/first/MyDummySingleton.java  
java -cp src:src1:src2 main.Main
java -cp src:src2:src1 main.Main
```

### Windows:
From the root folder (make sure you have Java installed) execute these commands in the command line
```
javac src\main\Main.java src1\first\MyDummySingleton.java
javac src2\first\MyDummySingleton.java  
java -cp src;src1;src2 main.Main
java -cp src;src2;src1 main.Main
```

After executing those commands, you probably got two different outputs, 
despite the fact that nothing was changed except the order of the classpath.