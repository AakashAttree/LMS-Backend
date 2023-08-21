package ca.utoronto.lms.faculty.mapper;

import ca.utoronto.lms.faculty.dto.AdministratorDTO;
import ca.utoronto.lms.faculty.model.Administrator;
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
public class AdministratorMapperImpl implements AdministratorMapper {

    @Override
    public List<AdministratorDTO> toDTO(List<Administrator> model) {
        if ( model == null ) {
            return null;
        }

        List<AdministratorDTO> list = new ArrayList<AdministratorDTO>( model.size() );
        for ( Administrator administrator : model ) {
            list.add( toDTO( administrator ) );
        }

        return list;
    }

    @Override
    public List<Administrator> toModel(List<AdministratorDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<Administrator> list = new ArrayList<Administrator>( DTO.size() );
        for ( AdministratorDTO administratorDTO : DTO ) {
            list.add( toModel( administratorDTO ) );
        }

        return list;
    }

    @Override
    public AdministratorDTO toDTO(Administrator administrator) {
        if ( administrator == null ) {
            return null;
        }

        AdministratorDTO administratorDTO = new AdministratorDTO();

        administratorDTO.setUser( userDTOFromId( administrator.getUserId() ) );
        administratorDTO.setId( administrator.getId() );
        administratorDTO.setFirstName( administrator.getFirstName() );
        administratorDTO.setLastName( administrator.getLastName() );

        return administratorDTO;
    }

    @Override
    public Administrator toModel(AdministratorDTO administratorDTO) {
        if ( administratorDTO == null ) {
            return null;
        }

        Administrator.AdministratorBuilder<?, ?> administrator = Administrator.builder();

        administrator.userId( administratorDTOUserId( administratorDTO ) );
        administrator.id( administratorDTO.getId() );
        administrator.firstName( administratorDTO.getFirstName() );
        administrator.lastName( administratorDTO.getLastName() );

        return administrator.build();
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

    private Long administratorDTOUserId(AdministratorDTO administratorDTO) {
        if ( administratorDTO == null ) {
            return null;
        }
        UserDTO user = administratorDTO.getUser();
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
