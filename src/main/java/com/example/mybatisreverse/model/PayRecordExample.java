package com.example.mybatisreverse.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(Integer value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(Integer value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(Integer value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(Integer value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(Integer value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<Integer> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<Integer> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(Integer value1, Integer value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(Integer value1, Integer value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andConfirmDateIsNull() {
            addCriterion("confirm_date is null");
            return (Criteria) this;
        }

        public Criteria andConfirmDateIsNotNull() {
            addCriterion("confirm_date is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmDateEqualTo(Date value) {
            addCriterion("confirm_date =", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotEqualTo(Date value) {
            addCriterion("confirm_date <>", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateGreaterThan(Date value) {
            addCriterion("confirm_date >", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_date >=", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateLessThan(Date value) {
            addCriterion("confirm_date <", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateLessThanOrEqualTo(Date value) {
            addCriterion("confirm_date <=", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateIn(List<Date> values) {
            addCriterion("confirm_date in", values, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotIn(List<Date> values) {
            addCriterion("confirm_date not in", values, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateBetween(Date value1, Date value2) {
            addCriterion("confirm_date between", value1, value2, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotBetween(Date value1, Date value2) {
            addCriterion("confirm_date not between", value1, value2, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNull() {
            addCriterion("submit_date is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNotNull() {
            addCriterion("submit_date is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateEqualTo(Date value) {
            addCriterion("submit_date =", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotEqualTo(Date value) {
            addCriterion("submit_date <>", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThan(Date value) {
            addCriterion("submit_date >", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_date >=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThan(Date value) {
            addCriterion("submit_date <", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThanOrEqualTo(Date value) {
            addCriterion("submit_date <=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIn(List<Date> values) {
            addCriterion("submit_date in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotIn(List<Date> values) {
            addCriterion("submit_date not in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateBetween(Date value1, Date value2) {
            addCriterion("submit_date between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotBetween(Date value1, Date value2) {
            addCriterion("submit_date not between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("pay_method is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(Integer value) {
            addCriterion("pay_method =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(Integer value) {
            addCriterion("pay_method <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(Integer value) {
            addCriterion("pay_method >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_method >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(Integer value) {
            addCriterion("pay_method <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(Integer value) {
            addCriterion("pay_method <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<Integer> values) {
            addCriterion("pay_method in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<Integer> values) {
            addCriterion("pay_method not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(Integer value1, Integer value2) {
            addCriterion("pay_method between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_method not between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Long value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Long value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Long value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Long value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Long value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Long> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Long> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Long value1, Long value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Long value1, Long value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andRechargegoalIsNull() {
            addCriterion("rechargegoal is null");
            return (Criteria) this;
        }

        public Criteria andRechargegoalIsNotNull() {
            addCriterion("rechargegoal is not null");
            return (Criteria) this;
        }

        public Criteria andRechargegoalEqualTo(Integer value) {
            addCriterion("rechargegoal =", value, "rechargegoal");
            return (Criteria) this;
        }

        public Criteria andRechargegoalNotEqualTo(Integer value) {
            addCriterion("rechargegoal <>", value, "rechargegoal");
            return (Criteria) this;
        }

        public Criteria andRechargegoalGreaterThan(Integer value) {
            addCriterion("rechargegoal >", value, "rechargegoal");
            return (Criteria) this;
        }

        public Criteria andRechargegoalGreaterThanOrEqualTo(Integer value) {
            addCriterion("rechargegoal >=", value, "rechargegoal");
            return (Criteria) this;
        }

        public Criteria andRechargegoalLessThan(Integer value) {
            addCriterion("rechargegoal <", value, "rechargegoal");
            return (Criteria) this;
        }

        public Criteria andRechargegoalLessThanOrEqualTo(Integer value) {
            addCriterion("rechargegoal <=", value, "rechargegoal");
            return (Criteria) this;
        }

        public Criteria andRechargegoalIn(List<Integer> values) {
            addCriterion("rechargegoal in", values, "rechargegoal");
            return (Criteria) this;
        }

        public Criteria andRechargegoalNotIn(List<Integer> values) {
            addCriterion("rechargegoal not in", values, "rechargegoal");
            return (Criteria) this;
        }

        public Criteria andRechargegoalBetween(Integer value1, Integer value2) {
            addCriterion("rechargegoal between", value1, value2, "rechargegoal");
            return (Criteria) this;
        }

        public Criteria andRechargegoalNotBetween(Integer value1, Integer value2) {
            addCriterion("rechargegoal not between", value1, value2, "rechargegoal");
            return (Criteria) this;
        }

        public Criteria andRechargeUsernameIsNull() {
            addCriterion("recharge_username is null");
            return (Criteria) this;
        }

        public Criteria andRechargeUsernameIsNotNull() {
            addCriterion("recharge_username is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeUsernameEqualTo(String value) {
            addCriterion("recharge_username =", value, "rechargeUsername");
            return (Criteria) this;
        }

        public Criteria andRechargeUsernameNotEqualTo(String value) {
            addCriterion("recharge_username <>", value, "rechargeUsername");
            return (Criteria) this;
        }

        public Criteria andRechargeUsernameGreaterThan(String value) {
            addCriterion("recharge_username >", value, "rechargeUsername");
            return (Criteria) this;
        }

        public Criteria andRechargeUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_username >=", value, "rechargeUsername");
            return (Criteria) this;
        }

        public Criteria andRechargeUsernameLessThan(String value) {
            addCriterion("recharge_username <", value, "rechargeUsername");
            return (Criteria) this;
        }

        public Criteria andRechargeUsernameLessThanOrEqualTo(String value) {
            addCriterion("recharge_username <=", value, "rechargeUsername");
            return (Criteria) this;
        }

        public Criteria andRechargeUsernameLike(String value) {
            addCriterion("recharge_username like", value, "rechargeUsername");
            return (Criteria) this;
        }

        public Criteria andRechargeUsernameNotLike(String value) {
            addCriterion("recharge_username not like", value, "rechargeUsername");
            return (Criteria) this;
        }

        public Criteria andRechargeUsernameIn(List<String> values) {
            addCriterion("recharge_username in", values, "rechargeUsername");
            return (Criteria) this;
        }

        public Criteria andRechargeUsernameNotIn(List<String> values) {
            addCriterion("recharge_username not in", values, "rechargeUsername");
            return (Criteria) this;
        }

        public Criteria andRechargeUsernameBetween(String value1, String value2) {
            addCriterion("recharge_username between", value1, value2, "rechargeUsername");
            return (Criteria) this;
        }

        public Criteria andRechargeUsernameNotBetween(String value1, String value2) {
            addCriterion("recharge_username not between", value1, value2, "rechargeUsername");
            return (Criteria) this;
        }

        public Criteria andFromPlatformIsNull() {
            addCriterion("from_platform is null");
            return (Criteria) this;
        }

        public Criteria andFromPlatformIsNotNull() {
            addCriterion("from_platform is not null");
            return (Criteria) this;
        }

        public Criteria andFromPlatformEqualTo(Integer value) {
            addCriterion("from_platform =", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNotEqualTo(Integer value) {
            addCriterion("from_platform <>", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformGreaterThan(Integer value) {
            addCriterion("from_platform >", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_platform >=", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformLessThan(Integer value) {
            addCriterion("from_platform <", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformLessThanOrEqualTo(Integer value) {
            addCriterion("from_platform <=", value, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformIn(List<Integer> values) {
            addCriterion("from_platform in", values, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNotIn(List<Integer> values) {
            addCriterion("from_platform not in", values, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformBetween(Integer value1, Integer value2) {
            addCriterion("from_platform between", value1, value2, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("from_platform not between", value1, value2, "fromPlatform");
            return (Criteria) this;
        }

        public Criteria andAccountUpdateIsNull() {
            addCriterion("account_update is null");
            return (Criteria) this;
        }

        public Criteria andAccountUpdateIsNotNull() {
            addCriterion("account_update is not null");
            return (Criteria) this;
        }

        public Criteria andAccountUpdateEqualTo(BigDecimal value) {
            addCriterion("account_update =", value, "accountUpdate");
            return (Criteria) this;
        }

        public Criteria andAccountUpdateNotEqualTo(BigDecimal value) {
            addCriterion("account_update <>", value, "accountUpdate");
            return (Criteria) this;
        }

        public Criteria andAccountUpdateGreaterThan(BigDecimal value) {
            addCriterion("account_update >", value, "accountUpdate");
            return (Criteria) this;
        }

        public Criteria andAccountUpdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("account_update >=", value, "accountUpdate");
            return (Criteria) this;
        }

        public Criteria andAccountUpdateLessThan(BigDecimal value) {
            addCriterion("account_update <", value, "accountUpdate");
            return (Criteria) this;
        }

        public Criteria andAccountUpdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("account_update <=", value, "accountUpdate");
            return (Criteria) this;
        }

        public Criteria andAccountUpdateIn(List<BigDecimal> values) {
            addCriterion("account_update in", values, "accountUpdate");
            return (Criteria) this;
        }

        public Criteria andAccountUpdateNotIn(List<BigDecimal> values) {
            addCriterion("account_update not in", values, "accountUpdate");
            return (Criteria) this;
        }

        public Criteria andAccountUpdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_update between", value1, value2, "accountUpdate");
            return (Criteria) this;
        }

        public Criteria andAccountUpdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_update not between", value1, value2, "accountUpdate");
            return (Criteria) this;
        }

        public Criteria andPayRecordIdIsNull() {
            addCriterion("pay_record_id is null");
            return (Criteria) this;
        }

        public Criteria andPayRecordIdIsNotNull() {
            addCriterion("pay_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayRecordIdEqualTo(String value) {
            addCriterion("pay_record_id =", value, "payRecordId");
            return (Criteria) this;
        }

        public Criteria andPayRecordIdNotEqualTo(String value) {
            addCriterion("pay_record_id <>", value, "payRecordId");
            return (Criteria) this;
        }

        public Criteria andPayRecordIdGreaterThan(String value) {
            addCriterion("pay_record_id >", value, "payRecordId");
            return (Criteria) this;
        }

        public Criteria andPayRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_record_id >=", value, "payRecordId");
            return (Criteria) this;
        }

        public Criteria andPayRecordIdLessThan(String value) {
            addCriterion("pay_record_id <", value, "payRecordId");
            return (Criteria) this;
        }

        public Criteria andPayRecordIdLessThanOrEqualTo(String value) {
            addCriterion("pay_record_id <=", value, "payRecordId");
            return (Criteria) this;
        }

        public Criteria andPayRecordIdLike(String value) {
            addCriterion("pay_record_id like", value, "payRecordId");
            return (Criteria) this;
        }

        public Criteria andPayRecordIdNotLike(String value) {
            addCriterion("pay_record_id not like", value, "payRecordId");
            return (Criteria) this;
        }

        public Criteria andPayRecordIdIn(List<String> values) {
            addCriterion("pay_record_id in", values, "payRecordId");
            return (Criteria) this;
        }

        public Criteria andPayRecordIdNotIn(List<String> values) {
            addCriterion("pay_record_id not in", values, "payRecordId");
            return (Criteria) this;
        }

        public Criteria andPayRecordIdBetween(String value1, String value2) {
            addCriterion("pay_record_id between", value1, value2, "payRecordId");
            return (Criteria) this;
        }

        public Criteria andPayRecordIdNotBetween(String value1, String value2) {
            addCriterion("pay_record_id not between", value1, value2, "payRecordId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(Integer value) {
            addCriterion("invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(Integer value) {
            addCriterion("invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(Integer value) {
            addCriterion("invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(Integer value) {
            addCriterion("invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<Integer> values) {
            addCriterion("invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<Integer> values) {
            addCriterion("invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(Integer value1, Integer value2) {
            addCriterion("invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andSourcesIsNull() {
            addCriterion("sources is null");
            return (Criteria) this;
        }

        public Criteria andSourcesIsNotNull() {
            addCriterion("sources is not null");
            return (Criteria) this;
        }

        public Criteria andSourcesEqualTo(Integer value) {
            addCriterion("sources =", value, "sources");
            return (Criteria) this;
        }

        public Criteria andSourcesNotEqualTo(Integer value) {
            addCriterion("sources <>", value, "sources");
            return (Criteria) this;
        }

        public Criteria andSourcesGreaterThan(Integer value) {
            addCriterion("sources >", value, "sources");
            return (Criteria) this;
        }

        public Criteria andSourcesGreaterThanOrEqualTo(Integer value) {
            addCriterion("sources >=", value, "sources");
            return (Criteria) this;
        }

        public Criteria andSourcesLessThan(Integer value) {
            addCriterion("sources <", value, "sources");
            return (Criteria) this;
        }

        public Criteria andSourcesLessThanOrEqualTo(Integer value) {
            addCriterion("sources <=", value, "sources");
            return (Criteria) this;
        }

        public Criteria andSourcesIn(List<Integer> values) {
            addCriterion("sources in", values, "sources");
            return (Criteria) this;
        }

        public Criteria andSourcesNotIn(List<Integer> values) {
            addCriterion("sources not in", values, "sources");
            return (Criteria) this;
        }

        public Criteria andSourcesBetween(Integer value1, Integer value2) {
            addCriterion("sources between", value1, value2, "sources");
            return (Criteria) this;
        }

        public Criteria andSourcesNotBetween(Integer value1, Integer value2) {
            addCriterion("sources not between", value1, value2, "sources");
            return (Criteria) this;
        }

        public Criteria andIncomeoroutcomeIsNull() {
            addCriterion("incomeoroutcome is null");
            return (Criteria) this;
        }

        public Criteria andIncomeoroutcomeIsNotNull() {
            addCriterion("incomeoroutcome is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeoroutcomeEqualTo(Integer value) {
            addCriterion("incomeoroutcome =", value, "incomeoroutcome");
            return (Criteria) this;
        }

        public Criteria andIncomeoroutcomeNotEqualTo(Integer value) {
            addCriterion("incomeoroutcome <>", value, "incomeoroutcome");
            return (Criteria) this;
        }

        public Criteria andIncomeoroutcomeGreaterThan(Integer value) {
            addCriterion("incomeoroutcome >", value, "incomeoroutcome");
            return (Criteria) this;
        }

        public Criteria andIncomeoroutcomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("incomeoroutcome >=", value, "incomeoroutcome");
            return (Criteria) this;
        }

        public Criteria andIncomeoroutcomeLessThan(Integer value) {
            addCriterion("incomeoroutcome <", value, "incomeoroutcome");
            return (Criteria) this;
        }

        public Criteria andIncomeoroutcomeLessThanOrEqualTo(Integer value) {
            addCriterion("incomeoroutcome <=", value, "incomeoroutcome");
            return (Criteria) this;
        }

        public Criteria andIncomeoroutcomeIn(List<Integer> values) {
            addCriterion("incomeoroutcome in", values, "incomeoroutcome");
            return (Criteria) this;
        }

        public Criteria andIncomeoroutcomeNotIn(List<Integer> values) {
            addCriterion("incomeoroutcome not in", values, "incomeoroutcome");
            return (Criteria) this;
        }

        public Criteria andIncomeoroutcomeBetween(Integer value1, Integer value2) {
            addCriterion("incomeoroutcome between", value1, value2, "incomeoroutcome");
            return (Criteria) this;
        }

        public Criteria andIncomeoroutcomeNotBetween(Integer value1, Integer value2) {
            addCriterion("incomeoroutcome not between", value1, value2, "incomeoroutcome");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIsNull() {
            addCriterion("refund_fee is null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIsNotNull() {
            addCriterion("refund_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeEqualTo(BigDecimal value) {
            addCriterion("refund_fee =", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotEqualTo(BigDecimal value) {
            addCriterion("refund_fee <>", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeGreaterThan(BigDecimal value) {
            addCriterion("refund_fee >", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_fee >=", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLessThan(BigDecimal value) {
            addCriterion("refund_fee <", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_fee <=", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIn(List<BigDecimal> values) {
            addCriterion("refund_fee in", values, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotIn(List<BigDecimal> values) {
            addCriterion("refund_fee not in", values, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_fee between", value1, value2, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_fee not between", value1, value2, "refundFee");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andOfflineChargeNoIsNull() {
            addCriterion("offline_charge_no is null");
            return (Criteria) this;
        }

        public Criteria andOfflineChargeNoIsNotNull() {
            addCriterion("offline_charge_no is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineChargeNoEqualTo(String value) {
            addCriterion("offline_charge_no =", value, "offlineChargeNo");
            return (Criteria) this;
        }

        public Criteria andOfflineChargeNoNotEqualTo(String value) {
            addCriterion("offline_charge_no <>", value, "offlineChargeNo");
            return (Criteria) this;
        }

        public Criteria andOfflineChargeNoGreaterThan(String value) {
            addCriterion("offline_charge_no >", value, "offlineChargeNo");
            return (Criteria) this;
        }

        public Criteria andOfflineChargeNoGreaterThanOrEqualTo(String value) {
            addCriterion("offline_charge_no >=", value, "offlineChargeNo");
            return (Criteria) this;
        }

        public Criteria andOfflineChargeNoLessThan(String value) {
            addCriterion("offline_charge_no <", value, "offlineChargeNo");
            return (Criteria) this;
        }

        public Criteria andOfflineChargeNoLessThanOrEqualTo(String value) {
            addCriterion("offline_charge_no <=", value, "offlineChargeNo");
            return (Criteria) this;
        }

        public Criteria andOfflineChargeNoLike(String value) {
            addCriterion("offline_charge_no like", value, "offlineChargeNo");
            return (Criteria) this;
        }

        public Criteria andOfflineChargeNoNotLike(String value) {
            addCriterion("offline_charge_no not like", value, "offlineChargeNo");
            return (Criteria) this;
        }

        public Criteria andOfflineChargeNoIn(List<String> values) {
            addCriterion("offline_charge_no in", values, "offlineChargeNo");
            return (Criteria) this;
        }

        public Criteria andOfflineChargeNoNotIn(List<String> values) {
            addCriterion("offline_charge_no not in", values, "offlineChargeNo");
            return (Criteria) this;
        }

        public Criteria andOfflineChargeNoBetween(String value1, String value2) {
            addCriterion("offline_charge_no between", value1, value2, "offlineChargeNo");
            return (Criteria) this;
        }

        public Criteria andOfflineChargeNoNotBetween(String value1, String value2) {
            addCriterion("offline_charge_no not between", value1, value2, "offlineChargeNo");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andRollInUsernameIsNull() {
            addCriterion("roll_in_username is null");
            return (Criteria) this;
        }

        public Criteria andRollInUsernameIsNotNull() {
            addCriterion("roll_in_username is not null");
            return (Criteria) this;
        }

        public Criteria andRollInUsernameEqualTo(String value) {
            addCriterion("roll_in_username =", value, "rollInUsername");
            return (Criteria) this;
        }

        public Criteria andRollInUsernameNotEqualTo(String value) {
            addCriterion("roll_in_username <>", value, "rollInUsername");
            return (Criteria) this;
        }

        public Criteria andRollInUsernameGreaterThan(String value) {
            addCriterion("roll_in_username >", value, "rollInUsername");
            return (Criteria) this;
        }

        public Criteria andRollInUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("roll_in_username >=", value, "rollInUsername");
            return (Criteria) this;
        }

        public Criteria andRollInUsernameLessThan(String value) {
            addCriterion("roll_in_username <", value, "rollInUsername");
            return (Criteria) this;
        }

        public Criteria andRollInUsernameLessThanOrEqualTo(String value) {
            addCriterion("roll_in_username <=", value, "rollInUsername");
            return (Criteria) this;
        }

        public Criteria andRollInUsernameLike(String value) {
            addCriterion("roll_in_username like", value, "rollInUsername");
            return (Criteria) this;
        }

        public Criteria andRollInUsernameNotLike(String value) {
            addCriterion("roll_in_username not like", value, "rollInUsername");
            return (Criteria) this;
        }

        public Criteria andRollInUsernameIn(List<String> values) {
            addCriterion("roll_in_username in", values, "rollInUsername");
            return (Criteria) this;
        }

        public Criteria andRollInUsernameNotIn(List<String> values) {
            addCriterion("roll_in_username not in", values, "rollInUsername");
            return (Criteria) this;
        }

        public Criteria andRollInUsernameBetween(String value1, String value2) {
            addCriterion("roll_in_username between", value1, value2, "rollInUsername");
            return (Criteria) this;
        }

        public Criteria andRollInUsernameNotBetween(String value1, String value2) {
            addCriterion("roll_in_username not between", value1, value2, "rollInUsername");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateIsNull() {
            addCriterion("coupon_update is null");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateIsNotNull() {
            addCriterion("coupon_update is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateEqualTo(BigDecimal value) {
            addCriterion("coupon_update =", value, "couponUpdate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateNotEqualTo(BigDecimal value) {
            addCriterion("coupon_update <>", value, "couponUpdate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateGreaterThan(BigDecimal value) {
            addCriterion("coupon_update >", value, "couponUpdate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_update >=", value, "couponUpdate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateLessThan(BigDecimal value) {
            addCriterion("coupon_update <", value, "couponUpdate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_update <=", value, "couponUpdate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateIn(List<BigDecimal> values) {
            addCriterion("coupon_update in", values, "couponUpdate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateNotIn(List<BigDecimal> values) {
            addCriterion("coupon_update not in", values, "couponUpdate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_update between", value1, value2, "couponUpdate");
            return (Criteria) this;
        }

        public Criteria andCouponUpdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_update not between", value1, value2, "couponUpdate");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}