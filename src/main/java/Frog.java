public class Frog extends Pet {


    public Frog(String name) {
        super(name, "Frog");
    }

    @Override
    public String speak() {
        return "Ribbit Ribbit!";
    }
}
