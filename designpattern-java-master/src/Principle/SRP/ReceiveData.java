package Principle.SRP;

public class ReceiveData {

    public String[] receive(String username, String password){
        String[] result = new String[2];
        result[0] = username;
        result[1] = password;

        return result;
    }
}
