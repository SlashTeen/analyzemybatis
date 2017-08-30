package me.mybatis.po;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/8/16.
 */
public class TestExample {
    private String orderByClause;

    private boolean distinct;

    private List<Criteria> oredCriteria;

    public TestExample(){
        this.oredCriteria=new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
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

    public static abstract class GeneratedCriteria{
        private List<Criterion> criteria;

        public boolean isValid() {//这个方法很重要;如果集合之中没有数据证明where语句后面没有条件
            return criteria.size() > 0;
        }

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andAppsEqualTo(String value) {
            addCriterion("APPS =", value, "apps");
            return (Criteria) this;
        }

    }

    public static class Criteria extends GeneratedCriteria{
        public Criteria(){
            super();
        }
    }

    public static class Criterion{
        private String condition;//name is not null

        private Object value;//存放第一个属性值;value可能是个属性值;也可能是一个集合

        private Object secondValue;//存放第二个属性值

        private boolean noValue;//where语句后面没有'属性=值'这样的表达式

        private boolean singleValue;//where语句后面只有一个'属性=值'这样的表达式

        private boolean betweenValue;//where语句后面有两个属性值且是between..and形式

        private boolean listValue;//where语句后面有多个'属性=值'这样的表达式

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


        public Criterion(String condition){//where语句后面没有表达式;类似xx is not null;
            super();
            this.condition=condition;
            this.noValue=true;
            this.typeHandler=null;
        }

        public Criterion(String condition,Object value,String typeHandler){
            super();
            this.condition=condition;
            this.value=value;
            if(value instanceof List<?>){
                this.listValue=true;
            }else {
                this.singleValue=true;
            }
            this.typeHandler=typeHandler;
        }

        public Criterion(String condition,Object value){
            this(condition,value,null);
        }

        public Criterion(String condition,Object value,Object secondValue,String typeHandler){
            super();
            this.condition=condition;
            this.value=value;
            this.secondValue=secondValue;
            this.betweenValue=true;
            this.typeHandler=typeHandler;
        }

        public Criterion(String condition,Object value,Object secondValue){
            this(condition,value,secondValue,null);
        }
    }
}
