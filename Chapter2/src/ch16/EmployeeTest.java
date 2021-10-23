package ch16;

import java.sql.SQLOutput;

public class EmployeeTest {
    public static void main(String[]args) {

        // 1. static 으로 선언된 변수는 모든 인스턴스가 공유한다.
//        Employee employeeLee = new Employee();
//        employeeLee.setEmployeeName("이순신");
//        System.out.println(employeeLee.serialNum);
//
//        Employee employeeKim = new Employee();
//        employeeKim.setEmployeeName("김유신");
//        employeeKim.serialNum++;
//        System.out.println(employeeLee.serialNum);
//        System.out.println(employeeKim.serialNum);

        // 2. static 변수는 클래스 이름으로 참조 가능하다.
        System.out.println(Employee.serialNum);
//        System.out.println(Employee.employeeId);

        
        // 3. static 변수로, 인스턴스에 사번 부여하기
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName()+" 님의 사번 : " + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName()+" 님의 사번 : " + employeeKim.getEmployeeId());

    }
}
