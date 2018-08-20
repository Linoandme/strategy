package strategy;
//打8折收费
public class DiscountCash implements CashSuper {

    private double discount;//折扣

    public DiscountCash(double discount) {//初始化时加上折扣
        this.discount = discount;
    }

    @Override
    public double acceptCash(double money) {
        return money*discount;
    }
}
