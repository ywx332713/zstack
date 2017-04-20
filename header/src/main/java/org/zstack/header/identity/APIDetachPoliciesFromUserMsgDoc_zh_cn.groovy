package org.zstack.header.identity

doc {
    title "DetachPoliciesFromUser"

    category "identity"

    desc "将策略从用户解绑"

    rest {
        request {
            url "DELETE /v1/accounts/users/{userUuid}/policies"


            header(OAuth: 'the-session-uuid')

            clz APIDetachPoliciesFromUserMsg.class

            desc "将策略从用户解绑"

            params {

                column {
                    name "policyUuids"
                    enclosedIn "params"
                    desc "策略UUID列表"
                    location "body"
                    type "List"
                    optional false
                    since "0.6"

                }
                column {
                    name "userUuid"
                    enclosedIn "params"
                    desc "用户UUID"
                    location "url"
                    type "String"
                    optional false
                    since "0.6"

                }
                column {
                    name "systemTags"
                    enclosedIn ""
                    desc "系统标签"
                    location "body"
                    type "List"
                    optional true
                    since "0.6"

                }
                column {
                    name "userTags"
                    enclosedIn ""
                    desc "用户标签"
                    location "body"
                    type "List"
                    optional true
                    since "0.6"

                }
            }
        }

        response {
            clz APIDetachPoliciesFromUserEvent.class
        }
    }
}