package com.rmitc.listtomap;

import com.rmitc.model.User;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapNew {

    public Map<String, User> toMap(List<User> users) {
        if (users != null) {
            return users.stream().collect(Collectors.toMap(User::getUsername, user -> user));
        }
        return Collections.emptyMap();
    }

}
