import java.util.*;
/**
 * FishingAPP
 */
public class FishingAPP {

    public static void main(String[] args) {
        System.out.println("釣りゲーム");
        System.out.print("Press enter Key...");
        Scanner sc =new Scanner(System.in);
        Random rand=new Random();

        String ready=sc.nextLine();
        int []casts={20,10,5,1};
        int index=rand.nextInt(3);
        int cast=casts[index];
        System.out.printf("%dメートル投げました。\n",cast);
        int []damages={-1,0,1};
        int damage=damages[index];
        System.out.printf("糸のダメージは%dです。",damage);
        
        
    }
}