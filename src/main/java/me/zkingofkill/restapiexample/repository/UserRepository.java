package me.zkingofkill.restapiexample.repository;

import me.zkingofkill.restapiexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
        User findById(long id);
}
