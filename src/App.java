import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //游戏规则说明
        System.out.println("游戏规则：");
        System.out.println("1. 玩家和电脑轮流出拳，每局出拳只能为：0——石头、1——剪刀、2——布。");
        System.out.println("2. 玩家和电脑出拳后，系统会进行比较，比较出拳的胜负。");

        //初始化用户选择
        int user=-1;
        while (true) { 
            try {
                System.out.print("请输入你的选择(0-2)：");
                user=input.nextInt();
                if (user>=0&&user<=2) {
                    break;
                }else {

                }
               System.out.println("无效输入，请重新输入(0-2):");
            } catch ( InputMismatchException e) {
        
                input.nextLine();
            }
        }

        //电脑随机选择
        int computer=rand.nextInt(3);

        //定义选项数据
        String[] choices={"石头","剪刀","布"};
        System.out.println("玩家1："+choices[user]);
        System.out.println("电脑："+choices[computer]);

        //判断胜负
        int result=(user-computer+3)%3;
        switch (result) {
            case 0:
                System.out.println("平局!");
                break;
            case 1:
                System.out.println("您输了。");
                break;
            case 2:
                System.out.println("玩家1 获胜！");
                break;
        }

        // 关闭 Scanner 对象
        input.close();
    }
}