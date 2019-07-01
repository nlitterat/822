package example4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import example4.model.Seat;

public interface SeatDAO extends JpaRepository<Seat, Long> {
	
	List<Seat> findByBusId(Long budId);
	
	@Query("SELECT seat FROM Seat seat where seat.bus.id = :busId")
	List<Seat> findByBusIdQuery(@Param("busId") Long busId);

	@Query("SELECT seat FROM Seat seat where seat.bus.id = :busId")
	List<Seat> findByBusIdNamedQuery(@Param("busId") Long busId);

}