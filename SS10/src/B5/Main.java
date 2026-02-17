package B5;

public class Main {
    public static void main(String[] args) {

        Employee staff = new OfficeStaff("An", 8000);
        Employee manager = new Manager("Bình", 15000, 5000);

        Employee[] employees = { staff, manager };

        for (Employee e : employees) {
            System.out.println("Nhân viên: " + e.getName());
            System.out.println("Lương cuối cùng: " + e.calculateSalary());
            System.out.println("------------------------");
        }
    }
}
