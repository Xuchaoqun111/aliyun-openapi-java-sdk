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

package com.aliyuncs.baas.model.v20180731;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeConsortiumMemberApprovalRequest extends RpcAcsRequest<DescribeConsortiumMemberApprovalResponse> {
	
	public DescribeConsortiumMemberApprovalRequest() {
		super("Baas", "2018-07-31", "DescribeConsortiumMemberApproval");
	}

	private String location;

	private String consortiumId;

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putBodyParameter("Location", location);
		}
	}

	public String getConsortiumId() {
		return this.consortiumId;
	}

	public void setConsortiumId(String consortiumId) {
		this.consortiumId = consortiumId;
		if(consortiumId != null){
			putQueryParameter("ConsortiumId", consortiumId);
		}
	}

	@Override
	public Class<DescribeConsortiumMemberApprovalResponse> getResponseClass() {
		return DescribeConsortiumMemberApprovalResponse.class;
	}

}
