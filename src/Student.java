import java.time.LocalDate;

public class Student {
    private String name;
    private int seatNumber;
    private LocalDate registrationDate;

    public Student(String name, int seatNumber, LocalDate registrationDate) {
        this.name = name;
        this.seatNumber = seatNumber;
        this.registrationDate = registrationDate;
    }

    public void displayRegistrationInfo() {
        System.out.println(name + " registered successfully on " + registrationDate.getMonth() + " " + registrationDate.getDayOfMonth() + " with seat number " + seatNumber);
    }

    public int getSeatNumber() {
        return seatNumber;
    }

}
