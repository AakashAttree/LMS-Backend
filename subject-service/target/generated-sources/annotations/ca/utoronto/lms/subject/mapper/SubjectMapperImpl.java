package ca.utoronto.lms.subject.mapper;

import ca.utoronto.lms.subject.dto.StudyProgramDTO;
import ca.utoronto.lms.subject.dto.SubjectDTO;
import ca.utoronto.lms.subject.dto.TeacherDTO;
import ca.utoronto.lms.subject.model.Subject;
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
public class SubjectMapperImpl implements SubjectMapper {

    @Override
    public List<SubjectDTO> toDTO(List<Subject> model) {
        if ( model == null ) {
            return null;
        }

        List<SubjectDTO> list = new ArrayList<SubjectDTO>( model.size() );
        for ( Subject subject : model ) {
            list.add( toDTO( subject ) );
        }

        return list;
    }

    @Override
    public List<Subject> toModel(List<SubjectDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<Subject> list = new ArrayList<Subject>( DTO.size() );
        for ( SubjectDTO subjectDTO : DTO ) {
            list.add( toModel( subjectDTO ) );
        }

        return list;
    }

    @Override
    public SubjectDTO toDTO(Subject subject) {
        if ( subject == null ) {
            return null;
        }

        SubjectDTO subjectDTO = new SubjectDTO();

        subjectDTO.setStudyProgram( studyProgramDTOFromId( subject.getStudyProgramId() ) );
        subjectDTO.setProfessor( teacherFromId( subject.getProfessorId() ) );
        subjectDTO.setAssistant( teacherFromId( subject.getAssistantId() ) );
        subjectDTO.setId( subject.getId() );
        subjectDTO.setEcts( subject.getEcts() );
        subjectDTO.setName( subject.getName() );
        subjectDTO.setSemester( subject.getSemester() );
        subjectDTO.setSyllabus( subject.getSyllabus() );

        return subjectDTO;
    }

    @Override
    public Subject toModel(SubjectDTO subjectDTO) {
        if ( subjectDTO == null ) {
            return null;
        }

        Subject subject = new Subject();

        subject.setStudyProgramId( subjectDTOStudyProgramId( subjectDTO ) );
        subject.setProfessorId( subjectDTOProfessorId( subjectDTO ) );
        subject.setAssistantId( subjectDTOAssistantId( subjectDTO ) );
        subject.setId( subjectDTO.getId() );
        subject.setEcts( subjectDTO.getEcts() );
        subject.setName( subjectDTO.getName() );
        subject.setSemester( subjectDTO.getSemester() );
        subject.setSyllabus( subjectDTO.getSyllabus() );

        return subject;
    }

    @Override
    public StudyProgramDTO studyProgramDTOFromId(Long id) {
        if ( id == null ) {
            return null;
        }

        StudyProgramDTO studyProgramDTO = new StudyProgramDTO();

        studyProgramDTO.setId( id );

        return studyProgramDTO;
    }

    @Override
    public TeacherDTO teacherFromId(Long id) {
        if ( id == null ) {
            return null;
        }

        TeacherDTO teacherDTO = new TeacherDTO();

        teacherDTO.setId( id );

        return teacherDTO;
    }

    private Long subjectDTOStudyProgramId(SubjectDTO subjectDTO) {
        if ( subjectDTO == null ) {
            return null;
        }
        StudyProgramDTO studyProgram = subjectDTO.getStudyProgram();
        if ( studyProgram == null ) {
            return null;
        }
        Long id = studyProgram.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long subjectDTOProfessorId(SubjectDTO subjectDTO) {
        if ( subjectDTO == null ) {
            return null;
        }
        TeacherDTO professor = subjectDTO.getProfessor();
        if ( professor == null ) {
            return null;
        }
        Long id = professor.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long subjectDTOAssistantId(SubjectDTO subjectDTO) {
        if ( subjectDTO == null ) {
            return null;
        }
        TeacherDTO assistant = subjectDTO.getAssistant();
        if ( assistant == null ) {
            return null;
        }
        Long id = assistant.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
