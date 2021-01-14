package com.x3platform.transactions.app3.program.models;

import java.io.Serializable;

/**
 * tbl_3
 */
public class Tbl3 implements Serializable {
  
  private Integer id;
  
  public void setId(Integer value) {
    id = value;
  }
  
  public Integer getId() {
    return id;
  }
  
  private String name;
  
  public void setName(String value) {
    name = value;
  }
  
  public String getName() {
    return name;
  }
  
  private static final long serialVersionUID = 1L;
}
