package ca.utoronto.lms.auth.mapper;

import ca.utoronto.lms.auth.model.Role;
import ca.utoronto.lms.shared.dto.RoleDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-21T11:54:02+0530",
    comments = "version: 1.5.0.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.7 (Eclipse Adoptium)"
)
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleDTO toDTO(Role model) {
        if ( model == null ) {
            return null;
        }

        RoleDTO.RoleDTOBuilder<?, ?> roleDTO = RoleDTO.builder();

        roleDTO.id( model.getId() );
        roleDTO.authority( model.getAuthority() );

        return roleDTO.build();
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
    public Role toModel(RoleDTO DTO) {
        if ( DTO == null ) {
            return null;
        }

        Role.RoleBuilder<?, ?> role = Role.builder();

        role.id( DTO.getId() );
        role.authority( DTO.getAuthority() );

        return role.build();
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
