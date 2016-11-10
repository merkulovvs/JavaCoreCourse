package module3.assignment_3_1;

/**
 * Created by merkulovvs on 11/10/2016.
 */
public class Main extends Bird {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        System.out.println("I am "+bird.getName());
    }
}
