package Reusing;

/**
 * Created by andy on 2017/3/12.
 */
class Amphibian {
    protected void swim() {
        System.out.println("Amphibian swim");
    }
    protected void speak() {
        System.out.println("Amphibian speak");
    }
    void eat() {
        System.out.println("Amphibian eat");
    }
    static void grow(Amphibian a) {
        System.out.println("Amphibian grow");
        a.eat();
    }
}
public class Frog extends Amphibian{
    @Override protected void swim() {
        System.out.println("Frog swim");
    }
    @Override protected void speak() {
        System.out.println("Frog speak");
    }
    @Override void eat() {
        System.out.println("Frog eat");
    }
    static void grow(Amphibian a) {
        System.out.println("Frog grow");
        a.eat();
    }
    public static void main(String[] args) {
        Frog f = new Frog();
        // call overridden base-class methods:
        f.swim();
        f.speak();
        f.eat();
        // upcast Frog17 to Amphibian argument:
        f.grow(f);
        // upcast Frog17 to Amphibian and call Amphibian method:
        Amphibian.grow(f);
    }
}
