package ozzy_e_commerce_lab.discount;

import java.util.UUID;

public class AmountBasedDiscount extends Discount{
private Double discountAmount;

    public AmountBasedDiscount(UUID id, String name, Double thresholdAmount, Double discountAmount) {
        super(id, name, thresholdAmount);
        this.discountAmount = discountAmount;
    }

    @Override
    public Double calculateCartAmountDiscountApplied(Double amount) {
        return null;
    }

    @Override
    public Double calculateCartAmountAfterDiscountApplied(Double amount) {
        return null;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
        ", Discount Amount=" + getDiscountAmount() +
               ", calculateCartAmountAfterDiscountApplied=" +calculateCartAmountAfterDiscountApplied(getDiscountAmount())+
                '}';

    }


}
