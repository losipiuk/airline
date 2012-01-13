/**
 * Copyright (C) 2010 the original author or authors.
 * See the notice.md file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.iq80.cli.command;

import org.iq80.cli.Arguments;
import org.iq80.cli.Command;
import org.iq80.cli.Option;
import org.iq80.cli.Options;

import java.util.List;

import static org.iq80.cli.OptionsType.GLOBAL;

@Command(name = "add", description = "Add file contents to the index")
public class CommandAdd
{
    @Options(GLOBAL)
    public CommandMain commandMain;

    @Arguments(description = "Patterns of files to be added")
    public List<String> patterns;

    @Option(options = "-i")
    public Boolean interactive = false;

}