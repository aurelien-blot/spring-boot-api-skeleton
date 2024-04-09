package fr.adgsoftware.point_hebdo.service;

import fr.adgsoftware.point_hebdo.dao.UserRepository;
import fr.adgsoftware.point_hebdo.dto.user.UserDto;
import fr.adgsoftware.point_hebdo.entity.User;
import fr.adgsoftware.point_hebdo.formatter.UserFormatter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GenericService<User, UserDto>{

    private static final Logger logger = LogManager.getLogger(UserService.class);

    private UserRepository userRepository;
    private UserFormatter userFormatter;

    public UserService(UserRepository userRepository, UserFormatter userFormatter) {
        super(userRepository, userFormatter);
    }
}
