package chapter14.sweetshop;

public class ShopTest {
    public static void main(String[] args) {
/*
        new Candy();
        try {
            Class.forName("chapter14.sweetshop.Gum");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        new Cookie();
*/
        buildObject("Candy");
        buildObject("Cookie");
        buildObject("Gum");
    }
    static void buildObject(String mark){
        switch (mark){
            case "Candy":
                try {
                    Class.forName("chapter14.sweetshop.Candy");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            case "Cookie":
                try {
                    Class.forName("chapter14.sweetshop.Cookie");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            case "Gum":
                try {
                    Class.forName("chapter14.sweetshop.Gum");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }


        }
    }
}
