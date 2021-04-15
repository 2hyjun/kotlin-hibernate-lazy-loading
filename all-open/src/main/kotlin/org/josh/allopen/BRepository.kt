package org.josh.allopen

import org.springframework.data.jpa.repository.JpaRepository

interface BRepository : JpaRepository<B, Long> {
}