package org.josh.woallopen

import org.springframework.data.jpa.repository.JpaRepository

interface BRepository : JpaRepository<B, Long> {
}