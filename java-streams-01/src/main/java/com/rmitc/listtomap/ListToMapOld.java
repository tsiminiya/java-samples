package com.rmitc.listtomap;

import com.rmitc.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMapOld {

    public Map<String, User> toMap(List<User> users) {
        Map<String, User> userMap = new HashMap<>();
        if (users != null) {
            for (User user : users) {
                userMap.put(user.getUsername(), user);
            }
        }
        return userMap;
    }

}
