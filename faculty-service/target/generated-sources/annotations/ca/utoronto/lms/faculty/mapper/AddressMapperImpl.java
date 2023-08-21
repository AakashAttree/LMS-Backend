package ca.utoronto.lms.faculty.mapper;

import ca.utoronto.lms.faculty.dto.AddressDTO;
import ca.utoronto.lms.faculty.dto.CityDTO;
import ca.utoronto.lms.faculty.dto.CountryDTO;
import ca.utoronto.lms.faculty.model.Address;
import ca.utoronto.lms.faculty.model.City;
import ca.utoronto.lms.faculty.model.Country;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-21T11:54:06+0530",
    comments = "version: 1.5.0.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class AddressMapperImpl implements AddressMapper {

    @Override
    public AddressDTO toDTO(Address model) {
        if ( model == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setId( model.getId() );
        addressDTO.setCity( cityToCityDTO( model.getCity() ) );
        addressDTO.setNumber( model.getNumber() );
        addressDTO.setStreet( model.getStreet() );

        return addressDTO;
    }

    @Override
    public List<AddressDTO> toDTO(List<Address> model) {
        if ( model == null ) {
            return null;
        }

        List<AddressDTO> list = new ArrayList<AddressDTO>( model.size() );
        for ( Address address : model ) {
            list.add( toDTO( address ) );
        }

        return list;
    }

    @Override
    public Address toModel(AddressDTO DTO) {
        if ( DTO == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( DTO.getId() );
        address.setCity( cityDTOToCity( DTO.getCity() ) );
        address.setNumber( DTO.getNumber() );
        address.setStreet( DTO.getStreet() );

        return address;
    }

    @Override
    public List<Address> toModel(List<AddressDTO> DTO) {
        if ( DTO == null ) {
            return null;
        }

        List<Address> list = new ArrayList<Address>( DTO.size() );
        for ( AddressDTO addressDTO : DTO ) {
            list.add( toModel( addressDTO ) );
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
}
