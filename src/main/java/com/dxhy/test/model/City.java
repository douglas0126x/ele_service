package com.dxhy.test.model;

public class City {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.ID
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    private Integer ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.Name
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.CountryCode
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    private String countryCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.District
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    private String district;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.Population
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    private Integer population;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.ID
     *
     * @return the value of city.ID
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    public Integer getID() {
        return ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.ID
     *
     * @param ID the value for city.ID
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.Name
     *
     * @return the value of city.Name
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.Name
     *
     * @param name the value for city.Name
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.CountryCode
     *
     * @return the value of city.CountryCode
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.CountryCode
     *
     * @param countryCode the value for city.CountryCode
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.District
     *
     * @return the value of city.District
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    public String getDistrict() {
        return district;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.District
     *
     * @param district the value for city.District
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.Population
     *
     * @return the value of city.Population
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    public Integer getPopulation() {
        return population;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.Population
     *
     * @param population the value for city.Population
     *
     * @mbggenerated Thu May 25 17:53:09 CST 2017
     */
    public void setPopulation(Integer population) {
        this.population = population;
    }
}