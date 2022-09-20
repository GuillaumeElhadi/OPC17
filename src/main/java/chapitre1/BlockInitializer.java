public class BlockInitializer {

    {
        System.out.println("Hello initializer");
    }

    public static void main(String[] args) {

        BlockInitializer b = new BlockInitializer();
        System.out.println("Hello");
    }
}