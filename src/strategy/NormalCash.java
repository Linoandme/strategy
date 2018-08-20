package strategy;
//正常收费
public class NormalCash implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
