/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.core.parsing.parser.sql;

import org.apache.shardingsphere.core.parsing.parser.sql.dal.DALStatementTest;
import org.apache.shardingsphere.core.parsing.parser.sql.dcl.DCLStatementTest;
import org.apache.shardingsphere.core.parsing.parser.sql.ddl.DDLStatementTest;
import org.apache.shardingsphere.core.parsing.parser.sql.dml.DMLStatementTest;
import org.apache.shardingsphere.core.parsing.parser.sql.dql.DQLStatementTest;
import org.apache.shardingsphere.core.parsing.parser.sql.tcl.TCLStatementTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        DQLStatementTest.class, 
        DMLStatementTest.class, 
        DDLStatementTest.class, 
        DCLStatementTest.class, 
        TCLStatementTest.class, 
        DALStatementTest.class
    })
public final class AllSQLTests {
}
