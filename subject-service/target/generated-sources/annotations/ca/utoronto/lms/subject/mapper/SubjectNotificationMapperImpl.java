package ca.utoronto.lms.subject.mapper;

import ca.utoronto.lms.subject.dto.SubjectDTO;
import ca.utoronto.lms.subject.dto.SubjectNotificationDTO;
import ca.utoronto.lms.subject.dto.TeacherDTO;
import ca.utoronto.lms.subject.model.Subject;
import ca.utoronto.lms.subject.model.SubjectNotification;
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
public class SubjectNotificationMapperImpl implements SubjectNotificationMapper {

    @Override
    public List<SubjectNotificationDTO> toDTO(List<SubjectNotification> model) {
        if ( model == null ) {
            return null;
        }

        List<SubjectNotificationDTO> list = new ArrayList<SubjectNotificationDTO>( model.size() );
        for ( SubjectNotification subjectNotification : model ) {
            list.add( toDTO( subjectNotification ) );
        }

        return list;
    }

    @Override
    public List<SubjectNotification> toModel(List<SubjectNotificationDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<SubjectNotification> list = new ArrayList<SubjectNotification>( DTO.size() );
        for ( SubjectNotificationDTO subjectNotificationDTO : DTO ) {
            list.add( toModel( subjectNotificationDTO ) );
        }

        return list;
    }

    @Override
    public SubjectNotificationDTO toDTO(SubjectNotification subjectNotification) {
        if ( subjectNotification == null ) {
            return null;
        }

        SubjectNotificationDTO subjectNotificationDTO = new SubjectNotificationDTO();

        subjectNotificationDTO.setTeacher( teacherDTOFromId( subjectNotification.getTeacherId() ) );
        subjectNotificationDTO.setId( subjectNotification.getId() );
        subjectNotificationDTO.setDescription( subjectNotification.getDescription() );
        subjectNotificationDTO.setName( subjectNotification.getName() );
        subjectNotificationDTO.setPublicationDate( subjectNotification.getPublicationDate() );
        subjectNotificationDTO.setSubject( toDTO( subjectNotification.getSubject() ) );

        return subjectNotificationDTO;
    }

    @Override
    public SubjectNotification toModel(SubjectNotificationDTO subjectNotificationDTO) {
        if ( subjectNotificationDTO == null ) {
            return null;
        }

        SubjectNotification subjectNotification = new SubjectNotification();

        subjectNotification.setTeacherId( subjectNotificationDTOTeacherId( subjectNotificationDTO ) );
        subjectNotification.setId( subjectNotificationDTO.getId() );
        subjectNotification.setDescription( subjectNotificationDTO.getDescription() );
        subjectNotification.setName( subjectNotificationDTO.getName() );
        subjectNotification.setPublicationDate( subjectNotificationDTO.getPublicationDate() );
        subjectNotification.setSubject( subjectDTOToSubject( subjectNotificationDTO.getSubject() ) );

        return subjectNotification;
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

    @Override
    public SubjectDTO toDTO(Subject subject) {
        if ( subject == null ) {
            return null;
        }

        SubjectDTO subjectDTO = new SubjectDTO();

        subjectDTO.setId( subject.getId() );
        subjectDTO.setEcts( subject.getEcts() );
        subjectDTO.setName( subject.getName() );
        subjectDTO.setSemester( subject.getSemester() );
        subjectDTO.setSyllabus( subject.getSyllabus() );

        return subjectDTO;
    }

    private Long subjectNotificationDTOTeacherId(SubjectNotificationDTO subjectNotificationDTO) {
        if ( subjectNotificationDTO == null ) {
            return null;
        }
        TeacherDTO teacher = subjectNotificationDTO.getTeacher();
        if ( teacher == null ) {
            return null;
        }
        Long id = teacher.getId();
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
