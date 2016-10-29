package test.dao.generate.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.standard.RequestingUserName;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

import swallow.base.dao.OrderType;
import swallow.base.dao.Query;
import swallow.base.dao.QueryList;
import swallow.base.exception.SwallowException;
import test.dao.generate.entity.UserInfoEntity;
import test.dao.generate.entity.UserInfoEntity.UserInfoEntityKey;

/**
 * 用户信息SQL构建类（由代码生成工具生成，修改请重新生成）
 * 
 * @author aohanhe
 *
 */
public class UserInfoGenSql {
	protected String SEL_FIELD = " tbUser.id as id,tbUser.name as name,tbUser.mobile as mobile, tbUser.company_Id as companyId, tbUserCompany.Name as companyName";
	protected String SEL_TABLE = "tb_user tbUser";
	protected String TABLE = "tb_user";
	protected String[] LEFT_JOINTABLES = { "tb_user_company tbUserCompany on tbUserCompany.id = tbUser.company_Id" };
	protected String SEQ = "tb_user_seq";

	/**
	 * 根据ID构建查询语句
	 * 
	 * @param Id
	 * @return
	 */
	public String getUserInfoById(@Param("id") long Id) {
		return new SQL() {
			{
				SELECT(SEL_FIELD);
				FROM(SEL_TABLE);
				for (String joinTables : LEFT_JOINTABLES) {
					LEFT_OUTER_JOIN(joinTables);

				}
				WHERE("tbUser.id = #{id}");
			}
		}.toString();
	}

	/**
	 * 查询用户信息SQL
	 * 
	 * @param queries
	 * @param orders
	 * @return
	 */
	public String getAllUserInfo(@Param("queries") final QueryList<UserInfoEntity.UserInfoEntityKey> queries,
			final HashMap<UserInfoEntity.UserInfoEntityKey, OrderType> orders) {
		String string = new SQL() {
			{
				SELECT(SEL_FIELD);
				FROM(SEL_TABLE);
				for (String joinTables : LEFT_JOINTABLES) {
					LEFT_OUTER_JOIN(joinTables);
				}
				// 生成查询条件
				if (queries != null) {
					for (int i = 0; i < queries.size(); i++) {
						Query<UserInfoEntity.UserInfoEntityKey> query = queries.get(i);
						WHERE(query.getKeyName() + " " + query.getOpt().toString() + " #{queries." + i + ".value}");
					}
				}

				// 生成排序条件
				if (orders != null) {
					for (UserInfoEntityKey key : orders.keySet()) {
						ORDER_BY(key.toString() + " " + orders.get(key).toString());
					}
				}

			}
		}.toString();
		return string;
	}

	/**
	 * 添加新用户SQL
	 * 
	 * @param entity
	 * @return
	 */
	public String addNewUserInfo(@Param("entity") UserInfoEntity entity) {
		String string = new SQL() {
			{
				INSERT_INTO(TABLE);
				VALUES("id ,name,mobile",
						SEQ + ".NEXTVAL,#{entity.name,jdbcType=VARCHAR},#{entity.mobile,jdbcType=VARCHAR}");

			}
		}.toString();
		return string;
	}

	/**
	 * 取得最新插入的记录的序列SQl
	 * 
	 * @return
	 */
	public String getNewUserInfoId() {
		String string = new SQL() {
			{
				SELECT(SEQ + ".CURRVAL");
				FROM("DUAL");
			}
		}.toString();
		return string;
	}

	/**
	 * 更新用户数据SQL
	 * 
	 * @param entity
	 * @return
	 */
	public String saveUserInfo(@Param("entity") UserInfoEntity entity) {
		String string = new SQL() {
			{
				UPDATE(TABLE);
				SET("name = #{entity.name,jdbcType=VARCHAR}");
				SET("mobile = #{entity.mobile,jdbcType=VARCHAR}");
				WHERE("id = #{entity.id}");
			}
		}.toString();
		return string;
	}

	/**
	 * 删除指定ID的用户信息
	 * 
	 * @param id
	 * @return
	 */
	public String delUserInfo(@Param("id") long id) {
		String string = new SQL() {
			{
				DELETE_FROM(TABLE);
				WHERE("id = #{id}");
			}
		}.toString();
		return string;
	}

}
