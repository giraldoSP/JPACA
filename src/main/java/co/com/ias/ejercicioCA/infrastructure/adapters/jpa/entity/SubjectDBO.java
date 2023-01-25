package co.com.ias.ejercicioCA.infrastructure.adapters.jpa.entity;

import co.com.ias.ejercicioCA.domain.model.student.*;
import co.com.ias.ejercicioCA.domain.model.subject.Subject;
import co.com.ias.ejercicioCA.domain.model.subject.SubjectId;
import co.com.ias.ejercicioCA.domain.model.subject.SubjectName;
import co.com.ias.ejercicioCA.domain.model.subject.dto.SubjectDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="subject")
@Entity
public class SubjectDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "studentDBO_id")
    private List<SubjectDBO> comments = new ArrayList<>();

    public SubjectDBO(Long id, String name) {

    }


    public static SubjectDBO studentDBOFromDomain (Subject subject) {
        return new SubjectDBO(
                subject.getId().getId(),
                subject.getName().getName()
        );
    }

    public static Subject studentDBOToDomain (SubjectDBO subjectDBO) {
        return new Subject(
                new SubjectId(subjectDBO.getId()), new SubjectName(subjectDBO.getName())
        );
    }
}
