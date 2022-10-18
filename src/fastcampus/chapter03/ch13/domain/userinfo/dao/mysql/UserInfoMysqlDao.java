package fastcampus.chapter03.ch13.domain.userinfo.dao.mysql;

import fastcampus.chapter03.ch13.domain.userinfo.UserInfo;
import fastcampus.chapter03.ch13.domain.userinfo.dao.UserInfoDao;

/**
 * packageName : fastcampus.chapter03.ch13.domain.userinfo.dao.mysql
 * className : UserInfoMysqlDao
 * user : jwlee
 * date : 2022/10/18
 */
public class UserInfoMysqlDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySQL userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MySQL userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete into MySQL userId = " + userInfo.getUserId());
    }
}
