package com.rental.project.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.rental.project.model.Auto;


@Repository
    public interface AutoRepository extends PagingAndSortingRepository<Auto, Long>, JpaRepository<Auto, Long> {


//    @Query("select q from Auto q order by q.createdOn")
//    Optional<Auto> findWithAuto(Long id);


//        @Query("select new com.rental.project.dtos.AutoView(q.id, q.marka,q.model,q.typ_nadwozia,q.rocznik,q.kolor,q.status,q.kwota) from Auto q group by q.id, q.model order by q.createdOn desc ")
//        Page<AutoView> findAutoViews(Pageable page);
//
//        @Query("select new com.rental.project.dtos.AutoView(q.id, q.marka,q.model,q.typ_nadwozia,q.rocznik,q.kolor,q.status,q.kwota) from Auto q group by q.id, q.model order by q.createdOn desc ")
//        Page<AutoView> findAutoViewsById(long autoId, Pageable page);
    }