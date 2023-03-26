public class Java extends  Backend{
      private String name;
    public  void spring() {
        System.out.println("django...");
    }

    public Java(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Java{" +
                "name='" + name + '\'' +
                '}';
    }
}
