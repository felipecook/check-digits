package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckTest {

  @Test
  void digitSum() {
    assertEquals(14, Check.digitSum(4046));
    assertEquals(16, Check.digitSum(6325));
    assertEquals(32, Check.digitSum(9788));
    assertEquals(24, Check.digitSum(5676));
    assertEquals(16, Check.digitSum(88));
    assertEquals(24, Check.digitSum(8925));
    assertEquals(30, Check.digitSum(8598));
    assertEquals(9, Check.digitSum(2025));
    assertEquals(22, Check.digitSum(4738));
    assertEquals(12, Check.digitSum(453));
  }
}