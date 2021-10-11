package Task1;

class Client extends Person{

    private int sum;
    static String bank;

    public Client(String name, int sum) {

        super(name);
        this.sum=sum;
    }
    static {
        bank = "Mono";
    }
}