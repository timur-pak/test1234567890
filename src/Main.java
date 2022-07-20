import edu.duke.*;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        class HelloWorld {
            public void runHello() {
                FileResource res = new FileResource("hello_unicode.txt");
                for (String line : res.lines()) {
                    System.out.println(line);
                }
            }
        }

        HelloWorld hw = new HelloWorld();
        hw.runHello();
    }
}