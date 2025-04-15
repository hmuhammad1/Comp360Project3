import java.time.LocalDate;

public class ClassFullException extends RuntimeException {
  private LocalDate registrationDate;

  public ClassFullException(LocalDate registrationDate) {
    super("Class is full! No available seats.");
    this.registrationDate = registrationDate;
  }

  public void displayError() {
    System.out.println("Registration failed on: " + registrationDate.getMonth() + " " + registrationDate.getDayOfMonth());
  }
  //public ClassFullException(String message) {
    //super(message);
  //}
}
