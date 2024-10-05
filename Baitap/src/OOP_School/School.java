package OOP_School;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.Serializable;

public class School implements Serializable{
    protected String name;
    protected String address;
    protected int numberOfStudents;
    protected int numberOfTeachers;

    public School(String name, String address, int numberOfStudents, int numberOfTeachers) {
        this.name = name;
        this.address = address;
        this.numberOfStudents = numberOfStudents;
        this.numberOfTeachers = numberOfTeachers;
    }

    public School() {
        this.name = "";
        this.address = "";
        this.numberOfStudents = 0;
        this.numberOfTeachers = 0;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getNumberOfTeachers() {
        return numberOfTeachers;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tên trường: ");
        name = scanner.nextLine();

        System.out.print("Địa chỉ: ");
        address = scanner.nextLine();


        while (true) {
            try {
                System.out.print("Số lượng học sinh: ");
                numberOfStudents = scanner.nextInt();
                if (numberOfStudents <= 0) {
                    System.out.println("Lỗi: Số lượng học sinh phải lớn hơn 0. Vui lòng nhập lại.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên.");
                scanner.nextLine();
            }
        }

        while (true) {
            try {
                System.out.print("Số lượng giáo viên: ");
                numberOfTeachers = scanner.nextInt();
                if (numberOfTeachers <= 0) {
                    System.out.println("Lỗi: Số lượng giáo viên phải lớn hơn 0. Vui lòng nhập lại.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên.");
                scanner.nextLine(); // Xóa bộ nhớ đệm
            }
        }
    }

    public void displayInformation() {
        System.out.println("Tên trường: " + name + " , Địa chỉ: " + address + " . Số lượng học sinh: " + numberOfStudents + " , Số lượng giáo viên: " + numberOfTeachers);
    }
}
