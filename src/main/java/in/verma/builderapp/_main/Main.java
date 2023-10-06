package in.verma.builderapp._main;
import in.verma.builderapp.model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User.Builder> list = new ArrayList<>();
        for(int i=1;i<=20;i++){
            list.add(new User.Builder());
        }
    }
}
