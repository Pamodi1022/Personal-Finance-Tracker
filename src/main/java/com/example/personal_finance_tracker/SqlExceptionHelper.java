package com.example.personal_finance_tracker;

import org.hibernate.JDBCException;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;

import java.sql.SQLException;

class CustomSqlExceptionHelper extends SqlExceptionHelper {
    public CustomSqlExceptionHelper(boolean logWarnings) {
        super(logWarnings);
    }

    @Override
    public JDBCException convert(SQLException sqlException, String message) {
        System.out.println("Caught SQLException: " + sqlException.getMessage());
        return super.convert(sqlException, message);
    }
}
