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
        int distance=100;
        int damage=2;
        while(true){
        String ready=sc.nextLine();
        int []casts={20,10,10,5,5,1};
        int index=rand.nextInt(5);
        int cast=casts[index];
        System.out.printf("%dメートル投げました。\n",cast);
        distance=distance-cast;
        System.out.printf("残り:%dmです。",distance);
        int damageIndex=rand.nextInt(9);
        int []damages={-1,0,0,0,1,1,1,1,1,1};
        
        damage+=damages[damageIndex];
        
        System.out.printf("糸のダメージが%dです。",damage);
        if(damage>=5){
        System.out.println("ゲームオーバー。糸が切れてしまいました。");
        }
        if(distance<=0){
            System.out.printf("釣り上げる事に成功しました。");
            break;
        }
        }
        
        
    }
}