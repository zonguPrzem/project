package com.rental.project.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.rental.project.dtos.AutoView;
import com.rental.project.model.Auto;



    @Repository
    public interface AutoRepository extends PagingAndSortingRepository<Auto, Long>, JpaRepository<Auto, Long> {

//        @Query("select new pstaniec.rental.dtos.QuestionView(q.id, q.title, size(a)) from Question q left join q.answers a group by q.id, q.title order by q.createdOn desc ")
//        Page<AutoView> findQuestionViews(Pageable page);
//
//        @Query("select new pstaniec.rental.dtos.QuestionView(q.id, q.title, size(a)) from Question q left join q.answers a where q.user.id = ?1 group by q.id, q.title order by q.createdOn desc ")
//        Page<AutoView> findQuestionViewsById(long usedId, Pageable page);
    }



