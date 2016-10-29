package test.dao.generate.mapper;

import java.util.*;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import swallow.base.dao.OrderType;
import swallow.base.dao.PagerInfo;
import swallow.base.dao.Query;
import swallow.base.dao.QueryList;
import swallow.base.exception.SwallowException;
import test.dao.generate.entity.UserInfoEntity;


/**
 * 用户信息Mybatis映射对象（由代码生成工具生成，修改请重新生成）
 * @author aohanhe
 *
 */
public interface UserInfoGenMapper {
	/**
	 * 通过ID取得用户信息对象
	 * @param Id 对象的ID值
	 * @return
	 * @exception  SwallowException
	 */
	@SelectProvider(method = "getUserInfoById", type = UserInfoGenSql.class)
	UserInfoEntity getUserInfoById(@Param("id") long Id) ;
	
	/**
	 * 取得所有用户信息
	 * @param queries 查询条件集合
	 * @param orders  排序条件集合
	 * @return UserInfoEntity 列表
	 * @exception  SwallowException
	 */
	@SelectProvider(method = "getAllUserInfo", type = UserInfoGenSql.class)
	List<UserInfoEntity> getAllUserInfo(@Param("queries") final QueryList<UserInfoEntity.UserInfoEntityKey> queries,
			HashMap<UserInfoEntity.UserInfoEntityKey,OrderType> orders) ;

	
	
	/**
	 * 保存用户信息
	 * @param userInfo 要保存的新的UserInfoEntity对象 
	 * @return  保存生成的记录条数
	 * @throws SwallowException
	 */
	
	@InsertProvider(method = "addNewUserInfo", type = UserInfoGenSql.class)	 
	int addNewUserInfo(@Param("entity") UserInfoEntity entity);
	
	/**
	 * 取得新插入的记录ID值，需要与Add方法在同一事务中执行
	 * @return
	 */
	@SelectProvider(method="getNewUserInfoId",type =UserInfoGenSql.class)
	Long getNewUserInfoId();
	

	/**
	 * 保存用户信息
	 * @param userInfo 要保存的UserInfoEntity对象 
	 * @return userInfo 影响的记录数
	 * @throws SwallowException
	 */
	@UpdateProvider(method = "saveUserInfo", type = UserInfoGenSql.class)
	int saveUserInfo(@Param("entity") UserInfoEntity entity);
	
	/**
	 * 删除用户信息
	 * @param id 用户记录对应的id
	 * @return 影响的记录数
	 */
	@DeleteProvider(method = "delUserInfo", type = UserInfoGenSql.class)
	int delUserInfo(@Param("id") long id);
}
