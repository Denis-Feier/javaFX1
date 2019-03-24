package enumtutorial;

import java.util.EnumSet;

public class EnumTutorial {

    public static void main(String[] args) {
        Level level1 = Level.HIGH;
        System.out.println(level1.toString());
        System.out.println(level1.getInt());
        System.out.println(level1.LOW);
        
        System.out.println("\n\n");
        
        System.out.println(Level.HIGH.normalizedForm());
        System.out.println(Level.MEDIUM.normalizedForm());
        System.out.println(Level.LOW.normalizedForm());
        System.out.println(Level.LOW.compareTo(Level.MEDIUM));
        System.out.println("\n\n");
        
        
        
        EnumSet setOfEnum = EnumSet.of(Level.MEDIUM, Level.LOW, Level.HIGH);
        
        System.out.println(setOfEnum);
        
    
    }
    
}
