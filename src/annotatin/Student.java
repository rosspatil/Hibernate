package annotatin;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name="student")
public class Student implements Serializable {

	String name;
	int roll;	
	Set<Marks> marks;
	
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Id
	@GeneratedValue
	@Column(name="roll")
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name = "marks",joinColumns={  @JoinColumn(name="roll")},inverseJoinColumns={@JoinColumn(name="sno")})
	public Set<Marks> getMarks() {
		return marks;
	}
	public void setMarks(Set<Marks> marks) {
		this.marks = marks;
	}
	
	
	

	

}
