package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weather.domain.Memo;

import javax.persistence.Entity;

@Repository
public interface JpaMemoRepository extends JpaRepository<Memo, Integer> {

}
