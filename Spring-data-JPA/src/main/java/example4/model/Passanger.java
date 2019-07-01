package example4.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passanger implements Serializable{
	/**
	 * Require in order to prevent the IDE warning 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(nullable = false)
	private Long id;

	@Basic(optional = false)
	@Column(nullable = false)
	private String firstName;

	@Basic(optional = false)
	@Column(nullable = false)
	private String lastName;

	@Basic(optional = false)
	@Column(nullable = false)
	private int seatNumber;
	
	@ToString.Exclude
	@OneToMany(fetch= FetchType.LAZY, mappedBy="passanger")
	private List<Ticket> tickets=new ArrayList<>();;
}
