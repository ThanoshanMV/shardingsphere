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

package org.apache.shardingsphere.sql.parser.sql.dialect.statement.doris.dml;

import lombok.Setter;
import org.apache.shardingsphere.sql.parser.sql.common.segment.dml.assignment.SetAssignmentSegment;
import org.apache.shardingsphere.sql.parser.sql.common.segment.dml.column.OnDuplicateKeyColumnsSegment;
import org.apache.shardingsphere.sql.parser.sql.common.statement.dml.InsertStatement;
import org.apache.shardingsphere.sql.parser.sql.dialect.statement.doris.DorisStatement;

import java.util.Optional;

/**
 * Doris insert statement.
 */
@Setter
public final class DorisInsertStatement extends InsertStatement implements DorisStatement {
    
    private SetAssignmentSegment setAssignment;
    
    private OnDuplicateKeyColumnsSegment onDuplicateKeyColumns;
    
    /**
     * Get set assignment segment.
     *
     * @return set assignment segment
     */
    public Optional<SetAssignmentSegment> getSetAssignment() {
        return Optional.ofNullable(setAssignment);
    }
    
    /**
     * Get on duplicate key columns segment.
     *
     * @return on duplicate key columns segment
     */
    public Optional<OnDuplicateKeyColumnsSegment> getOnDuplicateKeyColumns() {
        return Optional.ofNullable(onDuplicateKeyColumns);
    }
}
