package builder;

public class BuilderTest {
    public static void main(String[] args) {
        Hamburger hamburger = new HamburgerBuilder().bun(true).cheese(true).tomato(true).build();
        System.out.println("hamburger has cheese : " + hamburger.cheese);

    }


}
