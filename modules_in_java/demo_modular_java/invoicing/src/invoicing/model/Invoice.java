package invoicing.model;

/**
 * Created by Admin on 5/10/2023
 *
 * @author : Admin
 * @date : 5/10/2023
 * @project : demo_modular_java
 */
public class Invoice {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "Invoice{" +
                "amount=" + amount +
                '}';
    }
}
