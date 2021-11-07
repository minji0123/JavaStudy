package ch13.web.userinfo;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserinfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserinfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserinfoClient {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");
        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("12dsf");
        userInfo.setUserName("김철수");

        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserinfoOracleDao();
        } else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserinfoMySqlDao();
        } else {
            System.out.println("db error");
            return;
        }
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }
}
