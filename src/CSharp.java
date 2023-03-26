public class CSharp extends Backend {
    private String name;

    public CSharp(String name) {
        this.name = name;
    }

    public void doNet(){
        System.out.println("C#...");
    }

    @Override
    public String toString() {
        return "CSharp{" +
                "name='" + name + '\'' +
                '}';
    }
}
