package com.lance.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AddressEntity.class)
public abstract class AddressEntity_ extends com.lance.entity.BaseEntity_ {

	public static volatile SingularAttribute<AddressEntity, Boolean> isDefault;
	public static volatile SingularAttribute<AddressEntity, String> address;
	public static volatile SingularAttribute<AddressEntity, String> province;
	public static volatile SingularAttribute<AddressEntity, String> city;
	public static volatile SingularAttribute<AddressEntity, UserEntity> user;

}

