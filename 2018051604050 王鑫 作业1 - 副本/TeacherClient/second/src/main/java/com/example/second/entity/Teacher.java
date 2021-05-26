package com.example.second.entity;

public class Teacher {

    private Long uid;

    private String name;

    //注解校验
//    @ApiModelProperty(value = "年龄, 长度: 10", required = false)
//    @Max(value = 150, message = "年龄不允许超过150岁且必须为数字")

    private Integer age;

    private String sex;

    //add
    private long id_number;

    private String workspace;

    private String hometown;

    private  String address;

    private String tel;

    private  String habbit;


    public long getId_number() {
        return id_number;
    }

    public void setId_number(long id_number) {
        this.id_number = id_number;
    }

    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getHabbit() {
        return habbit;
    }

    public void setHabbit(String habbit) {
        this.habbit = habbit;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }


//    @check({"cookOrNo","marriageStatus"})
//    @Size(min = 5,max = 10,message = "{Teacher.cuisine.size}")
    //这里添加到20个属性
    private Boolean cookOrNo;                    //1
    private String marriageStatus;              //2
    private String favoriteCity;                //3
    private String intruduceMyself;             //4
    private String timesOfLearningAbroad;       //5
    private String majaroCategory;              //6
    private String cuisine;                     //7
    private String justPaidOrNo;                //8
    private String degreeOfConfidence;          //9
    private String timeOfInThisSpace;           //10
    private String Score;                       //11
    private String colorSelect;                 //12

//    public String getCookOrNo() {
//        return cookOrNo;
//    }

//    public void setCookOrNo(String cookOrNo) {
//        this.cookOrNo = cookOrNo;
//    }

    public Boolean getCookOrNo() {
        return cookOrNo;
    }

    public void setCookOrNo(Boolean cookOrNo) {
        this.cookOrNo = cookOrNo;
    }

    public String getMarriageStatus() {
        return marriageStatus;
    }

    public void setMarriageStatus(String marriageStatus) {
        this.marriageStatus = marriageStatus;
    }

    public String getFavoriteCity() {
        return favoriteCity;
    }

    public void setFavoriteCity(String favoriteCity) {
        this.favoriteCity = favoriteCity;
    }

    public String getIntruduceMyself() {
        return intruduceMyself;
    }

    public void setIntruduceMyself(String intruduceMyself) {
        this.intruduceMyself = intruduceMyself;
    }

    public String getTimesOfLearningAbroad() {
        return timesOfLearningAbroad;
    }

    public void setTimesOfLearningAbroad(String timesOfLearningAbroad) {
        this.timesOfLearningAbroad = timesOfLearningAbroad;
    }

    public String getMajaroCategory() {
        return majaroCategory;
    }

    public void setMajaroCategory(String majaroCategory) {
        this.majaroCategory = majaroCategory;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getJustPaidOrNo() {
        return justPaidOrNo;
    }

    public void setJustPaidOrNo(String justPaidOrNo) {
        this.justPaidOrNo = justPaidOrNo;
    }

    public String getDegreeOfConfidence() {
        return degreeOfConfidence;
    }

    public void setDegreeOfConfidence(String degreeOfConfidence) {
        this.degreeOfConfidence = degreeOfConfidence;
    }

    public String getTimeOfInThisSpace() {
        return timeOfInThisSpace;
    }

    public void setTimeOfInThisSpace(String timeOfInThisSpace) {
        this.timeOfInThisSpace = timeOfInThisSpace;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

    public String getColorSelect() {
        return colorSelect;
    }

    public void setColorSelect(String colorSelect) {
        this.colorSelect = colorSelect;
    }
}
