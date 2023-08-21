package ca.utoronto.lms.faculty.mapper;

import ca.utoronto.lms.faculty.dto.AddressDTO;
import ca.utoronto.lms.faculty.dto.CityDTO;
import ca.utoronto.lms.faculty.dto.CountryDTO;
import ca.utoronto.lms.faculty.dto.FacultyDTO;
import ca.utoronto.lms.faculty.dto.StudyProgramDTO;
import ca.utoronto.lms.faculty.dto.TeacherDTO;
import ca.utoronto.lms.faculty.model.Address;
import ca.utoronto.lms.faculty.model.City;
import ca.utoronto.lms.faculty.model.Country;
import ca.utoronto.lms.faculty.model.Faculty;
import ca.utoronto.lms.faculty.model.StudyProgram;
import ca.utoronto.lms.faculty.model.Teacher;
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
public class StudyProgramMapperImpl implements StudyProgramMapper {

    @Override
    public StudyProgramDTO toDTO(StudyProgram model) {
        if ( model == null ) {
            return null;
        }

        StudyProgramDTO studyProgramDTO = new StudyProgramDTO();

        studyProgramDTO.setId( model.getId() );
        studyProgramDTO.setAcronym( model.getAcronym() );
        studyProgramDTO.setDescription( model.getDescription() );
        studyProgramDTO.setFaculty( toDTO( model.getFaculty() ) );
        studyProgramDTO.setManager( teacherToTeacherDTO( model.getManager() ) );
        studyProgramDTO.setName( model.getName() );

        return studyProgramDTO;
    }

    @Override
    public List<StudyProgramDTO> toDTO(List<StudyProgram> model) {
        if ( model == null ) {
            return null;
        }

        List<StudyProgramDTO> list = new ArrayList<StudyProgramDTO>( model.size() );
        for ( StudyProgram studyProgram : model ) {
            list.add( toDTO( studyProgram ) );
        }

        return list;
    }

    @Override
    public StudyProgram toModel(StudyProgramDTO DTO) {
        if ( DTO == null ) {
            return null;
        }

        StudyProgram studyProgram = new StudyProgram();

        studyProgram.setId( DTO.getId() );
        studyProgram.setAcronym( DTO.getAcronym() );
        studyProgram.setDescription( DTO.getDescription() );
        studyProgram.setFaculty( facultyDTOToFaculty( DTO.getFaculty() ) );
        studyProgram.setManager( teacherDTOToTeacher( DTO.getManager() ) );
        studyProgram.setName( DTO.getName() );

        return studyProgram;
    }

    @Override
    public List<StudyProgram> toModel(List<StudyProgramDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<StudyProgram> list = new ArrayList<StudyProgram>( DTO.size() );
        for ( StudyProgramDTO studyProgramDTO : DTO ) {
            list.add( toModel( studyProgramDTO ) );
        }

        return list;
    }

    @Override
    public FacultyDTO toDTO(Faculty faculty) {
        if ( faculty == null ) {
            return null;
        }

        FacultyDTO facultyDTO = new FacultyDTO();

        facultyDTO.setId( faculty.getId() );
        facultyDTO.setDescription( faculty.getDescription() );
        facultyDTO.setEmail( faculty.getEmail() );
        facultyDTO.setName( faculty.getName() );

        return facultyDTO;
    }

    protected TeacherDTO teacherToTeacherDTO(Teacher teacher) {
        if ( teacher == null ) {
            return null;
        }

        TeacherDTO teacherDTO = new TeacherDTO();

        teacherDTO.setId( teacher.getId() );
        teacherDTO.setFirstName( teacher.getFirstName() );
        teacherDTO.setLastName( teacher.getLastName() );

        return teacherDTO;
    }

    protected Country countryDTOToCountry(CountryDTO countryDTO) {
        if ( countryDTO == null ) {
            return null;
        }

        Country country = new Country();

        country.setId( countryDTO.getId() );
        country.setName( countryDTO.getName() );

        return country;
    }

    protected City cityDTOToCity(CityDTO cityDTO) {
        if ( cityDTO == null ) {
            return null;
        }

        City city = new City();

        city.setId( cityDTO.getId() );
        city.setCountry( countryDTOToCountry( cityDTO.getCountry() ) );
        city.setName( cityDTO.getName() );

        return city;
    }

    protected Address addressDTOToAddress(AddressDTO addressDTO) {
        if ( addressDTO == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( addressDTO.getId() );
        address.setCity( cityDTOToCity( addressDTO.getCity() ) );
        address.setNumber( addressDTO.getNumber() );
        address.setStreet( addressDTO.getStreet() );

        return address;
    }

    protected Teacher teacherDTOToTeacher(TeacherDTO teacherDTO) {
        if ( teacherDTO == null ) {
            return null;
        }

        Teacher teacher = new Teacher();

        teacher.setId( teacherDTO.getId() );
        teacher.setFirstName( teacherDTO.getFirstName() );
        teacher.setLastName( teacherDTO.getLastName() );

        return teacher;
    }

    protected Faculty facultyDTOToFaculty(FacultyDTO facultyDTO) {
        if ( facultyDTO == null ) {
            return null;
        }

        Faculty faculty = new Faculty();

        faculty.setId( facultyDTO.getId() );
        faculty.setAddress( addressDTOToAddress( facultyDTO.getAddress() ) );
        faculty.setDean( teacherDTOToTeacher( facultyDTO.getDean() ) );
        faculty.setDescription( facultyDTO.getDescription() );
        faculty.setEmail( facultyDTO.getEmail() );
        faculty.setName( facultyDTO.getName() );

        return faculty;
    }
}
