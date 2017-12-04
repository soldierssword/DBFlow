package com.raizlabs.dbflow5.adapter

import com.raizlabs.dbflow5.annotation.QueryModel
import com.raizlabs.dbflow5.config.DatabaseDefinition
import com.raizlabs.dbflow5.query.OperatorGroup
import com.raizlabs.dbflow5.database.DatabaseWrapper

/**
 * Description: The baseclass for adapters to [QueryModel] that defines how it interacts with the DB. The
 * where query is not defined here, rather its determined by the query used.
 */
abstract class QueryModelAdapter<T : Any>(databaseDefinition: DatabaseDefinition)
    : InstanceAdapter<T>(databaseDefinition) {

    override fun getPrimaryConditionClause(model: T): OperatorGroup {
        throw UnsupportedOperationException("QueryModels cannot check for existence")
    }

    override fun exists(model: T): Boolean {
        throw UnsupportedOperationException("QueryModels cannot check for existence")
    }

    override fun exists(model: T, databaseWrapper: DatabaseWrapper): Boolean {
        throw UnsupportedOperationException("QueryModels cannot check for existence")
    }
}