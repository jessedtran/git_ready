public class Main {

     static boolean condition;
    public static void main(String[] args) {
        condition = false;
        System.out.println("Hello, World!");
        System.out.println(getCondition());
    } 

    public static boolean getCondition() {
        condition = true;
        return condition;
    }
}
