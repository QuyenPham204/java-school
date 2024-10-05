package OOP_School;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
public class FileManager {
    public static void writeBinaryFile(List<School> schoolList, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(schoolList);
            System.out.println("Ghi dữ liệu vào tệp nhị phân thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi ghi tệp: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<School> readBinaryFile(String fileName) {
        List<School> schoolList = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            schoolList = (List<School>) ois.readObject();
            System.out.println("Đọc dữ liệu từ tệp nhị phân thành công.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi đọc tệp: " + e.getMessage());
        }
        return schoolList;
    }
}
