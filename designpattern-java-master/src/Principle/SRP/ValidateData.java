package Principle.SRP;

public class ValidateData {

    public void validate(String[] info) throws Exception {
        if (info[0] == null){
            throw new Exception("用户名错误");
        }

        if (info[1] == null){
            throw new Exception("密码错误");
        }
    }
}
