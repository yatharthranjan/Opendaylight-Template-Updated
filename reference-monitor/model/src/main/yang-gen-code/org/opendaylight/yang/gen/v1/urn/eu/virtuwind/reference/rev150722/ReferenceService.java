package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>reference</b>
 * <br>(Source path: <i>META-INF/yang/reference.yang</i>):
 * <pre>
 * rpc addApplication {
 *     input {
 *         leaf appId {
 *             type int32;
 *         }
 *         leaf bandwidth {
 *             type decimal64;
 *         }
 *         leaf packetLoss {
 *             type decimal64;
 *         }
 *         leaf packetDelay {
 *             type decimal64;
 *         }
 *         leaf jitter {
 *             type decimal64;
 *         }
 *     }
 *     
 * }
 * </pre>
 *
 */
public interface ReferenceService
    extends
    RpcService
{




    Future<RpcResult<java.lang.Void>> addApplication(AddApplicationInput input);

}

