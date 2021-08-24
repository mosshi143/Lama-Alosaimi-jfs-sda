package com;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Embeddable
@Entity
@Table(name = "classes")
public class Classes {

	private int clasesId;
	private int teacherId;
	private int subjectId;
	private String time;
	private Teacher teacher_info;

	@Id
	@Column(name = "ClassesId")
	public int getClasesId() {
		return clasesId;
	}

	public void setClasesId(int clasesId) {
		this.clasesId = clasesId;
	}

	@Column(name = "teacher_ref")

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	@Column(name = "subject_ref")
	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	@Column(name = "time")
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	


//
//	@OneToOne
//	@JoinColumn(name = "id")
//	private Subject subject;

}
