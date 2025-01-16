public class Main {
    public static void main(String[] args) {
        // Bước 1: Khai báo và gán giá trị cho các biến
        int myInt = 42;
        double myDouble = 3.14;
        String myString = "Hello, Java!";

        // In các giá trị của ba biến ra màn hình
        System.out.println("Giá trị của myInt: " + myInt);
        System.out.println("Giá trị của myDouble: " + myDouble);
        System.out.println("Giá trị của myString: " + myString);

        // Bước 2: Kiểm tra giá trị của biến myInt
        if (myInt > 10) {
            System.out.println(" Lớn hơnhơn 10");
        } else {
            System.out.println("Nhỏ hơn hoặc bằng 10");
        }
    }
}
