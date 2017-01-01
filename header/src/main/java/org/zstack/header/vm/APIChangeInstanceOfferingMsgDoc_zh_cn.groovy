package org.zstack.header.vm



doc {
    title "在这里填写API标题"

    desc "在这里填写API描述"

    rest {
        request {
			url "PUT /v1/vm-instances/{vmInstanceUuid}/actions"


            header (OAuth: 'the-session-uuid')

            clz APIChangeInstanceOfferingMsg.class

            desc ""
            
			params {

				column {
					name "vmInstanceUuid"
					enclosedIn "changeInstanceOffering"
					desc "云主机UUID"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "instanceOfferingUuid"
					enclosedIn "changeInstanceOffering"
					desc "计算规格UUID"
					location "body"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "systemTags"
					enclosedIn ""
					desc ""
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc ""
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIChangeInstanceOfferingEvent.class
        }
    }
}