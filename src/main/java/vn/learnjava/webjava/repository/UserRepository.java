package vn.learnjava.webjava.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.learnjava.webjava.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}