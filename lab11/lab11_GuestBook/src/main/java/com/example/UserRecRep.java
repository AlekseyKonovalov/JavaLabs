package com.example;


import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRecRep extends JpaRepository<UserRecord, Integer> {
}
