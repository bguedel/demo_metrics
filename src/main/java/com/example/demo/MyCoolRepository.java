package com.example.demo;

import com.example.demo.entity.MyCoolRepoPojo;
import io.micrometer.core.annotation.Timed;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Timed("timed.repository.my-cool-repository")
public interface MyCoolRepository extends JpaRepository<MyCoolRepoPojo, Integer> {

    Optional<MyCoolRepoPojo> findByNameIgnoreCase(String name);
}
