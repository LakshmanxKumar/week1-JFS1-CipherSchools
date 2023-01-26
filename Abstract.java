package week1;

interface olaCustomer {
    void bookCab();
    void ride();
    void vRoom();
    void cancelCab();
    void signIn();
    void signUp();
}
interface olaDriver {
    void acceptBooking();
    void rejectBooking();
    void setStatus();
    void getMyCommission();
    void callCustomer();
}
interface olaOwner {
    void getRevenue();
    void addDriver();
    void changeDriver();
}
public class Abstract implements olaCustomer,olaOwner,olaDriver {
    public static void main(String[] args) {
olaOwner c1= new Abstract();
        c1.getRevenue();
        c1.addDriver();
        c1.changeDriver();
    }

    @Override
    public void bookCab() {

    }

    @Override
    public void ride() {

    }

    @Override
    public void vRoom() {

    }

    @Override
    public void cancelCab() {

    }

    @Override
    public void signIn() {

    }

    @Override
    public void signUp() {

    }

    @Override
    public void acceptBooking() {

    }

    @Override
    public void rejectBooking() {

    }

    @Override
    public void setStatus() {

    }

    @Override
    public void getMyCommission() {

    }

    @Override
    public void callCustomer() {

    }

    @Override
    public void getRevenue() {

    }

    @Override
    public void addDriver() {

    }

    @Override
    public void changeDriver() {

    }
}
