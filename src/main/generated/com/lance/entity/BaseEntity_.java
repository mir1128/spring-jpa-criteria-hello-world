package com.lance.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BaseEntity.class)
public abstract class BaseEntity_ {

	public static volatile SingularAttribute<BaseEntity, Date> updateDate;
	public static volatile SingularAttribute<BaseEntity, String> createById;
	public static volatile SingularAttribute<BaseEntity, Long> id;
	public static volatile SingularAttribute<BaseEntity, Integer> status;
	public static volatile SingularAttribute<BaseEntity, Date> createDate;
	public static volatile SingularAttribute<BaseEntity, String> updateById;

}

