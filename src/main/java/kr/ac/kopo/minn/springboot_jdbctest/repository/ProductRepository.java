package kr.ac.kopo.minn.springboot_jdbctest.repository;

import kr.ac.kopo.minn.springboot_jdbctest.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
