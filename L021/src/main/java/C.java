public class C {
    private byte b = 22;
    private short sh = 22;
    private int x = 10;
    private long l = 12L;
    private float f = 34.43f;
    private double d = 34.43d;
    private char c = 'A';
    private String str = "";
    private boolean bol = true;

    public static void main(String [] args) {

        System.out.println("Object - " + ObjectSizeFetcher.getObjectSize(new C()));
        System.out.println("byte - " + ObjectSizeFetcher.getObjectSize(new C().b));
        System.out.println("short - " + ObjectSizeFetcher.getObjectSize(new C().sh));
        System.out.println("int - " + ObjectSizeFetcher.getObjectSize(new C().x));
        System.out.println("long - " + ObjectSizeFetcher.getObjectSize(new C().l));
        System.out.println("float - " + ObjectSizeFetcher.getObjectSize(new C().f));
        System.out.println("double - " + ObjectSizeFetcher.getObjectSize(new C().d));
        System.out.println("char - " + ObjectSizeFetcher.getObjectSize(new C().c));
        System.out.println("String - " + ObjectSizeFetcher.getObjectSize(new C().str));
        System.out.println("boolean - " + ObjectSizeFetcher.getObjectSize(new C().bol));
    }
}