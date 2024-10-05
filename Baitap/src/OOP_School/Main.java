package OOP_School;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<School> schoolList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Thêm trường tiểu học");
            System.out.println("2. Thêm trường cấp 2");
            System.out.println("3. Thêm trường cấp 3");
            System.out.println("4. Hiển thị danh sách các trường");
            System.out.println("5. Xóa trường khỏi danh sách");
            System.out.println("6. Tìm kiếm trường theo tên");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Xóa bộ nhớ đệm

            switch (choice) {
                case 1:
                    PrimarySchool primarySchool = new PrimarySchool();
                    primarySchool.inputInfo();
                    schoolList.add(primarySchool);
                    break;
                case 2:
                    SecondarySchool secondarySchool = new SecondarySchool();
                    secondarySchool.inputInfo();
                    schoolList.add(secondarySchool);
                    break;
                case 3:
                    HighSchool highSchool = new HighSchool();
                    highSchool.inputInfo();
                    schoolList.add(highSchool);
                    break;
                case 4:
                    System.out.println("Danh sách các trường:");
                    for (School school : schoolList) {
                        school.displayInformation();
                        System.out.println("-------------------");
                    }
                    break;
                case 5:
                    System.out.print("Nhập tên trường cần xóa: ");
                    String schoolName = scanner.nextLine();
                    boolean found = false;
                    for (School school : schoolList) {
                        if (school.name.equalsIgnoreCase(schoolName)) {
                            schoolList.remove(school);
                            found = true;
                            System.out.println("Đã xóa trường " + schoolName);
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy trường có tên " + schoolName);
                    }
                    break;
                case 6:
                    System.out.print("Nhập tên trường cần tìm: ");
                    String searchName = scanner.nextLine();
                    boolean isFound = false;
                    for (School school : schoolList) {
                        if (school.name.equalsIgnoreCase(searchName)) {
                            school.displayInformation();
                            isFound = true;
                        }
                    }
                    if (!isFound) {
                        System.out.println("Không tìm thấy trường có tên " + searchName);
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    }

