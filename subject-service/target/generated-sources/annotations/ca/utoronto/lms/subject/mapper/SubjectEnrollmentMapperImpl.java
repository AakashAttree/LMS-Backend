package ca.utoronto.lms.subject.mapper;

import ca.utoronto.lms.subject.dto.StudentDTO;
import ca.utoronto.lms.subject.dto.SubjectDTO;
import ca.utoronto.lms.subject.dto.SubjectEnrollmentDTO;
import ca.utoronto.lms.subject.dto.TeacherDTO;
import ca.utoronto.lms.subject.model.Subject;
import ca.utoronto.lms.subject.model.SubjectEnrollment;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-21T11:54:08+0530",
    comments = "version: 1.5.0.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class SubjectEnrollmentMapperImpl implements SubjectEnrollmentMapper {

    @Override
    public List<SubjectEnrollmentDTO> toDTO(List<SubjectEnrollment> model) {
        if ( model == null ) {
            return null;
        }

        List<SubjectEnrollmentDTO> list = new ArrayList<SubjectEnrollmentDTO>( model.size() );
        for ( SubjectEnrollment subjectEnrollment : model ) {
            list.add( toDTO( subjectEnrollment ) );
        }

        return list;
    }

    @Override
    public List<SubjectEnrollment> toModel(List<SubjectEnrollmentDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<SubjectEnrollment> list = new ArrayList<SubjectEnrollment>( DTO.size() );
        for ( SubjectEnrollmentDTO subjectEnrollmentDTO : DTO ) {
            list.add( toModel( subjectEnrollmentDTO ) );
        }

        return list;
    }

    @Override
    public SubjectEnrollmentDTO toDTO(SubjectEnrollment subjectEnrollment) {
        if ( subjectEnrollment == null ) {
            return null;
        }

        SubjectEnrollmentDTO subjectEnrollmentDTO = new SubjectEnrollmentDTO();

        subjectEnrollmentDTO.setStudent( studentDTOFromId( subjectEnrollment.getStudentId() ) );
        subjectEnrollmentDTO.setId( subjectEnrollment.getId() );
        subjectEnrollmentDTO.setExtraPoints( subjectEnrollment.getExtraPoints() );
        subjectEnrollmentDTO.setGrade( subjectEnrollment.getGrade() );
        subjectEnrollmentDTO.setSubject( toDTO( subjectEnrollment.getSubject() ) );

        return subjectEnrollmentDTO;
    }

    @Override
    public SubjectEnrollment toModel(SubjectEnrollmentDTO subjectEnrollmentDTO) {
        if ( subjectEnrollmentDTO == null ) {
            return null;
        }

        SubjectEnrollment subjectEnrollment = new SubjectEnrollment();

        subjectEnrollment.setStudentId( subjectEnrollmentDTOStudentId( subjectEnrollmentDTO ) );
        subjectEnrollment.setId( subjectEnrollmentDTO.getId() );
        subjectEnrollment.setExtraPoints( subjectEnrollmentDTO.getExtraPoints() );
        subjectEnrollment.setGrade( subjectEnrollmentDTO.getGrade() );
        subjectEnrollment.setSubject( subjectDTOToSubject( subjectEnrollmentDTO.getSubject() ) );

        return subjectEnrollment;
    }

    @Override
    public StudentDTO studentDTOFromId(Long id) {
        if ( id == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId( id );

        return studentDTO;
    }

    @Override
    public SubjectDTO toDTO(Subject subject) {
        if ( subject == null ) {
            return null;
        }

        SubjectDTO subjectDTO = new SubjectDTO();

        subjectDTO.setProfessor( teacherDTOFromId( subject.getProfessorId() ) );
        subjectDTO.setAssistant( teacherDTOFromId( subject.getAssistantId() ) );
        subjectDTO.setId( subject.getId() );
        subjectDTO.setEcts( subject.getEcts() );
        subjectDTO.setName( subject.getName() );
        subjectDTO.setSemester( subject.getSemester() );
        subjectDTO.setSyllabus( subject.getSyllabus() );

        return subjectDTO;
    }

    @Override
    public TeacherDTO teacherDTOFromId(Long id) {
        if ( id == null ) {
            return null;
        }

        TeacherDTO teacherDTO = new TeacherDTO();

        teacherDTO.setId( id );

        return teacherDTO;
    }

    private Long subjectEnrollmentDTOStudentId(SubjectEnrollmentDTO subjectEnrollmentDTO) {
        if ( subjectEnrollmentDTO == null ) {
            return null;
        }
        StudentDTO student = subjectEnrollmentDTO.getStudent();
        if ( student == null ) {
            return null;
        }
        Long id = student.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected Subject subjectDTOToSubject(SubjectDTO subjectDTO) {
        if ( subjectDTO == null ) {
            return null;
        }

        Subject subject = new Subject();

        subject.setId( subjectDTO.getId() );
        subject.setEcts( subjectDTO.getEcts() );
        subject.setName( subjectDTO.getName() );
        subject.setSemester( subjectDTO.getSemester() );
        subject.setSyllabus( subjectDTO.getSyllabus() );

        return subject;
    }
}
