package cdu.gu.user.mapper;

import cdu.gu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonalMapper {
    /**
     * 根据userid查找用户
     * @param id
     * @return
     */
    User SearchUserById(int id);
}
