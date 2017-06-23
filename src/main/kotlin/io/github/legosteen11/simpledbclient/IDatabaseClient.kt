package io.github.legosteen11.simpledbclient

import java.sql.Connection
import java.sql.ResultSet

/**
 * DatabaseClient interface. The base class of every database client.
 */
interface IDatabaseClient {
    /**
     * Get a connection to the database to use
     *
     * @return Returns a connection to do some custom things to the database.
     */
    fun getConnection(): Connection

    /**
     * Execute an [sql]-query statement with set [parameters] and get the results
     *
     * @param sql The SQL statement
     * @param parameters The parameters
     *
     * @return Returns the results
     */
    fun executeQuery(sql: String, vararg parameters: Any?): ResultSet

    /**
     * Execute an [sql]-update statement with set [parameters] and get the amount of rows that changed
     *
     * @param sql The SQL statement
     * @param parameters The parameters
     *
     * @return The amount of rows that were changed
     */
    fun executeUpdate(sql: String, vararg parameters: Any?): Int

    /**
     * Execute a [sql]-query statement with set [parameters] and get the first result, or null if there are no results.
     *
     * @param sql The SQL statement
     * @param parameters The parameters
     *
     * @return The first result of the query
     */
    fun getSingleValueQuery(sql: String, vararg parameters: Any?): Any?
}