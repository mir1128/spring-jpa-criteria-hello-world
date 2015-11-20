package com.lance.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserEntity.class)
public abstract class UserEntity_ extends com.lance.entity.BaseEntity_ {

	public static volatile SingularAttribute<UserEntity, String> password;
	public static volatile ListAttribute<UserEntity, AddressEntity> addresses;
	public static volatile SingularAttribute<UserEntity, Integer> sex;
	public static volatile SingularAttribute<UserEntity, String> tel;
	public static volatile SingularAttribute<UserEntity, String> userName;

}

