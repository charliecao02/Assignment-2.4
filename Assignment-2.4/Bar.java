import java.util.Scanner;
class Bar{
    public static void main(){
        Scanner scan=new Scanner(System.in);
        System.out.println("What character do you want your bar made of?");
        String chars=scan.nextLine();
        System.out.println("How long do you want your bar?");
        int length=scan.nextInt();
        System.out.println("Here's your bar!");
        for(int i=1;i<=length;i++){
            System.out.print(chars);
        }
    }
}