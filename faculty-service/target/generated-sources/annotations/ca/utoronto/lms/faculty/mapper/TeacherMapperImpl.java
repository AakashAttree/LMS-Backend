package ca.utoronto.lms.faculty.mapper;

import ca.utoronto.lms.faculty.dto.TeacherDTO;
import ca.utoronto.lms.faculty.model.Teacher;
import ca.utoronto.lms.shared.dto.UserDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-21T11:54:07+0530",
    comments = "version: 1.5.0.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public List<TeacherDTO> toDTO(List<Teacher> model) {
        if ( model == null ) {
            return null;
        }

        List<TeacherDTO> list = new ArrayList<TeacherDTO>( model.size() );
        for ( Teacher teacher : model ) {
            list.add( toDTO( teacher ) );
        }

        return list;
    }

    @Override
    public List<Teacher> toModel(List<TeacherDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<Teacher> list = new ArrayList<Teacher>( DTO.size() );
        for ( TeacherDTO teacherDTO : DTO ) {
            list.add( toModel( teacherDTO ) );
        }

        return list;
    }

    @Override
    public TeacherDTO toDTO(Teacher teacher) {
        if ( teacher == null ) {
            return null;
        }

        TeacherDTO teacherDTO = new TeacherDTO();

        teacherDTO.setUser( userDTOFromId( teacher.getUserId() ) );
        teacherDTO.setId( teacher.getId() );
        teacherDTO.setFirstName( teacher.getFirstName() );
        teacherDTO.setLastName( teacher.getLastName() );

        return teacherDTO;
    }

    @Override
    public Teacher toModel(TeacherDTO teacherDTO) {
        if ( teacherDTO == null ) {
            return null;
        }

        Teacher teacher = new Teacher();

        teacher.setUserId( teacherDTOUserId( teacherDTO ) );
        teacher.setId( teacherDTO.getId() );
        teacher.setFirstName( teacherDTO.getFirstName() );
        teacher.setLastName( teacherDTO.getLastName() );

        return teacher;
    }

    @Override
    public UserDTO userDTOFromId(Long id) {
        if ( id == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( id );

        return userDTO;
    }

    private Long teacherDTOUserId(TeacherDTO teacherDTO) {
        if ( teacherDTO == null ) {
            return null;
        }
        UserDTO user = teacherDTO.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
