package com.jcg.hibernate.crud.operations;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name= "student")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "roll_number")
    private int rollNumber;



    @Column(name="course")
    private String course;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;

    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }
    @Override
    public String toString() {
        return ("Student Details? = Id:" + this.id + "Name : " + this.studentName + "Roll No. : " + this.rollNumber + "Course : "+ this.course);
    }
}
