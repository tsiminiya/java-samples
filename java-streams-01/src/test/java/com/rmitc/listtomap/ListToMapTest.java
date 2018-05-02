package com.rmitc.listtomap;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.rmitc.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class ListToMapTest {

    private ListToMapOld listToMapOld = new ListToMapOld();
    private ListToMapNew listToMapNew = new ListToMapNew();

    private List<User> users;

    private static Map<String, User> expectedResult = ImmutableMap.of(
            "alex123", new User("alex123", "Alex", "Cruz"),
            "lesley", new User("lesley", "Lesley", "Santos"),
            "samson", new User("samson", "Samson", "Perez"));

    @Before
    public void setup() {
        users = ImmutableList.of(new User("alex123", "Alex", "Cruz"),
                                 new User("lesley", "Lesley", "Santos"),
                                 new User("samson", "Samson", "Perez"));
    }

    @Test
    public void givenUserList_whenConvertedToMapUsingOldMethod_shouldReturnResult() {
        Map<String, User> userMap = listToMapOld.toMap(users);
        Assert.assertEquals(expectedResult, userMap);
    }

    @Test
    public void givenUserList_whenConvertedToMapUsingNewMethod_shouldReturnResult() {
        Map<String, User> userMap = listToMapNew.toMap(users);
        Assert.assertEquals(expectedResult, userMap);
    }

}
