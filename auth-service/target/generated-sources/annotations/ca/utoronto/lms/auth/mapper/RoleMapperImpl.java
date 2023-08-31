package ca.utoronto.lms.auth.mapper;

import ca.utoronto.lms.auth.model.Role;
import ca.utoronto.lms.shared.dto.RoleDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-29T11:16:14+0530",
    comments = "version: 1.5.0.Final, compiler: javac, environment: Java 1.8.0_311 (Oracle Corporation)"
)
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleDTO toDTO(Role model) {
        if ( model == null ) {
            return null;
        }

        RoleDTO.RoleDTOBuilder<?, ?> roleDTO = RoleDTO.builder();

        roleDTO.id( model.getId() );

        return roleDTO.build();
    }

    @Override
    public Role toModel(RoleDTO DTO) {
        if ( DTO == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( DTO.getId() );

        return role;
    }

    @Override
    public List<RoleDTO> toDTO(List<Role> model) {
        if ( model == null ) {
            return null;
        }

        List<RoleDTO> list = new ArrayList<RoleDTO>( model.size() );
        for ( Role role : model ) {
            list.add( toDTO( role ) );
        }

        return list;
    }

    @Override
    public List<Role> toModel(List<RoleDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<Role> list = new ArrayList<Role>( DTO.size() );
        for ( RoleDTO roleDTO : DTO ) {
            list.add( toModel( roleDTO ) );
        }

        return list;
    }
}
