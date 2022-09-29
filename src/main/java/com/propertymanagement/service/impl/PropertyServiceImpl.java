package com.propertymanagement.service.impl;

import com.propertymanagement.convertor.PropertyConvertor;
import com.propertymanagement.service.impl.dto.PropertyDto;
import com.propertymanagement.entity.PropertyEntity;
import com.propertymanagement.repository.PropertyRepository;
import com.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;
    @Autowired
    private PropertyConvertor propertyConvertor;
    @Override
    public PropertyDto saveProperty(PropertyDto propertyDto) {
    PropertyEntity pe = propertyConvertor.convertDtoToEntity(propertyDto);
    propertyRepository.save(pe);
    //propertyRepository.save();
        return null;
    }

//    @Override
//    public PropertyDto deleteProperty(PropertyDto propertyDto) {
//        PropertyEntity pe = propertyConvertor.convertDtoToEntity(propertyDto);
//        propertyRepository.deleteById(pe.getId());
//
//        return null;
//    }
}