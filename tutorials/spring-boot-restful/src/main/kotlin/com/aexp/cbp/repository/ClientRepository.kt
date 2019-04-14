package com.aexp.cbp.repository

import com.aexp.cbp.entity.Client
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "runners", path = "runners")
interface ClientRepository : CrudRepository <Client, Long >{
}