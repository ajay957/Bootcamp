import java.util.Scanner;

public class Calculator {
    public int add(int a,int b) {
        return a + b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        Calculator x=new Calculator();
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(i==1){
            System.out.println("1.addition");
            System.out.println("2.subtraction");
            System.out.println("3.multiplication");
            System.out.println("4.division");
            System.out.println("5.exit");
            System.out.println("enter your choice");
            int s=sc.nextInt();
            System.out.println("enter first number");
            int a=sc.nextInt();
            System.out.println("enter second number");
            int b=sc.nextInt();
            switch (s){
                case 1:
                    System.out.println(x.add(a,b));
                    break;
                case 2:
                    System.out.println(x.sub(a,b));
                    break;
                case 3:
                    System.out.println(x.mul(a,b));
                    break;
                case 4:
                    System.out.println(x.div(a,b));
                    break;
                default:
                    System.out.println("enter a vaild number");
            }
            System.out.println("do you want to continue 1.yes 2.no");
            i=sc.nextInt();
        }
    }



    }



