package ca.utoronto.lms.auth.mapper;

import ca.utoronto.lms.auth.model.Role;
import ca.utoronto.lms.auth.model.User;
import ca.utoronto.lms.shared.dto.RoleDTO;
import ca.utoronto.lms.shared.dto.UserDTO;
import ca.utoronto.lms.shared.dto.UserDetailsDTO;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-21T11:54:02+0530",
    comments = "version: 1.5.0.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.7 (Eclipse Adoptium)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDetailsDTO toDTO(User model) {
        if ( model == null ) {
            return null;
        }

        UserDetailsDTO.UserDetailsDTOBuilder<?, ?> userDetailsDTO = UserDetailsDTO.builder();

        userDetailsDTO.id( model.getId() );
        userDetailsDTO.accountNonExpired( model.isAccountNonExpired() );
        userDetailsDTO.accountNonLocked( model.isAccountNonLocked() );
        userDetailsDTO.authorities( roleSetToRoleDTOSet( model.getAuthorities() ) );
        userDetailsDTO.credentialsNonExpired( model.isCredentialsNonExpired() );
        userDetailsDTO.enabled( model.isEnabled() );
        userDetailsDTO.password( model.getPassword() );
        userDetailsDTO.username( model.getUsername() );

        return userDetailsDTO.build();
    }

    @Override
    public List<UserDetailsDTO> toDTO(List<User> model) {
        if ( model == null ) {
            return null;
        }

        List<UserDetailsDTO> list = new ArrayList<UserDetailsDTO>( model.size() );
        for ( User user : model ) {
            list.add( toDTO( user ) );
        }

        return list;
    }

    @Override
    public List<User> toModel(List<UserDetailsDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( DTO.size() );
        for ( UserDetailsDTO userDetailsDTO : DTO ) {
            list.add( toModel( userDetailsDTO ) );
        }

        return list;
    }

    @Override
    public UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setPassword( user.getPassword() );
        userDTO.setUsername( user.getUsername() );

        return userDTO;
    }

    @Override
    public User userDTOtoUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User.UserBuilder<?, ?> user = User.builder();

        user.id( userDTO.getId() );
        user.password( userDTO.getPassword() );
        user.username( userDTO.getUsername() );

        return user.build();
    }

    @Override
    public List<UserDTO> userToUserDTOList(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( users.size() );
        for ( User user : users ) {
            list.add( userToUserDTO( user ) );
        }

        return list;
    }

    @Override
    public List<User> userDTOtoUserList(List<UserDTO> userDTOList) {
        if ( userDTOList == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( userDTOList.size() );
        for ( UserDTO userDTO : userDTOList ) {
            list.add( userDTOtoUser( userDTO ) );
        }

        return list;
    }

    @Override
    public User toModel(UserDetailsDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User.UserBuilder<?, ?> user = User.builder();

        user.id( userDTO.getId() );
        user.accountNonExpired( userDTO.isAccountNonExpired() );
        user.accountNonLocked( userDTO.isAccountNonLocked() );
        user.credentialsNonExpired( userDTO.isCredentialsNonExpired() );
        user.enabled( userDTO.isEnabled() );
        user.password( userDTO.getPassword() );
        user.username( userDTO.getUsername() );

        user.authorities( convert123(userDTO.getAuthorities()) );

        return user.build();
    }

    protected RoleDTO roleToRoleDTO(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDTO.RoleDTOBuilder<?, ?> roleDTO = RoleDTO.builder();

        roleDTO.id( role.getId() );
        roleDTO.authority( role.getAuthority() );

        return roleDTO.build();
    }

    protected Set<RoleDTO> roleSetToRoleDTOSet(Set<Role> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleDTO> set1 = new LinkedHashSet<RoleDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Role role : set ) {
            set1.add( roleToRoleDTO( role ) );
        }

        return set1;
    }
}
