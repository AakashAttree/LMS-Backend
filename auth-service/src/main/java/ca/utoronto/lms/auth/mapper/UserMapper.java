package ca.utoronto.lms.auth.mapper;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ca.utoronto.lms.auth.model.Role;
import ca.utoronto.lms.auth.model.User;
import ca.utoronto.lms.shared.dto.RoleDTO;
import ca.utoronto.lms.shared.dto.UserDTO;
import ca.utoronto.lms.shared.dto.UserDetailsDTO;
import ca.utoronto.lms.shared.mapper.BaseMapper;

@Mapper
public interface UserMapper extends BaseMapper<User, UserDetailsDTO, Long> {
	
	UserMapper MAPPER = Mappers.getMapper(UserMapper.class);
	

    UserDTO userToUserDTO(User user);

    User userDTOtoUser(UserDTO userDTO);

    List<UserDTO> userToUserDTOList(List<User> users);

    List<User> userDTOtoUserList(List<UserDTO> userDTOList);
    @Mapping(source = "authorities", ignore = true, target = "authorities")
   User toModel(UserDetailsDTO userDTO);
    
    default Set<Role> convert123(Set<RoleDTO>  roles ){
    	return roles.stream().map(DTO-> {
//   		Role role = new Role();
//	role.setAuthority(DTO.getAuthority());
    		return RoleMapper.MAPPER.toModel(DTO);
    	}).collect(Collectors.toSet());
    }
    
}
