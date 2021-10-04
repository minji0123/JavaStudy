package ch14;

public class EmployTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(20210, "김철수", "사원");
        Employee employee2 = new Employee(20211, "김영희", "대리");

        Office office5 = new Office(" 5층");
        Office office4 = new Office(" 4층");
        employee1.empOffDepartment(office5);

        Factory factory3 = new Factory("3line");
        employee2.empFacDepartment(factory3);

        employee1.showEmpInfo();
        employee2.showEmpInfo();

        office5.showDepartInfo();
        office4.showDepartInfo();
        factory3.showDepartInfo();

    }
}
