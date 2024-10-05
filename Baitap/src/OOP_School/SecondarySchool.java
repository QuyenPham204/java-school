package OOP_School;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.Serializable;
public class SecondarySchool extends School implements Serializable{
    private int numberOfGrades;

    public SecondarySchool(String name, String address, int numberOfStudents, int numberOfTeachers, int numberOfGrades) {
        super(name, address, numberOfStudents, numberOfTeachers);
        this.numberOfGrades = numberOfGrades;
    }

    public SecondarySchool() {
        this.numberOfGrades = 0;
    }

    public int getNumberOfGrades() {
        return numberOfGrades;
    }

    @Override
    public void inputInfo() {
        super.inputInfo(); // Gọi phương thức nhập dữ liệu của lớp cha

        Scanner scanner = new Scanner(System.in);

        // Sử dụng try-catch để kiểm tra tính hợp lệ
        while (true) {
            try {
                System.out.print("Số khối lớp: ");
                numberOfGrades = scanner.nextInt();

                // Kiểm tra điều kiện hợp lệ, thay vì sử dụng throw
                if (numberOfGrades > 0) {
                    break; // Dữ liệu hợp lệ, thoát vòng lặp
                } else {
                    System.out.println("Số khối lớp phải lớn hơn 0. Vui lòng nhập lại.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên.");
                scanner.nextLine(); // Xóa bộ nhớ đệm để tránh lặp vô hạn
            }
        }
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Số khối lớp: " + numberOfGrades);
    }
}
