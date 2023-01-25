package co.com.ias.ejercicioCA.infrastructure.entrypoint;

import co.com.ias.ejercicioCA.domain.model.student.dto.StudentDTO;
import co.com.ias.ejercicioCA.domain.usecase.StudentUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class StudentEntryPoint {

   private final StudentUseCase studentUseCase;

   @ResponseStatus(code = HttpStatus.CREATED, reason = "OK")
   @PostMapping("/student")
   public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
       return studentUseCase.saveStudent(studentDTO);


   }

   @ResponseStatus(code = HttpStatus.OK, reason = "OK")
   @GetMapping("/student")
   public List<StudentDTO> findAllStudents(){
       return studentUseCase.findAll();
    }
}
