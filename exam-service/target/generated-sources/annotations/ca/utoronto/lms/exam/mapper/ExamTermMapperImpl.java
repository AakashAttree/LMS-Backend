package ca.utoronto.lms.exam.mapper;

import ca.utoronto.lms.exam.dto.ExamDTO;
import ca.utoronto.lms.exam.dto.ExamPeriodDTO;
import ca.utoronto.lms.exam.dto.ExamTermDTO;
import ca.utoronto.lms.exam.dto.ExamTypeDTO;
import ca.utoronto.lms.exam.dto.SubjectDTO;
import ca.utoronto.lms.exam.model.Exam;
import ca.utoronto.lms.exam.model.ExamPeriod;
import ca.utoronto.lms.exam.model.ExamTerm;
import ca.utoronto.lms.exam.model.ExamType;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-21T11:54:04+0530",
    comments = "version: 1.5.0.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class ExamTermMapperImpl implements ExamTermMapper {

    @Override
    public ExamTermDTO toDTO(ExamTerm model) {
        if ( model == null ) {
            return null;
        }

        ExamTermDTO examTermDTO = new ExamTermDTO();

        examTermDTO.setId( model.getId() );
        examTermDTO.setEndTime( model.getEndTime() );
        examTermDTO.setExam( toDTO( model.getExam() ) );
        examTermDTO.setExamPeriod( toDTO( model.getExamPeriod() ) );
        examTermDTO.setStartTime( model.getStartTime() );

        return examTermDTO;
    }

    @Override
    public List<ExamTermDTO> toDTO(List<ExamTerm> model) {
        if ( model == null ) {
            return null;
        }

        List<ExamTermDTO> list = new ArrayList<ExamTermDTO>( model.size() );
        for ( ExamTerm examTerm : model ) {
            list.add( toDTO( examTerm ) );
        }

        return list;
    }

    @Override
    public ExamTerm toModel(ExamTermDTO DTO) {
        if ( DTO == null ) {
            return null;
        }

        ExamTerm examTerm = new ExamTerm();

        examTerm.setId( DTO.getId() );
        examTerm.setEndTime( DTO.getEndTime() );
        examTerm.setExam( toModel( DTO.getExam() ) );
        examTerm.setExamPeriod( examPeriodDTOToExamPeriod( DTO.getExamPeriod() ) );
        examTerm.setStartTime( DTO.getStartTime() );

        return examTerm;
    }

    @Override
    public List<ExamTerm> toModel(List<ExamTermDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<ExamTerm> list = new ArrayList<ExamTerm>( DTO.size() );
        for ( ExamTermDTO examTermDTO : DTO ) {
            list.add( toModel( examTermDTO ) );
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

    @Override
    public ExamPeriodDTO toDTO(ExamPeriod examPeriod) {
        if ( examPeriod == null ) {
            return null;
        }

        ExamPeriodDTO examPeriodDTO = new ExamPeriodDTO();

        examPeriodDTO.setId( examPeriod.getId() );
        examPeriodDTO.setExamEndDate( examPeriod.getExamEndDate() );
        examPeriodDTO.setExamStartDate( examPeriod.getExamStartDate() );
        examPeriodDTO.setName( examPeriod.getName() );
        examPeriodDTO.setRegistrationEndDate( examPeriod.getRegistrationEndDate() );
        examPeriodDTO.setRegistrationStartDate( examPeriod.getRegistrationStartDate() );

        return examPeriodDTO;
    }

    protected ExamPeriod examPeriodDTOToExamPeriod(ExamPeriodDTO examPeriodDTO) {
        if ( examPeriodDTO == null ) {
            return null;
        }

        ExamPeriod examPeriod = new ExamPeriod();

        examPeriod.setId( examPeriodDTO.getId() );
        examPeriod.setExamEndDate( examPeriodDTO.getExamEndDate() );
        examPeriod.setExamStartDate( examPeriodDTO.getExamStartDate() );
        examPeriod.setName( examPeriodDTO.getName() );
        examPeriod.setRegistrationEndDate( examPeriodDTO.getRegistrationEndDate() );
        examPeriod.setRegistrationStartDate( examPeriodDTO.getRegistrationStartDate() );

        return examPeriod;
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
