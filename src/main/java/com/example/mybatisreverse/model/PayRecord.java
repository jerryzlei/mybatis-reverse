package com.example.mybatisreverse.model;

import java.math.BigDecimal;
import java.util.Date;

public class PayRecord {
    private Integer id;

    private BigDecimal amount;

    private Integer currency;

    private Date confirmDate;

    private Date submitDate;

    private Integer payMethod;

    private Integer status;

    private Long userId;

    private Integer type;

    private Long agentId;

    private Integer rechargegoal;

    private String rechargeUsername;

    private Integer fromPlatform;

    private BigDecimal accountUpdate;

    private String payRecordId;

    private Integer invoice;

    private Integer sources;

    private Integer incomeoroutcome;

    private String token;

    private BigDecimal refundFee;

    private Integer adminId;

    private String adminName;

    private String offlineChargeNo;

    private String remark;

    private String transactionId;

    private String rollInUsername;

    private BigDecimal couponUpdate;

    private BigDecimal rate;

    private String payParams;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Integer getRechargegoal() {
        return rechargegoal;
    }

    public void setRechargegoal(Integer rechargegoal) {
        this.rechargegoal = rechargegoal;
    }

    public String getRechargeUsername() {
        return rechargeUsername;
    }

    public void setRechargeUsername(String rechargeUsername) {
        this.rechargeUsername = rechargeUsername == null ? null : rechargeUsername.trim();
    }

    public Integer getFromPlatform() {
        return fromPlatform;
    }

    public void setFromPlatform(Integer fromPlatform) {
        this.fromPlatform = fromPlatform;
    }

    public BigDecimal getAccountUpdate() {
        return accountUpdate;
    }

    public void setAccountUpdate(BigDecimal accountUpdate) {
        this.accountUpdate = accountUpdate;
    }

    public String getPayRecordId() {
        return payRecordId;
    }

    public void setPayRecordId(String payRecordId) {
        this.payRecordId = payRecordId == null ? null : payRecordId.trim();
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public Integer getSources() {
        return sources;
    }

    public void setSources(Integer sources) {
        this.sources = sources;
    }

    public Integer getIncomeoroutcome() {
        return incomeoroutcome;
    }

    public void setIncomeoroutcome(Integer incomeoroutcome) {
        this.incomeoroutcome = incomeoroutcome;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public BigDecimal getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(BigDecimal refundFee) {
        this.refundFee = refundFee;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getOfflineChargeNo() {
        return offlineChargeNo;
    }

    public void setOfflineChargeNo(String offlineChargeNo) {
        this.offlineChargeNo = offlineChargeNo == null ? null : offlineChargeNo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public String getRollInUsername() {
        return rollInUsername;
    }

    public void setRollInUsername(String rollInUsername) {
        this.rollInUsername = rollInUsername == null ? null : rollInUsername.trim();
    }

    public BigDecimal getCouponUpdate() {
        return couponUpdate;
    }

    public void setCouponUpdate(BigDecimal couponUpdate) {
        this.couponUpdate = couponUpdate;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getPayParams() {
        return payParams;
    }

    public void setPayParams(String payParams) {
        this.payParams = payParams == null ? null : payParams.trim();
    }
}