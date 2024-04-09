package fr.adgsoftware.point_hebdo.formatter;

import fr.adgsoftware.point_hebdo.dto.TestDto;
import fr.adgsoftware.point_hebdo.entity.Test;
import org.springframework.stereotype.Service;

@Service
public class TestFormatter implements IFormatter<Test, TestDto>{

    @Override
    public TestDto entityToDto(Test entity) {
        if(entity == null){
            return null;
        }
        TestDto testDto = new TestDto();
        testDto.setId(entity.getId());
        testDto.setCreationTime(entity.getCreationTime());
        testDto.setModificationTime(entity.getModificationTime());
        testDto.setContent(entity.getContent());

        return testDto;
    }

    @Override
    public Test dtoToEntity(TestDto dto) {
        Test test = new Test();
        test.setId(dto.getId());
        test.setContent(dto.getContent());
        return test;
    }
}
