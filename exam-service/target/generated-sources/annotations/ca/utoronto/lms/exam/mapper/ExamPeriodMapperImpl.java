package ca.utoronto.lms.exam.mapper;

import ca.utoronto.lms.exam.dto.ExamPeriodDTO;
import ca.utoronto.lms.exam.dto.FacultyDTO;
import ca.utoronto.lms.exam.model.ExamPeriod;
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
public class ExamPeriodMapperImpl implements ExamPeriodMapper {

    @Override
    public List<ExamPeriodDTO> toDTO(List<ExamPeriod> model) {
        if ( model == null ) {
            return null;
        }

        List<ExamPeriodDTO> list = new ArrayList<ExamPeriodDTO>( model.size() );
        for ( ExamPeriod examPeriod : model ) {
            list.add( toDTO( examPeriod ) );
        }

        return list;
    }

    @Override
    public List<ExamPeriod> toModel(List<ExamPeriodDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<ExamPeriod> list = new ArrayList<ExamPeriod>( DTO.size() );
        for ( ExamPeriodDTO examPeriodDTO : DTO ) {
            list.add( toModel( examPeriodDTO ) );
        }

        return list;
    }

    @Override
    public ExamPeriodDTO toDTO(ExamPeriod examPeriod) {
        if ( examPeriod == null ) {
            return null;
        }

        ExamPeriodDTO examPeriodDTO = new ExamPeriodDTO();

        examPeriodDTO.setFaculty( facultyDTOFromId( examPeriod.getFacultyId() ) );
        examPeriodDTO.setId( examPeriod.getId() );
        examPeriodDTO.setExamEndDate( examPeriod.getExamEndDate() );
        examPeriodDTO.setExamStartDate( examPeriod.getExamStartDate() );
        examPeriodDTO.setName( examPeriod.getName() );
        examPeriodDTO.setRegistrationEndDate( examPeriod.getRegistrationEndDate() );
        examPeriodDTO.setRegistrationStartDate( examPeriod.getRegistrationStartDate() );

        return examPeriodDTO;
    }

    @Override
    public ExamPeriod toModel(ExamPeriodDTO examPeriodDTO) {
        if ( examPeriodDTO == null ) {
            return null;
        }

        ExamPeriod examPeriod = new ExamPeriod();

        examPeriod.setFacultyId( examPeriodDTOFacultyId( examPeriodDTO ) );
        examPeriod.setId( examPeriodDTO.getId() );
        examPeriod.setExamEndDate( examPeriodDTO.getExamEndDate() );
        examPeriod.setExamStartDate( examPeriodDTO.getExamStartDate() );
        examPeriod.setName( examPeriodDTO.getName() );
        examPeriod.setRegistrationEndDate( examPeriodDTO.getRegistrationEndDate() );
        examPeriod.setRegistrationStartDate( examPeriodDTO.getRegistrationStartDate() );

        return examPeriod;
    }

    @Override
    public FacultyDTO facultyDTOFromId(Long id) {
        if ( id == null ) {
            return null;
        }

        FacultyDTO facultyDTO = new FacultyDTO();

        facultyDTO.setId( id );

        return facultyDTO;
    }

    private Long examPeriodDTOFacultyId(ExamPeriodDTO examPeriodDTO) {
        if ( examPeriodDTO == null ) {
            return null;
        }
        FacultyDTO faculty = examPeriodDTO.getFaculty();
        if ( faculty == null ) {
            return null;
        }
        Long id = faculty.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
