public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (Secret value : Secret.values()) {
            if (value.name().indexOf("STAR")== 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

//enum Secret {
//    STAR, CRASH, START; // ...
//}