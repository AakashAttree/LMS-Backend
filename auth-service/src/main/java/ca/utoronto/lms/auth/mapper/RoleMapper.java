package ca.utoronto.lms.auth.mapper;

import ca.utoronto.lms.auth.model.Role;
import ca.utoronto.lms.shared.dto.RoleDTO;
import ca.utoronto.lms.shared.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper

public interface RoleMapper extends BaseMapper<Role, RoleDTO, Long> {
	
	RoleMapper MAPPER = Mappers.getMapper(RoleMapper.class);
}
