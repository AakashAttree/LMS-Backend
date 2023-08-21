package ca.utoronto.lms.faculty.mapper;

import ca.utoronto.lms.faculty.dto.AddressDTO;
import ca.utoronto.lms.faculty.dto.CityDTO;
import ca.utoronto.lms.faculty.dto.CountryDTO;
import ca.utoronto.lms.faculty.dto.FacultyDTO;
import ca.utoronto.lms.faculty.dto.TeacherDTO;
import ca.utoronto.lms.faculty.model.Address;
import ca.utoronto.lms.faculty.model.City;
import ca.utoronto.lms.faculty.model.Country;
import ca.utoronto.lms.faculty.model.Faculty;
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
public class FacultyMapperImpl implements FacultyMapper {

    @Override
    public FacultyDTO toDTO(Faculty model) {
        if ( model == null ) {
            return null;
        }

        FacultyDTO facultyDTO = new FacultyDTO();

        facultyDTO.setId( model.getId() );
        facultyDTO.setAddress( addressToAddressDTO( model.getAddress() ) );
        facultyDTO.setDean( teacherToTeacherDTO( model.getDean() ) );
        facultyDTO.setDescription( model.getDescription() );
        facultyDTO.setEmail( model.getEmail() );
        facultyDTO.setName( model.getName() );

        return facultyDTO;
    }

    @Override
    public List<FacultyDTO> toDTO(List<Faculty> model) {
        if ( model == null ) {
            return null;
        }

        List<FacultyDTO> list = new ArrayList<FacultyDTO>( model.size() );
        for ( Faculty faculty : model ) {
            list.add( toDTO( faculty ) );
        }

        return list;
    }

    @Override
    public Faculty toModel(FacultyDTO DTO) {
        if ( DTO == null ) {
            return null;
        }

        Faculty faculty = new Faculty();

        faculty.setId( DTO.getId() );
        faculty.setAddress( addressDTOToAddress( DTO.getAddress() ) );
        faculty.setDean( teacherDTOToTeacher( DTO.getDean() ) );
        faculty.setDescription( DTO.getDescription() );
        faculty.setEmail( DTO.getEmail() );
        faculty.setName( DTO.getName() );

        return faculty;
    }

    @Override
    public List<Faculty> toModel(List<FacultyDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<Faculty> list = new ArrayList<Faculty>( DTO.size() );
        for ( FacultyDTO facultyDTO : DTO ) {
            list.add( toModel( facultyDTO ) );
        }

        return list;
    }

    protected CountryDTO countryToCountryDTO(Country country) {
        if ( country == null ) {
            return null;
        }

        CountryDTO countryDTO = new CountryDTO();

        countryDTO.setId( country.getId() );
        countryDTO.setName( country.getName() );

        return countryDTO;
    }

    protected CityDTO cityToCityDTO(City city) {
        if ( city == null ) {
            return null;
        }

        CityDTO cityDTO = new CityDTO();

        cityDTO.setId( city.getId() );
        cityDTO.setCountry( countryToCountryDTO( city.getCountry() ) );
        cityDTO.setName( city.getName() );

        return cityDTO;
    }

    protected AddressDTO addressToAddressDTO(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setId( address.getId() );
        addressDTO.setCity( cityToCityDTO( address.getCity() ) );
        addressDTO.setNumber( address.getNumber() );
        addressDTO.setStreet( address.getStreet() );

        return addressDTO;
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
}
