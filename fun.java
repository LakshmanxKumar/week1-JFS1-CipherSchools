package week1;
class Chair extends fun {
    void cal() {
        width=90;
        height=24;
        display("Chair");
    }
}
class Table extends fun {
    void cal() {
        width=19;
        height=34;
        display("Table");
    }
}
class Cupboard extends fun{
    void cal() {
        width=48;
        height=64;
        display("cupboard");
    }

}


public class fun {
    int width;
    int height;

    void display(String item) {
        System.out.println(item+" width "+width+" height "+height);
    }
    public static void main(String[] args) {
        Chair c1 = new Chair();
        c1.cal();
    }

}
