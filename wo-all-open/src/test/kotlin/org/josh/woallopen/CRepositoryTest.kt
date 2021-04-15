package org.josh.woallopen

import mu.KotlinLogging
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.data.repository.findByIdOrNull

@DataJpaTest
class CRepositoryTest {
    @Autowired
    private lateinit var cRepository: CRepository

    @Autowired
    private lateinit var bRepository: BRepository

    private val logger = KotlinLogging.logger { }
    @Test
    fun `let's get it`() {

        logger.info {
            """
##################
## BEFORE GET C ##
##################
            """
        }
        val c = cRepository.findByIdOrNull(1)

        logger.info {
            """
##################
## BEFORE ACCESS A ##
##################
            """
        }

        logger.info { c?.a?.name }


        logger.info {
            """
##################
## BEFORE ACCESS B ##
##################
            """
        }

        logger.info { c?.b?.name }


    }

    @Test
    fun `One To Many Lazy Test`() {

        logger.info {
            """
##################
## BEFORE GET B ##
##################
            """
        }
        val b = bRepository.findByIdOrNull(1)!!

        logger.info {
            """
##################
## BEFORE ACCESS C ##
##################
            """
        }

        b.cs.forEach { logger.info { it } }


    }
}