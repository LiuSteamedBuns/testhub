package com.huawei.cloud.bean;

public class Pending {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_pending.ppid
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    private Integer ppid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_pending.ppending
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    private String ppending;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_pending.middletag
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    private Integer middletag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_pending.empno
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    private Integer empno;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_pending.ppid
     *
     * @return the value of tab_pending.ppid
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public Integer getPpid() {
        return ppid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_pending.ppid
     *
     * @param ppid the value for tab_pending.ppid
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public void setPpid(Integer ppid) {
        this.ppid = ppid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_pending.ppending
     *
     * @return the value of tab_pending.ppending
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public String getPpending() {
        return ppending;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_pending.ppending
     *
     * @param ppending the value for tab_pending.ppending
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public void setPpending(String ppending) {
        this.ppending = ppending == null ? null : ppending.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_pending.middletag
     *
     * @return the value of tab_pending.middletag
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public Integer getMiddletag() {
        return middletag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_pending.middletag
     *
     * @param middletag the value for tab_pending.middletag
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public void setMiddletag(Integer middletag) {
        this.middletag = middletag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_pending.empno
     *
     * @return the value of tab_pending.empno
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public Integer getEmpno() {
        return empno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_pending.empno
     *
     * @param empno the value for tab_pending.empno
     *
     * @mbg.generated Sun Jun 16 10:11:06 CST 2019
     */
    public void setEmpno(Integer empno) {
        this.empno = empno;
    }
}