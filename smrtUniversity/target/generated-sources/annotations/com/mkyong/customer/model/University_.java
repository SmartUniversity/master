package com.mkyong.customer.model;

import com.mkyong.customer.model.City;
import com.mkyong.customer.model.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-15T02:44:47")
@StaticMetamodel(University.class)
public class University_ { 

    public static volatile SingularAttribute<University, String> name;
    public static volatile SingularAttribute<University, City> idCity;
    public static volatile SingularAttribute<University, Integer> id;
    public static volatile CollectionAttribute<University, Users> usersCollection;

}