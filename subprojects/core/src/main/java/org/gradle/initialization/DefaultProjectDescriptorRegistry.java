/*
 * Copyright 2007 the original author or authors.
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
package org.gradle.initialization;

import org.gradle.api.internal.project.DefaultProjectRegistry;
import org.gradle.internal.service.scopes.Scope;
import org.gradle.internal.service.scopes.ServiceScope;
import org.gradle.util.Path;

@ServiceScope(Scope.Settings.class)
public class DefaultProjectDescriptorRegistry extends DefaultProjectRegistry<DefaultProjectDescriptor> implements ProjectDescriptorRegistry {

    @Override
    public void changeDescriptorPath(Path oldPath, Path newPath) {
        DefaultProjectDescriptor projectDescriptor = removeProject(oldPath.toString());
        projectDescriptor.setPath(newPath);
        addProject(projectDescriptor);
    }
}
