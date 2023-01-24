package co.com.ias.ejercicioCA.domain.model.subject.dto;

import co.com.ias.ejercicioCA.domain.model.student.*;
import co.com.ias.ejercicioCA.domain.model.student.dto.StudentDTO;
import co.com.ias.ejercicioCA.domain.model.subject.*;


public class SubjectDTO {

    Long id;
    String name;

    public SubjectDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject subjectDTOToDomain(SubjectDTO subjectDTO) {
        return new Subject(
                new SubjectId(subjectDTO.getId()),
                new SubjectName(subjectDTO.getName())
        );
    }

    public static SubjectDTO valueSubjectToDTO(Subject subject) {
        return new SubjectDTO(
                subject.getId().getId(),
                subject.getName().toString()
        );
    }

}
