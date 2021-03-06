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

package org.apache.shardingsphere.orchestration.internal.registry.config;

import org.apache.shardingsphere.orchestration.internal.registry.config.listener.AuthenticationChangedListenerTest;
import org.apache.shardingsphere.orchestration.internal.registry.config.listener.ConfigMapChangedListenerTest;
import org.apache.shardingsphere.orchestration.internal.registry.config.listener.ConfigurationChangedListenerManagerTest;
import org.apache.shardingsphere.orchestration.internal.registry.config.listener.PropertiesChangedListenerTest;
import org.apache.shardingsphere.orchestration.internal.registry.config.listener.SchemaChangedListenerTest;
import org.apache.shardingsphere.orchestration.internal.registry.config.node.ConfigurationNodeTest;
import org.apache.shardingsphere.orchestration.internal.registry.config.service.ConfigurationServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        ConfigurationNodeTest.class, 
        ConfigurationServiceTest.class,
        ConfigurationChangedListenerManagerTest.class,
        PropertiesChangedListenerTest.class,
        AuthenticationChangedListenerTest.class,
        ConfigMapChangedListenerTest.class,
        SchemaChangedListenerTest.class
})
public final class AllConfigTests {
}
