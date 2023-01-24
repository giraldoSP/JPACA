package co.com.ias.ejercicioCA.domain.model.subject;

import co.com.ias.ejercicioCA.domain.model.student.StudentId;
import co.com.ias.ejercicioCA.domain.model.student.StudentName;

public class Subject {

    private final SubjectId id;
    private final SubjectName name;

    public Subject(SubjectId id, SubjectName name) {
        this.id = id;
        this.name = name;
    }



    public SubjectId getId() {
        return id;
    }

    public SubjectName getName() {
        return name;
    }
}
