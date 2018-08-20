package strategy;
//返利
public class ReturnCash implements CashSuper {
    private double returnCondition ;//返利条件
    private double returnMoney;//返利金额

    public ReturnCash(double returnCondition, double returnMoney) {
        this.returnCondition = returnCondition;
        this.returnMoney = returnMoney;
    }

    @Override
    public double acceptCash(double money) {
        double result=money;
        if(money>returnCondition){
            money=money-Math.floor(money/returnCondition)*returnMoney;
        }
        return money;
    }
}
