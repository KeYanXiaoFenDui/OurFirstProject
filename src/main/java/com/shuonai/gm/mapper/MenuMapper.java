package com.shuonai.gm.mapper;

import com.shuonai.gm.domain.Menu;
import org.apache.ibatis.annotations.*;

@Mapper
public interface MenuMapper {

    @Insert("INSERT into menu (title,menu_no,parent_menu_no,type,create_time,status) values (#{title},#{menuNo},#{parentMenuNo},#{type},#{createTime},#{status})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public int insertMenu(Menu menu);

    @Update("UPDATE menu SET title=#{title},menu_no=#{menuNo},parent_menu_no=#{parentMenuNo},type=#{type},create_time=#{createTime},status=#{status} where id=#{id}")
    public int updateMenu(Menu menu);

    @Delete("delete from menu where id=#{id}")
    public int deleteMenu(int id);

    @Select("select * from menu where id=#{id}")
    public Menu getMenu(int id);

}