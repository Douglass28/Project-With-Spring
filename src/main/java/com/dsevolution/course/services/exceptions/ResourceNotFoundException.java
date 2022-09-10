package com.dsevolution.course.services.exceptions;

import java.io.Serializable;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("Resource Not Found. id " + id);
    }
}
