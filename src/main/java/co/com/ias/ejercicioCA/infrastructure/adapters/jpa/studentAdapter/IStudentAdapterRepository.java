package co.com.ias.ejercicioCA.infrastructure.adapters.jpa.studentAdapter;

import co.com.ias.ejercicioCA.infrastructure.adapters.jpa.entity.StudentDBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentAdapterRepository extends JpaRepository<StudentDBO, Long> {

}
