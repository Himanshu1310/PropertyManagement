package com.propertymanagement.convertor;

import com.propertymanagement.service.impl.dto.PropertyDto;
import com.propertymanagement.entity.PropertyEntity;
import org.springframework.stereotype.Component;

@Component
public class PropertyConvertor {
        public PropertyEntity convertDtoToEntity(PropertyDto propertyDto){
                PropertyEntity pe = new PropertyEntity();
                pe.setTitle(propertyDto.getTitle());
                pe.setPrice(propertyDto.getPrice());
                pe.setDescription(propertyDto.getDescription());
                pe.setOwnerName(propertyDto.getOwnerName());
                pe.setOwnerMail(propertyDto.getOwnerMail());
                return pe;
        }
        public PropertyDto convertEntityToDto(PropertyEntity propertyEntity){
                PropertyDto pd = new PropertyDto();
                pd.setTitle(propertyEntity.getTitle());
                pd.setPrice(propertyEntity.getPrice());
                pd.setDescription(propertyEntity.getDescription());
                pd.setOwnerName(propertyEntity.getOwnerName());
                pd.setOwnerMail(propertyEntity.getOwnerMail());
                return pd;
        }
}
