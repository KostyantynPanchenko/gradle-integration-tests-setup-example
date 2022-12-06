package com.example.integration.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class EmployeeRepositoryIT {

  @Autowired
  private EmployeeRepository employeeRepository;

  @Test
  void testThereShouldBeFourEntriesInTheDatabase() {
    Assertions.assertThat(employeeRepository.findAll().size()).isEqualTo(4);
  }
}
