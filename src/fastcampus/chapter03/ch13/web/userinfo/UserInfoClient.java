package fastcampus.chapter03.ch13.web.userinfo;

import fastcampus.chapter03.ch13.domain.userinfo.UserInfo;
import fastcampus.chapter03.ch13.domain.userinfo.dao.UserInfoDao;
import fastcampus.chapter03.ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import fastcampus.chapter03.ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * packageName : fastcampus.chapter03.ch13.web.userinfo
 * className : UserInfoClient
 * user : jwlee
 * date : 2022/10/18
 */
public class UserInfoClient {

    public static void main(String[] args) throws Exception{



        InputStream fis = ClassLoader.getSystemResourceAsStream("fastcampus/chapter03/ch13/db.properties");
        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setUserName("Lee");
        userInfo.setPassword("!@#$%");

        UserInfoDao userInfoDao = null;

        if("ORACLE".equals(dbType)) {
            userInfoDao = new UserInfoOracleDao();
        }else if("MYSQL".equals(dbType)) {
            userInfoDao = new UserInfoMysqlDao();
        }else{
            System.out.println("db error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }

}
