import org.apache.log4j.Logger;

public class Payment {

    public static Logger logger = Logger.getLogger(Payment.class);


    public static void main(String[] args) {

        Electricity prs1 = new Electricity("one", 100);
        Water prs3 = new Water("123", 304);


        pay(prs1);
        pay(prs3);
    }

    public static <E> void pay(E obj){
        logger.info("komunalurebi gadaxdilia: " + obj);



    }
}
