package OOP_School;
import java.util.Scanner;
import java.io.Serializable;
public class HighSchool extends School implements Serializable{
    private String universityEntranceExam;
    public HighSchool() {
        this.universityEntranceExam ="";
    }

    public HighSchool(String name, String address, int numberOfStudents, int numberOfTeachers, String universityEntranceExam) {
        super(name, address, numberOfStudents, numberOfTeachers);
        this.universityEntranceExam = universityEntranceExam;
    }
    public String getUniversityEntranceExam() {
        return universityEntranceExam;
    }
    @Override
    public void inputInfo() throws IllegalArgumentException {
        super.inputInfo(); // Gọi phương thức nhập dữ liệu của lớp cha

        Scanner scanner = new Scanner(System.in);

        System.out.print("Chất lượng thi đỗ tốt nghiệp: ");
        universityEntranceExam = scanner.nextLine();
        if (universityEntranceExam.isEmpty()) {
            throw new IllegalArgumentException("Chất lượng thi đỗ tốt nghiệp không được để trống.");
        }
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Chất lượng kỳ thi đỗ tốt nghiệp: " + universityEntranceExam);
    }
}
