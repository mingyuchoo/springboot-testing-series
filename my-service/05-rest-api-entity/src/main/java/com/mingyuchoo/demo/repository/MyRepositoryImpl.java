package com.mingyuchoo.demo.repository;

import com.mingyuchoo.demo.entity.MyEntity;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryImpl implements MyRepository {

    @Override
    public MyEntity get() {
        MyEntity myEntity = new MyEntity();
        myEntity.setFirstName("Hello");
        myEntity.setLastName("World");
        return myEntity;
    }
}
