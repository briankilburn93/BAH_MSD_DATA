package com.bah.msd.mcc.repository;

import org.springframework.data.repository.CrudRepository;

import com.bah.msd.mcc.pojos.Event;

public interface EventsRepository extends CrudRepository<Event, Long> {

}