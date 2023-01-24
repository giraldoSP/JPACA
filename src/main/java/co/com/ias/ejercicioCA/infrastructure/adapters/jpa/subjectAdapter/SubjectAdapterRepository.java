package co.com.ias.ejercicioCA.infrastructure.adapters.jpa.subjectAdapter;

import co.com.ias.ejercicioCA.domain.model.gateway.ISubjectRepository;
import co.com.ias.ejercicioCA.domain.model.student.Student;
import co.com.ias.ejercicioCA.domain.model.subject.Subject;
import co.com.ias.ejercicioCA.infrastructure.adapters.jpa.entity.SubjectDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class SubjectAdapterRepository implements ISubjectRepository {

    private  final ISubjectAdapterRepository iSubjectAdapterRepository;

    @Override
    public Subject saveSubject(Subject subject) {

        SubjectDBO subjectDBO = SubjectDBO.studentDBOFromDomain(subject);

        return SubjectDBO.studentDBOToDomain(iSubjectAdapterRepository.save(subjectDBO));
    }

    @Override
    public List<Subject> findAll() {
        return null;
    }
}
