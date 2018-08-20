import strategy.CashSuper;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
         double total=0;
         System.out.println("输入对应收费方式前的数字：\n1.正常收费\n2.打8折\n3.满300减100");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
         CashContext cashContext = new CashContext(type);
         System.out.println("输入收费金额：");
         double money = sc.nextInt();
         total = cashContext.GetResult(money);
         System.out.println(total);

    }
}
