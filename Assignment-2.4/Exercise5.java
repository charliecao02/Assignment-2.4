import java.util.Scanner;
class Exercise5{
    public static void main(){
        Scanner scan=new Scanner(System.in);
        System.out.println("What character do you want your triangle made of?");
        String character=scan.next();
        System.out.println("How tall do you want your triangle?");
        int height=scan.nextInt();
        System.out.println("Here's your triangle!");
        for(int i=1;i<=height;i++){
            for(int i2=1;i2<=i;i2++){
                System.out.print(character);
            }
            System.out.print("\n");
        }
    }
}