package generic.ex4;

public class GenericMethod { //제네릭 타입
    public static Object objMethod(Object obj){
        System.out.println("Object print: " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t){ //제네릭 메서드
        System.out.println("generic print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t){
        System.out.println("bound print: " + t);
        return t;
    }
}
