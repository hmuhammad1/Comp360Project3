public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        Comp360Registration registrationSystem = new Comp360Registration();

        try {
            for (int i = 1; i <= 32; i++) {
                registrationSystem.registerStudent("Student " + i);
            }
        } catch (ClassFullException e) {
            e.displayError();
        }

        registrationSystem.cancelRegistration("Student 30");
    }

}
