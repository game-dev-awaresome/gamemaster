package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class ServerSqlProvider extends ServerEntitySqlProvider {
    public String searchPage(ServerSearchQuery query) {
        StringBuilder sql = new StringBuilder(" SELECT * from server")
                .append(" WHERE 1=1 ");
        if (query.getServerId() != null) {
            sql.append(" and server_id like '%" + query.getServerId() + "%' ");
        }
        if (StringUtils.isNotBlank(query.getServerName())) {
            sql.append(" and server_name like \"%\"#{serverName}\"%\" ");
        }
        sql.append(" order by create_time desc");
        return sql.toString();
    }
}