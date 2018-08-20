import strategy.CashSuper;
import strategy.DiscountCash;
import strategy.NormalCash;
import strategy.ReturnCash;

public class CashContext {
    CashSuper cashSuper;
//策略模式与工厂模式结合
    public CashContext(String type) {
        switch (type)
        {
            //正常收费
            case "1":cashSuper=new NormalCash();break;
            //打8折
            case "2":cashSuper=new DiscountCash(0.8);break;
            //满300减100
            case "3":cashSuper=new ReturnCash(300,100);
        }

    }

    public double GetResult(double money){
        return cashSuper.acceptCash(money);
    }
}
