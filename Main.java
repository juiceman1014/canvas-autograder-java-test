public class Main {
    public static void main(String[] args) throws java.io.IOException {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = scanner.nextLine();
        try {
            int num = Integer.parseInt(input);
            System.out.println(num * num);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}