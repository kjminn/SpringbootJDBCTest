package kr.ac.kopo.minn.springboot_jdbctest.repository;

import kr.ac.kopo.minn.springboot_jdbctest.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepostiroy extends JpaRepository<Team, Long> {
}
