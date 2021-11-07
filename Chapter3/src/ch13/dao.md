## [인터페이스와 다형성]   
1. 다형성   
- 하나의 인터페이스를 여러 객체가 구현-> 클라이언트 프로그램이 인터페이스의 메서드를 활용해서 여러 객체 구현 가능   
![Alt text](C:/Users/user/Desktop/javaGit/dao.png)   

## [인터페이스를 활용한 dao 구현]   
1. DB에 회원 정보를 넣는 dao(data access object)를 여러 DB 제품이 지원될 수 있게 구현함   
2. 환경파일(db.properties) 에서 database 의 종류에 대한 정보를 읽고, 그 정보에 맞게 dao 인스턴스를 생성하여 실행될 수 있게 함   
![Alt text](C:/Users/user/Desktop/javaGit/dao2.png)   