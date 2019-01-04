package com.example.hibernate.aggregation.bidir;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Courses2")
public class Course2 {
	
	@Id
	private int cId;
	private String cName;
	
	@OneToMany(mappedBy="course",cascade=CascadeType.ALL)
	private Set<Student2> students;
	
	public Course2() {}

	public Course2(int cId, String cName, Set<Student2> students) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.students = students;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Set<Student2> getStudents() {
		return students;
	}

	public void setStudents(Set<Student2> students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("Course [cId="+cId+",cName=" +cName+",students="+students+"]\n");
		if(students!=null)
		{
			for(Student2 student:students)
				sb.append("\n"+student);
		}
		return sb.toString();
	}
	

}
