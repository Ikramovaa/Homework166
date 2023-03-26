import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Backend backend = new Backend();
        Java java = new Java("Java");
        CSharp cSharp = new CSharp("C sharp");
        Python python = new Python("Python");
        cSharp.doNet();
        java.spring();
        python.django();
        System.out.println();
        
        Backend[]backends=new Backend[3];
        backends[0]=java;
        backends[1]=cSharp;
        backends[2]=python;

        for (Backend b : backends ) {
           System.out.println(b);
          //  System.out.println(Arrays.toString(backends));

        }
    }
}