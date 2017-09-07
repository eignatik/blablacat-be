package com.blablacat.core.services;

import com.blablacat.core.entities.TestEntity;

import java.util.ArrayList;
import java.util.List;

public class TestService {
    public List<TestEntity> getTestEntities() {
        List<TestEntity> entities = new ArrayList<>();
        entities.add(new TestEntity("test", "testUrl"));
        entities.add(new TestEntity("test", "testUrl"));
        entities.add(new TestEntity("test", "testUrl"));
        return entities;
    }

    public String getHTML() {
        return "<h1>Hello!</h1>" +
                "<a href=\"/test\">return to test</a>";
    }
}
