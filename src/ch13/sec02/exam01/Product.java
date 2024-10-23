package ch13.sec02.exam01;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product <K, M>{
  private K kind;
  private M model;

}
