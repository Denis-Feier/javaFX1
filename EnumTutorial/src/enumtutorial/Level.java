package enumtutorial;

public enum Level {
    HIGH(3){
        @Override
        public String normalizedForm(){
            return HIGH.name() + ": " + HIGH.getInt();
        }
    },
    MEDIUM(2){
        @Override
        public String normalizedForm(){
            // nu are sens pe this dar java te lasa
            return this.name() + ": " + this.getInt();
        }
    },
    LOW(1){
        @Override
        public String normalizedForm(){
            return LOW.name() + ": " + LOW.getInt();
        }
    };
    
    
    private final int intValue;
    
    private Level(int intValue){
        this.intValue = intValue;
    }
    
    public int getInt(){
        return intValue;
    }
    
    public abstract String normalizedForm();
    
}
