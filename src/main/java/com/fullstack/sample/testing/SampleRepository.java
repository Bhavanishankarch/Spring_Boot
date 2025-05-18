package com.fullstack.sample.testing;

import org.springframework.data.jpa.repository.JpaRepository;

interface SampleRepository  extends JpaRepository<SampleEntity,Long>{

    
}