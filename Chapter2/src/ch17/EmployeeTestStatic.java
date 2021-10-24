package ch17;

import ch16.Employee;

public class EmployeeTestStatic {

    public static void main(String[]args) {

        // 1. static 메서드는 new선언 없이 생성 된다.
        // EmployeeStatic클래스에서 게터메소드로 설정한 serialNum을 호출한다.
        System.out.println(EmployeeStatic.getSerialNum());


        EmployeeStatic employeeLee = new EmployeeStatic();
        employeeLee.setEmployeeName("이순신");

        EmployeeStatic employeeKim = new EmployeeStatic();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName()+" 님의 사번 : " + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName()+" 님의 사번 : " + employeeKim.getEmployeeId());

    }
}
// 그렇다고 멤버변수를 너무 안만들면
// 변수 선언할 때 마다 계속 새로 생성해줘야 하기 때문에 적당히 선언해줘야 한다.
// 공유할 필요가 있는 변수를 static으로 (최소한으로)사용하자