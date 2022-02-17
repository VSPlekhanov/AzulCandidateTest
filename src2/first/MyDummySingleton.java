package first;

public class MyDummySingleton {
    private static final MyDummySingleton instance = new MyDummySingleton();

    private MyDummySingleton(){
        System.out.println("Bonjour le monde!");
    }

    public static MyDummySingleton getInstance(){
        return instance;
    }
}
