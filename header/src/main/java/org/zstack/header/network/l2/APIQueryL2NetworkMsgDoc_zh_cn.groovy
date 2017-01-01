package org.zstack.header.network.l2

import org.zstack.header.query.APIQueryMessage

doc {
    title "在这里填写API标题"

    desc "在这里填写API描述"

    rest {
        request {
			url "GET /v1/l2-networks"

			url "GET /v1/l2-networks/{uuid}"


            header (OAuth: 'the-session-uuid')

            clz APIQueryL2NetworkMsg.class

            desc ""
            
			params APIQueryMessage.class
        }

        response {
            clz APIQueryL2NetworkReply.class
        }
    }
}