/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.kogito.serverless;

import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import javax.inject.Inject;
import javax.inject.Named;
import org.kie.kogito.process.Process;
import org.kie.kogito.addon.quarkus.messaging.common.QuarkusMessageConsumer;
import org.kie.kogito.event.EventReceiver;
import org.kie.kogito.serverless.workflow.models.JsonNodeModel;

@io.quarkus.runtime.Startup
public class QcFailedMessageConsumer_18_24 extends QuarkusMessageConsumer<JsonNodeModel, com.fasterxml.jackson.databind.JsonNode> {

    @Inject
    @Named("qcFailed")
    Process<JsonNodeModel> process;

    @Inject
    EventReceiver eventReceiver;

    private Set<String> correlation = java.util.Set.of("exceptionid");

    @javax.annotation.PostConstruct
    void init() {
        init(process, "action_executed_crs_cancelreservation", com.fasterxml.jackson.databind.JsonNode.class, eventReceiver, correlation);
    }

    private JsonNodeModel eventToModel(com.fasterxml.jackson.databind.JsonNode event) {
        JsonNodeModel model = new JsonNodeModel();
        if (event != null) {
            model.setWorkflowdata(event);
        }
        return model;
    }
}
