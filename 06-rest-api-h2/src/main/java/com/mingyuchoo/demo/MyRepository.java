package com.mingyuchoo.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<MyEntity, Integer> {
    MyEntity findById(int id);
}
