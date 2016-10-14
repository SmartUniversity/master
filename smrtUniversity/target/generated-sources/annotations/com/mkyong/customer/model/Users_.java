package com.mkyong.customer.model;

import com.mkyong.customer.model.Comments;
import com.mkyong.customer.model.Events;
import com.mkyong.customer.model.Likes;
import com.mkyong.customer.model.University;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-15T02:44:47")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, University> idUniv;
    public static volatile CollectionAttribute<Users, Events> eventsCollection;
    public static volatile SingularAttribute<Users, String> photo;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile CollectionAttribute<Users, Comments> commentsCollection;
    public static volatile SingularAttribute<Users, String> userName;
    public static volatile CollectionAttribute<Users, Likes> likesCollection;
    public static volatile SingularAttribute<Users, String> userSurname;

}