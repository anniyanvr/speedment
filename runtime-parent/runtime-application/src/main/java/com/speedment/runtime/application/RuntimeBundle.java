/*
 *
 * Copyright (c) 2006-2019, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.runtime.application;

import com.speedment.common.injector.InjectBundle;
import com.speedment.runtime.connector.mariadb.MariaDbBundle;
import com.speedment.runtime.connector.mysql.MySqlBundle;
import com.speedment.runtime.connector.postgres.PostgresBundle;
import com.speedment.runtime.connector.sqlite.SqliteBundle;
import com.speedment.runtime.core.provider.*;
import com.speedment.runtime.join.JoinBundle;

import java.util.stream.Stream;

/**
 * The {@link InjectBundle} for the "application"-module.
 *
 * @author Per Minborg
 * @since 3.0.1
 */
public class RuntimeBundle implements InjectBundle {

    @Override
    public Stream<Class<?>> injectables() {
        return InjectBundle.of(
            DelegateInfoComponent.class,
            DelegateConnectionPoolComponent.class,
            DelegateDbmsHandlerComponent.class,
            DelegateEntityManager.class,
            DelegateManagerComponent.class,
            DelegatePasswordComponent.class,
            DelegateProjectComponent.class,
            DelegateResultSetMapperComponent.class,
            DelegateSqlStreamSupplierComponent.class,
            DelegateSqlPersistenceComponent.class,
            DelegateStatisticsReporterComponent.class,
            DelegateStatisticsReporterSchedulerComponent.class,
            DelegateSqlStreamOptimizerComponent.class,
            DelegateSqlStreamTerminatorComponent.class,
            DelegateTransactionComponent.class,
            DelegateDriverComponent.class,
            DefaultConnectionDecorator.class
        )
            .withBundle(new MySqlBundle())
            .withBundle(new MariaDbBundle())
            .withBundle(new PostgresBundle())
            .withBundle(new SqliteBundle())
            .withBundle(new JoinBundle())
            .injectables();
    }

}
