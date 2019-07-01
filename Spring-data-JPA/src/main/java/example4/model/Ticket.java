package example4.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket implements Serializable {
	/**
	 * Require in order to prevent the IDE warning
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(nullable = false)
	private Long id;
	
	@ManyToOne
	private Passanger passanger;
	@ManyToOne
	private Seat seat;
}
