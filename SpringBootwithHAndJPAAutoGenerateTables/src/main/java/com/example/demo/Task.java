package com.example.demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Task")
public class Task {
 @Id
 @GeneratedValue
 private int id;
 @Column(name = "description")
 private String desc;
 @Column(name = "target_date")
 private Date targetDate;
 @Column(name = "is_done")
 private boolean isDone;
}