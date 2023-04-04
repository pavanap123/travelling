package com.example.Travelling.Repository;

import com.example.Travelling.Model.Bus;
import com.example.Travelling.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
}
