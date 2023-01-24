package co.com.ias.ejercicioCA.infrastructure.adapters.jpa.subjectAdapter;

import co.com.ias.ejercicioCA.infrastructure.adapters.jpa.entity.SubjectDBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubjectAdapterRepository extends JpaRepository<SubjectDBO, Long> {
}
