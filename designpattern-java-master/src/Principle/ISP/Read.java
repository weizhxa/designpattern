package Principle.ISP;

/**
 * 第二次优化
 * 对查询进行接口拆分隔离
 */
public interface Read {

    /**
     * 查询单个
     * @param ResourceId
     */
    public void findOne(int ResourceId);

    /**
     * 通过oid查询
     * @param oid
     */
    public void findWithOid(int oid);

    /**
     * 通过token查询
     * @param token
     */
    public void findWithToken(String token);

    /**
     * 通过用户名查询
     * @param Username
     */
    public void findWithUsername(String Username);

    /**
     * 通过工作组查询
     * @param wid
     */
    public void findWithWorkgroup(int wid);

    /**
     * 通过其他条件查询
     * 有不确定的条件扩展的话，说明此接口有冗余的风险
     * @param other
     */
    public void findWithOther(Object other);
}
