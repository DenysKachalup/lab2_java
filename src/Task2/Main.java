package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ListStack<String> list = new ListStack<>();

        for (int i = 0; i < 4; i++) {
            list.add("" + i);
        }
        for (String text :list) {
            System.out.print(text + "  ");
        }

        //list.print();
        /*list.delete();
        System.out.println("Delete");
        list.print();
        list.clean();
        System.out.println("Clean");
        list.print();*/
    }
}
