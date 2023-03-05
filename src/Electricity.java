public class Electricity {
    String customerNumber;
    double amount;

    public Electricity(String customerNumber, double amount){
        this.amount = amount;
        this.customerNumber = customerNumber;

    }

    @Override
    public String toString() {
        return "Electricity{" +
                "customerNumber='" + customerNumber + '\'' +
                ", amount=" + amount +
                '}';
    }
}
