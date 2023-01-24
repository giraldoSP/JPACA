package co.com.ias.ejercicioCA.infrastructure.adapters.jpa.studentAdapter;

import co.com.ias.ejercicioCA.domain.model.gateway.IStudentRepository;
import co.com.ias.ejercicioCA.domain.model.student.Student;
import co.com.ias.ejercicioCA.infrastructure.adapters.jpa.entity.StudentDBO;
import co.com.ias.ejercicioCA.infrastructure.adapters.jpa.studentAdapter.IStudentAdapterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class StudentAdapterRepository implements IStudentRepository {
    private final IStudentAdapterRepository iStudentAdapterRepository;
    @Override
    public Student saveStudent(Student student) {
        StudentDBO studentDBO = StudentDBO.studentDBOfromDomain(student);
        StudentDBO savedStudent = iStudentAdapterRepository.save(studentDBO);
        Student studentConverted = savedStudent.studentDBOtoDomain(savedStudent);
        return studentConverted;
    }

    @Override
    public List<Student> findAll() {

        List<StudentDBO> studentsDBO = iStudentAdapterRepository.findAll();
        List<Student> students = new ArrayList<>();

        for (StudentDBO studentDBO:studentsDBO) {

            students.add(StudentDBO.studentDBOtoDomain(studentDBO));

        }
        return students;
    }
}
