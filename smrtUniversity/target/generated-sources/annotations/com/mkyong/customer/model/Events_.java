package com.mkyong.customer.model;

import com.mkyong.customer.model.Comments;
import com.mkyong.customer.model.Likes;
import com.mkyong.customer.model.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-15T02:44:47")
@StaticMetamodel(Events.class)
public class Events_ { 

    public static volatile SingularAttribute<Events, Users> idUser;
    public static volatile SingularAttribute<Events, Integer> cost;
    public static volatile SingularAttribute<Events, Date> endDate;
    public static volatile SingularAttribute<Events, String> name;
    public static volatile SingularAttribute<Events, String> photo;
    public static volatile SingularAttribute<Events, Integer> id;
    public static volatile SingularAttribute<Events, String> text;
    public static volatile CollectionAttribute<Events, Comments> commentsCollection;
    public static volatile CollectionAttribute<Events, Likes> likesCollection;
    public static volatile SingularAttribute<Events, Date> startDate;

}