package chapter14.toy;

public class ObjectUtil {

    public static void isBasicType(){
        char[] chars = new char[4];
        chars[1] = 'a';
        chars[2] = 'b';
        chars[3] = 'c';
        if (chars instanceof Object){
            System.out.println("Is Object");
        } else {
            System.out.println("Is Not Object");
        }
    }

    public static void main(String[] args) {
        isBasicType();
    }

}
