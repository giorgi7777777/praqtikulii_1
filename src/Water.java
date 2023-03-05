public class Water {
    String customerNumber;
    double amount;

    public Water(String customerNumber, double amount){
        this.amount = amount;
        this.customerNumber = customerNumber;

    }

    @Override
    public String toString() {
        return "Water{" +
                "customerNumber='" + customerNumber + '\'' +
                ", amount=" + amount +
                '}';
    }
}
