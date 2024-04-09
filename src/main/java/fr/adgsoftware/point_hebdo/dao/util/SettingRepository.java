package fr.adgsoftware.point_hebdo.dao.util;

import fr.adgsoftware.point_hebdo.entity.util.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingRepository extends JpaRepository<Setting, Long> {

    Setting findByShortName(String shortName);
}
