package Principle.SRP;

public class CreateData {

    String username;
    String password;

    /**
     * 接收数据
     * @param username
     * @param password
     */
    public void receiveData(String username, String password){
        this.username = username;
        this.password = password;
        System.out.println("数据接收成功:" + username + "-" + password);
    }

    /**
     * 校验数据
     */
    public void validate() throws Exception {
        if (username == null || username.trim() == ""){
            throw new Exception("用户为不正确");
        }

        if (password == null || password.trim() == ""){
            throw new Exception("密码不正确");
        }
        System.out.println("数据校验通过");
    }

    /**
     * 链接数据库
     */
    public void connection(){
        System.out.println("链接数据库:1.1.1.1 成功");
    }

    /**
     * 保存数据
     */
    public void save(){
        System.out.println("保存数据成功:" + username + "-" + password);
    }
}
