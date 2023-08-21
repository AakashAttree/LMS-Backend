package ca.utoronto.lms.subject.mapper;

import ca.utoronto.lms.subject.dto.SubjectDTO;
import ca.utoronto.lms.subject.dto.SubjectTermDTO;
import ca.utoronto.lms.subject.dto.TeacherDTO;
import ca.utoronto.lms.subject.model.Subject;
import ca.utoronto.lms.subject.model.SubjectTerm;
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
public class SubjectTermMapperImpl implements SubjectTermMapper {

    @Override
    public List<SubjectTermDTO> toDTO(List<SubjectTerm> model) {
        if ( model == null ) {
            return null;
        }

        List<SubjectTermDTO> list = new ArrayList<SubjectTermDTO>( model.size() );
        for ( SubjectTerm subjectTerm : model ) {
            list.add( toDTO( subjectTerm ) );
        }

        return list;
    }

    @Override
    public List<SubjectTerm> toModel(List<SubjectTermDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<SubjectTerm> list = new ArrayList<SubjectTerm>( DTO.size() );
        for ( SubjectTermDTO subjectTermDTO : DTO ) {
            list.add( toModel( subjectTermDTO ) );
        }

        return list;
    }

    @Override
    public SubjectTermDTO toDTO(SubjectTerm SubjectTerm) {
        if ( SubjectTerm == null ) {
            return null;
        }

        SubjectTermDTO subjectTermDTO = new SubjectTermDTO();

        subjectTermDTO.setTeacher( teacherDTOFromId( SubjectTerm.getTeacherId() ) );
        subjectTermDTO.setId( SubjectTerm.getId() );
        subjectTermDTO.setDescription( SubjectTerm.getDescription() );
        subjectTermDTO.setEndTime( SubjectTerm.getEndTime() );
        subjectTermDTO.setName( SubjectTerm.getName() );
        subjectTermDTO.setStartTime( SubjectTerm.getStartTime() );
        subjectTermDTO.setSubject( toDTO( SubjectTerm.getSubject() ) );

        return subjectTermDTO;
    }

    @Override
    public SubjectTerm toModel(SubjectTermDTO SubjectTermDTO) {
        if ( SubjectTermDTO == null ) {
            return null;
        }

        SubjectTerm subjectTerm = new SubjectTerm();

        subjectTerm.setTeacherId( subjectTermDTOTeacherId( SubjectTermDTO ) );
        subjectTerm.setId( SubjectTermDTO.getId() );
        subjectTerm.setDescription( SubjectTermDTO.getDescription() );
        subjectTerm.setEndTime( SubjectTermDTO.getEndTime() );
        subjectTerm.setName( SubjectTermDTO.getName() );
        subjectTerm.setStartTime( SubjectTermDTO.getStartTime() );
        subjectTerm.setSubject( subjectDTOToSubject( SubjectTermDTO.getSubject() ) );

        return subjectTerm;
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

    private Long subjectTermDTOTeacherId(SubjectTermDTO subjectTermDTO) {
        if ( subjectTermDTO == null ) {
            return null;
        }
        TeacherDTO teacher = subjectTermDTO.getTeacher();
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
