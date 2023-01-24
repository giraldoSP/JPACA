package co.com.ias.ejercicioCA.domain.model.gateway;

import co.com.ias.ejercicioCA.domain.model.student.Student;
import co.com.ias.ejercicioCA.domain.model.subject.Subject;

import java.util.List;

public interface ISubjectRepository {

    Subject saveSubject(Subject subject);

    List<Subject> findAll();


}
