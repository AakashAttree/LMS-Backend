package ca.utoronto.lms.exam.mapper;

import ca.utoronto.lms.exam.dto.ExamDTO;
import ca.utoronto.lms.exam.dto.ExamTypeDTO;
import ca.utoronto.lms.exam.dto.SubjectDTO;
import ca.utoronto.lms.exam.model.Exam;
import ca.utoronto.lms.exam.model.ExamType;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-21T11:54:05+0530",
    comments = "version: 1.5.0.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class ExamMapperImpl implements ExamMapper {

    @Override
    public List<ExamDTO> toDTO(List<Exam> model) {
        if ( model == null ) {
            return null;
        }

        List<ExamDTO> list = new ArrayList<ExamDTO>( model.size() );
        for ( Exam exam : model ) {
            list.add( toDTO( exam ) );
        }

        return list;
    }

    @Override
    public List<Exam> toModel(List<ExamDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<Exam> list = new ArrayList<Exam>( DTO.size() );
        for ( ExamDTO examDTO : DTO ) {
            list.add( toModel( examDTO ) );
        }

        return list;
    }

    @Override
    public ExamDTO toDTO(Exam exam) {
        if ( exam == null ) {
            return null;
        }

        ExamDTO examDTO = new ExamDTO();

        examDTO.setSubject( subjectDTOFromId( exam.getSubjectId() ) );
        examDTO.setId( exam.getId() );
        examDTO.setDescription( exam.getDescription() );
        examDTO.setExamType( examTypeToExamTypeDTO( exam.getExamType() ) );
        examDTO.setMaximumScore( exam.getMaximumScore() );
        examDTO.setMinimumScore( exam.getMinimumScore() );
        examDTO.setName( exam.getName() );

        return examDTO;
    }

    @Override
    public Exam toModel(ExamDTO examDTO) {
        if ( examDTO == null ) {
            return null;
        }

        Exam exam = new Exam();

        exam.setSubjectId( examDTOSubjectId( examDTO ) );
        exam.setId( examDTO.getId() );
        exam.setDescription( examDTO.getDescription() );
        exam.setExamType( examTypeDTOToExamType( examDTO.getExamType() ) );
        exam.setMaximumScore( examDTO.getMaximumScore() );
        exam.setMinimumScore( examDTO.getMinimumScore() );
        exam.setName( examDTO.getName() );

        return exam;
    }

    @Override
    public SubjectDTO subjectDTOFromId(Long id) {
        if ( id == null ) {
            return null;
        }

        SubjectDTO subjectDTO = new SubjectDTO();

        subjectDTO.setId( id );

        return subjectDTO;
    }

    protected ExamTypeDTO examTypeToExamTypeDTO(ExamType examType) {
        if ( examType == null ) {
            return null;
        }

        ExamTypeDTO examTypeDTO = new ExamTypeDTO();

        examTypeDTO.setId( examType.getId() );
        examTypeDTO.setName( examType.getName() );

        return examTypeDTO;
    }

    private Long examDTOSubjectId(ExamDTO examDTO) {
        if ( examDTO == null ) {
            return null;
        }
        SubjectDTO subject = examDTO.getSubject();
        if ( subject == null ) {
            return null;
        }
        Long id = subject.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected ExamType examTypeDTOToExamType(ExamTypeDTO examTypeDTO) {
        if ( examTypeDTO == null ) {
            return null;
        }

        ExamType examType = new ExamType();

        examType.setId( examTypeDTO.getId() );
        examType.setName( examTypeDTO.getName() );

        return examType;
    }
}
