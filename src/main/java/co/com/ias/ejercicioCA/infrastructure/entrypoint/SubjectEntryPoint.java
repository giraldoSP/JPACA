package co.com.ias.ejercicioCA.infrastructure.entrypoint;

import co.com.ias.ejercicioCA.domain.model.student.dto.StudentDTO;
import co.com.ias.ejercicioCA.domain.model.subject.dto.SubjectDTO;
import co.com.ias.ejercicioCA.domain.usecase.StudentUseCase;
import co.com.ias.ejercicioCA.domain.usecase.SubjectUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class SubjectEntryPoint {

    private final SubjectUseCase subjectUseCase;

    @ResponseStatus(code = HttpStatus.CREATED, reason = "OK")
    @PostMapping("/subject")
    public SubjectDTO saveSubject(@RequestBody SubjectDTO subjectDTO) {
        return subjectUseCase.saveSubject(subjectDTO);

    }

    @ResponseStatus(code = HttpStatus.OK, reason = "OK")
    @GetMapping("/subject")
    public List<SubjectDTO> findAllStudents(){
        return subjectUseCase.findAll();
    }
}

