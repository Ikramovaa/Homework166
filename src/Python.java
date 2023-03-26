public class Python extends  Backend{
    private String name;

    public Python(String name) {
        this.name = name;
    }

    public  void django(){
        System.out.println("Python...");
    }

    @Override
    public String toString() {
        return "Python{" +
                "name='" + name + '\'' +
                '}';
    }
}
