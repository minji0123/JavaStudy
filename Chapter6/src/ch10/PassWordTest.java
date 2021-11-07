package ch10;

public class PassWordTest {
    private  String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PassWordException{
        if (password == null){
            throw new PassWordException("비밀번호는 null일 수 없습니다.");
        }
        else if (password.length()<5){
            throw new PassWordException("비밀번호는 5자 이상이어야 합니다.");
        }
        else if (password.matches("[a-zA-Z]+")) {// 정규표현식임
            throw new PassWordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
        }
        else {
            this.password = password;
        }
    }

    public static void main(String[] args) {
        PassWordTest test = new PassWordTest();

        String password = null;
        try {
            test.setPassword(password);
            System.out.println("null오류 없음");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        }

        password = "as1";
        try {
            test.setPassword(password);
            System.out.println("비번 길이 오류 없음");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        }

        password = "asssa";
        try {
            test.setPassword(password);
            System.out.println("특수문자, 숫자 미포함 오류 없음");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        }

        password = "asss2a";
        try {
            test.setPassword(password);
            System.out.println("모든 오류 없음");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        }
    }
}
