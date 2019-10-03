import java.util.Scanner;
class Exercise3{
    public static void main(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Let's add some numbers! [Type a negative number to quit]");
        int sum=0, in;
        do{
            System.out.print("Add: ");
            in=scan.nextInt();
            if(in>=0) sum=sum+in;
        }while(in>=0);
        System.out.print("Your total is "+sum);
    }
}