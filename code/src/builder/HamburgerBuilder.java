package builder;


public class HamburgerBuilder {
    boolean bun;
    boolean cheese;
    boolean tomato;

    public HamburgerBuilder bun(boolean bun) {
        this.bun = bun;
        return this;
    }

    public HamburgerBuilder cheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public HamburgerBuilder tomato(boolean tomato) {
        this.tomato = tomato;
        return this;
    }

    public Hamburger build() {
        return new Hamburger(bun, cheese,tomato);
    }
}
