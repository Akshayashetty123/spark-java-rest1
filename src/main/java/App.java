public class App {
    public static void main(String[] args) {
        System.out.println("Hello folks");
        System.out.println("Second Push");
        System.out.println("Third Push");
        System.out.println("Fouth Push Skipped Its Fifth Push");
        System.out.println("Sixth Push Added");

        HelloWorldEndpoint helloWorldEndpoint = new HelloWorldEndpoint();
        UserEndpoint userEndpoint = new UserEndpoint();
    }
}
