package ch15.sec02.exam01;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Board {
  private String subject;
  private String content;
  private String writer;

  @Override
  public String toString() { // better fix length
    return String.format("%s | %s | %s",subject,content,writer);
  }
}
