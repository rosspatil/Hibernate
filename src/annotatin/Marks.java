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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="marks")
public class Marks implements Serializable {


	int marks;	
	int sno;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sno")
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	Set<Student> stud;
	@Column(name="marks")
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="marks")
	public Set<Student> getStud() {
		return stud;
	}
	public void setStud(Set<Student> stud) {
		this.stud = stud;
	}
	

	
}
