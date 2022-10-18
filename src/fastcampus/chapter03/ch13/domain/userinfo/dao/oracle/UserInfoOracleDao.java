package fastcampus.chapter03.ch13.domain.userinfo.dao.oracle;

import fastcampus.chapter03.ch13.domain.userinfo.UserInfo;
import fastcampus.chapter03.ch13.domain.userinfo.dao.UserInfoDao;

/**
 * packageName : fastcampus.chapter03.ch13.domain.userinfo.dao.oracle
 * className : UserInfoOracleDao
 * user : jwlee
 * date : 2022/10/18
 */
public class UserInfoOracleDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into Oracle userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete into Oracle userId = " + userInfo.getUserId());
    }
}
