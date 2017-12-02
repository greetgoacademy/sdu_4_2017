package kz.greetgo.education.register.dao;

import kz.greetgo.education.controller.model.AuthInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;

public interface AuthDao {
  @Select("select NOW()")
  Date getSysdate();

  @Select("select id from Person where accountName=#{name} and " +
    "encryptedPassword=#{pass}")
  String getPersonId(@Param("name") String accountName,
                     @Param("pass") String password);

  @Select("select id as personId from Person where accountName=#{name} and " +
    "encryptedPassword=#{pass}")
  AuthInfo getPersonIdByObject(@Param("name") String accountName,
                       @Param("pass") String password);
}
