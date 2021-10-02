package ch11;

public class MakeReport {
    //StringBuffer는 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형이다.
    //String, StringBuilder, StringBuffer
    StringBuffer buffer = new StringBuffer();

    private String line = "========================================\n";
    private String title = "     이름\t    주소 \t\t    전화번호\n";

    private void makeHeader(){
        //append는 값을 추가한다.
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody(){
        // 원래 이렇게 나열하는거는 안좋은 방법이다. 나중에 배열을 배우고, for문으로 돌리는게 좋다.
        buffer.append("John\t\t");
        buffer.append("Seoul Korea  \t");
        buffer.append("010-0000-0000\n");

        buffer.append("Travis  \t");
        buffer.append("London UK  \t\t");
        buffer.append("010-7777-7777\n");
    }
    private void makeFooter(){
        buffer.append(line);
    }

    public String getReport(){
        makeHeader();
        generateBody();
        makeFooter();
        //toString은 메소드 재정의
        return buffer.toString();
    }
}
