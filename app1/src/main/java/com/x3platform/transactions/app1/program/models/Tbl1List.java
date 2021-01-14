package com.x3platform.transactions.app1.program.models;

import java.io.Serializable;

/**
 * tbl_1_list
 */
public class Tbl1List implements Serializable {
  
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
