/*
#
# Copyright 2007 The Trustees of Indiana University
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or areed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# -----------------------------------------------------------------
#
# Project: Karma-Service-core
# File:  DBLockConfiguration.java
# Description:  DB Lock configuration parameters
#
# -----------------------------------------------------------------
# 
*/



/**
 * 
 */
package edu.indiana.dsi.karma.ingest;

/**
 * @author Devarshi Ghoshal
 *
 */

public class DBLockConfiguration{
	public final static int MAX_RETRIES = 10;
	public final static int LOCK_WAIT_TIME = 5;
	public final static int LOCK_ACQUIRE = 1;
	public final static int LOCK_RELEASE = 0;
	public final static int LOCK_OP_SUCCESS = 1;
}