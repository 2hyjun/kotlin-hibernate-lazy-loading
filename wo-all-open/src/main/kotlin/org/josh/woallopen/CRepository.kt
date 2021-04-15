package org.josh.woallopen

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CRepository : CrudRepository<C, Long>