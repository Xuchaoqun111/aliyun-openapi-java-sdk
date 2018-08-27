/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ft.model.v20180713;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ft.transform.v20180713.FtEagleEyeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FtEagleEyeResponse extends AcsResponse {

	private String requestId;

	private String name;

	private String eagleEyeTraceId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEagleEyeTraceId() {
		return this.eagleEyeTraceId;
	}

	public void setEagleEyeTraceId(String eagleEyeTraceId) {
		this.eagleEyeTraceId = eagleEyeTraceId;
	}

	@Override
	public FtEagleEyeResponse getInstance(UnmarshallerContext context) {
		return	FtEagleEyeResponseUnmarshaller.unmarshall(this, context);
	}
}
