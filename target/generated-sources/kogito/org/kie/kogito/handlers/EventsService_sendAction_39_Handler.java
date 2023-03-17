package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class EventsService_sendAction_39_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.kie.kogito.examples.EventsService service;

    public EventsService_sendAction_39_Handler() {
        this(new org.kie.kogito.examples.EventsService());
    }

    @javax.inject.Inject()
    public EventsService_sendAction_39_Handler(org.kie.kogito.examples.EventsService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        service.sendAction((com.fasterxml.jackson.databind.JsonNode) workItem.getParameter("actionName"), (org.kie.kogito.internal.process.runtime.KogitoProcessContext) workItem.getParameter("eventPayload"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.emptyMap());
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.kie.kogito.examples.EventsService_sendAction_39_Handler";
    }
}
