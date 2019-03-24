package cevalamda;

public class CevaLamda {
    public static void main(String[] args) {
        // TODO code application logic here
        
        LamdaFunction l1 = new LamdaFunction() {
            @Override
            public String getString(String s) {
                return s;
            }
        };
        
        LamdaFunction l2 = e -> "Din lamda: " + e;
        /**
        System.out.println(l1.getString("Denis"));
        System.out.println(l1.getString2());
        System.out.println(LamdaFunction.getString3());
        System.out.println("\nPentru Lamda:\n");
        System.out.println(l2.getString("Denis"));
        System.out.println(l2.getString2());
        System.out.println(LamdaFunction.getString3());
        **/
        
        ClasaDinLamda c1 = new ClasaDinLamda();
        
        System.out.println(c1.getString2());
    }
}
