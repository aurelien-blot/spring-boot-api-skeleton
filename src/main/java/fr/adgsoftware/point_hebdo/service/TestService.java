package fr.adgsoftware.point_hebdo.service;

import fr.adgsoftware.point_hebdo.dao.TestRepository;
import fr.adgsoftware.point_hebdo.dto.TestDto;
import fr.adgsoftware.point_hebdo.entity.Test;
import fr.adgsoftware.point_hebdo.formatter.TestFormatter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService extends GenericService<Test, TestDto>{

    private static final Logger logger = LogManager.getLogger(TestService.class);

    private TestRepository testRepository;
    private TestFormatter testFormatter;

    public TestService(TestRepository testRepository, TestFormatter testFormatter) {
        super(testRepository, testFormatter);
    }

    public List<TestDto> findByContent(String content){
        List<Test> entityList= testRepository.findByContentContainsIgnoreCase(content);
        return testFormatter.entityToDto(entityList);
    }
}
