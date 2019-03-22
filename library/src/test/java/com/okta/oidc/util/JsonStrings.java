/*
 * Copyright (c) 2019, Okta, Inc. and/or its affiliates. All rights reserved.
 * The Okta software accompanied by this notice is provided pursuant to the Apache License,
 * Version 2.0 (the "License.")
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and limitations under the
 * License.
 */
package com.okta.oidc.util;

public interface JsonStrings {
    String PROVIDER_CONFIG = "{\n" +
            "    \"issuer\": \"https://dev-486177.oktapreview.com/oauth2/default\",\n" +
            "    \"authorization_endpoint\": \"https://dev-486177.oktapreview.com/oauth2/default/v1/authorize\",\n" +
            "    \"token_endpoint\": \"https://dev-486177.oktapreview.com/oauth2/default/v1/token\",\n" +
            "    \"userinfo_endpoint\": \"https://dev-486177.oktapreview.com/oauth2/default/v1/userinfo\",\n" +
            "    \"registration_endpoint\": \"https://dev-486177.oktapreview.com/oauth2/v1/clients/0oaiv94wtjW7DHvvj0h7\",\n" +
            "    \"jwks_uri\": \"https://dev-486177.oktapreview.com/oauth2/default/v1/keys?client_id=0oaiv94wtjW7DHvvj0h7\",\n" +
            "    \"response_types_supported\": [\n" +
            "        \"code\"\n" +
            "    ],\n" +
            "    \"response_modes_supported\": [\n" +
            "        \"query\",\n" +
            "        \"fragment\",\n" +
            "        \"form_post\",\n" +
            "        \"okta_post_message\"\n" +
            "    ],\n" +
            "    \"grant_types_supported\": [\n" +
            "        \"refresh_token\",\n" +
            "        \"authorization_code\"\n" +
            "    ],\n" +
            "    \"subject_types_supported\": [\n" +
            "        \"public\"\n" +
            "    ],\n" +
            "    \"id_token_signing_alg_values_supported\": [\n" +
            "        \"RS256\"\n" +
            "    ],\n" +
            "    \"scopes_supported\": [\n" +
            "        \"openid\",\n" +
            "        \"profile\",\n" +
            "        \"email\",\n" +
            "        \"address\",\n" +
            "        \"phone\",\n" +
            "        \"offline_access\"\n" +
            "    ],\n" +
            "    \"token_endpoint_auth_methods_supported\": [\n" +
            "        \"none\"\n" +
            "    ],\n" +
            "    \"claims_supported\": [\n" +
            "        \"iss\",\n" +
            "        \"ver\",\n" +
            "        \"sub\",\n" +
            "        \"aud\",\n" +
            "        \"iat\",\n" +
            "        \"exp\",\n" +
            "        \"jti\",\n" +
            "        \"auth_time\",\n" +
            "        \"amr\",\n" +
            "        \"idp\",\n" +
            "        \"nonce\",\n" +
            "        \"name\",\n" +
            "        \"nickname\",\n" +
            "        \"preferred_username\",\n" +
            "        \"given_name\",\n" +
            "        \"middle_name\",\n" +
            "        \"family_name\",\n" +
            "        \"email\",\n" +
            "        \"email_verified\",\n" +
            "        \"profile\",\n" +
            "        \"zoneinfo\",\n" +
            "        \"locale\",\n" +
            "        \"address\",\n" +
            "        \"phone_number\",\n" +
            "        \"picture\",\n" +
            "        \"website\",\n" +
            "        \"gender\",\n" +
            "        \"birthdate\",\n" +
            "        \"updated_at\",\n" +
            "        \"at_hash\",\n" +
            "        \"c_hash\"\n" +
            "    ],\n" +
            "    \"code_challenge_methods_supported\": [\n" +
            "        \"S256\"\n" +
            "    ],\n" +
            "    \"introspection_endpoint\": \"https://dev-486177.oktapreview.com/oauth2/default/v1/introspect\",\n" +
            "    \"introspection_endpoint_auth_methods_supported\": [\n" +
            "        \"none\"\n" +
            "    ],\n" +
            "    \"revocation_endpoint\": \"https://dev-486177.oktapreview.com/oauth2/default/v1/revoke\",\n" +
            "    \"revocation_endpoint_auth_methods_supported\": [\n" +
            "        \"none\"\n" +
            "    ],\n" +
            "    \"end_session_endpoint\": \"https://dev-486177.oktapreview.com/oauth2/default/v1/logout\",\n" +
            "    \"request_parameter_supported\": false\n" +
            "}";

    String USER_PROFILE = "{\n  \"sub\": \"00uid4BxXw6I6TV4m0g3\",\n  \"name\" :\"John Doe\",\n" +
            " \"nickname\":\"Jimmy\",\n  \"given_name\":\"John\",\n " +
            " \"middle_name\":\"James\",\n" +
            " \"family_name\":\"Doe\",\n  \"profile\":\"https://example.com/john.doe\",\n" +
            " \"zoneinfo\":\"America/Los_Angeles\",\n  \"locale\":\"en-US\",\n" +
            " \"updated_at\":1311280970,\n  \"email\":\"john.doe@example.com\",\n" +
            " \"email_verified\":true,\n" +
            " \"address\" : { \"street_address\":\"123 Hollywood Blvd.\"," +
            " \"locality\":\"Los Angeles\", \"region\":\"CA\", \"postal_code\":\"90210\"," +
            " \"country\":\"US\" },\n  \"phone_number\":\"+1 (425) 555-1212\"\n}";

    String TOKEN_RESPONSE = "{ \"access_token\" : " +
            "\"ACCESS_TOKEN\",\n\"token_type\" : " +
            "\"Bearer\",\n \"expires_in\" : 3600,\n " +
            "\"scope\" : \"openid email profile\",\n " +
            "\"refresh_token\" : \"REFRESH_TOKEN\",\n\"id_token\" : \"ID_TOKEN\"\n}";

    String INVALID_CLIENT = "{\n" +
            "  \"error\": \"invalid_client\",\n" +
            "  \"error_description\": \"No client credentials found.\"\n" +
            "}";

    String WWW_AUTHENTICATE = "WWW-Authenticate";

    String UNAUTHORIZED_INVALID_TOKEN = "Bearer authorization_uri=" +
            "\"http://samples-test.oktapreview.com/oauth2/v1/authorize\", " +
            "realm=\"http://samples-test.oktapreview.com\", scope=\"openid\", " +
            "error=\"invalid_token\", error_description=\"The access token has been revoked.\", " +
            "resource=\"/oauth2/v1/userinfo\"";

    String FORBIDDEN = "Bearer error=\"insufficient_scope\", " +
            "error_description=\"The access token must provide access to at " +
            "least one of these scopes - profile, email, address or phone\"";

    String CONFIGURATION_NOT_FOUND = "{\n" +
            "    \"errorCode\": \"E0000007\",\n" +
            "    \"errorSummary\": \"Not found: Resource not found: authServerId AuthorizationServer\",\n" +
            "    \"errorLink\": \"E0000007\",\n" +
            "    \"errorId\": \"oaeQdc5IvrlSGGnewf-cqqDqA\",\n" +
            "    \"errorCauses\": not found\n" +
            "}";
}
