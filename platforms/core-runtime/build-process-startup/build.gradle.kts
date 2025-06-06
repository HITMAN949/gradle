/*
 * Copyright 2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
    id("gradlebuild.distribution.implementation-java")
    id("gradlebuild.publish-public-libraries")
}

description = """
    Services and types used to setup a build process from a Gradle distribution.
    These classes are explicitly intended to be compatible with a wide range of Java versions,
    as they are used by process entry-points in order to verify java version compatibility.
    """

gradlebuildJava {
    usedForStartup()
    usesIncompatibleDependencies = true // For testFixtures
}

dependencies {
    testFixturesImplementation(projects.baseServices)
}
