
abstract class shape {
public static void main(String[] args) {
    

    abstract void draw();  // Abstract method

    public void description() {
        System.out.println("This is a shape.");
    }
}

public class circle extends shape {

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}}
