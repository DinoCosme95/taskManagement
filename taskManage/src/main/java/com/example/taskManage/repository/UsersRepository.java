package com.example.taskManage.repository;
import com.example.taskManage.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepository  extends JpaRepository<Users, Long> {

}
