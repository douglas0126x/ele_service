package com.dxhy.test.dao;

import com.dxhy.test.model.Country;
import com.dxhy.test.model.CountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    int countByExample(CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    int deleteByExample(CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    int deleteByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    int insert(Country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    int insertSelective(Country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    List<Country> selectByExample(CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    Country selectByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    int updateByExampleSelective(@Param("record") Country record, @Param("example") CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    int updateByExample(@Param("record") Country record, @Param("example") CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    int updateByPrimaryKeySelective(Country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    int updateByPrimaryKey(Country record);
}