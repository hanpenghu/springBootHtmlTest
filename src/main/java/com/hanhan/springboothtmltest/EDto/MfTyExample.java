package main.java.com.hanhan.springboothtmltest.EDto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MfTyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MfTyExample() {
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

        public Criteria andTyIdIsNull() {
            addCriterion("TY_ID is null");
            return (Criteria) this;
        }

        public Criteria andTyIdIsNotNull() {
            addCriterion("TY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTyIdEqualTo(String value) {
            addCriterion("TY_ID =", value, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdNotEqualTo(String value) {
            addCriterion("TY_ID <>", value, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdGreaterThan(String value) {
            addCriterion("TY_ID >", value, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdGreaterThanOrEqualTo(String value) {
            addCriterion("TY_ID >=", value, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdLessThan(String value) {
            addCriterion("TY_ID <", value, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdLessThanOrEqualTo(String value) {
            addCriterion("TY_ID <=", value, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdLike(String value) {
            addCriterion("TY_ID like", value, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdNotLike(String value) {
            addCriterion("TY_ID not like", value, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdIn(List<String> values) {
            addCriterion("TY_ID in", values, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdNotIn(List<String> values) {
            addCriterion("TY_ID not in", values, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdBetween(String value1, String value2) {
            addCriterion("TY_ID between", value1, value2, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyIdNotBetween(String value1, String value2) {
            addCriterion("TY_ID not between", value1, value2, "tyId");
            return (Criteria) this;
        }

        public Criteria andTyNoIsNull() {
            addCriterion("TY_NO is null");
            return (Criteria) this;
        }

        public Criteria andTyNoIsNotNull() {
            addCriterion("TY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTyNoEqualTo(String value) {
            addCriterion("TY_NO =", value, "tyNo");
            return (Criteria) this;
        }

        public Criteria andTyNoNotEqualTo(String value) {
            addCriterion("TY_NO <>", value, "tyNo");
            return (Criteria) this;
        }

        public Criteria andTyNoGreaterThan(String value) {
            addCriterion("TY_NO >", value, "tyNo");
            return (Criteria) this;
        }

        public Criteria andTyNoGreaterThanOrEqualTo(String value) {
            addCriterion("TY_NO >=", value, "tyNo");
            return (Criteria) this;
        }

        public Criteria andTyNoLessThan(String value) {
            addCriterion("TY_NO <", value, "tyNo");
            return (Criteria) this;
        }

        public Criteria andTyNoLessThanOrEqualTo(String value) {
            addCriterion("TY_NO <=", value, "tyNo");
            return (Criteria) this;
        }

        public Criteria andTyNoLike(String value) {
            addCriterion("TY_NO like", value, "tyNo");
            return (Criteria) this;
        }

        public Criteria andTyNoNotLike(String value) {
            addCriterion("TY_NO not like", value, "tyNo");
            return (Criteria) this;
        }

        public Criteria andTyNoIn(List<String> values) {
            addCriterion("TY_NO in", values, "tyNo");
            return (Criteria) this;
        }

        public Criteria andTyNoNotIn(List<String> values) {
            addCriterion("TY_NO not in", values, "tyNo");
            return (Criteria) this;
        }

        public Criteria andTyNoBetween(String value1, String value2) {
            addCriterion("TY_NO between", value1, value2, "tyNo");
            return (Criteria) this;
        }

        public Criteria andTyNoNotBetween(String value1, String value2) {
            addCriterion("TY_NO not between", value1, value2, "tyNo");
            return (Criteria) this;
        }

        public Criteria andTyDdIsNull() {
            addCriterion("TY_DD is null");
            return (Criteria) this;
        }

        public Criteria andTyDdIsNotNull() {
            addCriterion("TY_DD is not null");
            return (Criteria) this;
        }

        public Criteria andTyDdEqualTo(Date value) {
            addCriterion("TY_DD =", value, "tyDd");
            return (Criteria) this;
        }

        public Criteria andTyDdNotEqualTo(Date value) {
            addCriterion("TY_DD <>", value, "tyDd");
            return (Criteria) this;
        }

        public Criteria andTyDdGreaterThan(Date value) {
            addCriterion("TY_DD >", value, "tyDd");
            return (Criteria) this;
        }

        public Criteria andTyDdGreaterThanOrEqualTo(Date value) {
            addCriterion("TY_DD >=", value, "tyDd");
            return (Criteria) this;
        }

        public Criteria andTyDdLessThan(Date value) {
            addCriterion("TY_DD <", value, "tyDd");
            return (Criteria) this;
        }

        public Criteria andTyDdLessThanOrEqualTo(Date value) {
            addCriterion("TY_DD <=", value, "tyDd");
            return (Criteria) this;
        }

        public Criteria andTyDdIn(List<Date> values) {
            addCriterion("TY_DD in", values, "tyDd");
            return (Criteria) this;
        }

        public Criteria andTyDdNotIn(List<Date> values) {
            addCriterion("TY_DD not in", values, "tyDd");
            return (Criteria) this;
        }

        public Criteria andTyDdBetween(Date value1, Date value2) {
            addCriterion("TY_DD between", value1, value2, "tyDd");
            return (Criteria) this;
        }

        public Criteria andTyDdNotBetween(Date value1, Date value2) {
            addCriterion("TY_DD not between", value1, value2, "tyDd");
            return (Criteria) this;
        }

        public Criteria andSalNoIsNull() {
            addCriterion("SAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andSalNoIsNotNull() {
            addCriterion("SAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSalNoEqualTo(String value) {
            addCriterion("SAL_NO =", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotEqualTo(String value) {
            addCriterion("SAL_NO <>", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoGreaterThan(String value) {
            addCriterion("SAL_NO >", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoGreaterThanOrEqualTo(String value) {
            addCriterion("SAL_NO >=", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLessThan(String value) {
            addCriterion("SAL_NO <", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLessThanOrEqualTo(String value) {
            addCriterion("SAL_NO <=", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLike(String value) {
            addCriterion("SAL_NO like", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotLike(String value) {
            addCriterion("SAL_NO not like", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoIn(List<String> values) {
            addCriterion("SAL_NO in", values, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotIn(List<String> values) {
            addCriterion("SAL_NO not in", values, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoBetween(String value1, String value2) {
            addCriterion("SAL_NO between", value1, value2, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotBetween(String value1, String value2) {
            addCriterion("SAL_NO not between", value1, value2, "salNo");
            return (Criteria) this;
        }

        public Criteria andCloseIdIsNull() {
            addCriterion("CLOSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCloseIdIsNotNull() {
            addCriterion("CLOSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCloseIdEqualTo(String value) {
            addCriterion("CLOSE_ID =", value, "closeId");
            return (Criteria) this;
        }

        public Criteria andCloseIdNotEqualTo(String value) {
            addCriterion("CLOSE_ID <>", value, "closeId");
            return (Criteria) this;
        }

        public Criteria andCloseIdGreaterThan(String value) {
            addCriterion("CLOSE_ID >", value, "closeId");
            return (Criteria) this;
        }

        public Criteria andCloseIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLOSE_ID >=", value, "closeId");
            return (Criteria) this;
        }

        public Criteria andCloseIdLessThan(String value) {
            addCriterion("CLOSE_ID <", value, "closeId");
            return (Criteria) this;
        }

        public Criteria andCloseIdLessThanOrEqualTo(String value) {
            addCriterion("CLOSE_ID <=", value, "closeId");
            return (Criteria) this;
        }

        public Criteria andCloseIdLike(String value) {
            addCriterion("CLOSE_ID like", value, "closeId");
            return (Criteria) this;
        }

        public Criteria andCloseIdNotLike(String value) {
            addCriterion("CLOSE_ID not like", value, "closeId");
            return (Criteria) this;
        }

        public Criteria andCloseIdIn(List<String> values) {
            addCriterion("CLOSE_ID in", values, "closeId");
            return (Criteria) this;
        }

        public Criteria andCloseIdNotIn(List<String> values) {
            addCriterion("CLOSE_ID not in", values, "closeId");
            return (Criteria) this;
        }

        public Criteria andCloseIdBetween(String value1, String value2) {
            addCriterion("CLOSE_ID between", value1, value2, "closeId");
            return (Criteria) this;
        }

        public Criteria andCloseIdNotBetween(String value1, String value2) {
            addCriterion("CLOSE_ID not between", value1, value2, "closeId");
            return (Criteria) this;
        }

        public Criteria andCusNoIsNull() {
            addCriterion("CUS_NO is null");
            return (Criteria) this;
        }

        public Criteria andCusNoIsNotNull() {
            addCriterion("CUS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCusNoEqualTo(String value) {
            addCriterion("CUS_NO =", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotEqualTo(String value) {
            addCriterion("CUS_NO <>", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThan(String value) {
            addCriterion("CUS_NO >", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_NO >=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThan(String value) {
            addCriterion("CUS_NO <", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThanOrEqualTo(String value) {
            addCriterion("CUS_NO <=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLike(String value) {
            addCriterion("CUS_NO like", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotLike(String value) {
            addCriterion("CUS_NO not like", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoIn(List<String> values) {
            addCriterion("CUS_NO in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotIn(List<String> values) {
            addCriterion("CUS_NO not in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoBetween(String value1, String value2) {
            addCriterion("CUS_NO between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotBetween(String value1, String value2) {
            addCriterion("CUS_NO not between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andTiNoIsNull() {
            addCriterion("TI_NO is null");
            return (Criteria) this;
        }

        public Criteria andTiNoIsNotNull() {
            addCriterion("TI_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTiNoEqualTo(String value) {
            addCriterion("TI_NO =", value, "tiNo");
            return (Criteria) this;
        }

        public Criteria andTiNoNotEqualTo(String value) {
            addCriterion("TI_NO <>", value, "tiNo");
            return (Criteria) this;
        }

        public Criteria andTiNoGreaterThan(String value) {
            addCriterion("TI_NO >", value, "tiNo");
            return (Criteria) this;
        }

        public Criteria andTiNoGreaterThanOrEqualTo(String value) {
            addCriterion("TI_NO >=", value, "tiNo");
            return (Criteria) this;
        }

        public Criteria andTiNoLessThan(String value) {
            addCriterion("TI_NO <", value, "tiNo");
            return (Criteria) this;
        }

        public Criteria andTiNoLessThanOrEqualTo(String value) {
            addCriterion("TI_NO <=", value, "tiNo");
            return (Criteria) this;
        }

        public Criteria andTiNoLike(String value) {
            addCriterion("TI_NO like", value, "tiNo");
            return (Criteria) this;
        }

        public Criteria andTiNoNotLike(String value) {
            addCriterion("TI_NO not like", value, "tiNo");
            return (Criteria) this;
        }

        public Criteria andTiNoIn(List<String> values) {
            addCriterion("TI_NO in", values, "tiNo");
            return (Criteria) this;
        }

        public Criteria andTiNoNotIn(List<String> values) {
            addCriterion("TI_NO not in", values, "tiNo");
            return (Criteria) this;
        }

        public Criteria andTiNoBetween(String value1, String value2) {
            addCriterion("TI_NO between", value1, value2, "tiNo");
            return (Criteria) this;
        }

        public Criteria andTiNoNotBetween(String value1, String value2) {
            addCriterion("TI_NO not between", value1, value2, "tiNo");
            return (Criteria) this;
        }

        public Criteria andTbNoIsNull() {
            addCriterion("TB_NO is null");
            return (Criteria) this;
        }

        public Criteria andTbNoIsNotNull() {
            addCriterion("TB_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTbNoEqualTo(String value) {
            addCriterion("TB_NO =", value, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoNotEqualTo(String value) {
            addCriterion("TB_NO <>", value, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoGreaterThan(String value) {
            addCriterion("TB_NO >", value, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoGreaterThanOrEqualTo(String value) {
            addCriterion("TB_NO >=", value, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoLessThan(String value) {
            addCriterion("TB_NO <", value, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoLessThanOrEqualTo(String value) {
            addCriterion("TB_NO <=", value, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoLike(String value) {
            addCriterion("TB_NO like", value, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoNotLike(String value) {
            addCriterion("TB_NO not like", value, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoIn(List<String> values) {
            addCriterion("TB_NO in", values, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoNotIn(List<String> values) {
            addCriterion("TB_NO not in", values, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoBetween(String value1, String value2) {
            addCriterion("TB_NO between", value1, value2, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoNotBetween(String value1, String value2) {
            addCriterion("TB_NO not between", value1, value2, "tbNo");
            return (Criteria) this;
        }

        public Criteria andUsrIsNull() {
            addCriterion("USR is null");
            return (Criteria) this;
        }

        public Criteria andUsrIsNotNull() {
            addCriterion("USR is not null");
            return (Criteria) this;
        }

        public Criteria andUsrEqualTo(String value) {
            addCriterion("USR =", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotEqualTo(String value) {
            addCriterion("USR <>", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrGreaterThan(String value) {
            addCriterion("USR >", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrGreaterThanOrEqualTo(String value) {
            addCriterion("USR >=", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLessThan(String value) {
            addCriterion("USR <", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLessThanOrEqualTo(String value) {
            addCriterion("USR <=", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLike(String value) {
            addCriterion("USR like", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotLike(String value) {
            addCriterion("USR not like", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrIn(List<String> values) {
            addCriterion("USR in", values, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotIn(List<String> values) {
            addCriterion("USR not in", values, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrBetween(String value1, String value2) {
            addCriterion("USR between", value1, value2, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotBetween(String value1, String value2) {
            addCriterion("USR not between", value1, value2, "usr");
            return (Criteria) this;
        }

        public Criteria andChkManIsNull() {
            addCriterion("CHK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andChkManIsNotNull() {
            addCriterion("CHK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andChkManEqualTo(String value) {
            addCriterion("CHK_MAN =", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotEqualTo(String value) {
            addCriterion("CHK_MAN <>", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManGreaterThan(String value) {
            addCriterion("CHK_MAN >", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_MAN >=", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLessThan(String value) {
            addCriterion("CHK_MAN <", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLessThanOrEqualTo(String value) {
            addCriterion("CHK_MAN <=", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLike(String value) {
            addCriterion("CHK_MAN like", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotLike(String value) {
            addCriterion("CHK_MAN not like", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManIn(List<String> values) {
            addCriterion("CHK_MAN in", values, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotIn(List<String> values) {
            addCriterion("CHK_MAN not in", values, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManBetween(String value1, String value2) {
            addCriterion("CHK_MAN between", value1, value2, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotBetween(String value1, String value2) {
            addCriterion("CHK_MAN not between", value1, value2, "chkMan");
            return (Criteria) this;
        }

        public Criteria andPrtSwIsNull() {
            addCriterion("PRT_SW is null");
            return (Criteria) this;
        }

        public Criteria andPrtSwIsNotNull() {
            addCriterion("PRT_SW is not null");
            return (Criteria) this;
        }

        public Criteria andPrtSwEqualTo(String value) {
            addCriterion("PRT_SW =", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotEqualTo(String value) {
            addCriterion("PRT_SW <>", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwGreaterThan(String value) {
            addCriterion("PRT_SW >", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwGreaterThanOrEqualTo(String value) {
            addCriterion("PRT_SW >=", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwLessThan(String value) {
            addCriterion("PRT_SW <", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwLessThanOrEqualTo(String value) {
            addCriterion("PRT_SW <=", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwLike(String value) {
            addCriterion("PRT_SW like", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotLike(String value) {
            addCriterion("PRT_SW not like", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwIn(List<String> values) {
            addCriterion("PRT_SW in", values, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotIn(List<String> values) {
            addCriterion("PRT_SW not in", values, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwBetween(String value1, String value2) {
            addCriterion("PRT_SW between", value1, value2, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotBetween(String value1, String value2) {
            addCriterion("PRT_SW not between", value1, value2, "prtSw");
            return (Criteria) this;
        }

        public Criteria andCpySwIsNull() {
            addCriterion("CPY_SW is null");
            return (Criteria) this;
        }

        public Criteria andCpySwIsNotNull() {
            addCriterion("CPY_SW is not null");
            return (Criteria) this;
        }

        public Criteria andCpySwEqualTo(String value) {
            addCriterion("CPY_SW =", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotEqualTo(String value) {
            addCriterion("CPY_SW <>", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwGreaterThan(String value) {
            addCriterion("CPY_SW >", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwGreaterThanOrEqualTo(String value) {
            addCriterion("CPY_SW >=", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwLessThan(String value) {
            addCriterion("CPY_SW <", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwLessThanOrEqualTo(String value) {
            addCriterion("CPY_SW <=", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwLike(String value) {
            addCriterion("CPY_SW like", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotLike(String value) {
            addCriterion("CPY_SW not like", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwIn(List<String> values) {
            addCriterion("CPY_SW in", values, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotIn(List<String> values) {
            addCriterion("CPY_SW not in", values, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwBetween(String value1, String value2) {
            addCriterion("CPY_SW between", value1, value2, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotBetween(String value1, String value2) {
            addCriterion("CPY_SW not between", value1, value2, "cpySw");
            return (Criteria) this;
        }

        public Criteria andPreClsIdIsNull() {
            addCriterion("PRE_CLS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPreClsIdIsNotNull() {
            addCriterion("PRE_CLS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPreClsIdEqualTo(String value) {
            addCriterion("PRE_CLS_ID =", value, "preClsId");
            return (Criteria) this;
        }

        public Criteria andPreClsIdNotEqualTo(String value) {
            addCriterion("PRE_CLS_ID <>", value, "preClsId");
            return (Criteria) this;
        }

        public Criteria andPreClsIdGreaterThan(String value) {
            addCriterion("PRE_CLS_ID >", value, "preClsId");
            return (Criteria) this;
        }

        public Criteria andPreClsIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_CLS_ID >=", value, "preClsId");
            return (Criteria) this;
        }

        public Criteria andPreClsIdLessThan(String value) {
            addCriterion("PRE_CLS_ID <", value, "preClsId");
            return (Criteria) this;
        }

        public Criteria andPreClsIdLessThanOrEqualTo(String value) {
            addCriterion("PRE_CLS_ID <=", value, "preClsId");
            return (Criteria) this;
        }

        public Criteria andPreClsIdLike(String value) {
            addCriterion("PRE_CLS_ID like", value, "preClsId");
            return (Criteria) this;
        }

        public Criteria andPreClsIdNotLike(String value) {
            addCriterion("PRE_CLS_ID not like", value, "preClsId");
            return (Criteria) this;
        }

        public Criteria andPreClsIdIn(List<String> values) {
            addCriterion("PRE_CLS_ID in", values, "preClsId");
            return (Criteria) this;
        }

        public Criteria andPreClsIdNotIn(List<String> values) {
            addCriterion("PRE_CLS_ID not in", values, "preClsId");
            return (Criteria) this;
        }

        public Criteria andPreClsIdBetween(String value1, String value2) {
            addCriterion("PRE_CLS_ID between", value1, value2, "preClsId");
            return (Criteria) this;
        }

        public Criteria andPreClsIdNotBetween(String value1, String value2) {
            addCriterion("PRE_CLS_ID not between", value1, value2, "preClsId");
            return (Criteria) this;
        }

        public Criteria andPrdListIsNull() {
            addCriterion("PRD_LIST is null");
            return (Criteria) this;
        }

        public Criteria andPrdListIsNotNull() {
            addCriterion("PRD_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andPrdListEqualTo(String value) {
            addCriterion("PRD_LIST =", value, "prdList");
            return (Criteria) this;
        }

        public Criteria andPrdListNotEqualTo(String value) {
            addCriterion("PRD_LIST <>", value, "prdList");
            return (Criteria) this;
        }

        public Criteria andPrdListGreaterThan(String value) {
            addCriterion("PRD_LIST >", value, "prdList");
            return (Criteria) this;
        }

        public Criteria andPrdListGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_LIST >=", value, "prdList");
            return (Criteria) this;
        }

        public Criteria andPrdListLessThan(String value) {
            addCriterion("PRD_LIST <", value, "prdList");
            return (Criteria) this;
        }

        public Criteria andPrdListLessThanOrEqualTo(String value) {
            addCriterion("PRD_LIST <=", value, "prdList");
            return (Criteria) this;
        }

        public Criteria andPrdListLike(String value) {
            addCriterion("PRD_LIST like", value, "prdList");
            return (Criteria) this;
        }

        public Criteria andPrdListNotLike(String value) {
            addCriterion("PRD_LIST not like", value, "prdList");
            return (Criteria) this;
        }

        public Criteria andPrdListIn(List<String> values) {
            addCriterion("PRD_LIST in", values, "prdList");
            return (Criteria) this;
        }

        public Criteria andPrdListNotIn(List<String> values) {
            addCriterion("PRD_LIST not in", values, "prdList");
            return (Criteria) this;
        }

        public Criteria andPrdListBetween(String value1, String value2) {
            addCriterion("PRD_LIST between", value1, value2, "prdList");
            return (Criteria) this;
        }

        public Criteria andPrdListNotBetween(String value1, String value2) {
            addCriterion("PRD_LIST not between", value1, value2, "prdList");
            return (Criteria) this;
        }

        public Criteria andBilNoIsNull() {
            addCriterion("BIL_NO is null");
            return (Criteria) this;
        }

        public Criteria andBilNoIsNotNull() {
            addCriterion("BIL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBilNoEqualTo(String value) {
            addCriterion("BIL_NO =", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotEqualTo(String value) {
            addCriterion("BIL_NO <>", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoGreaterThan(String value) {
            addCriterion("BIL_NO >", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_NO >=", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoLessThan(String value) {
            addCriterion("BIL_NO <", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoLessThanOrEqualTo(String value) {
            addCriterion("BIL_NO <=", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoLike(String value) {
            addCriterion("BIL_NO like", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotLike(String value) {
            addCriterion("BIL_NO not like", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoIn(List<String> values) {
            addCriterion("BIL_NO in", values, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotIn(List<String> values) {
            addCriterion("BIL_NO not in", values, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoBetween(String value1, String value2) {
            addCriterion("BIL_NO between", value1, value2, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotBetween(String value1, String value2) {
            addCriterion("BIL_NO not between", value1, value2, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilIdIsNull() {
            addCriterion("BIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBilIdIsNotNull() {
            addCriterion("BIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBilIdEqualTo(String value) {
            addCriterion("BIL_ID =", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotEqualTo(String value) {
            addCriterion("BIL_ID <>", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdGreaterThan(String value) {
            addCriterion("BIL_ID >", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_ID >=", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdLessThan(String value) {
            addCriterion("BIL_ID <", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdLessThanOrEqualTo(String value) {
            addCriterion("BIL_ID <=", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdLike(String value) {
            addCriterion("BIL_ID like", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotLike(String value) {
            addCriterion("BIL_ID not like", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdIn(List<String> values) {
            addCriterion("BIL_ID in", values, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotIn(List<String> values) {
            addCriterion("BIL_ID not in", values, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdBetween(String value1, String value2) {
            addCriterion("BIL_ID between", value1, value2, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotBetween(String value1, String value2) {
            addCriterion("BIL_ID not between", value1, value2, "bilId");
            return (Criteria) this;
        }

        public Criteria andClsDateIsNull() {
            addCriterion("CLS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andClsDateIsNotNull() {
            addCriterion("CLS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andClsDateEqualTo(Date value) {
            addCriterion("CLS_DATE =", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotEqualTo(Date value) {
            addCriterion("CLS_DATE <>", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateGreaterThan(Date value) {
            addCriterion("CLS_DATE >", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CLS_DATE >=", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateLessThan(Date value) {
            addCriterion("CLS_DATE <", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateLessThanOrEqualTo(Date value) {
            addCriterion("CLS_DATE <=", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateIn(List<Date> values) {
            addCriterion("CLS_DATE in", values, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotIn(List<Date> values) {
            addCriterion("CLS_DATE not in", values, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateBetween(Date value1, Date value2) {
            addCriterion("CLS_DATE between", value1, value2, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotBetween(Date value1, Date value2) {
            addCriterion("CLS_DATE not between", value1, value2, "clsDate");
            return (Criteria) this;
        }

        public Criteria andOlefieldIsNull() {
            addCriterion("OLEFIELD is null");
            return (Criteria) this;
        }

        public Criteria andOlefieldIsNotNull() {
            addCriterion("OLEFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andOlefieldEqualTo(String value) {
            addCriterion("OLEFIELD =", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldNotEqualTo(String value) {
            addCriterion("OLEFIELD <>", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldGreaterThan(String value) {
            addCriterion("OLEFIELD >", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldGreaterThanOrEqualTo(String value) {
            addCriterion("OLEFIELD >=", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldLessThan(String value) {
            addCriterion("OLEFIELD <", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldLessThanOrEqualTo(String value) {
            addCriterion("OLEFIELD <=", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldLike(String value) {
            addCriterion("OLEFIELD like", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldNotLike(String value) {
            addCriterion("OLEFIELD not like", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldIn(List<String> values) {
            addCriterion("OLEFIELD in", values, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldNotIn(List<String> values) {
            addCriterion("OLEFIELD not in", values, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldBetween(String value1, String value2) {
            addCriterion("OLEFIELD between", value1, value2, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldNotBetween(String value1, String value2) {
            addCriterion("OLEFIELD not between", value1, value2, "olefield");
            return (Criteria) this;
        }

        public Criteria andBilTypeIsNull() {
            addCriterion("BIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBilTypeIsNotNull() {
            addCriterion("BIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBilTypeEqualTo(String value) {
            addCriterion("BIL_TYPE =", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotEqualTo(String value) {
            addCriterion("BIL_TYPE <>", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeGreaterThan(String value) {
            addCriterion("BIL_TYPE >", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_TYPE >=", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLessThan(String value) {
            addCriterion("BIL_TYPE <", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLessThanOrEqualTo(String value) {
            addCriterion("BIL_TYPE <=", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLike(String value) {
            addCriterion("BIL_TYPE like", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotLike(String value) {
            addCriterion("BIL_TYPE not like", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeIn(List<String> values) {
            addCriterion("BIL_TYPE in", values, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotIn(List<String> values) {
            addCriterion("BIL_TYPE not in", values, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeBetween(String value1, String value2) {
            addCriterion("BIL_TYPE between", value1, value2, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotBetween(String value1, String value2) {
            addCriterion("BIL_TYPE not between", value1, value2, "bilType");
            return (Criteria) this;
        }

        public Criteria andDepIsNull() {
            addCriterion("DEP is null");
            return (Criteria) this;
        }

        public Criteria andDepIsNotNull() {
            addCriterion("DEP is not null");
            return (Criteria) this;
        }

        public Criteria andDepEqualTo(String value) {
            addCriterion("DEP =", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotEqualTo(String value) {
            addCriterion("DEP <>", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepGreaterThan(String value) {
            addCriterion("DEP >", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepGreaterThanOrEqualTo(String value) {
            addCriterion("DEP >=", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLessThan(String value) {
            addCriterion("DEP <", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLessThanOrEqualTo(String value) {
            addCriterion("DEP <=", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLike(String value) {
            addCriterion("DEP like", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotLike(String value) {
            addCriterion("DEP not like", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepIn(List<String> values) {
            addCriterion("DEP in", values, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotIn(List<String> values) {
            addCriterion("DEP not in", values, "dep");
            return (Criteria) this;
        }

        public Criteria andDepBetween(String value1, String value2) {
            addCriterion("DEP between", value1, value2, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotBetween(String value1, String value2) {
            addCriterion("DEP not between", value1, value2, "dep");
            return (Criteria) this;
        }

        public Criteria andCusOsNoIsNull() {
            addCriterion("CUS_OS_NO is null");
            return (Criteria) this;
        }

        public Criteria andCusOsNoIsNotNull() {
            addCriterion("CUS_OS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCusOsNoEqualTo(String value) {
            addCriterion("CUS_OS_NO =", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotEqualTo(String value) {
            addCriterion("CUS_OS_NO <>", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoGreaterThan(String value) {
            addCriterion("CUS_OS_NO >", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_OS_NO >=", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoLessThan(String value) {
            addCriterion("CUS_OS_NO <", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoLessThanOrEqualTo(String value) {
            addCriterion("CUS_OS_NO <=", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoLike(String value) {
            addCriterion("CUS_OS_NO like", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotLike(String value) {
            addCriterion("CUS_OS_NO not like", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoIn(List<String> values) {
            addCriterion("CUS_OS_NO in", values, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotIn(List<String> values) {
            addCriterion("CUS_OS_NO not in", values, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoBetween(String value1, String value2) {
            addCriterion("CUS_OS_NO between", value1, value2, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotBetween(String value1, String value2) {
            addCriterion("CUS_OS_NO not between", value1, value2, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andMobIdIsNull() {
            addCriterion("MOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andMobIdIsNotNull() {
            addCriterion("MOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMobIdEqualTo(String value) {
            addCriterion("MOB_ID =", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotEqualTo(String value) {
            addCriterion("MOB_ID <>", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdGreaterThan(String value) {
            addCriterion("MOB_ID >", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdGreaterThanOrEqualTo(String value) {
            addCriterion("MOB_ID >=", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLessThan(String value) {
            addCriterion("MOB_ID <", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLessThanOrEqualTo(String value) {
            addCriterion("MOB_ID <=", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLike(String value) {
            addCriterion("MOB_ID like", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotLike(String value) {
            addCriterion("MOB_ID not like", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdIn(List<String> values) {
            addCriterion("MOB_ID in", values, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotIn(List<String> values) {
            addCriterion("MOB_ID not in", values, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdBetween(String value1, String value2) {
            addCriterion("MOB_ID between", value1, value2, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotBetween(String value1, String value2) {
            addCriterion("MOB_ID not between", value1, value2, "mobId");
            return (Criteria) this;
        }

        public Criteria andLockManIsNull() {
            addCriterion("LOCK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andLockManIsNotNull() {
            addCriterion("LOCK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andLockManEqualTo(String value) {
            addCriterion("LOCK_MAN =", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotEqualTo(String value) {
            addCriterion("LOCK_MAN <>", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManGreaterThan(String value) {
            addCriterion("LOCK_MAN >", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_MAN >=", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManLessThan(String value) {
            addCriterion("LOCK_MAN <", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManLessThanOrEqualTo(String value) {
            addCriterion("LOCK_MAN <=", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManLike(String value) {
            addCriterion("LOCK_MAN like", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotLike(String value) {
            addCriterion("LOCK_MAN not like", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManIn(List<String> values) {
            addCriterion("LOCK_MAN in", values, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotIn(List<String> values) {
            addCriterion("LOCK_MAN not in", values, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManBetween(String value1, String value2) {
            addCriterion("LOCK_MAN between", value1, value2, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotBetween(String value1, String value2) {
            addCriterion("LOCK_MAN not between", value1, value2, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockDateIsNull() {
            addCriterion("LOCK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLockDateIsNotNull() {
            addCriterion("LOCK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLockDateEqualTo(Date value) {
            addCriterion("LOCK_DATE =", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotEqualTo(Date value) {
            addCriterion("LOCK_DATE <>", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThan(Date value) {
            addCriterion("LOCK_DATE >", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LOCK_DATE >=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThan(Date value) {
            addCriterion("LOCK_DATE <", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThanOrEqualTo(Date value) {
            addCriterion("LOCK_DATE <=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateIn(List<Date> values) {
            addCriterion("LOCK_DATE in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotIn(List<Date> values) {
            addCriterion("LOCK_DATE not in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateBetween(Date value1, Date value2) {
            addCriterion("LOCK_DATE between", value1, value2, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotBetween(Date value1, Date value2) {
            addCriterion("LOCK_DATE not between", value1, value2, "lockDate");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNull() {
            addCriterion("SYS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNotNull() {
            addCriterion("SYS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSysDateEqualTo(Date value) {
            addCriterion("SYS_DATE =", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotEqualTo(Date value) {
            addCriterion("SYS_DATE <>", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThan(Date value) {
            addCriterion("SYS_DATE >", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SYS_DATE >=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThan(Date value) {
            addCriterion("SYS_DATE <", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThanOrEqualTo(Date value) {
            addCriterion("SYS_DATE <=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateIn(List<Date> values) {
            addCriterion("SYS_DATE in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotIn(List<Date> values) {
            addCriterion("SYS_DATE not in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateBetween(Date value1, Date value2) {
            addCriterion("SYS_DATE between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotBetween(Date value1, Date value2) {
            addCriterion("SYS_DATE not between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andTiIdIsNull() {
            addCriterion("TI_ID is null");
            return (Criteria) this;
        }

        public Criteria andTiIdIsNotNull() {
            addCriterion("TI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTiIdEqualTo(String value) {
            addCriterion("TI_ID =", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdNotEqualTo(String value) {
            addCriterion("TI_ID <>", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdGreaterThan(String value) {
            addCriterion("TI_ID >", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdGreaterThanOrEqualTo(String value) {
            addCriterion("TI_ID >=", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdLessThan(String value) {
            addCriterion("TI_ID <", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdLessThanOrEqualTo(String value) {
            addCriterion("TI_ID <=", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdLike(String value) {
            addCriterion("TI_ID like", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdNotLike(String value) {
            addCriterion("TI_ID not like", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdIn(List<String> values) {
            addCriterion("TI_ID in", values, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdNotIn(List<String> values) {
            addCriterion("TI_ID not in", values, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdBetween(String value1, String value2) {
            addCriterion("TI_ID between", value1, value2, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdNotBetween(String value1, String value2) {
            addCriterion("TI_ID not between", value1, value2, "tiId");
            return (Criteria) this;
        }

        public Criteria andFxWhIsNull() {
            addCriterion("FX_WH is null");
            return (Criteria) this;
        }

        public Criteria andFxWhIsNotNull() {
            addCriterion("FX_WH is not null");
            return (Criteria) this;
        }

        public Criteria andFxWhEqualTo(String value) {
            addCriterion("FX_WH =", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhNotEqualTo(String value) {
            addCriterion("FX_WH <>", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhGreaterThan(String value) {
            addCriterion("FX_WH >", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhGreaterThanOrEqualTo(String value) {
            addCriterion("FX_WH >=", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhLessThan(String value) {
            addCriterion("FX_WH <", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhLessThanOrEqualTo(String value) {
            addCriterion("FX_WH <=", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhLike(String value) {
            addCriterion("FX_WH like", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhNotLike(String value) {
            addCriterion("FX_WH not like", value, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhIn(List<String> values) {
            addCriterion("FX_WH in", values, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhNotIn(List<String> values) {
            addCriterion("FX_WH not in", values, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhBetween(String value1, String value2) {
            addCriterion("FX_WH between", value1, value2, "fxWh");
            return (Criteria) this;
        }

        public Criteria andFxWhNotBetween(String value1, String value2) {
            addCriterion("FX_WH not between", value1, value2, "fxWh");
            return (Criteria) this;
        }

        public Criteria andClsIdOkIsNull() {
            addCriterion("CLS_ID_OK is null");
            return (Criteria) this;
        }

        public Criteria andClsIdOkIsNotNull() {
            addCriterion("CLS_ID_OK is not null");
            return (Criteria) this;
        }

        public Criteria andClsIdOkEqualTo(String value) {
            addCriterion("CLS_ID_OK =", value, "clsIdOk");
            return (Criteria) this;
        }

        public Criteria andClsIdOkNotEqualTo(String value) {
            addCriterion("CLS_ID_OK <>", value, "clsIdOk");
            return (Criteria) this;
        }

        public Criteria andClsIdOkGreaterThan(String value) {
            addCriterion("CLS_ID_OK >", value, "clsIdOk");
            return (Criteria) this;
        }

        public Criteria andClsIdOkGreaterThanOrEqualTo(String value) {
            addCriterion("CLS_ID_OK >=", value, "clsIdOk");
            return (Criteria) this;
        }

        public Criteria andClsIdOkLessThan(String value) {
            addCriterion("CLS_ID_OK <", value, "clsIdOk");
            return (Criteria) this;
        }

        public Criteria andClsIdOkLessThanOrEqualTo(String value) {
            addCriterion("CLS_ID_OK <=", value, "clsIdOk");
            return (Criteria) this;
        }

        public Criteria andClsIdOkLike(String value) {
            addCriterion("CLS_ID_OK like", value, "clsIdOk");
            return (Criteria) this;
        }

        public Criteria andClsIdOkNotLike(String value) {
            addCriterion("CLS_ID_OK not like", value, "clsIdOk");
            return (Criteria) this;
        }

        public Criteria andClsIdOkIn(List<String> values) {
            addCriterion("CLS_ID_OK in", values, "clsIdOk");
            return (Criteria) this;
        }

        public Criteria andClsIdOkNotIn(List<String> values) {
            addCriterion("CLS_ID_OK not in", values, "clsIdOk");
            return (Criteria) this;
        }

        public Criteria andClsIdOkBetween(String value1, String value2) {
            addCriterion("CLS_ID_OK between", value1, value2, "clsIdOk");
            return (Criteria) this;
        }

        public Criteria andClsIdOkNotBetween(String value1, String value2) {
            addCriterion("CLS_ID_OK not between", value1, value2, "clsIdOk");
            return (Criteria) this;
        }

        public Criteria andClsIdLostIsNull() {
            addCriterion("CLS_ID_LOST is null");
            return (Criteria) this;
        }

        public Criteria andClsIdLostIsNotNull() {
            addCriterion("CLS_ID_LOST is not null");
            return (Criteria) this;
        }

        public Criteria andClsIdLostEqualTo(String value) {
            addCriterion("CLS_ID_LOST =", value, "clsIdLost");
            return (Criteria) this;
        }

        public Criteria andClsIdLostNotEqualTo(String value) {
            addCriterion("CLS_ID_LOST <>", value, "clsIdLost");
            return (Criteria) this;
        }

        public Criteria andClsIdLostGreaterThan(String value) {
            addCriterion("CLS_ID_LOST >", value, "clsIdLost");
            return (Criteria) this;
        }

        public Criteria andClsIdLostGreaterThanOrEqualTo(String value) {
            addCriterion("CLS_ID_LOST >=", value, "clsIdLost");
            return (Criteria) this;
        }

        public Criteria andClsIdLostLessThan(String value) {
            addCriterion("CLS_ID_LOST <", value, "clsIdLost");
            return (Criteria) this;
        }

        public Criteria andClsIdLostLessThanOrEqualTo(String value) {
            addCriterion("CLS_ID_LOST <=", value, "clsIdLost");
            return (Criteria) this;
        }

        public Criteria andClsIdLostLike(String value) {
            addCriterion("CLS_ID_LOST like", value, "clsIdLost");
            return (Criteria) this;
        }

        public Criteria andClsIdLostNotLike(String value) {
            addCriterion("CLS_ID_LOST not like", value, "clsIdLost");
            return (Criteria) this;
        }

        public Criteria andClsIdLostIn(List<String> values) {
            addCriterion("CLS_ID_LOST in", values, "clsIdLost");
            return (Criteria) this;
        }

        public Criteria andClsIdLostNotIn(List<String> values) {
            addCriterion("CLS_ID_LOST not in", values, "clsIdLost");
            return (Criteria) this;
        }

        public Criteria andClsIdLostBetween(String value1, String value2) {
            addCriterion("CLS_ID_LOST between", value1, value2, "clsIdLost");
            return (Criteria) this;
        }

        public Criteria andClsIdLostNotBetween(String value1, String value2) {
            addCriterion("CLS_ID_LOST not between", value1, value2, "clsIdLost");
            return (Criteria) this;
        }

        public Criteria andVohIdIsNull() {
            addCriterion("VOH_ID is null");
            return (Criteria) this;
        }

        public Criteria andVohIdIsNotNull() {
            addCriterion("VOH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVohIdEqualTo(String value) {
            addCriterion("VOH_ID =", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotEqualTo(String value) {
            addCriterion("VOH_ID <>", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdGreaterThan(String value) {
            addCriterion("VOH_ID >", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdGreaterThanOrEqualTo(String value) {
            addCriterion("VOH_ID >=", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdLessThan(String value) {
            addCriterion("VOH_ID <", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdLessThanOrEqualTo(String value) {
            addCriterion("VOH_ID <=", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdLike(String value) {
            addCriterion("VOH_ID like", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotLike(String value) {
            addCriterion("VOH_ID not like", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdIn(List<String> values) {
            addCriterion("VOH_ID in", values, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotIn(List<String> values) {
            addCriterion("VOH_ID not in", values, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdBetween(String value1, String value2) {
            addCriterion("VOH_ID between", value1, value2, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotBetween(String value1, String value2) {
            addCriterion("VOH_ID not between", value1, value2, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohNoIsNull() {
            addCriterion("VOH_NO is null");
            return (Criteria) this;
        }

        public Criteria andVohNoIsNotNull() {
            addCriterion("VOH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVohNoEqualTo(String value) {
            addCriterion("VOH_NO =", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotEqualTo(String value) {
            addCriterion("VOH_NO <>", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoGreaterThan(String value) {
            addCriterion("VOH_NO >", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoGreaterThanOrEqualTo(String value) {
            addCriterion("VOH_NO >=", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoLessThan(String value) {
            addCriterion("VOH_NO <", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoLessThanOrEqualTo(String value) {
            addCriterion("VOH_NO <=", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoLike(String value) {
            addCriterion("VOH_NO like", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotLike(String value) {
            addCriterion("VOH_NO not like", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoIn(List<String> values) {
            addCriterion("VOH_NO in", values, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotIn(List<String> values) {
            addCriterion("VOH_NO not in", values, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoBetween(String value1, String value2) {
            addCriterion("VOH_NO between", value1, value2, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotBetween(String value1, String value2) {
            addCriterion("VOH_NO not between", value1, value2, "vohNo");
            return (Criteria) this;
        }

        public Criteria andZhangIdIsNull() {
            addCriterion("ZHANG_ID is null");
            return (Criteria) this;
        }

        public Criteria andZhangIdIsNotNull() {
            addCriterion("ZHANG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andZhangIdEqualTo(String value) {
            addCriterion("ZHANG_ID =", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdNotEqualTo(String value) {
            addCriterion("ZHANG_ID <>", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdGreaterThan(String value) {
            addCriterion("ZHANG_ID >", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdGreaterThanOrEqualTo(String value) {
            addCriterion("ZHANG_ID >=", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdLessThan(String value) {
            addCriterion("ZHANG_ID <", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdLessThanOrEqualTo(String value) {
            addCriterion("ZHANG_ID <=", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdLike(String value) {
            addCriterion("ZHANG_ID like", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdNotLike(String value) {
            addCriterion("ZHANG_ID not like", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdIn(List<String> values) {
            addCriterion("ZHANG_ID in", values, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdNotIn(List<String> values) {
            addCriterion("ZHANG_ID not in", values, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdBetween(String value1, String value2) {
            addCriterion("ZHANG_ID between", value1, value2, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdNotBetween(String value1, String value2) {
            addCriterion("ZHANG_ID not between", value1, value2, "zhangId");
            return (Criteria) this;
        }

        public Criteria andTaxIdIsNull() {
            addCriterion("TAX_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaxIdIsNotNull() {
            addCriterion("TAX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxIdEqualTo(String value) {
            addCriterion("TAX_ID =", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotEqualTo(String value) {
            addCriterion("TAX_ID <>", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdGreaterThan(String value) {
            addCriterion("TAX_ID >", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_ID >=", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLessThan(String value) {
            addCriterion("TAX_ID <", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLessThanOrEqualTo(String value) {
            addCriterion("TAX_ID <=", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLike(String value) {
            addCriterion("TAX_ID like", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotLike(String value) {
            addCriterion("TAX_ID not like", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdIn(List<String> values) {
            addCriterion("TAX_ID in", values, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotIn(List<String> values) {
            addCriterion("TAX_ID not in", values, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdBetween(String value1, String value2) {
            addCriterion("TAX_ID between", value1, value2, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotBetween(String value1, String value2) {
            addCriterion("TAX_ID not between", value1, value2, "taxId");
            return (Criteria) this;
        }

        public Criteria andArpNoIsNull() {
            addCriterion("ARP_NO is null");
            return (Criteria) this;
        }

        public Criteria andArpNoIsNotNull() {
            addCriterion("ARP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andArpNoEqualTo(String value) {
            addCriterion("ARP_NO =", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoNotEqualTo(String value) {
            addCriterion("ARP_NO <>", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoGreaterThan(String value) {
            addCriterion("ARP_NO >", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoGreaterThanOrEqualTo(String value) {
            addCriterion("ARP_NO >=", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoLessThan(String value) {
            addCriterion("ARP_NO <", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoLessThanOrEqualTo(String value) {
            addCriterion("ARP_NO <=", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoLike(String value) {
            addCriterion("ARP_NO like", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoNotLike(String value) {
            addCriterion("ARP_NO not like", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoIn(List<String> values) {
            addCriterion("ARP_NO in", values, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoNotIn(List<String> values) {
            addCriterion("ARP_NO not in", values, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoBetween(String value1, String value2) {
            addCriterion("ARP_NO between", value1, value2, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoNotBetween(String value1, String value2) {
            addCriterion("ARP_NO not between", value1, value2, "arpNo");
            return (Criteria) this;
        }

        public Criteria andCurIdIsNull() {
            addCriterion("CUR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCurIdIsNotNull() {
            addCriterion("CUR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCurIdEqualTo(String value) {
            addCriterion("CUR_ID =", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotEqualTo(String value) {
            addCriterion("CUR_ID <>", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdGreaterThan(String value) {
            addCriterion("CUR_ID >", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUR_ID >=", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLessThan(String value) {
            addCriterion("CUR_ID <", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLessThanOrEqualTo(String value) {
            addCriterion("CUR_ID <=", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLike(String value) {
            addCriterion("CUR_ID like", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotLike(String value) {
            addCriterion("CUR_ID not like", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdIn(List<String> values) {
            addCriterion("CUR_ID in", values, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotIn(List<String> values) {
            addCriterion("CUR_ID not in", values, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdBetween(String value1, String value2) {
            addCriterion("CUR_ID between", value1, value2, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotBetween(String value1, String value2) {
            addCriterion("CUR_ID not between", value1, value2, "curId");
            return (Criteria) this;
        }

        public Criteria andExcRtoIsNull() {
            addCriterion("EXC_RTO is null");
            return (Criteria) this;
        }

        public Criteria andExcRtoIsNotNull() {
            addCriterion("EXC_RTO is not null");
            return (Criteria) this;
        }

        public Criteria andExcRtoEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO =", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoNotEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO <>", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoGreaterThan(BigDecimal value) {
            addCriterion("EXC_RTO >", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO >=", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoLessThan(BigDecimal value) {
            addCriterion("EXC_RTO <", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO <=", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO in", values, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoNotIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO not in", values, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO between", value1, value2, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO not between", value1, value2, "excRto");
            return (Criteria) this;
        }

        public Criteria andPrtUsrIsNull() {
            addCriterion("PRT_USR is null");
            return (Criteria) this;
        }

        public Criteria andPrtUsrIsNotNull() {
            addCriterion("PRT_USR is not null");
            return (Criteria) this;
        }

        public Criteria andPrtUsrEqualTo(String value) {
            addCriterion("PRT_USR =", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotEqualTo(String value) {
            addCriterion("PRT_USR <>", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrGreaterThan(String value) {
            addCriterion("PRT_USR >", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrGreaterThanOrEqualTo(String value) {
            addCriterion("PRT_USR >=", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrLessThan(String value) {
            addCriterion("PRT_USR <", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrLessThanOrEqualTo(String value) {
            addCriterion("PRT_USR <=", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrLike(String value) {
            addCriterion("PRT_USR like", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotLike(String value) {
            addCriterion("PRT_USR not like", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrIn(List<String> values) {
            addCriterion("PRT_USR in", values, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotIn(List<String> values) {
            addCriterion("PRT_USR not in", values, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrBetween(String value1, String value2) {
            addCriterion("PRT_USR between", value1, value2, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotBetween(String value1, String value2) {
            addCriterion("PRT_USR not between", value1, value2, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andCnttNoIsNull() {
            addCriterion("CNTT_NO is null");
            return (Criteria) this;
        }

        public Criteria andCnttNoIsNotNull() {
            addCriterion("CNTT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCnttNoEqualTo(String value) {
            addCriterion("CNTT_NO =", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoNotEqualTo(String value) {
            addCriterion("CNTT_NO <>", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoGreaterThan(String value) {
            addCriterion("CNTT_NO >", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoGreaterThanOrEqualTo(String value) {
            addCriterion("CNTT_NO >=", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoLessThan(String value) {
            addCriterion("CNTT_NO <", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoLessThanOrEqualTo(String value) {
            addCriterion("CNTT_NO <=", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoLike(String value) {
            addCriterion("CNTT_NO like", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoNotLike(String value) {
            addCriterion("CNTT_NO not like", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoIn(List<String> values) {
            addCriterion("CNTT_NO in", values, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoNotIn(List<String> values) {
            addCriterion("CNTT_NO not in", values, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoBetween(String value1, String value2) {
            addCriterion("CNTT_NO between", value1, value2, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoNotBetween(String value1, String value2) {
            addCriterion("CNTT_NO not between", value1, value2, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andChkKndIsNull() {
            addCriterion("CHK_KND is null");
            return (Criteria) this;
        }

        public Criteria andChkKndIsNotNull() {
            addCriterion("CHK_KND is not null");
            return (Criteria) this;
        }

        public Criteria andChkKndEqualTo(String value) {
            addCriterion("CHK_KND =", value, "chkKnd");
            return (Criteria) this;
        }

        public Criteria andChkKndNotEqualTo(String value) {
            addCriterion("CHK_KND <>", value, "chkKnd");
            return (Criteria) this;
        }

        public Criteria andChkKndGreaterThan(String value) {
            addCriterion("CHK_KND >", value, "chkKnd");
            return (Criteria) this;
        }

        public Criteria andChkKndGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_KND >=", value, "chkKnd");
            return (Criteria) this;
        }

        public Criteria andChkKndLessThan(String value) {
            addCriterion("CHK_KND <", value, "chkKnd");
            return (Criteria) this;
        }

        public Criteria andChkKndLessThanOrEqualTo(String value) {
            addCriterion("CHK_KND <=", value, "chkKnd");
            return (Criteria) this;
        }

        public Criteria andChkKndLike(String value) {
            addCriterion("CHK_KND like", value, "chkKnd");
            return (Criteria) this;
        }

        public Criteria andChkKndNotLike(String value) {
            addCriterion("CHK_KND not like", value, "chkKnd");
            return (Criteria) this;
        }

        public Criteria andChkKndIn(List<String> values) {
            addCriterion("CHK_KND in", values, "chkKnd");
            return (Criteria) this;
        }

        public Criteria andChkKndNotIn(List<String> values) {
            addCriterion("CHK_KND not in", values, "chkKnd");
            return (Criteria) this;
        }

        public Criteria andChkKndBetween(String value1, String value2) {
            addCriterion("CHK_KND between", value1, value2, "chkKnd");
            return (Criteria) this;
        }

        public Criteria andChkKndNotBetween(String value1, String value2) {
            addCriterion("CHK_KND not between", value1, value2, "chkKnd");
            return (Criteria) this;
        }

        public Criteria andCancelIdIsNull() {
            addCriterion("CANCEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCancelIdIsNotNull() {
            addCriterion("CANCEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCancelIdEqualTo(String value) {
            addCriterion("CANCEL_ID =", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotEqualTo(String value) {
            addCriterion("CANCEL_ID <>", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdGreaterThan(String value) {
            addCriterion("CANCEL_ID >", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_ID >=", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLessThan(String value) {
            addCriterion("CANCEL_ID <", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_ID <=", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLike(String value) {
            addCriterion("CANCEL_ID like", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotLike(String value) {
            addCriterion("CANCEL_ID not like", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdIn(List<String> values) {
            addCriterion("CANCEL_ID in", values, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotIn(List<String> values) {
            addCriterion("CANCEL_ID not in", values, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdBetween(String value1, String value2) {
            addCriterion("CANCEL_ID between", value1, value2, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotBetween(String value1, String value2) {
            addCriterion("CANCEL_ID not between", value1, value2, "cancelId");
            return (Criteria) this;
        }

        public Criteria andPrtDateIsNull() {
            addCriterion("PRT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPrtDateIsNotNull() {
            addCriterion("PRT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrtDateEqualTo(Date value) {
            addCriterion("PRT_DATE =", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateNotEqualTo(Date value) {
            addCriterion("PRT_DATE <>", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateGreaterThan(Date value) {
            addCriterion("PRT_DATE >", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PRT_DATE >=", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateLessThan(Date value) {
            addCriterion("PRT_DATE <", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateLessThanOrEqualTo(Date value) {
            addCriterion("PRT_DATE <=", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateIn(List<Date> values) {
            addCriterion("PRT_DATE in", values, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateNotIn(List<Date> values) {
            addCriterion("PRT_DATE not in", values, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateBetween(Date value1, Date value2) {
            addCriterion("PRT_DATE between", value1, value2, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateNotBetween(Date value1, Date value2) {
            addCriterion("PRT_DATE not between", value1, value2, "prtDate");
            return (Criteria) this;
        }

        public Criteria andModifyDdIsNull() {
            addCriterion("MODIFY_DD is null");
            return (Criteria) this;
        }

        public Criteria andModifyDdIsNotNull() {
            addCriterion("MODIFY_DD is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDdEqualTo(Date value) {
            addCriterion("MODIFY_DD =", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdNotEqualTo(Date value) {
            addCriterion("MODIFY_DD <>", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdGreaterThan(Date value) {
            addCriterion("MODIFY_DD >", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DD >=", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdLessThan(Date value) {
            addCriterion("MODIFY_DD <", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DD <=", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdIn(List<Date> values) {
            addCriterion("MODIFY_DD in", values, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdNotIn(List<Date> values) {
            addCriterion("MODIFY_DD not in", values, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DD between", value1, value2, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DD not between", value1, value2, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyManIsNull() {
            addCriterion("MODIFY_MAN is null");
            return (Criteria) this;
        }

        public Criteria andModifyManIsNotNull() {
            addCriterion("MODIFY_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andModifyManEqualTo(String value) {
            addCriterion("MODIFY_MAN =", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotEqualTo(String value) {
            addCriterion("MODIFY_MAN <>", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManGreaterThan(String value) {
            addCriterion("MODIFY_MAN >", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_MAN >=", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLessThan(String value) {
            addCriterion("MODIFY_MAN <", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_MAN <=", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLike(String value) {
            addCriterion("MODIFY_MAN like", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotLike(String value) {
            addCriterion("MODIFY_MAN not like", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManIn(List<String> values) {
            addCriterion("MODIFY_MAN in", values, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotIn(List<String> values) {
            addCriterion("MODIFY_MAN not in", values, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManBetween(String value1, String value2) {
            addCriterion("MODIFY_MAN between", value1, value2, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotBetween(String value1, String value2) {
            addCriterion("MODIFY_MAN not between", value1, value2, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andScanIdIsNull() {
            addCriterion("SCAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andScanIdIsNotNull() {
            addCriterion("SCAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andScanIdEqualTo(String value) {
            addCriterion("SCAN_ID =", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdNotEqualTo(String value) {
            addCriterion("SCAN_ID <>", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdGreaterThan(String value) {
            addCriterion("SCAN_ID >", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdGreaterThanOrEqualTo(String value) {
            addCriterion("SCAN_ID >=", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdLessThan(String value) {
            addCriterion("SCAN_ID <", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdLessThanOrEqualTo(String value) {
            addCriterion("SCAN_ID <=", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdLike(String value) {
            addCriterion("SCAN_ID like", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdNotLike(String value) {
            addCriterion("SCAN_ID not like", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdIn(List<String> values) {
            addCriterion("SCAN_ID in", values, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdNotIn(List<String> values) {
            addCriterion("SCAN_ID not in", values, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdBetween(String value1, String value2) {
            addCriterion("SCAN_ID between", value1, value2, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdNotBetween(String value1, String value2) {
            addCriterion("SCAN_ID not between", value1, value2, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanUsrIsNull() {
            addCriterion("SCAN_USR is null");
            return (Criteria) this;
        }

        public Criteria andScanUsrIsNotNull() {
            addCriterion("SCAN_USR is not null");
            return (Criteria) this;
        }

        public Criteria andScanUsrEqualTo(String value) {
            addCriterion("SCAN_USR =", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrNotEqualTo(String value) {
            addCriterion("SCAN_USR <>", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrGreaterThan(String value) {
            addCriterion("SCAN_USR >", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrGreaterThanOrEqualTo(String value) {
            addCriterion("SCAN_USR >=", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrLessThan(String value) {
            addCriterion("SCAN_USR <", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrLessThanOrEqualTo(String value) {
            addCriterion("SCAN_USR <=", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrLike(String value) {
            addCriterion("SCAN_USR like", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrNotLike(String value) {
            addCriterion("SCAN_USR not like", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrIn(List<String> values) {
            addCriterion("SCAN_USR in", values, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrNotIn(List<String> values) {
            addCriterion("SCAN_USR not in", values, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrBetween(String value1, String value2) {
            addCriterion("SCAN_USR between", value1, value2, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrNotBetween(String value1, String value2) {
            addCriterion("SCAN_USR not between", value1, value2, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanDateIsNull() {
            addCriterion("SCAN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andScanDateIsNotNull() {
            addCriterion("SCAN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andScanDateEqualTo(Date value) {
            addCriterion("SCAN_DATE =", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotEqualTo(Date value) {
            addCriterion("SCAN_DATE <>", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateGreaterThan(Date value) {
            addCriterion("SCAN_DATE >", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SCAN_DATE >=", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateLessThan(Date value) {
            addCriterion("SCAN_DATE <", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateLessThanOrEqualTo(Date value) {
            addCriterion("SCAN_DATE <=", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateIn(List<Date> values) {
            addCriterion("SCAN_DATE in", values, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotIn(List<Date> values) {
            addCriterion("SCAN_DATE not in", values, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateBetween(Date value1, Date value2) {
            addCriterion("SCAN_DATE between", value1, value2, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotBetween(Date value1, Date value2) {
            addCriterion("SCAN_DATE not between", value1, value2, "scanDate");
            return (Criteria) this;
        }

        public Criteria andSlIdIsNull() {
            addCriterion("SL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSlIdIsNotNull() {
            addCriterion("SL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSlIdEqualTo(String value) {
            addCriterion("SL_ID =", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdNotEqualTo(String value) {
            addCriterion("SL_ID <>", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdGreaterThan(String value) {
            addCriterion("SL_ID >", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdGreaterThanOrEqualTo(String value) {
            addCriterion("SL_ID >=", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdLessThan(String value) {
            addCriterion("SL_ID <", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdLessThanOrEqualTo(String value) {
            addCriterion("SL_ID <=", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdLike(String value) {
            addCriterion("SL_ID like", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdNotLike(String value) {
            addCriterion("SL_ID not like", value, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdIn(List<String> values) {
            addCriterion("SL_ID in", values, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdNotIn(List<String> values) {
            addCriterion("SL_ID not in", values, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdBetween(String value1, String value2) {
            addCriterion("SL_ID between", value1, value2, "slId");
            return (Criteria) this;
        }

        public Criteria andSlIdNotBetween(String value1, String value2) {
            addCriterion("SL_ID not between", value1, value2, "slId");
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