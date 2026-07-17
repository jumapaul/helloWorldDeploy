package com.helloworld;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloWorldRepository extends JpaRepository<Users, Integer> {
}
