package ch14;

public class Employee {
    int companyNum;
    String employeeName;
    String spot;
    String department;
    
    public Employee(int companyNum, String employeeName, String spot){
        this.companyNum = companyNum;
        this.employeeName = employeeName;
        this.spot = spot;
    }
    public void empOffDepartment(Office department){
        department.departNumbOfEmp(1);
    }
    public void empFacDepartment(Factory department){
        department.departNumOfEmp(1);
    }
    public void showEmpInfo(){
        System.out.println(companyNum+employeeName+"님은 "+spot+"입니다.");
    }
}

class Office {
//    String departmentKind;
    String address;
    int employeeNum = 100;
    
    public Office(String address){
        this.address = address;
    }
    public void departNumbOfEmp(int employeeNum){
        this.employeeNum += employeeNum;
    }
    public void showDepartInfo(){
        System.out.println("사무실 " +address+" 에 위치한 인사부서는 총 " +employeeNum+"명 입니다.");
    }
}

class Factory {
    String address;
    int employeeNum = 200;

    public Factory(String address){
        this.address = address;
    }
    public void departNumOfEmp(int employeeNum){
        this.employeeNum += employeeNum;
    }
    public void showDepartInfo(){
        System.out.println("공장 " +address+" 에 위치한 도장부서는 총 " +employeeNum+"명 입니다.");
    }
}