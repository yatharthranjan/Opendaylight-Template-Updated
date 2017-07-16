package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.monitoring.rev150722;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
 * Interface for receiving the following YANG notifications defined in module <b>monitoring</b>
 * <br>(Source path: <i>META-INF/yang/monitoring.yang</i>):
 * <pre>
 * notification topologyChanged {
 *     leaf topologyChange {
 *         type enumeration;
 *     }
 *     leaf linkId {
 *         type string;
 *     }
 * }
 * </pre>
 *
 */
public interface MonitoringListener
    extends
    NotificationListener
{




    void onTopologyChanged(TopologyChanged notification);

}

