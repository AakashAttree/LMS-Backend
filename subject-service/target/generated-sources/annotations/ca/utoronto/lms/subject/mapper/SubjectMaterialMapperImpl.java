package ca.utoronto.lms.subject.mapper;

import ca.utoronto.lms.subject.dto.SubjectDTO;
import ca.utoronto.lms.subject.dto.SubjectMaterialDTO;
import ca.utoronto.lms.subject.dto.TeacherDTO;
import ca.utoronto.lms.subject.model.Subject;
import ca.utoronto.lms.subject.model.SubjectMaterial;
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
public class SubjectMaterialMapperImpl implements SubjectMaterialMapper {

    @Override
    public List<SubjectMaterialDTO> toDTO(List<SubjectMaterial> model) {
        if ( model == null ) {
            return null;
        }

        List<SubjectMaterialDTO> list = new ArrayList<SubjectMaterialDTO>( model.size() );
        for ( SubjectMaterial subjectMaterial : model ) {
            list.add( toDTO( subjectMaterial ) );
        }

        return list;
    }

    @Override
    public List<SubjectMaterial> toModel(List<SubjectMaterialDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<SubjectMaterial> list = new ArrayList<SubjectMaterial>( DTO.size() );
        for ( SubjectMaterialDTO subjectMaterialDTO : DTO ) {
            list.add( toModel( subjectMaterialDTO ) );
        }

        return list;
    }

    @Override
    public SubjectMaterialDTO toDTO(SubjectMaterial subjectMaterial) {
        if ( subjectMaterial == null ) {
            return null;
        }

        SubjectMaterialDTO subjectMaterialDTO = new SubjectMaterialDTO();

        subjectMaterialDTO.setTeacher( teacherDTOFromId( subjectMaterial.getTeacherId() ) );
        subjectMaterialDTO.setId( subjectMaterial.getId() );
        subjectMaterialDTO.setDescription( subjectMaterial.getDescription() );
        subjectMaterialDTO.setName( subjectMaterial.getName() );
        subjectMaterialDTO.setPublicationDate( subjectMaterial.getPublicationDate() );
        subjectMaterialDTO.setResourceUrl( subjectMaterial.getResourceUrl() );
        subjectMaterialDTO.setSubject( toDTO( subjectMaterial.getSubject() ) );

        return subjectMaterialDTO;
    }

    @Override
    public SubjectMaterial toModel(SubjectMaterialDTO subjectMaterialDTO) {
        if ( subjectMaterialDTO == null ) {
            return null;
        }

        SubjectMaterial subjectMaterial = new SubjectMaterial();

        subjectMaterial.setTeacherId( subjectMaterialDTOTeacherId( subjectMaterialDTO ) );
        subjectMaterial.setId( subjectMaterialDTO.getId() );
        subjectMaterial.setDescription( subjectMaterialDTO.getDescription() );
        subjectMaterial.setName( subjectMaterialDTO.getName() );
        subjectMaterial.setPublicationDate( subjectMaterialDTO.getPublicationDate() );
        subjectMaterial.setResourceUrl( subjectMaterialDTO.getResourceUrl() );
        subjectMaterial.setSubject( subjectDTOToSubject( subjectMaterialDTO.getSubject() ) );

        return subjectMaterial;
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

    private Long subjectMaterialDTOTeacherId(SubjectMaterialDTO subjectMaterialDTO) {
        if ( subjectMaterialDTO == null ) {
            return null;
        }
        TeacherDTO teacher = subjectMaterialDTO.getTeacher();
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
