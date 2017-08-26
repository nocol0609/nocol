package com.nocol.onetoone;

import com.nocol.pojo.Address;
import com.nocol.pojo.Student;

public interface OneToOneMapper {

	Address findAddressById(Integer id);

	Student findStudentWithAddress(Integer id);
}
