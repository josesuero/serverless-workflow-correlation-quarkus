package org.kie.kogito.app;

import org.kie.kogito.event.cloudevents.CloudEventMeta;

public class ProcessCloudEventMetaFactory {

    @javax.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_CONSUMED_action__executed__exceptionstore__resolve() {
        return new CloudEventMeta("action_executed_exceptionstore_resolve", "", org.kie.kogito.event.EventKind.CONSUMED);
    }

    @javax.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_CONSUMED_action__executed__exceptionstore__create() {
        return new CloudEventMeta("action_executed_exceptionstore_create", "", org.kie.kogito.event.EventKind.CONSUMED);
    }

    @javax.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_CONSUMED_action__executed__supporthub__createdamageticket() {
        return new CloudEventMeta("action_executed_supporthub_createdamageticket", "", org.kie.kogito.event.EventKind.CONSUMED);
    }

    @javax.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_CONSUMED_action__executed__exceptionstore__update() {
        return new CloudEventMeta("action_executed_exceptionstore_update", "", org.kie.kogito.event.EventKind.CONSUMED);
    }

    @javax.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_CONSUMED_handling__unit__canceled__event() {
        return new CloudEventMeta("handling_unit_canceled_event", "", org.kie.kogito.event.EventKind.CONSUMED);
    }

    @javax.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_CONSUMED_handling__unit__released__event() {
        return new CloudEventMeta("handling_unit_released_event", "", org.kie.kogito.event.EventKind.CONSUMED);
    }

    @javax.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_CONSUMED_action__executed__crs__cancelreservation() {
        return new CloudEventMeta("action_executed_crs_cancelreservation", "", org.kie.kogito.event.EventKind.CONSUMED);
    }

    @javax.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_CONSUMED_manually__resolved__process__event() {
        return new CloudEventMeta("manually_resolved_process_event", "", org.kie.kogito.event.EventKind.CONSUMED);
    }

    @javax.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_CONSUMED_new__exception__event__type() {
        return new CloudEventMeta("new_exception_event_type", "", org.kie.kogito.event.EventKind.CONSUMED);
    }
}
