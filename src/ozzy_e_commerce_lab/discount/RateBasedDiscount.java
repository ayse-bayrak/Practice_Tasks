package ozzy_e_commerce_lab.discount;

import java.util.UUID;

public class RateBasedDiscount extends Discount{
    private Double discountRate;


    public RateBasedDiscount(UUID id, String name, Double thresholdAmount, Double discountRate) {
        super(id, name, thresholdAmount);
        this.discountRate = discountRate;
    }

    @Override
    public Double calculateCartAmountDiscountApplied(Double amount) {
        return null;
    }

    @Override
    public Double calculateCartAmountAfterDiscountApplied(Double amount) {
        return null;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public String toString() {
        return super.toString().replace("}", "") +
                ", Discount Rate=" + getDiscountRate() +
                ", calculateCartAmountAfterDiscountApplied=" +calculateCartAmountAfterDiscountApplied(getDiscountRate())+
                '}';

    }
}
