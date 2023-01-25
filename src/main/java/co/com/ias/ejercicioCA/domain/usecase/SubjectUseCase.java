package co.com.ias.ejercicioCA.domain.usecase;

import co.com.ias.ejercicioCA.domain.model.gateway.ISubjectRepository;
import co.com.ias.ejercicioCA.domain.model.subject.Subject;
import co.com.ias.ejercicioCA.domain.model.subject.dto.SubjectDTO;

import java.util.ArrayList;
import java.util.List;

public class SubjectUseCase {

    private final ISubjectRepository iSubjectRepository;

    public SubjectUseCase(ISubjectRepository iSubjectRepository) {
        this.iSubjectRepository = iSubjectRepository;
    }


    public SubjectDTO saveSubject(SubjectDTO subjectDTO) {

        Subject subject = subjectDTO.subjectDTOToDomain(subjectDTO);

        return SubjectDTO.valueSubjectToDTO(iSubjectRepository.saveSubject(subject));
    }

    public List<SubjectDTO> findAll() {

        List<SubjectDTO>  subjectDTOS = new ArrayList<>();

        List<Subject> subjects = iSubjectRepository.findAll();

        for (Subject subject:subjects) {

            subjectDTOS.add(SubjectDTO.valueSubjectToDTO(subject));

        }

        return  subjectDTOS;
    }
}
