package com.example.taskManage.repository;
import com.example.taskManage.model.AppUser;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@Transactional
public interface UsersRepository  extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByEmail(String email);
}
