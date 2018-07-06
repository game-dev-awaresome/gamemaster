package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.EmailFlowQueryEntity;
import com.luckygames.wmxz.gamemaster.dao.EmailFlowQueryEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.EmailFlowQueryEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.EmailFlowQueryEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class EmailFlowQueryEntitySqlProvider {

    public String countByExample(EmailFlowQueryEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("email_flowquery");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(EmailFlowQueryEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("email_flowquery");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(EmailFlowQueryEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("email_flowquery");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("`status`", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        if (record.getServerName() != null) {
            sql.VALUES("`server_name`", "#{serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            sql.VALUES("channel_id", "#{channelId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.VALUES("channel_name", "#{channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("`type`", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getEmailType() != null) {
            sql.VALUES("email_type", "#{emailType,jdbcType=VARCHAR}");
        }
        
        if (record.getIndexes() != null) {
            sql.VALUES("indexes", "#{indexes,jdbcType=VARCHAR}");
        }
        
        if (record.getConten() != null) {
            sql.VALUES("conten", "#{conten,jdbcType=VARCHAR}");
        }
        
        if (record.getSend() != null) {
            sql.VALUES("send", "#{send,jdbcType=VARCHAR}");
        }
        
        if (record.getAddressee() != null) {
            sql.VALUES("addressee", "#{addressee,jdbcType=VARCHAR}");
        }
        
        if (record.getSendTime() != null) {
            sql.VALUES("send_time", "#{sendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReadTime() != null) {
            sql.VALUES("read_time", "#{readTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEnclosure() != null) {
            sql.VALUES("enclosure", "#{enclosure,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(EmailFlowQueryEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("`status`");
        sql.SELECT("server_id");
        sql.SELECT("`server_name`");
        sql.SELECT("channel_id");
        sql.SELECT("channel_name");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("`type`");
        sql.SELECT("email_type");
        sql.SELECT("indexes");
        sql.SELECT("conten");
        sql.SELECT("send");
        sql.SELECT("addressee");
        sql.SELECT("send_time");
        sql.SELECT("read_time");
        sql.SELECT("enclosure");
        sql.FROM("email_flowquery");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        EmailFlowQueryEntity record = (EmailFlowQueryEntity) parameter.get("record");
        EmailFlowQueryEntityExample example = (EmailFlowQueryEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("email_flowquery");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        if (record.getServerName() != null) {
            sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getType() != null) {
            sql.SET("`type` = #{record.type,jdbcType=INTEGER}");
        }
        
        if (record.getEmailType() != null) {
            sql.SET("email_type = #{record.emailType,jdbcType=VARCHAR}");
        }
        
        if (record.getIndexes() != null) {
            sql.SET("indexes = #{record.indexes,jdbcType=VARCHAR}");
        }
        
        if (record.getConten() != null) {
            sql.SET("conten = #{record.conten,jdbcType=VARCHAR}");
        }
        
        if (record.getSend() != null) {
            sql.SET("send = #{record.send,jdbcType=VARCHAR}");
        }
        
        if (record.getAddressee() != null) {
            sql.SET("addressee = #{record.addressee,jdbcType=VARCHAR}");
        }
        
        if (record.getSendTime() != null) {
            sql.SET("send_time = #{record.sendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReadTime() != null) {
            sql.SET("read_time = #{record.readTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEnclosure() != null) {
            sql.SET("enclosure = #{record.enclosure,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("email_flowquery");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("`type` = #{record.type,jdbcType=INTEGER}");
        sql.SET("email_type = #{record.emailType,jdbcType=VARCHAR}");
        sql.SET("indexes = #{record.indexes,jdbcType=VARCHAR}");
        sql.SET("conten = #{record.conten,jdbcType=VARCHAR}");
        sql.SET("send = #{record.send,jdbcType=VARCHAR}");
        sql.SET("addressee = #{record.addressee,jdbcType=VARCHAR}");
        sql.SET("send_time = #{record.sendTime,jdbcType=TIMESTAMP}");
        sql.SET("read_time = #{record.readTime,jdbcType=TIMESTAMP}");
        sql.SET("enclosure = #{record.enclosure,jdbcType=VARCHAR}");
        
        EmailFlowQueryEntityExample example = (EmailFlowQueryEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, EmailFlowQueryEntityExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}