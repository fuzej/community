package cn.fu.community.mapper;

import cn.fu.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * created by fuzej on  2020-02-07 11:36
 *
 * @Describtion :
 */
@Mapper
//@Repository
public interface UserMapper
{
    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified) " +
            "values (#{name},#{account_id},#{token},#{gmt_create},#{gmt_modified})")
    public void insert(User user);

}
