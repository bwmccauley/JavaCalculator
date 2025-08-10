public class calculator {
    public static void main (String [] arguments) {
        int operator, n1, n2;
        System.out.println("1 - Add \n 2 - Subtract \n 3 - Multiply \n 4 - Divide");
        System.out.print("Choose Operator: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.extInt();
        System.out.print("Enter first number ; ");
        n1 = sc.nextInt();
        System.out.print("Enter second number ; ");
        n2 = sc.nextInt();
    }
    
}
 