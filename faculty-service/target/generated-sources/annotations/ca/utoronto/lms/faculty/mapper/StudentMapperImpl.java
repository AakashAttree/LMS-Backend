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
import ca.utoronto.lms.shared.dto.UserDTO;
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
public class StudentMapperImpl extends StudentMapper {

    @Override
    public List<Student> toModel(List<StudentDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<Student> list = new ArrayList<Student>( DTO.size() );
        for ( StudentDTO studentDTO : DTO ) {
            list.add( toModel( studentDTO ) );
        }

        return list;
    }

    @Override
    public StudentDTO toDTO(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setUser( userDTOFromId( student.getUserId() ) );
        studentDTO.setAverageGrade( getAverageGrade( student.getId() ) );
        studentDTO.setTotalECTS( getTotalECTS( student.getId() ) );
        studentDTO.setId( student.getId() );
        studentDTO.setFirstName( student.getFirstName() );
        studentDTO.setIndex( student.getIndex() );
        studentDTO.setLastName( student.getLastName() );
        studentDTO.setStudyProgram( toDTO( student.getStudyProgram() ) );
        studentDTO.setThesis( toDTO( student.getThesis() ) );
        studentDTO.setYearOfEnrollment( student.getYearOfEnrollment() );

        return studentDTO;
    }

    @Override
    public Student toModel(StudentDTO studentDTO) {
        if ( studentDTO == null ) {
            return null;
        }

        Student student = new Student();

        student.setUserId( studentDTOUserId( studentDTO ) );
        student.setId( studentDTO.getId() );
        student.setFirstName( studentDTO.getFirstName() );
        student.setIndex( studentDTO.getIndex() );
        student.setLastName( studentDTO.getLastName() );
        student.setStudyProgram( studyProgramDTOToStudyProgram( studentDTO.getStudyProgram() ) );
        student.setThesis( thesisDTOToThesis( studentDTO.getThesis() ) );
        student.setYearOfEnrollment( studentDTO.getYearOfEnrollment() );

        return student;
    }

    @Override
    public UserDTO userDTOFromId(Long id) {
        if ( id == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( id );

        return userDTO;
    }

    @Override
    public ThesisDTO toDTO(Thesis thesis) {
        if ( thesis == null ) {
            return null;
        }

        ThesisDTO thesisDTO = new ThesisDTO();

        thesisDTO.setId( thesis.getId() );
        thesisDTO.setApplicationDate( thesis.getApplicationDate() );
        thesisDTO.setDefenseDate( thesis.getDefenseDate() );
        thesisDTO.setDescription( thesis.getDescription() );
        thesisDTO.setGrade( thesis.getGrade() );
        thesisDTO.setMentor( teacherToTeacherDTO( thesis.getMentor() ) );
        thesisDTO.setName( thesis.getName() );
        thesisDTO.setUrl( thesis.getUrl() );

        return thesisDTO;
    }

    @Override
    public StudyProgramDTO toDTO(StudyProgram studyProgram) {
        if ( studyProgram == null ) {
            return null;
        }

        StudyProgramDTO studyProgramDTO = new StudyProgramDTO();

        studyProgramDTO.setId( studyProgram.getId() );
        studyProgramDTO.setAcronym( studyProgram.getAcronym() );
        studyProgramDTO.setDescription( studyProgram.getDescription() );
        studyProgramDTO.setName( studyProgram.getName() );

        return studyProgramDTO;
    }

    private Long studentDTOUserId(StudentDTO studentDTO) {
        if ( studentDTO == null ) {
            return null;
        }
        UserDTO user = studentDTO.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
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

    protected Thesis thesisDTOToThesis(ThesisDTO thesisDTO) {
        if ( thesisDTO == null ) {
            return null;
        }

        Thesis thesis = new Thesis();

        thesis.setId( thesisDTO.getId() );
        thesis.setApplicationDate( thesisDTO.getApplicationDate() );
        thesis.setDefenseDate( thesisDTO.getDefenseDate() );
        thesis.setDescription( thesisDTO.getDescription() );
        thesis.setGrade( thesisDTO.getGrade() );
        thesis.setMentor( teacherDTOToTeacher( thesisDTO.getMentor() ) );
        thesis.setName( thesisDTO.getName() );
        thesis.setStudent( toModel( thesisDTO.getStudent() ) );
        thesis.setUrl( thesisDTO.getUrl() );

        return thesis;
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
}
