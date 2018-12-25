/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.gradle.vagrant;

import org.elasticsearch.gradle.Version;
import org.gradle.api.tasks.Input;

import java.util.Arrays;
import java.util.List;

public class VagrantPropertiesExtension {

    @Input
    private List<String> boxes;

    @Input
    private Version upgradeFromVersion;

    @Input
    private List<String> upgradeFromVersions;

    @Input
    private String batsDir;

    @Input
    private Boolean inheritTests;

    @Input
    private Boolean inheritTestUtils;

    @Input
    private String testClass;

    public VagrantPropertiesExtension(List<String> availableBoxes) {
        this.boxes = availableBoxes;
        this.batsDir = "src/test/resources/packaging";
    }

    public void boxes(String... boxes) {
        this.boxes = Arrays.asList(boxes);
    }

    public void setBatsDir(String batsDir) {
        this.batsDir = batsDir;
    }

    public void setInheritTests(Boolean inheritTests) {
        this.inheritTests = inheritTests;
    }

    public void setInheritTestUtils(Boolean inheritTestUtils) {
        this.inheritTestUtils = inheritTestUtils;
    }
}