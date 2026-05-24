public class PrivateConstructor {
    private PrivateConstructor () {
        System.out.println("Object Created");
    }
    public static PrivateConstructor getObject () {
        return new PrivateConstructor ();
    }
}
