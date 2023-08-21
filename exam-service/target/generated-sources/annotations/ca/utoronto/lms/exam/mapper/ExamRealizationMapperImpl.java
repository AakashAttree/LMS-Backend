package ca.utoronto.lms.exam.mapper;

import ca.utoronto.lms.exam.dto.ExamDTO;
import ca.utoronto.lms.exam.dto.ExamPeriodDTO;
import ca.utoronto.lms.exam.dto.ExamRealizationDTO;
import ca.utoronto.lms.exam.dto.ExamTermDTO;
import ca.utoronto.lms.exam.dto.ExamTypeDTO;
import ca.utoronto.lms.exam.dto.SubjectEnrollmentDTO;
import ca.utoronto.lms.exam.model.Exam;
import ca.utoronto.lms.exam.model.ExamPeriod;
import ca.utoronto.lms.exam.model.ExamRealization;
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
public class ExamRealizationMapperImpl extends ExamRealizationMapper {

    @Override
    public List<ExamRealizationDTO> toDTO(List<ExamRealization> model) {
        if ( model == null ) {
            return null;
        }

        List<ExamRealizationDTO> list = new ArrayList<ExamRealizationDTO>( model.size() );
        for ( ExamRealization examRealization : model ) {
            list.add( toDTO( examRealization ) );
        }

        return list;
    }

    @Override
    public List<ExamRealization> toModel(List<ExamRealizationDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<ExamRealization> list = new ArrayList<ExamRealization>( DTO.size() );
        for ( ExamRealizationDTO examRealizationDTO : DTO ) {
            list.add( toModel( examRealizationDTO ) );
        }

        return list;
    }

    @Override
    public ExamRealizationDTO toDTO(ExamRealization examRealization) {
        if ( examRealization == null ) {
            return null;
        }

        ExamRealizationDTO examRealizationDTO = new ExamRealizationDTO();

        examRealizationDTO.setSubjectEnrollment( subjectEnrollmentDTOFromId( examRealization.getSubjectEnrollmentId() ) );
        examRealizationDTO.setPassed( hasPassed( examRealization ) );
        examRealizationDTO.setId( examRealization.getId() );
        examRealizationDTO.setExamTerm( examTermToExamTermDTO( examRealization.getExamTerm() ) );
        examRealizationDTO.setScore( examRealization.getScore() );

        return examRealizationDTO;
    }

    @Override
    public ExamRealization toModel(ExamRealizationDTO examRealizationDTO) {
        if ( examRealizationDTO == null ) {
            return null;
        }

        ExamRealization examRealization = new ExamRealization();

        examRealization.setSubjectEnrollmentId( examRealizationDTOSubjectEnrollmentId( examRealizationDTO ) );
        examRealization.setId( examRealizationDTO.getId() );
        examRealization.setExamTerm( examTermDTOToExamTerm( examRealizationDTO.getExamTerm() ) );
        examRealization.setScore( examRealizationDTO.getScore() );

        return examRealization;
    }

    @Override
    public SubjectEnrollmentDTO subjectEnrollmentDTOFromId(Long id) {
        if ( id == null ) {
            return null;
        }

        SubjectEnrollmentDTO subjectEnrollmentDTO = new SubjectEnrollmentDTO();

        subjectEnrollmentDTO.setId( id );

        return subjectEnrollmentDTO;
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

    protected ExamDTO examToExamDTO(Exam exam) {
        if ( exam == null ) {
            return null;
        }

        ExamDTO examDTO = new ExamDTO();

        examDTO.setId( exam.getId() );
        examDTO.setDescription( exam.getDescription() );
        examDTO.setExamType( examTypeToExamTypeDTO( exam.getExamType() ) );
        examDTO.setMaximumScore( exam.getMaximumScore() );
        examDTO.setMinimumScore( exam.getMinimumScore() );
        examDTO.setName( exam.getName() );

        return examDTO;
    }

    protected ExamPeriodDTO examPeriodToExamPeriodDTO(ExamPeriod examPeriod) {
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

    protected ExamTermDTO examTermToExamTermDTO(ExamTerm examTerm) {
        if ( examTerm == null ) {
            return null;
        }

        ExamTermDTO examTermDTO = new ExamTermDTO();

        examTermDTO.setId( examTerm.getId() );
        examTermDTO.setEndTime( examTerm.getEndTime() );
        examTermDTO.setExam( examToExamDTO( examTerm.getExam() ) );
        examTermDTO.setExamPeriod( examPeriodToExamPeriodDTO( examTerm.getExamPeriod() ) );
        examTermDTO.setStartTime( examTerm.getStartTime() );

        return examTermDTO;
    }

    private Long examRealizationDTOSubjectEnrollmentId(ExamRealizationDTO examRealizationDTO) {
        if ( examRealizationDTO == null ) {
            return null;
        }
        SubjectEnrollmentDTO subjectEnrollment = examRealizationDTO.getSubjectEnrollment();
        if ( subjectEnrollment == null ) {
            return null;
        }
        Long id = subjectEnrollment.getId();
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

    protected Exam examDTOToExam(ExamDTO examDTO) {
        if ( examDTO == null ) {
            return null;
        }

        Exam exam = new Exam();

        exam.setId( examDTO.getId() );
        exam.setDescription( examDTO.getDescription() );
        exam.setExamType( examTypeDTOToExamType( examDTO.getExamType() ) );
        exam.setMaximumScore( examDTO.getMaximumScore() );
        exam.setMinimumScore( examDTO.getMinimumScore() );
        exam.setName( examDTO.getName() );

        return exam;
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

    protected ExamTerm examTermDTOToExamTerm(ExamTermDTO examTermDTO) {
        if ( examTermDTO == null ) {
            return null;
        }

        ExamTerm examTerm = new ExamTerm();

        examTerm.setId( examTermDTO.getId() );
        examTerm.setEndTime( examTermDTO.getEndTime() );
        examTerm.setExam( examDTOToExam( examTermDTO.getExam() ) );
        examTerm.setExamPeriod( examPeriodDTOToExamPeriod( examTermDTO.getExamPeriod() ) );
        examTerm.setStartTime( examTermDTO.getStartTime() );

        return examTerm;
    }
}
