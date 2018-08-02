package Principle.ISP;

/**
 * Fat Interface
 * 原接口定义
 */
public interface Resource {

    /**
     * 增
     */
    public void create();

    /**
     * 删
     */
    public void delete();

    /**
     * 改
     */
    public void update();

    /**
     * 查id
     */
    public void read(int resourceId);

    //冗余的部分

    /**
     * 业务需要1，增加根据OID查询
     */
    public void readFromOid(int oid);

    /**
     * 业务需要2，增加根据token查询
     */
    public void readFromToken(String token);

    /**
     * 业务需要3，增加根据用户查询
     */
    public void readFromUsername(String username);

    /**
     * 业务需要4，增加根据工作组查询
     */
    public void readFromWorkgroup(int wid);

    /**
     * 业务需要5，增加节目更新
     */
    public void updatePlan(int planId);

}
