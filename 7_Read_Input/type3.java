// Java program to demonstrate working of System.console()
// Note that this program does not work on IDEs as,System.console() may require console
class type3 {
    public static void main(String[] args)
    {
        // Using Console to input data from user
        String name = System.console().readLine();

        System.out.println("You entered string " + name);
    }
}