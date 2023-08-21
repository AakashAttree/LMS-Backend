package ca.utoronto.lms.exam.mapper;

import ca.utoronto.lms.exam.dto.ExamTypeDTO;
import ca.utoronto.lms.exam.model.ExamType;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-21T11:54:04+0530",
    comments = "version: 1.5.0.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class ExamTypeMapperImpl implements ExamTypeMapper {

    @Override
    public ExamTypeDTO toDTO(ExamType model) {
        if ( model == null ) {
            return null;
        }

        ExamTypeDTO examTypeDTO = new ExamTypeDTO();

        examTypeDTO.setId( model.getId() );
        examTypeDTO.setName( model.getName() );

        return examTypeDTO;
    }

    @Override
    public List<ExamTypeDTO> toDTO(List<ExamType> model) {
        if ( model == null ) {
            return null;
        }

        List<ExamTypeDTO> list = new ArrayList<ExamTypeDTO>( model.size() );
        for ( ExamType examType : model ) {
            list.add( toDTO( examType ) );
        }

        return list;
    }

    @Override
    public ExamType toModel(ExamTypeDTO DTO) {
        if ( DTO == null ) {
            return null;
        }

        ExamType examType = new ExamType();

        examType.setId( DTO.getId() );
        examType.setName( DTO.getName() );

        return examType;
    }

    @Override
    public List<ExamType> toModel(List<ExamTypeDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<ExamType> list = new ArrayList<ExamType>( DTO.size() );
        for ( ExamTypeDTO examTypeDTO : DTO ) {
            list.add( toModel( examTypeDTO ) );
        }

        return list;
    }
}
