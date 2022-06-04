package com.trabalhoa3.delivery.model;

import com.trabalhoa3.delivery.core.model.Model;

import java.util.Arrays;
import java.util.List;

public class UserModel extends Model {

    public UserModel() {
        super();
    }

    public void create(String[] user) {
        System.out.println(user.length);
        List<String> fields = Arrays.stream(user).toList();
        fields.add(0,"1231231");
        System.out.println(fields.toString());
//        String[] userWithId = (String[]) fields.toArray();
////        System.out.println(userWithId);
//        this.getDatabase().writeFile(this.getDatabase().getPath("User"), userWithId);
    }

//    private  T[] insertUUID(T[] arr, T item, int position){
//        int n = arr.length +1;
//        int i;
//       T[] newarr = new T[n];
//        for (i = 0; i < arr.length + 1; i++) {
//            if (i < position - 1)
//                newarr[i] = arr[i];
//            else if (i == position - 1)
//                newarr[i] = item;
//            else
//                newarr[i] = arr[i - 1];
//        }
//        return newarr;
//    }
}
