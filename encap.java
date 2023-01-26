package week1;

class AmazonPay{

    float transaction(float amt) {
        Gpay gpayobj = new Gpay();
        gpayobj.changeTX(0.99f);
        float totlamt = amt*(amt*(gpayobj.getTX()));
        return totlamt;
    }
}

class Gpay {
    private float charge = 0.05f;

    public void changeTX(float ch) {
        if(ch<=5) {
            System.out.println("Invalid charge");
            return;
        }
        charge = ch;
    }

    float getTX() {
        return charge;
    }
}
public class encap {
    public static void main(String[] args) {
        AmazonPay customer= new AmazonPay();
        float payAbleAmount= customer.transaction(100);
        System.out.println(payAbleAmount);
    }
}
