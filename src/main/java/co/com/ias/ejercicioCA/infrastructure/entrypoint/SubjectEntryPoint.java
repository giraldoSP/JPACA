package co.com.ias.ejercicioCA.infrastructure.entrypoint;

import co.com.ias.ejercicioCA.domain.model.student.dto.StudentDTO;
import co.com.ias.ejercicioCA.domain.model.subject.dto.SubjectDTO;
import co.com.ias.ejercicioCA.domain.usecase.StudentUseCase;
import co.com.ias.ejercicioCA.domain.usecase.SubjectUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class SubjectEntryPoint {

    private final SubjectUseCase subjectUseCase;

    @PostMapping("/subject")
    public SubjectDTO saveSubject(@RequestBody SubjectDTO subjectDTO) {
        return subjectUseCase.saveSubject(subjectDTO);

    }

    @GetMapping("/subject")
    public List<SubjectDTO> findAllStudents(){
        return subjectUseCase.findAll();
    }
}

