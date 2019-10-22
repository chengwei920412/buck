/*
 * Copyright 2018-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.core.rules.platform;

import com.facebook.buck.core.rules.config.ConfigurationRuleDescription;
import com.facebook.buck.core.rules.config.ConfigurationRuleDescriptionProvider;
import java.util.Arrays;
import java.util.Collection;
import org.pf4j.Extension;

@Extension
public class ConstraintRulesDescriptionProvider implements ConfigurationRuleDescriptionProvider {
  @Override
  public Collection<ConfigurationRuleDescription<?, ?>> getDescriptions() {
    return Arrays.asList(new ConstraintSettingDescription(), new ConstraintValueDescription());
  }
}
