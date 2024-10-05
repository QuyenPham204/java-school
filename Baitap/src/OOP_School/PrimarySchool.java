package OOP_School;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.Serializable;

public class PrimarySchool extends School implements Serializable {
    private int numberOfClasses;

    public PrimarySchool(String name, String address, int numberOfStudents, int numberOfTeachers, int numberOfClasses) {
        super(name, address, numberOfStudents, numberOfTeachers);
        this.numberOfClasses = numberOfClasses;
    }

    public PrimarySchool() {
        this.numberOfClasses = 0;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    @Override
    public void inputInfo() {
        super.inputInfo(); // Gọi phương thức nhập dữ liệu của lớp cha

        Scanner scanner = new Scanner(System.in);

        // Sử dụng try-catch để kiểm tra tính hợp lệ
        while (true) {
            try {
                System.out.print("Số lớp học: ");
                numberOfClasses = scanner.nextInt();
                if (numberOfClasses > 0) {
                    break;
                } else {
                    System.out.println("Số lớp học phải lớn hơn 0. Vui lòng nhập lại.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên.");
                scanner.nextLine(); // Xóa bộ nhớ đệm để tránh vòng lặp vô hạn
            }
        }
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Số lượng lớp học: " + numberOfClasses);
    }
}