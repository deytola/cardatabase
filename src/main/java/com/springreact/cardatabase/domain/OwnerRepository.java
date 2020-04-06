package com.springreact.cardatabase.domain;

import com.springreact.cardatabase.entity.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
