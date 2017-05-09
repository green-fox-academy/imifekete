package com.todo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int id;
  private String title;
  boolean isUrgent;
  boolean isDone;

  public Todo(int id, String title, boolean isUrgent, boolean isDone) {
    this.id = id;
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }
}

