package com.connext.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsgExample() {
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

        public Criteria andMsgidIsNull() {
            addCriterion("msgid is null");
            return (Criteria) this;
        }

        public Criteria andMsgidIsNotNull() {
            addCriterion("msgid is not null");
            return (Criteria) this;
        }

        public Criteria andMsgidEqualTo(Integer value) {
            addCriterion("msgid =", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotEqualTo(Integer value) {
            addCriterion("msgid <>", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidGreaterThan(Integer value) {
            addCriterion("msgid >", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("msgid >=", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidLessThan(Integer value) {
            addCriterion("msgid <", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidLessThanOrEqualTo(Integer value) {
            addCriterion("msgid <=", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidIn(List<Integer> values) {
            addCriterion("msgid in", values, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotIn(List<Integer> values) {
            addCriterion("msgid not in", values, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidBetween(Integer value1, Integer value2) {
            addCriterion("msgid between", value1, value2, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotBetween(Integer value1, Integer value2) {
            addCriterion("msgid not between", value1, value2, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgtitleIsNull() {
            addCriterion("msgtitle is null");
            return (Criteria) this;
        }

        public Criteria andMsgtitleIsNotNull() {
            addCriterion("msgtitle is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtitleEqualTo(String value) {
            addCriterion("msgtitle =", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleNotEqualTo(String value) {
            addCriterion("msgtitle <>", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleGreaterThan(String value) {
            addCriterion("msgtitle >", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleGreaterThanOrEqualTo(String value) {
            addCriterion("msgtitle >=", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleLessThan(String value) {
            addCriterion("msgtitle <", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleLessThanOrEqualTo(String value) {
            addCriterion("msgtitle <=", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleLike(String value) {
            addCriterion("msgtitle like", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleNotLike(String value) {
            addCriterion("msgtitle not like", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleIn(List<String> values) {
            addCriterion("msgtitle in", values, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleNotIn(List<String> values) {
            addCriterion("msgtitle not in", values, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleBetween(String value1, String value2) {
            addCriterion("msgtitle between", value1, value2, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleNotBetween(String value1, String value2) {
            addCriterion("msgtitle not between", value1, value2, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgdateIsNull() {
            addCriterion("msgdate is null");
            return (Criteria) this;
        }

        public Criteria andMsgdateIsNotNull() {
            addCriterion("msgdate is not null");
            return (Criteria) this;
        }

        public Criteria andMsgdateEqualTo(Date value) {
            addCriterion("msgdate =", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateNotEqualTo(Date value) {
            addCriterion("msgdate <>", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateGreaterThan(Date value) {
            addCriterion("msgdate >", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateGreaterThanOrEqualTo(Date value) {
            addCriterion("msgdate >=", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateLessThan(Date value) {
            addCriterion("msgdate <", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateLessThanOrEqualTo(Date value) {
            addCriterion("msgdate <=", value, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateIn(List<Date> values) {
            addCriterion("msgdate in", values, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateNotIn(List<Date> values) {
            addCriterion("msgdate not in", values, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateBetween(Date value1, Date value2) {
            addCriterion("msgdate between", value1, value2, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgdateNotBetween(Date value1, Date value2) {
            addCriterion("msgdate not between", value1, value2, "msgdate");
            return (Criteria) this;
        }

        public Criteria andMsgcontentIsNull() {
            addCriterion("msgcontent is null");
            return (Criteria) this;
        }

        public Criteria andMsgcontentIsNotNull() {
            addCriterion("msgcontent is not null");
            return (Criteria) this;
        }

        public Criteria andMsgcontentEqualTo(String value) {
            addCriterion("msgcontent =", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotEqualTo(String value) {
            addCriterion("msgcontent <>", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentGreaterThan(String value) {
            addCriterion("msgcontent >", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentGreaterThanOrEqualTo(String value) {
            addCriterion("msgcontent >=", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentLessThan(String value) {
            addCriterion("msgcontent <", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentLessThanOrEqualTo(String value) {
            addCriterion("msgcontent <=", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentLike(String value) {
            addCriterion("msgcontent like", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotLike(String value) {
            addCriterion("msgcontent not like", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentIn(List<String> values) {
            addCriterion("msgcontent in", values, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotIn(List<String> values) {
            addCriterion("msgcontent not in", values, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentBetween(String value1, String value2) {
            addCriterion("msgcontent between", value1, value2, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotBetween(String value1, String value2) {
            addCriterion("msgcontent not between", value1, value2, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsguserIsNull() {
            addCriterion("msguser is null");
            return (Criteria) this;
        }

        public Criteria andMsguserIsNotNull() {
            addCriterion("msguser is not null");
            return (Criteria) this;
        }

        public Criteria andMsguserEqualTo(String value) {
            addCriterion("msguser =", value, "msguser");
            return (Criteria) this;
        }

        public Criteria andMsguserNotEqualTo(String value) {
            addCriterion("msguser <>", value, "msguser");
            return (Criteria) this;
        }

        public Criteria andMsguserGreaterThan(String value) {
            addCriterion("msguser >", value, "msguser");
            return (Criteria) this;
        }

        public Criteria andMsguserGreaterThanOrEqualTo(String value) {
            addCriterion("msguser >=", value, "msguser");
            return (Criteria) this;
        }

        public Criteria andMsguserLessThan(String value) {
            addCriterion("msguser <", value, "msguser");
            return (Criteria) this;
        }

        public Criteria andMsguserLessThanOrEqualTo(String value) {
            addCriterion("msguser <=", value, "msguser");
            return (Criteria) this;
        }

        public Criteria andMsguserLike(String value) {
            addCriterion("msguser like", value, "msguser");
            return (Criteria) this;
        }

        public Criteria andMsguserNotLike(String value) {
            addCriterion("msguser not like", value, "msguser");
            return (Criteria) this;
        }

        public Criteria andMsguserIn(List<String> values) {
            addCriterion("msguser in", values, "msguser");
            return (Criteria) this;
        }

        public Criteria andMsguserNotIn(List<String> values) {
            addCriterion("msguser not in", values, "msguser");
            return (Criteria) this;
        }

        public Criteria andMsguserBetween(String value1, String value2) {
            addCriterion("msguser between", value1, value2, "msguser");
            return (Criteria) this;
        }

        public Criteria andMsguserNotBetween(String value1, String value2) {
            addCriterion("msguser not between", value1, value2, "msguser");
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