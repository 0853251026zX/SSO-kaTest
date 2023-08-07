package code.internship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.sql.Timestamp;


import code.internship.entity.SSOUserEntity;

@Repository
public interface SSOUserJPARepository extends JpaRepository<SSOUserEntity, Timestamp> {

}
