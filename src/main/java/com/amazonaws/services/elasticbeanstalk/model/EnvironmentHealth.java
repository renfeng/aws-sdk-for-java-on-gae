/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model;

/**
 * Environment Health
 */
public enum EnvironmentHealth {
    
    Green("Green"),
    Yellow("Yellow"),
    Red("Red"),
    Grey("Grey");

    private String value;

    private EnvironmentHealth(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return EnvironmentHealth corresponding to the value
     */
    public static EnvironmentHealth fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("Green".equals(value)) {
            return EnvironmentHealth.Green;
        } else if ("Yellow".equals(value)) {
            return EnvironmentHealth.Yellow;
        } else if ("Red".equals(value)) {
            return EnvironmentHealth.Red;
        } else if ("Grey".equals(value)) {
            return EnvironmentHealth.Grey;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    