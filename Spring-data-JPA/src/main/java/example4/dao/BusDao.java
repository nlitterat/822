package example4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import example4.model.Bus;

public interface BusDao extends JpaRepository<Bus, Long> {

	

}