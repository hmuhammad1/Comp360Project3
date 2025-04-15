import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;


public class Comp360Registration {
    private static final int MAX_SEATS = 30;
    private List<Student> registeredStudents;


    public Comp360Registration() {
        registeredStudents = new ArrayList<>();
    }

    public boolean isClassRoomFull() {
        return registeredStudents.size() >= MAX_SEATS;
    }

    public void registerStudent(String name) throws ClassFullException {
        LocalDate registrationDate = LocalDate.now();
        if (isClassRoomFull()) {
            throw new ClassFullException(registrationDate);
        }
        int seatNumber = registeredStudents.size() + 1;
        Student student = new Student(name, seatNumber, registrationDate);
        registeredStudents.add(student);
        student.displayRegistrationInfo();
    }

    public void cancelRegistration(String name) {
        Student studentToRemove = null;
        for (Student student : registeredStudents) {
            if (student.getSeatNumber() == registeredStudents.size()) {
                studentToRemove = student;
                break;
            }
        }

        if (studentToRemove != null) {
            registeredStudents.remove(studentToRemove);
            System.out.println(name + "'s registration has been canceled. Seat " + studentToRemove.getSeatNumber() + " is now available.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
