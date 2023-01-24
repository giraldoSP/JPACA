package co.com.ias.ejercicioCA.application.configuration;

import co.com.ias.ejercicioCA.domain.model.gateway.IStudentRepository;
import co.com.ias.ejercicioCA.domain.model.gateway.ISubjectRepository;
import co.com.ias.ejercicioCA.domain.usecase.StudentUseCase;
import co.com.ias.ejercicioCA.domain.usecase.SubjectUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {
    @Bean
    public StudentUseCase studentUseCase(IStudentRepository iStudentRepository){
        return new StudentUseCase(iStudentRepository);
    }

    @Bean
    public SubjectUseCase subjectUseCase(ISubjectRepository iSubjectRepository){
        return new SubjectUseCase(iSubjectRepository);
    }

}
