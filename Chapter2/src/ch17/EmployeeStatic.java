package ch17;

public class EmployeeStatic {
    // serialNum은 외부에서 보면 안되는 중요한 값이다.
    // 1. 따라서 public이 아니라 private로 해야 한다.
    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    // 생성자에 static변수 사용 가능
    public EmployeeStatic(){
        serialNum++;
        employeeId=serialNum;
    }

    public static int getSerialNum(){
        // 1. 지역변수
        int i = 0;


        // 2. 인스턴스변수
        // 인스턴스 생성 전에 호출될 수 있으므로 static 메서드 내부에서는 인스턴스 변수를 사용할 수 없음
        // new로 선언해주면 사용할 수 있음
        // employeeName = "Lee";
        EmployeeStatic e1 = new EmployeeStatic();
        e1.employeeName = "Lee";

        // 3. static 변수
        return serialNum;
    }

    public int getEmployeeId() {
        // 일반 메소드에서 static 메소드를 사용하는건 상관없다.
        serialNum = 1000;
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}