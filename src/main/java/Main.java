public class Main {
public static void main(String[]args){
System.out.println("Hello World!");
System.out.println(fizzBus(15));

}
    public static String fizzBus(int a) {
        if (a % 15 == 0) {
            return "fizzBuzz";
        }
        if (a % 3 == 0) {
            return "fizz";
        }
        if (a % 5 == 0) {
            return "buzz";
        }

        return String.valueOf(a);
    }
}
