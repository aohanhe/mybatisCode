package test.dao.generate.mapper;

import java.util.*;

import swallow.base.dao.OrderType;
import swallow.base.dao.PagerInfo;
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
	UserInfoEntity getUserInfoById(long Id) throws SwallowException;
	
	/**
	 * 取得所有用户信息
	 * @param queries 查询条件集合
	 * @param orders  排序条件集合
	 * @return UserInfoEntity 列表
	 * @exception  SwallowException
	 */
	List<UserInfoEntity> getAllUserInfo(Map<UserInfoEntity.UserInfoEntityKey, Object> queries,
			Map<UserInfoEntity.UserInfoEntityKey,OrderType> orders)  throws SwallowException;

	/**
	 * 分页取得所有用户信息
	 * @param queries 查询条件集合
	 * @param orders  排序条件集合
	 * @param PagerInfo 分页查询设置，结果也通过这个对象返回
	 * @return UserInfoEntity 列表
	 * @exception  SwallowException
	 */
	List<UserInfoEntity> getAllUserInfo(Map<UserInfoEntity.UserInfoEntityKey, Object> queries,
			Map<UserInfoEntity.UserInfoEntityKey,OrderType> orders,PagerInfo pageInfo)  throws SwallowException;
	
	/**
	 * 保存用户信息
	 * @param userInfo 要保存的新的UserInfoEntity对象 
	 * @return userInfo 保存后的新的UserInfoEntity对象，对部分数据进行了更新
	 * @throws SwallowException
	 */
	UserInfoEntity saveNewUserInfo(UserInfoEntity userInfo) throws SwallowException;

	/**
	 * 保存用户信息
	 * @param userInfo 要保存的UserInfoEntity对象 
	 * @return userInfo 保存后的UserInfoEntity对象，对部分数据进行了更新
	 * @throws SwallowException
	 */
	UserInfoEntity saveUserInfo(UserInfoEntity userInfo) throws SwallowException;
}
