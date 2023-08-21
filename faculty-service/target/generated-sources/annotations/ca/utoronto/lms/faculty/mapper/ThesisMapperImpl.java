package ca.utoronto.lms.faculty.mapper;

import ca.utoronto.lms.faculty.dto.AddressDTO;
import ca.utoronto.lms.faculty.dto.CityDTO;
import ca.utoronto.lms.faculty.dto.CountryDTO;
import ca.utoronto.lms.faculty.dto.FacultyDTO;
import ca.utoronto.lms.faculty.dto.StudentDTO;
import ca.utoronto.lms.faculty.dto.StudyProgramDTO;
import ca.utoronto.lms.faculty.dto.TeacherDTO;
import ca.utoronto.lms.faculty.dto.ThesisDTO;
import ca.utoronto.lms.faculty.model.Address;
import ca.utoronto.lms.faculty.model.City;
import ca.utoronto.lms.faculty.model.Country;
import ca.utoronto.lms.faculty.model.Faculty;
import ca.utoronto.lms.faculty.model.Student;
import ca.utoronto.lms.faculty.model.StudyProgram;
import ca.utoronto.lms.faculty.model.Teacher;
import ca.utoronto.lms.faculty.model.Thesis;
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
public class ThesisMapperImpl implements ThesisMapper {

    @Override
    public ThesisDTO toDTO(Thesis model) {
        if ( model == null ) {
            return null;
        }

        ThesisDTO thesisDTO = new ThesisDTO();

        thesisDTO.setId( model.getId() );
        thesisDTO.setApplicationDate( model.getApplicationDate() );
        thesisDTO.setDefenseDate( model.getDefenseDate() );
        thesisDTO.setDescription( model.getDescription() );
        thesisDTO.setGrade( model.getGrade() );
        thesisDTO.setMentor( teacherToTeacherDTO( model.getMentor() ) );
        thesisDTO.setName( model.getName() );
        thesisDTO.setStudent( toDTO( model.getStudent() ) );
        thesisDTO.setUrl( model.getUrl() );

        return thesisDTO;
    }

    @Override
    public List<ThesisDTO> toDTO(List<Thesis> model) {
        if ( model == null ) {
            return null;
        }

        List<ThesisDTO> list = new ArrayList<ThesisDTO>( model.size() );
        for ( Thesis thesis : model ) {
            list.add( toDTO( thesis ) );
        }

        return list;
    }

    @Override
    public Thesis toModel(ThesisDTO DTO) {
        if ( DTO == null ) {
            return null;
        }

        Thesis thesis = new Thesis();

        thesis.setId( DTO.getId() );
        thesis.setApplicationDate( DTO.getApplicationDate() );
        thesis.setDefenseDate( DTO.getDefenseDate() );
        thesis.setDescription( DTO.getDescription() );
        thesis.setGrade( DTO.getGrade() );
        thesis.setMentor( teacherDTOToTeacher( DTO.getMentor() ) );
        thesis.setName( DTO.getName() );
        thesis.setStudent( studentDTOToStudent( DTO.getStudent() ) );
        thesis.setUrl( DTO.getUrl() );

        return thesis;
    }

    @Override
    public List<Thesis> toModel(List<ThesisDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<Thesis> list = new ArrayList<Thesis>( DTO.size() );
        for ( ThesisDTO thesisDTO : DTO ) {
            list.add( toModel( thesisDTO ) );
        }

        return list;
    }

    @Override
    public StudentDTO toDTO(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId( student.getId() );
        studentDTO.setFirstName( student.getFirstName() );
        studentDTO.setIndex( student.getIndex() );
        studentDTO.setLastName( student.getLastName() );
        studentDTO.setYearOfEnrollment( student.getYearOfEnrollment() );

        return studentDTO;
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

    protected StudyProgram studyProgramDTOToStudyProgram(StudyProgramDTO studyProgramDTO) {
        if ( studyProgramDTO == null ) {
            return null;
        }

        StudyProgram studyProgram = new StudyProgram();

        studyProgram.setId( studyProgramDTO.getId() );
        studyProgram.setAcronym( studyProgramDTO.getAcronym() );
        studyProgram.setDescription( studyProgramDTO.getDescription() );
        studyProgram.setFaculty( facultyDTOToFaculty( studyProgramDTO.getFaculty() ) );
        studyProgram.setManager( teacherDTOToTeacher( studyProgramDTO.getManager() ) );
        studyProgram.setName( studyProgramDTO.getName() );

        return studyProgram;
    }

    protected Student studentDTOToStudent(StudentDTO studentDTO) {
        if ( studentDTO == null ) {
            return null;
        }

        Student student = new Student();

        student.setId( studentDTO.getId() );
        student.setFirstName( studentDTO.getFirstName() );
        student.setIndex( studentDTO.getIndex() );
        student.setLastName( studentDTO.getLastName() );
        student.setStudyProgram( studyProgramDTOToStudyProgram( studentDTO.getStudyProgram() ) );
        student.setThesis( toModel( studentDTO.getThesis() ) );
        student.setYearOfEnrollment( studentDTO.getYearOfEnrollment() );

        return student;
    }
}
