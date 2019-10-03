import java.util.Scanner;
class NewD6{
    public static void main(){
            Scanner scan=new Scanner(System.in);
            int total;
            int amount;            
            boolean again=true;
            String again1;
                while(again){
                System.out.println("How many D6's do you want to roll?");
                total=0;
                amount=scan.nextInt();
                for(int i=0;i<amount;i++){
                int d=(int)((Math.random()*6));
                d=d+1;
                total=total+d;
                System.out.print(d+" ");
            }
            System.out.println("");
            System.out.println("Total:"+total);
            System.out.println("Again? [y,n]");
            again1=scan.next();
            if(again1.contains("y")) again=true;
            else {
                again=false;
                System.out.println("Sayonara");
            }
        }
    }
}