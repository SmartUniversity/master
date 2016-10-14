package com.mkyong.customer.model;

import com.mkyong.customer.model.Events;
import com.mkyong.customer.model.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-15T02:44:47")
@StaticMetamodel(Comments.class)
public class Comments_ { 

    public static volatile SingularAttribute<Comments, Date> date;
    public static volatile SingularAttribute<Comments, Users> idUser;
    public static volatile SingularAttribute<Comments, Events> idEvent;
    public static volatile SingularAttribute<Comments, Integer> id;
    public static volatile SingularAttribute<Comments, String> text;

}