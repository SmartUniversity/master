package com.mkyong.customer.model;

import com.mkyong.customer.model.Events;
import com.mkyong.customer.model.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-15T02:44:47")
@StaticMetamodel(Likes.class)
public class Likes_ { 

    public static volatile SingularAttribute<Likes, Users> idUser;
    public static volatile SingularAttribute<Likes, Events> idEvent;
    public static volatile SingularAttribute<Likes, Integer> id;

}