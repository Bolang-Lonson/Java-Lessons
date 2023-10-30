class EnumExample1 {
    public enum Season {WINTER, SPRING, SUMMER, FALL};
    /** Enum is a data type that contains fixed set of constants */
    public static void main(String args[]){
        for(Season s: Season.values()) {
            System.out.println(s);
        }  
    }
}
