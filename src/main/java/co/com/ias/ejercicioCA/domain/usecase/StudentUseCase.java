package co.com.ias.ejercicioCA.domain.usecase;

import co.com.ias.ejercicioCA.domain.model.gateway.IStudentRepository;
import co.com.ias.ejercicioCA.domain.model.student.Student;
import co.com.ias.ejercicioCA.domain.model.student.dto.StudentDTO;
import co.com.ias.ejercicioCA.infrastructure.adapters.jpa.entity.StudentDBO;

import java.util.ArrayList;
import java.util.List;


public class StudentUseCase {
    private final IStudentRepository iStudentRepository;

    public StudentUseCase(IStudentRepository iStudentRepository) {
        this.iStudentRepository = iStudentRepository;
    }

    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = studentDTO.studentDTOToDomain(studentDTO);

        return studentDTO.valueObjectToDTO(iStudentRepository.saveStudent(student));
    }

    public List<StudentDTO> findAll() {

        List<StudentDTO> studentDTOS = new ArrayList<>();

        List<Student> students = iStudentRepository.findAll();

        for (Student student:students) {

            studentDTOS.add(StudentDTO.valueObjectToDTO(student));

        }

        return  studentDTOS;
    }
}
