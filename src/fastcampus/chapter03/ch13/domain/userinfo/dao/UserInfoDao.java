package fastcampus.chapter03.ch13.domain.userinfo.dao;

import fastcampus.chapter03.ch13.domain.userinfo.UserInfo;

/**
 * packageName : fastcampus.chapter03.ch13.domain.userinfo.dao
 * className : UserInfoDao
 * user : jwlee
 * date : 2022/10/18
 */
public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);

}
