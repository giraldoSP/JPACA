package co.com.ias.ejercicioCA.domain.model.gateway;

import co.com.ias.ejercicioCA.domain.model.student.Student;

import java.util.List;

public interface IStudentRepository {
    Student saveStudent(Student student);

    List<Student> findAll();
}
