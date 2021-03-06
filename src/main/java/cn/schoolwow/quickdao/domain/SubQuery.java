package cn.schoolwow.quickdao.domain;

import cn.schoolwow.quickdao.query.condition.AbstractCondition;
import cn.schoolwow.quickdao.query.subCondition.SubCondition;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 子查询
 */
public class SubQuery<T> implements Serializable {
    /**
     * 关联实体
     */
    public transient Entity entity;
    /**
     * 表别名
     */
    public String tableAliasName;
    /**
     * 主表字段
     */
    public String primaryField;
    /**
     * 子表字段
     */
    public String joinTableField;
    /**
     * 对象变量名
     */
    public String compositField;
    /**
     * 连接方式
     */
    public String join = "join";
    /**
     * 查询条件
     */
    public StringBuilder whereBuilder = new StringBuilder();
    /**
     * 查询参数
     */
    public List parameterList = new ArrayList();
    /**
     * join Condition 关联子查询
     * */
    public StringBuilder subQuerySQLBuilder;
    /**
     * join Condition 关联子查询Query
     * */
    public Query subQuery;
    /**
     * 父表
     */
    public SubQuery parentSubQuery;
    /**
     * 父表
     */
    public SubCondition parentSubCondition;
    /**
     * 主表
     */
    public transient Query query;
    /**
     * 主表
     */
    public transient AbstractCondition condition;
}
