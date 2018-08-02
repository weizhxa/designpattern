package Principle.ISP;

/**
 * 第三次优化
 * 接受查询条件
 */
public interface ReadWithCondition {
    /**
     * 查询
     * 接收查询条件
     * @param condition
     */
    public void findWithCondition(Condition condition);

    /**
     * 媒体模块实现此接口
     * select * from media where 1=1 and + "condition.getConditionSql"
     */

    /**
     * 播放器模块实现此接口
     * select * from media where 1=1 and + 'condition.getConditionSql'
     */
}
