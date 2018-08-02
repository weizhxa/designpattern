package Principle.ISP;

/**
 * 第三次优化
 * 继续拆分
 * 继续抽象
 */
public interface Condition {

    /**
     * 接受条件参数
     * 返回条件的查询sql语句
     * @param arg 注意，此处参数不确定类型和个数，所以可以定义一个接口，用作处理参数
     * @return
     */
    public String getConditionSql(String[] arg);

    /**
     * 接受条件参数 - 重载
     * 返回条件的查询sql语句
     * 此处参数不确定类型和个数，所以可以定义一个接口，用作处理参数
     * @return
     */
    public String getConditionSql(Parameter parameter);

    /**
     * oid条件实现此接口
     * 返回
     * `oid` = prameter.getAttr
     */

    /**
     * username条件实现此接口
     * 返回
     * `username` = prameter.getAttr
     */
}