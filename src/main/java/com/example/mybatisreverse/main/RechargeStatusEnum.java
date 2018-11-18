package com.example.mybatisreverse.main;

/**
 * @Author: 彭哲
 * @Description:客户充值状态枚举类
 * @CreateTime: 2017/6/16 12:00 Copyright Rayvision Software Co.Ltd. All right reserved.
 */
public enum RechargeStatusEnum {

    STATUS_PROCEEDING(1, "支付中", "PROCEEDING"),
    STATUS_SUCCUSS(2, "支付成功", "SUCCESS"),
    STATUS_CANCEL(3, "取消支付", "CANCEL"),
    STATUS_FAIL(4, "支付失败", "FAIL"),
    STATUS_REFUND(5, "退款", "REFUND"),
    STATUS_PENDING(6, "待确认收款", "PENDING"),
    STATUS_CONFIRMED(7, "已确认收款", "CONFIRMED");


    private Integer id;
    private String desc;
    private String status;

    RechargeStatusEnum(Integer id, String desc, String status) {
        this.id = id;
        this.desc = desc;
        this.status = status;
    }


    public static RechargeStatusEnum getDescById(Integer id) {
        for (RechargeStatusEnum typeEnum : RechargeStatusEnum.values()) {
            if (typeEnum.getId().equals(id)) {
                return typeEnum;
            }
        }
        return null;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
