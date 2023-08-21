package ca.utoronto.lms.faculty.mapper;

import ca.utoronto.lms.faculty.dto.CityDTO;
import ca.utoronto.lms.faculty.dto.CountryDTO;
import ca.utoronto.lms.faculty.model.City;
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
public class CityMapperImpl implements CityMapper {

    @Override
    public CityDTO toDTO(City model) {
        if ( model == null ) {
            return null;
        }

        CityDTO cityDTO = new CityDTO();

        cityDTO.setId( model.getId() );
        cityDTO.setCountry( countryToCountryDTO( model.getCountry() ) );
        cityDTO.setName( model.getName() );

        return cityDTO;
    }

    @Override
    public List<CityDTO> toDTO(List<City> model) {
        if ( model == null ) {
            return null;
        }

        List<CityDTO> list = new ArrayList<CityDTO>( model.size() );
        for ( City city : model ) {
            list.add( toDTO( city ) );
        }

        return list;
    }

    @Override
    public City toModel(CityDTO DTO) {
        if ( DTO == null ) {
            return null;
        }

        City city = new City();

        city.setId( DTO.getId() );
        city.setCountry( countryDTOToCountry( DTO.getCountry() ) );
        city.setName( DTO.getName() );

        return city;
    }

    @Override
    public List<City> toModel(List<CityDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<City> list = new ArrayList<City>( DTO.size() );
        for ( CityDTO cityDTO : DTO ) {
            list.add( toModel( cityDTO ) );
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

    protected Country countryDTOToCountry(CountryDTO countryDTO) {
        if ( countryDTO == null ) {
            return null;
        }

        Country country = new Country();

        country.setId( countryDTO.getId() );
        country.setName( countryDTO.getName() );

        return country;
    }
}
