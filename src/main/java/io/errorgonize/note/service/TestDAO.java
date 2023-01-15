package io.errorgonize.note.service;

import io.errorgonize.note.store.logic.TestDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestDAO {
    List<TestDTO> getTestData();
}
