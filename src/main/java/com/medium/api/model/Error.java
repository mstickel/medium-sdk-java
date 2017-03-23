/*
 * Copyright 2017 nosemaj.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.medium.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error defines an error received when making a request to the API.
 */
public class Error extends Exception {
    /**
     * The http status code.
     */
    private int code;

    /**
     * Constructs a new Error.
     *
     * @param message the error message
     * @param code the error code
     */
    @JsonCreator
    public Error(
            @JsonProperty("message") final String message,
            @JsonProperty("code") final int code) {

        super(message);
        this.code = code;
    }
}
