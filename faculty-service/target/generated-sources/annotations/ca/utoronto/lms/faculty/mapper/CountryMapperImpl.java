package ca.utoronto.lms.faculty.mapper;

import ca.utoronto.lms.faculty.dto.CountryDTO;
import ca.utoronto.lms.faculty.model.Country;
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
public class CountryMapperImpl implements CountryMapper {

    @Override
    public CountryDTO toDTO(Country model) {
        if ( model == null ) {
            return null;
        }

        CountryDTO countryDTO = new CountryDTO();

        countryDTO.setId( model.getId() );
        countryDTO.setName( model.getName() );

        return countryDTO;
    }

    @Override
    public List<CountryDTO> toDTO(List<Country> model) {
        if ( model == null ) {
            return null;
        }

        List<CountryDTO> list = new ArrayList<CountryDTO>( model.size() );
        for ( Country country : model ) {
            list.add( toDTO( country ) );
        }

        return list;
    }

    @Override
    public Country toModel(CountryDTO DTO) {
        if ( DTO == null ) {
            return null;
        }

        Country country = new Country();

        country.setId( DTO.getId() );
        country.setName( DTO.getName() );

        return country;
    }

    @Override
    public List<Country> toModel(List<CountryDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<Country> list = new ArrayList<Country>( DTO.size() );
        for ( CountryDTO countryDTO : DTO ) {
            list.add( toModel( countryDTO ) );
        }

        return list;
    }
}
