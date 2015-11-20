package com.lance.service;

import com.lance.entity.UserEntity;
import com.lance.entity.UserEntity_;
import com.lance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Random;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Autowired
    EntityManager entityManager;


    public boolean createUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("hello" + new Random().nextInt());
        userRepository.save(userEntity);
        return true;
    }

    public List<UserEntity> getUsers() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<UserEntity> query = criteriaBuilder.createQuery(UserEntity.class);
        Root<UserEntity> user = query.from(UserEntity.class);

        Predicate condition = criteriaBuilder.equal(user.get(UserEntity_.userName), "hello-1623927557");
        query.where(condition);
        TypedQuery<UserEntity> typedQuery = entityManager.createQuery(query);
        return typedQuery.getResultList();
    }
}

